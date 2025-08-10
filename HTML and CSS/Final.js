const express = require("express");
const mysql = require("mysql");
const bodyParser = require("body-parser");
const cors = require("cors");

const app = express();
app.use(cors()); // Allow requests from any origin (for dev)
app.use(bodyParser.urlencoded({ extended: true }));
app.use(bodyParser.json());

// MySQL connection setup
const con = mysql.createConnection({
  host: "localhost",
  user: "root",
  password: "",
  database: "web",
  port: 3306
});

con.connect((err) => {
  if (err) {
    console.warn("DB connection error: " + err.message);
  } else {
    console.warn("Connected to MySQL");
  }
});

// Route to handle form submission
app.post("/signup", (req, res) => {
  const { name, age, email, password } = req.body;

  // Simple validation (server-side)
  if (!name || !age || !email || !password) {
    return res.status(400).json({ message: "All fields are required!" });
  }

  // Insert into DB
  const sql = "INSERT INTO users (name, age, email, password) VALUES (?, ?, ?, ?)";
  
  con.query(sql, [name, age, email, password], (err, result) => {
    if (err) {
      return res.status(500).json({ message: "DB error: " + err.message });
    }
    res.json({ message: "Signup successful!", id: result.insertId });
  });
});

// For testing: get all users (not for production!)
app.get("/users", (req, res) => {
  con.query("SELECT * FROM users", (err, result) => {
    if (err) 
        return res.status(500).json({ message: "DB error" });
    res.json(result);
  });
});

const PORT = 3000;
app.listen(PORT, () => {
  console.log(`Server running at http://localhost:${PORT}`);
});


// Login example (simple version)
app.post("/login", (req, res) => {
  const { email, password } = req.body;

  con.query("SELECT * FROM users WHERE email = ? AND password = ?", [email, password], (err, results) => {
    if (err) return res.status(500).json({ message: "DB error" });
    if (results.length === 0) return res.status(401).json({ message: "Invalid credentials" });

    const user = results[0];

    // ✅ Generate token AFTER checking credentials
    const token = jwt.sign({ id: user.id, email: user.email }, JWT_SECRET, { expiresIn: "1h" });

    res.json({ message: "Login successful", token });
  });
});

