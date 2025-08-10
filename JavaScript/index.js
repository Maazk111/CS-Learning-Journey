// console.log(`Hello`);
// console.log(`I like Pizza`);

// window.alert(`This is an Alert`);

// window.alert(`I like pizza`);

// This is a Comment

// document.getElementById("myH1").textContent = `Hello`;
// document.getElementById("myP").textContent = `I like pizza`;

/*

    This
    is
    a
    Comment

*/

// Variables

// variable = a Container that stores a value
//            Behaves as if it were the value it contains.

// 1. declaration let x;
// 2. assignment  x = 100;

// Numbers

// let x;
// x = 123;

// let age = 25;
// let price = 10.99;
// let gpa = 3.9;

// console.log(typeof gpa);

// console.log(`You are ${age} years old`);
// console.log(`The price is $${price}`);
// console.log(`Your gpa is: ${gpa}`);

// Strings

// let firstName = "Maaz Khan";
// let favouriteFood = "Pizza";
// let email = "Maazk111@gmail.com";

// console.log(typeof firstName);
// console.log(`Your name is ${firstName}`);
// console.log(`You like ${favouriteFood}`);
// console.log(`Your email is ${email}`);

// Boolean

// let online = false;
// let forSale = true;
// let isStudent = true;
// console.log(`Bro is online: ${online}`);
// console.log(`Is this car for sale: ${forSale}`);
// console.log(`Enrolled: ${isStudent}`);

// let fullName = "Maaz Khan";
// let age = 21;
// let isStudent = true;

// document.getElementById("p1").textContent = fullName;
// document.getElementById("p2").textContent = age;
// document.getElementById("p3").textContent = isStudent;

// document.getElementById("p1").textContent = `Your name is ${fullName}`;
// document.getElementById("p2").textContent = `You are  ${age} years old`;
// document.getElementById("p3").textContent = `Enrolled: ${isStudent}`;

// Arithmetic Operators = operands (values, variables, etc.)
//                        operators (+ - * /)
//                        ex. 11 = x + 5;

// let students = 30

// students = students + 1; add
// students = students - 1; sub
// students = students * 2; mul
// students = students / 2; div
// students = students **3;  exponent(Power)
// let extraStudents = students % 3; Modulus(for even or odd number)

// students += 2;
// students -= 2;
// students *= 2;
// students /= 2;
// students **= 2;
// students %= 2;

// students++;
// students--;

// console.log(students);

/*

    operator precedence
    1. parenthesis ()
    2. exponents
    3. multiplication & division & modulo
    4. additionn and subtraction

*/

// let result = 1 + 2 * 3 + 4 ** 2; // 23
// let result = 12 % 5 + 8 / 2;
// let result = 6 / 2 ** (2 + 5);

// console.log(result);

// How to accept user input

// 1. EASY WAY = window prompt
// 2. PROFESSIONAL WAY = HTML textbox

// let username;

// username = window.prompt("What's your username?");

// console.log(username);

// let username;

// document.getElementById("mySubmit").onclick = function(){

//     username = document.getElementById("myText").value;
//     document.getElementById("myH1").textContent = `Hello ${username}`;

// }

// type conversion = change the datatype of a value to another
//                   (strings, numbers, booleans)

// let age = window.prompt("How old are you?");

// age = Number(age);

// age +=1;

// console.log(age, typeof age)

// let x = "pizza";
// let y = "pizza";
// let z = "pizza";

// x = Number(x);
// y = String(y);
// z = Boolean(z);

// console.log(x , typeof x);
// console.log(y, typeof y);
// console.log(z, typeof z);

// const = a variable that can't be changed

// const PI = 3.14159;
// let radius;
// let circumference;

// document.getElementById("mySubmit").onclick = function(){

//    radius =  document.getElementById("myText").value;
//    radius = Number(radius);
//    circumference = 2 * PI * radius;

//     document.getElementById("myH3").textContent = circumference + " cm" ;

//     // window.alert(circumference);
//       console.log(circumference);
// }

// Math = build-in object that provides a
//        collection of properties and methods

// console.log(Math.PI);
// console.log(Math.E);

// let x = 3;
// let y = 2;
// let z = 1;

// z = Math.round(x);
// z = Math.floor(x);
// z = Math.ceil(x);
// z = Math.trunc(x);
// z = Math.pow(y,x);
// z = Math.sqrt(x);
// z = Math.log(x);
// z = Math.sin(x);
// z = Math.cos(x);
// z = Math.tan(x);
// z = Math.abs(x);
// z = Math.sign(x);

// let max = Math.max(x,y,z)
// let min = Math.min(x,y,z)

// console.log(min);

//         RANDOM NUMBER GENERATOR

// const min = 50;
// const max = 100;

// let randomNum = Math.floor(Math.random() * (max -min) ) + min;

// console.log(randomNum);

// const myButton = document.getElementById("myButton");
// const myLabel1 = document.getElementById("myLabel1");
// const myLabel2 = document.getElementById("myLabel2");
// const myLabel3 = document.getElementById("myLabel3");

// const min = 1;
// const max = 6;

// let randomNum1;
// let randomNum2;
// let randomNum3;

// myButton.onclick = function(){

//     randomNum1 = Math.floor(Math.random() * max ) + min;
//     randomNum2 = Math.floor(Math.random() * max ) + min;
//     randomNum3 = Math.floor(Math.random() * max ) + min;

//     myLabel1.textContent = randomNum1;
//     myLabel2.textContent = randomNum2;
//     myLabel3.textContent = randomNum3;
// }

//  IF STATEMENTS = if a condition is true, execute some code
//                  if not, do something else

// let age = 13;

// if(age >=18){
//         console.log("You are old enough to enter this site");
// }
// else{

//     console.log("You must be 18+ to enter this site");

// }

// let time = 14;

// if(time < 12){
//     console.log("Good Morning");
// }
// else{
//     console.log("Good Afternoon");

// }

// let isStudent = true;

// if(isStudent){
//     console.log("You are a Student")
// }
// else{
//     console.log("You are NOT a Student")

// }

// let age = 20;

// let hasLicense = true;

// if (age >= 16) {
//     console.log("You are old enough to drive");

//     if (hasLicense) {
//         console.log("You have your license");
//     }
//     else{
//         console.log("You do not have your license Yet!");
//     }
// } else {
//     console.log("You must be 16+ to have a License");
// }

// const myText = document.getElementById("myText");
// const mySubmit = document.getElementById("mySubmit");
// const resultElement = document.getElementById("resultElement");
// let age;

// mySubmit.onclick = function() {
//     age = myText.value;

//     age = Number(age);

//     if (age >= 18 && age < 100) {
//         resultElement.textContent = `You are old enough to enter this site`;
//     } else if (age == 0) {
//         resultElement.textContent = `Your can't enter. You were just born`;
//     } else if (age < 0) {
// const myCheckBos = document.getElementById("myCheckBox");
//         resultElement.textContent = `Your age can't be below 0`;
//     } else if (age >= 100) {
//         resultElement.textContent = `You are TOO OLD to enter this site`;
//     } else {
//         resultElement.textContent = `You must be 18+ to enter this site`;
//     }
// }

// Checked = property that determines that Checked state of an
//           HTML checkbox or radio button element

// const myCheckBox = document.getElementById("myCheckBox");
// const visaBtn = document.getElementById("visaBtn");
// const masterCardBtn = document.getElementById("masterCardBtn");
// const payPalBtn = document.getElementById("payPalBtn");
// const mySubmit = document.getElementById("mySubmit");
// const subResult = document.getElementById("subResult");
// const paymentResult = document.getElementById("paymentResult");

// mySubmit.onclick = function(){

//     if(myCheckBox.checked){
//         subResult.textContent = `You are Subscribed`;
//     }
//     else{
//         subResult.textContent = `You are Not Subscribed`;
//     }

//     if(visaBtn.checked){
//         paymentResult.textContent = `You are Paying with Visa`
//     }
//     else if(masterCardBtn.checked){
//         paymentResult.textContent = `You are Paying with MasterCard`
//     }
//     else if(payPalBtn.checked){
//         paymentResult.textContent = `You are Paying with PayPal`
//     }
//     else{
//         paymentResult.textContent = `Plz select a Paying Method`
//     }
// }

// ternary operator = a shortcut to if{} and else {} statement
//                    helps to assign a variable based on a condition
//                    condition ? codeIfTrue : codeIfFalse

// let age = 21;

// let message = age >= 18 ? "You're an adult" : "Your a minor";

// console.log(message);

// if(age >= 18){
//     message = "Your're an adult"
// }
// else{
//     message = "Your're an minor"
// }

// let time = 16;

// let greeting = time < 12 ? "Good Morning!" : "Good AfterNoon";

// console.log(greeting);

// let isStudent = false;

// let message = isStudent ? "your are a Student" : "You are not a Student";

// console.log(message);

// let purchaseAmount = 125;

// let discount = purchaseAmount >= 100 ? 10 : 0;

// console.log(`Your total is $${purchaseAmount - purchaseAmount * (discount/100)}`);

// SWITCH = can be an efficient replacement to many else if statements

// let day = "pizza";

// switch (day) {
//   case 1:
//     console.log(`It is Monday`);
//     break;
//   case 2:
//     console.log(`It is Tuesday`);
//     break;

//   case 3:
//     console.log(`It is Wednesday`);
//     break;
//   case 4:
//     console.log(`It is Thursday`);
//     break;
//   case 5:
//     console.log(`It is Friday`);
//     break;
//   case 6:
//     console.log(`It is Saturday`);
//     break;
//   case 7:
//     console.log(`It is Sunday`);
//     break;
//   default :
//         console.log(`${day} is not a Day`);
// // }

// let testScore = 92;

// let letterGrade;

// switch (true) {
//     case testScore >= 90:
//         letterGrade = "A";
//         break;
//     case testScore >= 80:
//         letterGrade = "B";
//         break;
//     case testScore >= 70:
//         letterGrade = "C";
//         break;
//     case testScore >= 60:
//         letterGrade = "D";
//         break;
//     default :
//         letterGrade = "F";
// }

// console.log(letterGrade);

// String Methods = allow you to manipulate and work with text (strings)

// let userName = "Maaz Khan ";

// console.log(userName.charAt(0));
// console.log(userName.indexOf("n"));
// console.log(userName.lastIndexOf("a"));
// console.log(userName.length);
// userName = userName.trim();
// console.log(userName);
// console.log(userName.toUpperCase());
// console.log(userName.toLowerCase());
// userName = userName.repeat(3);
// console.log(userName);
// console.log(userName.startsWith(" "));
// console.log(userName.endsWith(" "));
// console.log(userName.includes("K"));

// let phoneNumber = "123-456-7890"

// phoneNumber = phoneNumber.replaceAll("-","");

// phoneNumber = phoneNumber.padStart(2,"0");
// phoneNumber = phoneNumber.padEnd(20,"0");

// console.log(phoneNumber);

// const fullName = "Maaz Khan";

// let firstName = fullName.slice(0,4);

// let lastName = fullName.slice(5);

// let firstChar = fullName.slice(0,1);
// let lastChar = fullName.slice(-1);

// let firstName = fullName.slice(0,fullName.indexOf(" "));
// let lastName = fullName.slice(fullName.indexOf(" ") + 1);

// console.log(firstName);
// console.log(lastName);

// const email = "bro1@gmail.com";

// let username = email.slice(0,email.indexOf("@"));
// let extension = email.slice(email.indexOf("@") + 1);

// console.log(username);
// console.log(extension);

// Method Chaining = Calling one method after another
//                   in one continuous line of code

// ------ NO METHOD CHAINING ------

// let username = window.prompt("Enter your username: ");

// username = username.trim();
// let letter = username.charAt(0);
// letter = letter.toUpperCase();

// let extraChars = username.slice(1);
// extraChars = extraChars.toLowerCase();

// username = letter + extraChars;

// console.log(username);

// ------ METHOD CHAINING ------

// username = username.trim().charAt(0).toUpperCase() + username.trim().slice(1).toLowerCase();

// console.log(username);

// Logical operators = used to combine or manipulate boolean values
//                     (true or false)

//                      AND = &&
//                      OR = ||
//                      NOT = !

// const temp = 25;

// if(temp > 0  && temp <= 30){
//         console.log(`The Temp is Good`);
// }
// else{
//     console.log(`The weather is Bad`)
// }

// const isSunny = true;

// if(!isSunny){
//     console.log("It is CLOUDY");
// }
// else{
//     console.log("It is SUNNY");
// }

//    = assignment operator
//   == comparison operator (compare if values are equal)
//  === strict equality operator (compare if values & datatype are equal)
//   != inequality operator
//  !== strict inequality operator

// const PI = 3.14;

// if(PI === 3.14){
//     console.log("That is PI");
// }
// else{
//     console.log("That is NOT PI");
// }

// const PI = 3.14;

// if(PI !== "3.14"){
//     console.log("That is NOT PI");
// }
// else{
//     console.log("That is PI");
// }

// While loop = repeat some code WHILE some condition is true

// let username ;

// while(username === "" || username === null){
//     username = window.prompt(`Enter you Name`);
// }

// do{
//     username = window.prompt(`Enter you Name`);
// }
// while(username === "" || username === null)

// let loggedIn = false;
// let username;
// let password;

// while(!loggedIn){
//     username = window.prompt(`Enter your username`);
//     password = window.prompt(`Enter your Password`);

//     if(username === "myUsername" && password === "myPassword"){
//         loggedIn = true;
//         console.log(`You are logged in!`);
//     }
//     else{
//         console.log(`Invalid credentials! please try again`);
//     }

// }

// let loggedIn = true;

// do{
//     username = window.prompt(`Enter your username`);
//     password = window.prompt(`Enter your Password`);

//     if(username === "myUsername" && password === "myPassword"){
//         loggedIn = true;
//         console.log(`You are logged in!`);
//     }
//     else{
//         console.log(`Invalid credentials! please try again`);
//     }

// }while(!loggedIn)

// console.log(`Hello ${username}`);

// for Loop = repeat some code a LIMITED amount of times

// for (let i = 10; i > 0; i-=3) {
//   console.log(i);
// }

// console.log("HAPPY NEW YEAR!");

// for(let i = 1; i <= 20; i++){

//     if(i==13){
//         break;
//     }
//     else{
//         console.log(i);
//     }
// }

// for(let i = 1; i <= 20; i++){

//     if(i==13){
//         continue;
//     }
//     else{
//         console.log(i);
//     }
// }

// Function = A section of reusable code.
//            Declare code once, use it whenever you want
//            Call the function to execute that code

// function happyBirthday(username,age){
//     console.log(`Happy Birthday to you!`);
//     console.log(`Happy Birthday to you!`);
//     console.log(`Happy Birthday dear ${username}!`);
//     console.log(`Happy Birthday to you!`);
//     console.log(`You are ${age} years old!`);
// }

// happyBirthday("Farrukh",21);

// function add(x, y) {
//   return x + y;
// }

// function sub(x, y) {
//   return x - y;
// }

// function mul(x, y) {
//   return x * y;
// }
// function div(x, y) {
//   return x / y;
// }

// console.log(add(2, 3));
// console.log(sub(2, 3));
// console.log(mul(2, 3));
// console.log(div(2, 3));

// function num(x){

//     if(x % 2 == 0){
//         return x + " EVEN";
//     }
//     else{
//         return x + " ODD"
//     }

// }

// console.log(num(3));

// function isValidEmail(email){

//     if(email.includes("@")){
//             return true;
//     }
//     else{
//         return false;
//     }

//     return email.includes("@") ? true : false;

// }

// console.log(isValidEmail("Maaz111@gmail.com"));

// variable scope = where a variable is recognized
//                  and accessible (local vs global)

// let x =3;

// function1();

// function function1(){
//     let x = 1;
//     console.log(x);
// }

// function function2(){
//     let x = 2;
//     console.log(x);
// }

// function function1(){
//     console.log(x);
// }

// array = a variable like structure that can hold
//         more than 1 value

// let fruits = ["apple","orange","banana","coconut"];

// fruits.push("coconut");
// fruits.pop();
// fruits.unshift("mango");
// fruits.shift();
// let numOfFruits = fruits.length;
// let index = fruits.indexOf("orange")
// console.log(index);

// console.log(fruits[0]);
// console.log(fruits[1]);
// console.log(fruits[2]);
// console.log(fruits[3]);

// for(let i = 0 ; i < fruits.length ; i++){
//         console.log(fruits[i]);
// }

// for(let i = fruits.length - 1 ; i >=0 ; i--){
//     console.log(fruits[i]);
// }

// fruits.sort().reverse();

// FOR EACH LOOP IN JAVASCRIPT

// for(let fruit of fruits){
//     console.log(fruit);
// }

// spread operator = ... allows an iterable such as an
//                   array or string to be expanded
//                   into seperate elements
//                   (unpacks the elements)

// let numbers = [1,2,3,4,5];

// let maximun = Math.max(...numbers);

// let minimun = Math.min(...numbers);

// console.log(minimun);

// let username = "Maaz Khan";

// let letters = [...username].join("-");

// console.log(letters);

// let fruits = ["apple", "orange", "banana"];

// let vegetables = ["carrots","celery","potatoes"];

// let newFruits = [...fruits,...vegetables,"eggs","milk"];

// console.log(newFruits);

// rest parameters = (...rest) allow a function work with a variable
//                   number of arguments by bundling them into an array

//                   spread = expands an array into separate elements
//                   rest = bundles separate elements into an array

// function openFridge(...foods){
//     console.log(...foods);
// }

// function getFood(...foods){

//     return foods;
// }

// const food1 = "pizza";
// const food2 = "hamburger";
// const food3 = "hotdog";
// const food4 = "sushi";
// const food5 = "ramen";

// openFridge(food1,food2,food3,food4, food5);

// const foods = getFood(food1,food2,food3,food4, food5);

// console.log(foods);

// function sum(...numbers) {
//   let result = 0;

//   for (let number of numbers) {
//     result += number;
//   }

//   return result;
// }

// const total = sum(1,2,2,3,4);

// console.log(`Your total is $${total}`);

// function avg(...numbers) {
//     let result = 0;

//     for (let number of numbers) {
//       result += number;
//     }

//     return result / numbers.length;
//   }

//   const average = avg(75,100,85,90,50);

//   console.log(`Your avgerage is $${average}`);

// function combineStrings(...strings){
//     return strings.join(" ");
// }

// const fullName = combineStrings("Mr.","Spongebob", "Squarepants", "III");

// console.log(fullName);

// callback = a function that is passed as an argument
//            to another function.

//            used to handle asynchronous operations:
//            1. Reading a file
//            2. Network requests
//            3. Interesting with databases

//            "Hey, when you're done, call this next."

// hello(wait);

// function hello(callback){
//     console.log("Hello!");
//     callback();
// }

// function wait(){
//     console.log("Wait!");
// }

// function leave(){
//     console.log("leave!");
// }

// function goodbye(){
//     console.log("Goodbye!");
// }

// sum(displayPage , 1 ,2 )

// function sum(callback, x, y){
//     let result = x + y;
//     callback(result);
// }

// function displayConsole(result){
//     console.log(result);
// }

// function displayPage(result){
//     document.getElementById("myH1").textContent = result;

// }

// foreach() = method used to iterate over the element
//              of an array and apply a specified function (callback)
//              to each element

//              array.forEach(callback)
//              element, index, array are provided

// let numbers = [1, 2, 3, 4, 5];

// numbers.forEach(cube);
// numbers.forEach(display);

// function double(element, index, array) {
//     array[index] = element * 2;
// }

// function triple(element, index, array) {
//     array[index] = element * 3;
// }

// function sqrt(element, index, array) {
//     array[index] = Math.pow(element,2);
// }

// function cube(element, index, array) {
//     array[index] = Math.pow(element,3);
// }

// function display(element) {
//     console.log(element);
// }

// let fruits = ["apple", "orange", "banana", "coconut"];

// fruits.forEach(capitalize);
// fruits.forEach(display);

// function upperCase(element , index , array){
//     array[index] = element.toUpperCase();
// }

// function lowerCase(element, index, array) {
//     array[index] = element.toLowerCase();
// }

// function capitalize(element, index, array){
//     array[index] = element.charAt(0).toUpperCase() + element.slice(1);
// }

// function display(element){

//     console.log(element);
// }

// .map() = accepts a callback and applies that function
//          to each element of an array, then return a new array

// const numbers = [1,2,3,4,5];

// const squares = numbers.map(square);
// const cubes = numbers.map(cube);

// console.log(cubes);

// function square(element){
//     return Math.pow(element,2);
// }

// function cube(element){
//     return Math.pow(element,3);
// }

// const students = ["Maaz", "Rumaisa", "Farrukh" ,"Maria"];

// const studensUpper = students.map(capitalize);

// console.log(studensUpper);

// function upperCase(element){
//     return element.toUpperCase();
// }

// function lowerCase(element){
//     return element.toLowerCase();
// }

// function capitalize(element){
//     return element.charAt(0).toUpperCase() + element.slice(1);
// }

// const dates = ["2024-1-10","2025-2-20","2026-3-30"];

// const formatDate = dates.map(formatDates);
// console.log(formatDate);

// function formatDates(element){
//     const parts = element.split("-");
//     return`${parts[1]}/${parts[2]}/${parts[0]}`;
// }

// .filter() = creates a new array by filtering
//             out elements

// let numbers = [1,2,3,4,5,6,7];
// let evenNums = numbers.filter(isEven);
// let oddNums = numbers.filter(isOdd);

// console.log(oddNums);

// function isEven(element){
//     return element % 2 === 0;
// }

// function isOdd(element){
//     return element % 2 !== 0;
// }

// const ages = [16,17,18,18,19,20,60];
// const adults = ages.filter(isAdult);
// const children = ages.filter(isChild);

// console.log(children);

// function isAdult(element){
//     return element >= 18;
// }

// function isChild(element){
//     return element < 18;
// }

// const words = ["apple", "orange", "banana", "kiwi",
//                "pomegranate", "coconut"];

// const shortWords = words.filter(getShortWords);
// const longWords = words.filter(getLongWords);

// console.log(longWords);

// function getShortWords(element){
//     return element.length <=6;
// }

// function getLongWords(element){
//     return element.length > 6;
// }

// .reduce = reduce the elements of an array
//           to a single value

// const prices = [5,30,10,25,15,20];

// const total = prices.reduce(sum);

// console.log(`$${total.toFixed(2)}`);

// function sum(previous, next){
//     return previous + next;
// }

// const grades = [75, 50, 90, 80, 65, 95];
// const maximum = grades.reduce(getMax);
// const minimum = grades.reduce(getMin);

// console.log(maximum);
// console.log(minimum);

// function getMax(accumulator, element){
//         return Math.max(accumulator, element);
// }

// function getMin(accumulator, element){
//     return Math.min(accumulator, element);
// }

// function declaration = define a reusable block of code
//                        that performs a specific task

// function hello(){
//     console.log("Hello!");
// }

// function expressions = a way define functions as
//                        values or variables

// const hello = function(){   AS VARIABLES
//     console.log("Hello!");
// }

// hello();

// setTimeout(hello,3000);

// setTimeout(function(){     AS VALUES
//     console.log("Hello!");
// },3000);

// const numbers = [1,2,3,4,5,6];
// const squares = numbers.map(function(element){
//     return Math.pow(element,2);
// });

// const cubes = numbers.map(function(element){
//     return Math.pow(element,3);
// });

// const evenNums = numbers.filter(function(element){
//     return element % 2 === 0;
// });

// const oddNums = numbers.filter(function(element){
//     return element % 2 !== 0;
// });

// const total = numbers.reduce(function(previous,next){
//     return previous + next;
// });

// console.log(total);

// arrow functions = a concise way to write function expressions
//                   good for simple functions that you use only once
//                   (parameters) => some code

// const hello = function(){   // FUNCTION EXPRESSION
//     console.log("Hello!")
// }

// const hello = () =>  console.log("Hello!");   // FUNCTION ARROWS

// const hello = (name,age) =>  {console.log(`Hello ${name}`)
//                           console.log(`You are ${age} years old`)};

// hello("Bro",25);

// setTimeout(() => console.log("Hello!"), 3000);

// function hello(){
//     console.log('Hello');
// }

// const numbers = [1,2,3,4,5,6];

// const squares = numbers.map((element) => {  Math.pow(element,2)});
// const cubes = numbers.map((element) => {  Math.pow(element,3)});

// const evenNums = numbers.filter((element) =>  element % 2 === 0);
// const oddNums = numbers.filter((element) =>  element % 2 !== 0);

// const total = numbers.reduce((previous,next) =>  previous + next );

// console.log(total);

// object = A collection of related properties and/or methods
//          Can represent real world objects (people, products, places)
//          object = {key:value,
//                    function()}

// const person1 = {
//     firstName: "Spongebob",
//     lastName : "Squarepants",
//     age : 30,
//     isEmployed: true,
//     sayHello : function(){console.log("Hi! I am Spongebob!")},
//     eat: function(){console.log("I am eating Krabby Patty ")},
// }

// const person2 = {
//     firstName: "Patrick",
//     lastName : "Star",
//     age : 42,
//     isEmployed: false,
//     sayHello : () =>{console.log("Hey! I'm Patrick...")},
//     eat: () => {console.log("I am eating roast beef, chicken, and pizza ")},

// }

// person1.sayHello();
// person2.sayHello();

// person1.eat();
// person2.eat();

// console.log(person1.firstName);
// console.log(person1.lastName);
// console.log(person1.age);
// console.log(person1.isEmployed);

// console.log(person2.firstName);
// console.log(person2.lastName);
// console.log(person2.age);
// console.log(person2.isEmployed);

// this = reference to the object where THIS s used
//        (the object depends on the immediate context)
//        person.name = this.name

// const person1 = {
//     name: "Spongebob",
//     favFood: "hamburgers",
//     sayHello: function(){console.log(`Hi! I am ${this.name}`)},
//     eat: function(){console.log(`${this.name} is eating ${this.favFood}`)},
// }

// const person2 = {
//     name: "Patrick",
//     favFood: "Pizza",
//     sayHello: function(){console.log(`Hi! I am ${this.name}`)},
//     eat: () => {console.log(`${person2.name} is eating ${this.favFood}`)},
// }

// person1.eat();
// person2.eat();

// console.log(this);

// constructor = special method for defining the
//               properties and methods of objects

// function Car(make,model,year,color){
//         this.make = make,
//         this.model = model,
//         this.year = year,
//         this.color = color,
//         this.drive = function(){console.log(`You drive the ${this.model}`)}

// }

// const car1 = new Car("Ford","Mustang",2024,"red");
// const car2 = new Car("Chevrolet","Camaro",2025,"blue");
// const car3 = new Car("Dodge","Charger",2026,"silver");

// car1.drive();
// car2.drive();
// car3.drive();

// console.log(car1.make);
// console.log(car1.model);
// console.log(car1.year);
// console.log(car1.color);

// console.log(car2.make);
// console.log(car2.model);
// console.log(car2.year);
// console.log(car2.color);

// console.log(car3.make);
// console.log(car3.model);
// console.log(car3.year);
// console.log(car3.color);

// class = (ES6 feature) provides a more structured and cleaner way to work
//         with objects compared to traditional constructor functions
//         ex static keyword, encapsulation, inheritance

// class Product{

//     constructor(name,price){
//         this.name = name;
//         this.price = price;
//     }

//     displayProduct(){
//         console.log(`Product: ${this.name}`);
//         console.log(`Price: $${this.price.toFixed()}`)
//     }

//     calculateTotal(salesTax){
//         return this.price + (this.price * salesTax);
//     }

// }

// const salesTax = 0.05;

// const product1 = new Product("Shirt", 19.99);
// const product2 = new Product("Pants", 22.50);
// const product3 = new Product("Underwear", 100);

// product1.displayProduct();
// product2.displayProduct();
// product3.displayProduct();

// const total = product3.calculateTotal(salesTax);
// console.log(`Total price (With Tax): $${total.toFixed(2)}`);

// static = keyword that defines properties or methods that belong
//          to a class itself rather than the objects created
//          from that class (class owns anything static, not the objects)

// class MathUtil {
//   static PI = 3.14159;

//   static getDiameter(radius){
//     return radius * 2;
//   }

//   static getCircumference(radius){
//      return 2 * this.PI * radius;
//   }

//   static getArea(radius){
//     return this.PI * radius * radius;
//   }


// }

// const MathUtil = new MathUtil();  // we don't need to create OBJECT




// console.log(MathUtil.PI);
// console.log(MathUtil.getDiameter(10));
// console.log(MathUtil.getCircumference(10))
// console.log(MathUtil.getArea(10))



// class User{
//   static userCount = 0;

//   constructor(username){
//       this.username = username;
//       User.userCount++;
//   }

//   static getUserCount(){
//     console.log(`There are ${User.userCount} users Online`);
//   }

//   sayHello(){
//     console.log(`Hello, my username is ${this.username}`);
//   }
// }


// const user1 = new User("Spongebob");
// const user2 = new User("patrick");
// const user3 = new User("Sandy");


// user1.sayHello();
// user2.sayHello();
// user3.sayHello();

// User.getUserCount();

// console.log(user1.username);
// console.log(user2.username);
// console.log(user3.username);
// console.log(User.userCount);



// inheritance = allow a new class to inherit properties and methods
//               from an existing class (parent -> child)
//               helps with code reusability


// class Animal{
//   alive = true;

//   eat(){
//     console.log(`This ${this.name} is eating`);
//   }

//   sleep(){
//     console.log(`This ${this.name} is sleeping`);
//   }

// }
// class Rabbit extends Animal{
//   name = "rabbit";
//   run(){
//     console.log(`This ${this.name} is Running`);
//   }
// }
// class Fish extends Animal{
//   name = "fish";

//   swim(){
//     console.log(`This ${this.name} is Swimming`);
//   }
// }
// class Hawk extends Animal{
//   name = "hawk";
//   fly(){
//     console.log(`This ${this.name} is flying`);
//   }
// }


// const rabbit = new Rabbit();
// const fish = new Fish();
// const hawk = new Hawk();


// console.log(rabbit.alive);
// rabbit.eat();
// rabbit.sleep();
// rabbit.run();

// console.log(fish.alive);
// fish.eat();
// fish.sleep();
// fish.swim();

// console.log(hawk.alive);
// hawk.eat();
// hawk.sleep();
// hawk.fly();




// super = keyword is used in classes to call the constructor or
//         access the properties and methods of a parent (superclass)
//         this = this object
//         super = the parent

// class Animal {
//   constructor(name, age) {
//     this.name = name;
//     this.age = age;
//   }

//   move(speed){
//     console.log(`The ${this.name} move at a speed of ${speed}mph`);
//   }
// }
// class Rabbit extends Animal {
//   constructor(name, age, runSpeed) {
//     super(name,age);
//     this.runSpeed = runSpeed;
//   }
//   run(){
//     console.log(`The ${this.name} can run`);
//     super.move(this.runSpeed);
//   }
// }
// class Fish extends Animal {
//   constructor(name, age, swimSpeed) {
//     super(name,age);
//     this.swimSpeed = swimSpeed;
//   }

//   swim(){
//     console.log(`The ${this.name} can swim`);
//     super.move(this.swimSpeed);
//   }

// }
// class Hawk extends Animal {

//   constructor(name, age, flySpeed) {
//     super(name,age);
//     this.flySpeed = flySpeed;
//   }

//   fly(){
//     console.log(`The ${this.name} can fly`);
//     super.move(this.flySpeed);
//   }
// }


// const rabbit = new Rabbit("rabbit", 1,25);
// const fish = new Fish("fish", 2,12);
// const hawk = new Hawk("hawk", 3,50);


// console.log(rabbit.name);
// console.log(rabbit.age);
// console.log(rabbit.runSpeed)
// rabbit.run();


// console.log(fish.name);
// console.log(fish.age);
// console.log(fish.swimSpeed);
// fish.swim();

// console.log(hawk.name);
// console.log(hawk.age);
// console.log(hawk.flySpeed);
// hawk.fly();



// getter = special method that makes a property readable
// setter = special method that makes a property writeable


// validate and modify a value when reading/writing a property


// class Rectangle{

//     constructor(width, height){
//       this.width = width;
//       this.height = height;
//     }

//     set width(newWidth){
//       if(newWidth > 0){
//         this._width = newWidth;
//       }
//       else{
//         console.error("width must be a Positive number");
//       }
//     }


//     set height(newHeight){
//       if(newHeight > 0){
//         this._height = newHeight;
//       }
//       else{
//         console.error("Height must be a Positive number");
//       }
//     }


//     get width(){
//       return `${this._width.toFixed(1)}cm`;
//     }

//     get height(){
//       return `${this._height.toFixed(1)}cm`;
//     }


//     get area(){
//       return `${(this._width * this._height).toFixed(1)}cm^2`;
//     }
// }

// const rectangle = new Rectangle(3, 4);

// rectangle.width = 5;
// rectangle.height = 6;

// rectangle.width = -100000;
// rectangle.height = "pizza";


// console.log(rectangle.width);
// console.log(rectangle.height);
// console.log(rectangle.area);




// class Person{
//   constructor(firstName, lastName, age){
//     this.firstName = firstName;
//     this.lastName = lastName;
//     this.age = age;
//   }

//   set firstName(newFirstName){
//     if(typeof newFirstName === "string" && newFirstName.length > 0){
//       this._firstName = newFirstName;
//     }
//     else{
//       console.error("First name must be a non-empty string");
//     }
//   }

//   set lastName(newLastName){
//     if(typeof newLastName === "string" && newLastName.length > 0){
//       this._lastName = newLastName;
//     }
//     else{
//       console.error("Last name must be a non-empty string");
//     }
//   }

//   set age(newAge){
//     if(typeof newAge === "number" && newAge >= 0){
//       this._age = newAge;
//     }
//     else{
//       console.error("Age must be a non-negative number");
//     }
//   }


//   get firstName(){
//     return this._firstName;
//   }

//   get lastName(){
//     return this._lastName;
//   }

//   get age(){
//     return this._age;
//   }

//   get fullName(){
//       return this.firstName + " " + this._lastName;
//   }





// }


// const person = new Person("Spongebob", "Squarepants", 30 );

// console.log(person.firstName);
// console.log(person.lastName);
// console.log(person.fullName);
// console.log(person.age);


// destructuring = extracting values from array and objects,
//                 then assign them to variables in a convenient way
//                 [] = to perform array destructuring
//                 {} = to perform object destructuring
//                 5 examples


// ---------- EXAMPLE 1 ---------
// SWAP THE VALUE OF TWO VARIABLES

// let a = 1;
// let b = 2;

// [a, b] = [b, a];

// console.log(a);

// console.log(b);


// ---------- EXAMPLE 2 ---------
// SWAP 2 ELEMENT IN AN ARRAY

// const colors = ["red" , "green", "blue", "black", "white"];


// [colors[0], colors[4]] = [colors[4], colors[0]];

// console.log(colors);

// ---------- EXAMPLE 3 ---------
// ASSIGN ARRAY ELEMENTS TO VARIABLES

// const colors = ["red" , "green", "blue", "black", "white"];

// const [firstColor , secondColor, thirdColor,...extraColors] = colors;

// console.log(firstColor);
// console.log(secondColor);
// console.log(thirdColor);
// console.log(extraColors);


// ---------- EXAMPLE 4 ---------
// EXTRACT VALUES FROM OBJECTS

// const person1 = {
//     firstName: "Spongebob",
//     lastName: "SquarePants",
//     age: 30,
//     job: "Fry cook",
// }

// const person2 = {
//   firstName: "Patrick",
//   lastName: "Star",
//   age: 34,
// }


// const {firstName, lastName , age, job} = person1;
// const {firstName, lastName , age, job="Unemployed"} = person2;


// console.log(firstName);
// console.log(lastName);
// console.log(age);
// console.log(job);


// ---------- EXAMPLE 5 ---------
// DESTRUCTURE IN FUNCTION PARAMETERS


// function displayPerson({firstName, lastName , age , job="Unemployed"}){

//   console.log(`name: ${firstName} ${lastName}`);
//   console.log(`age: ${age}`);
//   console.log(`job: ${job}`);


// }

// const person1 = {
//     firstName: "Spongebob",
//     lastName: "SquarePants",
//     age: 30,
//     job: "Fry cook",
// }

// const person2 = {
//   firstName: "Patrick",
//   lastName: "Star",
//   age: 34,
// }

// displayPerson(person1);

// nested objects = Objects inside of other Objects.
//                  Allows you to represent more complex data structures
//                  Child Object is enclosed by a Parent Object

//                  Person{Address{}, ContactInfo{}}
//                  ShoppingCart{Keyboard{}, Mouse{}, Monitor{}}

// const person = {
//     fullName: "Spongebob Squarepants",
//     age: 30,
//     isStudent: true,
//     hobbies:["karate", "jellyfishing", "cooking"],
//     address: {
//       street: "124 Conch ST.",
//       city: "Bikini Bottom",
//       country: "Int. Water"
//     }
// }

// console.log(person.fullName);
// console.log(person.age);
// console.log(person.isStudent);
// console.log(person.hobbies[2]);
// console.log(person.address.country);

// for(const property in person.address){
//   console.log(person.address[property])
// }


// class Person{
//   constructor(name, age, ...address){
//     this.name = name;
//     this.age = age;
//     this.address = new Address(...address);
//   }
// }

// class Address{

//   constructor(street, city, country){
//     this.street = street;
//     this.city = city;
//     this.country = country;
//   }
// }


// const person1 = new Person("Spongebob", 30, "124 Conch St.",
//                                             "Bikini Bottom",
//                                             "Int. Waters");


// const person2 = new Person("Patrick", 37, "128 Conch St.",
//                                             "Bikini Bottom",
//                                             "Int. Waters");

// const person3 = new Person("Squidward", 45, "126 Conch St.",
//                                             "Bikini Bottom",
//                                             "Int. Waters");


// console.log(person3.address.street);


// ARRAY OF OBJECTS

// const fruits = [{name: "apple", color: "red" , calories: 95},
//                 {name: "orange", color: "orange" , calories: 45},
//                 {name: "banana", color: "yellow" , calories: 105},
//                 {name: "coconut", color: "white" , calories: 159},
//                 {name: "pineapple", color: "yellow" , calories: 37}];


// console.log(fruits[2].calories);

// fruits.push({name: "Grapes", color: "purple", calories: 62});
// fruits.pop();

// fruits.splice(0, 3);

// console.log(fruits);

//--------------- forEach() ---------------
// fruits.forEach(fruit => console.log(fruit.calories));


//--------------- map() ---------------

// const fruitNames = fruits.map(fruit => fruit.name);
// const fruitColors = fruits.map(fruit => fruit.color);
// const fruitCalories = fruits.map(fruit => fruit.calories);

// console.log(fruitNames);
// console.log(fruitColors);
// console.log(fruitCalories);


//--------------- filter() ---------------

// const yellowFruits = fruits.filter(fruit => fruit.color === "yellow");
// const lowCalories = fruits.filter(fruit => fruit.calories < 100);
// const highCalories = fruits.filter(fruit => fruit.calories >= 100);

// console.log(highCalories);



//--------------- reduce() ---------------



// const maxFruit = fruits.reduce((max, fruit) =>
//                                 fruit.calories > max.calories ?
//                                 fruit : max);


// const minFruit = fruits.reduce((min, fruit) =>
//                                 fruit.calories < min.calories ?
//                                 fruit : min);

// const sumCalories = fruits.reduce((previous, next) => {
//                                   return previous + next.calories;
//                                   }, 0);  // Start with an initial value of 0

// console.log(sumCalories);



// sort() = method used to sort elemesnt of an array in place.
//          Sorts elements as strings in lexicographic order, not alphabetical
//          lexicographic = (alphabet + number + symbols) as strings


// let fruits = ["apple", "orange", "banana", "coconut", "pineapple"];
// let numbers = [1, 10, 2, 9, 3, 8, 4, 7, 5, 6,];


// numbers.sort((a, b) => a - b);
// numbers.sort((a, b) => b - a);  // For REVERSE

// This function subtracts b from a:

// If a - b is negative, a is smaller than b, so a will be placed before b.
// If a - b is positive, a is larger than b, so a will be placed after b.
// If a - b is zero, their order doesn't change.

// console.log(numbers);


// const people = [{name: "Spongebob", age: 30, gpa: 3.0},
//                 {name: "Patrick", age: 37, gpa: 1.5},
//                 {name: "Squidward", age: 51, gpa: 2.5},
//                 {name: "Sandy", age: 27, gpa: 4.0} ];

// people.sort((a,b) => a.age - b.age );

// people.sort((a,b) => a.name.localeCompare(b.name) );


// console.log(people)

// SHUFFLE AN ARRAY


// const cards = ['A', 2, 3, 4, 5, 6, 7, 8, 9, 10, 'J', 'Q', 'K'];

// shuffle(cards);

// cards.sort(() => Math.random() - 0.5); NOT RECOMMENDED

// Fisher-Yates algorithm

// function shuffle(array){
//       for(let i = array.length - 1 ; i > 0; i--){
//           const random = Math.floor(Math.random() * (i + 1));

//           [array[i], array[random]] = [array[random], array[i]];
//       }
// }


// console.log(cards);



// Date Objects = Objects that contain values that represent dates and times
//                These date objects can be changed and formatted



// Date(year, month, day, hour, minute, second, ms)

// const date = new Date();

// const date = new Date(2024, 0, 1, 2, 3, 4, 5);
// const date = new Date("2024-09-05T12:00:00Z");
// const date = new Date(1700000000000);

//console.log(date);

// const year = date.getFullYear();
// const month = date.getMonth();
// const day = date.getDate();
// const hour = date.getHours();
// const minutes = date.getMinutes();
// const seconds = date.getSeconds();
// const dayOfWeek = date.getDay();

// console.log(dayOfWeek);

// SETTING THE DATE

// date.setFullYear(2024);
// date.setMonth(0);
// date.setDate(1);
// date.setHours(2);
// date.setMinutes(3);
// date.setSeconds(4);

// const date1 = new Date("2023-12-31");
// const date2 = new Date("2024-01-1");


// if(date2 > date1){
//   console.log("HAPPY NEW YEAR!");
// }



// closure = A function defined inside of another function,
//           the inner function has access to the variables
//           and scope of the outer function.
//           Allow for private variables and state maintenance
//           USed frequently in JS frameworks: React, Vue, Angular

// EXAMPLE

// function outer(){

//   let message = "Hello";

//   function inner(){
//       console.log(message);
//   }

//   inner();

// }

// message = "Goodbye";

// outer();


// function createCounter(){

//     let count = 0;

//     function increment(){
//         count++;
//         console.log(`Count increased to ${count}`);

//     }

//     function getCount(){
//       return count;
//     }
    
//     return {increment, getCount};
// }

// const counter = createCounter();

// counter.increment();
// counter.increment();
// counter.increment();


// console.log(`The Current Count is ${counter.getCount()}`);



// function createGame(){

//     let score = 0;

//     function increaseScore(points){

//         score += points;
//         console.log(`+${points}pts`);

//     }

//     function decreaseScore(points){

//       score -= points;
//       console.log(`-${points}pts`);
      
//     }

//     function getScore(){
//       return score;
//     }

//     return {increaseScore, decreaseScore, getScore};
  
// }


// const game = createGame();


// game.increaseScore(5);
// game.increaseScore(6);

// game.decreaseScore(3);

// console.log(`The final score is ${game.getScore()}pts`)



// setTimeout() = function in JavaScript that allows you to schedule
//                the execution of a function after an amount of time (milliseconds)
//                Times are approximate (-varies based on the workload of the JavaScript runtime env.)

//                setTimeout(callback, delay);


// function sayHello(){
//   window.alert("Hello");
// }

// setTimeout(sayHello, 3000);
// setTimeout(() => window.alert("Hello"), 3000);

// clearTimeout(timeoutId) = can cancel a timeout before it triggers
// const timeoutId = setTimeout(() => window.alert("Hello"), 3000);
// clearTimeout(timeoutId);

// let timeoutId;

// function startTimer(){
//   timeoutId =  setTimeout(() => window.alert("Hello"), 3000);
//   console.log("STARTED");
// }

// function clearTimer(){
//   clearTimeout(timeoutId);
//   console.log("CLEARED");

// }

// ES6 Module = An external file that contains reusable code
//              that can be imported into other JavaScript files.
//              Write reusable code for many different apps.
//              Can contain variables, classes, functions ... and more
//              Introduced as part of ECMAScript 2015 update





// import {PI,getCircumference, getArea , getVolume} from './mathutil.js';

// console.log(PI);

// const circumference = getCircumference(10);
// const area = getArea(10);
// const volume = getVolume(10);

// console.log(`${circumference.toFixed(2)}.cm`);
// console.log(`${area.toFixed(2)}.cm^2`);
// console.log(`${volume.toFixed(2)}.cm^3`);



// synchronous = Executes line by line consecutively in a sequential manner
//               COde that waits for an operation to complete.

// asynchronous = Allows multiple operations to be performed concurrently without waiting
//                Doesn't block the execution flow and allows the program to continue
//                (I/O operations, network requests, fetching data)
//                handled with: Callbacks, Promises, Async/Await





// function func1(callback){
//     setTimeout(() => {console.log("Task 1");
//                         callback() }, 3000);


// }

// function func2(){

//     console.log("Task 2");
//     console.log("Task 3");
//     console.log("Task 4");

// }

// func1(func2);


// Error = An Object that is Created to represent a Problem that occurs
//         Occurs often when user input or establishing a connection

// Try{ } = Encloses code that might potentially cause an error
// catch { } = Catch and handle any thrown Errors from try { }
// finally { } = (optional) Always executes. Used mostly for clean up
//               ex. close files, close connections, release resources



// try{

//     console.log(x);
//     //  NETWORK ERROR
//     //  PROMISE REJECTION
//     //  SECURITY ERRORS

// }
// catch(error){
//     console.error(error);
// }
// finally{
//     // CLOSE FILES
//     // CLOSE CONNECTIONS
//     // RELEASE RESOURCES
//     console.log("This always executes")
// }

// console.log("You have reached the end!");


// EXAMPLE

// try{

//     const dividend = Number(window.prompt("Enter a dividend: "));
//     const divisor = Number(window.prompt("Enter a divisor: "));

//     if(divisor == 0){
//         throw new Error("You can't divide by zero!");
//     }

//     if(isNaN(dividend) || isNaN(divisor)){
//         throw new Error("Values must be a number");
//     }

//     const result = dividend / divisor;

//     console.log(result);
// }
// catch(error){
//     console.error(error);
// }

// console.log("You have reached the end");




//  DOM = DOCUMENT OBJECT MODEL
//        Object{} that represents the page you see in the web browser
//        and provides you with an API to interact with it.
//        Web browser constructs the DOM when it loads an HTML document,
//        and structures all the elements in a tree-like representation.
//        JavaScript can access the DOM to dynamically
//        change the content, structure, and style of a web page.


// document.title = "Hello";
// document.body.style.backgroundColor = "hsl(0,0%,15%)";

// const username = " Bro Code";

// const welcomeMsg = document.getElementById("welcome-msg");

// welcomeMsg.textContent += username  === "" ? " Guest" : username;

// console.dir(document);



// element selectors = Methods used to target and manipulate HTML elements
//                     They allow you select one or more multiple HTML elements
//                     from the DOM (Document Object Model)



// 1. document.getElementById()            // ELEMENT OR NULL
// 2. document.getElementsClassName()      // HTML COLLECTION
// 3. document.getElementsByTagName()      // HTML COLLECTION
// 4. document.querySelector()             // FIRST ELEMENT OR NULL
// 5. document.querySelectorAll()          // NODELIST

// 1. document.getElementById()            // ELEMENT OR NULL
// const myHeading = document.getElementById("my-heading");

// myHeading.style.backgroundColor = "yellow";
// myHeading.style.textAlign = "center";

// console.log(myHeading);



// 2. document.getElementsClassName()      // HTML COLLECTION
// const fruits = document.getElementsByClassName("fruits");


// for(let fruit of fruits){
//     fruit.style.backgroundColor = "yellow";
// }

// fruits[1].style.backgroundColor = "yellow";

// fruits.forEach();           NOT ALLOWED

// Array.from(fruits).forEach(fruit => {
//         fruit.style.backgroundColor = "yellow";
// });

// console.log(fruits);


// 3. document.getElementsByTagName()      // HTML COLLECTION

// const h4Elements = document.getElementsByTagName("h4");

// const liElements = document.getElementsByTagName("li");

// for(let h4Element of h4Elements){
//     h4Element.style.backgroundColor = "yellow";
// }

// for(let liElement of liElements){
//     liElement.style.backgroundColor = "lightgreen";
// }

// Array.from(h4Elements).forEach(h4Element => {
//     h4Element.style.backgroundColor = "yellow";
// });

// Array.from(liElements).forEach(liElement => {
//     liElement.style.backgroundColor = "lightgreen";
// });

// h4Elements[1].style.backgroundColor = "yellow";

// console.log(h4Elements);


// 4. document.querySelector()             // FIRST ELEMENT OR NULL


// const element = document.querySelector("h4");

// element.style.backgroundColor = "yellow";

// console.log(element);

// 5. document.querySelectorAll()          // NODELIST

// it has build-in methods


// const foods = document.querySelectorAll("li");

// foods[5].style.backgroundColor = "yellow";


// console.log(foods);

// foods.forEach(food => {
//     food.style.backgroundColor = "yellow";
// })



// DOM navigation = The process of navigating through the structure
//                  of an HTML document using JavaScript.


// .firstElementChild
// .lastElementChild
// .nextElementSiblings
// .previousElementSiblings
// .parentElement
// .children


// ---------- .firstElementChild -----------

// const element = document.getElementById("desserts");
// const firstChild = element.firstElementChild;
// firstChild.style.backgroundColor = "yellow";


// const ulElements = document.querySelectorAll("ul");

// ulElements.forEach(ulElements => {
//     const firstChild = ulElements.firstElementChild;
//     firstChild.style.backgroundColor = "yellow";
// });


// ---------- .lastElementChild -----------


// const element = document.getElementById("vegetables");
// const lastChild = element.lastElementChild;
// lastChild.style.backgroundColor = "yellow";

// const ulElements = document.querySelectorAll("ul");

// ulElements.forEach(ulElements => {
//     const lastChild = ulElements.lastElementChild;
//     lastChild.style.backgroundColor = "yellow";
// });


// ---------- .nextElementChild -----------


// const element = document.getElementById("vegetables");

// const nextSibling = element.nextElementSibling;

// nextSibling.style.backgroundColor = "yellow";


// ---------- .previousElementChild -----------


// const element = document.getElementById("desserts");

// const prevSibling = element.previousElementSibling;

// prevSibling.style.backgroundColor = "yellow";


// ---------- .parentElement -----------

// const element = document.getElementById("ice cream");

// const parent = element.parentElement;

// parent.style.backgroundColor = "yellow"


// ---------- .children -----------

// const element = document.getElementById("fruits");

// const children = element.children;

// children[1].style.backgroundColor = "yellow";

// Array.from(children).forEach(child => {
//     child.style.backgroundColor = "yellow";
// })

// console.log(children);

//  Add and Change HTML

//  -------------  EXAMPLE 1 <h1> ----------

// STEP 1 CREATE THE ELEMENT
// const newListItem = document.createElement("li");


// const newH1 = document.createElement("h1");

// STEP 2 ADD ATTRIBUTES/PROPERTIES

// newListItem.textContent = "coconut";
// newListItem.id = "coconut";
// newListItem.style.fontWeight = "bold";
// newListItem.style.backgroundColor = "lightgreen";



// newH1.textContent = "I like Pizza";
// newH1.id = "myH1";
// newH1.style.color = "tomato";
// newH1.style.textAlign = "center";


// STEP 3 APPEND ELEMENT TO DOM

// document.body.append(newListItem);
// document.body.prepend(newListItem);
// document.getElementById("fruits").append(newListItem);
// document.getElementById("fruits").prepend(newListItem);
// const banana = document.getElementById("banana");
// document.getElementById("fruits").insertBefore(newListItem,banana);


// const listItems = document.querySelectorAll("#fruits li");
// document.getElementById("fruits").insertBefore(newListItem, listItems[4])






//  document.body.append(newH1);  // will be the last child
// document.body.prepend(newH1);  // will be first child
// document.getElementById("box1").append(newH1);
// document.getElementById("box1").prepend(newH1);

// const box4 = document.getElementById("box4");
// document.body.insertBefore(newH1, box4);

// IF DON'T HAVE ID THEN
// const boxes = document.querySelectorAll(".box");
// document.body.insertBefore(newH1, boxes[0])

// REMOVE HTML ELEMENT

// if it is not in the other parent like div , h1 etc.
// document.body.removeChild(newH1);

// document.getElementById("fruits").removeChild(newListItem);


// document.getElementById("box1").removeChild(newH1);



// eventListener = Listen for specific events to create interactive web pages
//                 events: click, mouseover, mouseout
//                 .addEventListener(event, arrow function || callback)



// const myBox = document.getElementById("myBox");
// const myButton = document.getElementById("myButton");


// // function changeColor(event){
    
// //     event.target.style.backgroundColor = "tomato";
// //     event.target.textContent = "Suiii";

// // }

// myButton.addEventListener("click", event => {
//     myBox.style.backgroundColor = "tomato";
//     myBox.textContent = "Suiii";
// });



// myButton.addEventListener("mouseover", event => {
//     myBox.style.backgroundColor = "yellow";
//     myBox.textContent = "Don't do it";
// })

// myButton.addEventListener("mouseout", event => {
//     myBox.style.backgroundColor = "lightgreen";
//     myBox.textContent = " Click Me 😊";
// });


// KEY EVENTS
// events: keydown, keyup
// document.addEventListener(event, callback);

// const myBox = document.getElementById("myBox");

// const moveAmount = 100;
// let x = 0;
// let y = 0;

// document.addEventListener("keydown", event => {

//     if(event.key.startsWith("Arrow")){

//         event.preventDefault();

//         switch(event.key){

//             case "ArrowUp":
//                 y -= moveAmount;
//                 break;

//             case "ArrowDown":
//                 y += moveAmount;
//                 break;

//             case "ArrowLeft":
//                 x -= moveAmount;
//                 break;

//             case "ArrowRight":
//                 x += moveAmount;
//                 break;
//         }
//         myBox.style.top = `${y}px`;
//         myBox.style.left = `${x}px`;
//     }
// })

// document.addEventListener("keydown", event  => {
//     myBox.textContent = "👽";
//     myBox.style.backgroundColor = "tomato";
// });


// document.addEventListener("keyup", event  => {
//     myBox.textContent = "😊";
//     myBox.style.backgroundColor = "lightblue";
// });


// HIDE AND SHOW HTML

// const myButton = document.getElementById("myButton");
// const myImg = document.getElementById("myImg");

// myButton.addEventListener("click", event => {


//     if(myImg.style.visibility === "hidden"){
//         myImg.style.visibility = "visible";
//         myButton.textContent = "Hide"
//     }
//     else{
//         myImg.style.visibility = "hidden";
//         myButton.textContent = "Show"
//     }

// });






// NodeList = Static collection of HTML elements by (id, class, element)
//            Can be created by using querySelectorAll()
//            Similar to an array, but no (map, filter, reduce)
//            NodeList won't update to automatically reflect changes



// let buttons = document.querySelectorAll(".myButtons");

// ADD HTML/CSS PROPERTIES

// buttons.forEach(button => {
//     button.style.backgroundColor = "green";
//     button.textContent += "😊"
// });


// CLICK event listener

// buttons.forEach(button => {
//     button.addEventListener("click", event => {
//         event.target.style.backgroundColor = "tomato";
//     });
// });


// MOUSEOVER + MOUSEOUT event listener


// buttons.forEach(button => {
//     button.addEventListener("mouseover", event =>{
//         event.target.style.backgroundColor = "hsl(205, 100%, 40%)"
//     });
// });


// buttons.forEach(button => {
//     button.addEventListener("mouseout", event =>{
//         event.target.style.backgroundColor = "hsl(205, 100%, 60%)"
//     });
// });



// ADD AN ELEMENT

// Step 1  create the element

// const newButton = document.createElement("button");

// Step 2 add necessary properties

// newButton.textContent = "Button 5";
// newButton.classList = "myButtons";

// Step 3 append to the DOM(Document Object Model)

// document.body.appendChild(newButton);

// buttons = document.querySelectorAll(".myButtons"); // will be updated to 5 NodeLists

// console.log(buttons);


// REMOVE AN ELEMENT

// buttons.forEach(button => {
//     button.addEventListener("click", event =>{
//         event.target.remove();
//         buttons = document.querySelectorAll(".myButtons");
//         console.log(buttons);
//     });
// });




// classList = Element property in JavaScript used to interact
//             with an element's list of classes (CSS classes)
//             Allows you to make reusable classes for many elements
//             across your webpage.

// add()
// remove()
// toggle(Remove if present, Add if not)
// replace(oldClass, newClass)
// contains()

// const myButton = document.getElementById("myButton");
// const myH1 = document.getElementById("myH1");

// myH1.classList.add("enabled");


// myButton.classList.add("enabled");
// myButton.classList.remove("enabled");


// myButton.addEventListener("mouseover", event =>{
//     event.target.classList.add("hover");
// } );

// myButton.addEventListener("mouseout", event =>{
//     event.target.classList.remove("hover");
// } );


// myButton.classList.add("hover");


// myButton.addEventListener("mouseover", event =>{
//     event.target.classList.toggle("hover");
// } );

// myButton.addEventListener("mouseout", event =>{
//     event.target.classList.toggle("hover");
// } );

// myButton.classList.add("enabled");


// myButton.addEventListener("click",event=> {
    
//     if(event.target.classList.contains("disabled")){
//         event.target.textContent += "😊";
//     }
//     else{
//         event.target.classList.replace("enabled", "disabled");
//     }

// });


// myH1.addEventListener("click",event=> {
    
//     if(event.target.classList.contains("disabled")){
//         event.target.textContent += "😊";
//     }
//     else{
//         event.target.classList.replace("enabled", "disabled");
//     }

// });


// let buttons = document.querySelectorAll(".myButtons");

// buttons.forEach(button => {
//     button.classList.add("enabled");
// });


// buttons.forEach(button => {
//     button.addEventListener("mouseover",event => {
//         event.target.classList.toggle("hover");
//     });
// });


// buttons.forEach(button => {
//     button.addEventListener("mouseout",event => {
//         event.target.classList.toggle("hover");
//     });
// });

// buttons.forEach(button => {
//     button.addEventListener("click", event => {

//         if(event.target.classList.contains("disabled")){
//             event.target.textContent += "😊";
//         }
//         else{
//             event.target.classList.replace("enabled", "disabled");
//         }
//     });
// });


// IMAGE SLIDER

// const slides = document.querySelectorAll(".slides img");
// let slideIndex = 0;
// let intervalID = null;


// // initializeSlider();

// document.addEventListener("DOMContentLoaded", initializeSlider);

// function initializeSlider(){
    
//     if(slides.length > 0){
//         slides[slideIndex].classList.add("displaySlide");
//         intervalID = setInterval(nextSlide, 5000);
//     }
// }

// function showSlide(index){
//     if(index >= slides.length){
//         slideIndex = 0;
//     }
//     else if(index < 0){
//         slideIndex = slides.length - 1;
//     }

//     slides.forEach(slide => {
//         slide.classList.remove("displaySlide");
//     });

//     slides[slideIndex].classList.add("displaySlide");
// }

// function prevSlide(){
//     clearInterval(intervalID);
//     slideIndex--;
//     showSlide(slideIndex);
// }

// function nextSlide(){
//     slideIndex++;
//     showSlide(slideIndex);
// }

// Callback Hell = Situation in JavScript where callbacks
//                 are nested within other callbacks to the
//                 degree where the code is difficult to read.
//                 Old pattern to handle asynchronous functions.
//                 Use Promises + async/await to avoid Callback Hell


// function task1(callback){
//     setTimeout(() =>{
//     console.log("Task 1 complete");
//         callback();
//     }, 2000);
// }

// function task2(callback){

//     setTimeout(() =>{
//         console.log("Task 2 complete");
//         callback();
//         }, 1000);
// }

// function task3(callback){
//     setTimeout(() =>{
//         console.log("Task 3 complete");
//         callback();
//         }, 3000);
// }

// function task4(callback){

//     setTimeout(() =>{
//         console.log("Task 4 complete");
//         callback();
//         }, 1500);
// }

// task1(() =>{
//     task2(() => {
//         task3(() => {
//             task4(() => {
//                 console.log("All tasks Completed")
//             });
//         });
//     });
// });




// Promise = An Object that manages asynchronous operations.
//           Wrap a Promise Object around {asynchronous code}
//           "I promise to return a value"
//           PENDING -> RESOLVED or REJECTED
//           new Promise((resolve, reject)) => {asynchronous code}



// DO THESE CHORES IN ORDER

//  1. WALK THE DOG
//  2. CLEAN THE KITCHEN
//  3. TAKE OUT THE TRASH



// function walkDog(){
    
//     return new Promise((resolve, reject) => {

//         setTimeout(() => {

//             const dogWalked = false;
            
//             if(dogWalked){
//                 resolve("You walk the dog 🐕");
//             }
//             else{
//                 reject("You DIDN'T walk the dog")
//             }

//         }, 1500);

//     });
// }

// function cleanKitchen(){


//     return new Promise((resolve, reject) => {
//         setTimeout(() => {

//             const kitchenCleaned = true;

//             if(kitchenCleaned){
//                 resolve("You clean the kitchen 🧹");
//             }
//             else{
//                 reject("You DIDN'T clean the kitchen");
//             }


//         }, 2500);
//     });
// }



// function takeOutTrash(){

//     return new Promise((resolve, reject) => {

//         setTimeout(() => {

//             const trashTakenOut = true;

//             if(trashTakenOut){
//                 resolve("You take out the trash ♻");
//             }
//             else{
//                 reject("You DIDN'T take out the trash");
//             }

//         }, 500);
//     });

// }


// walkDog().then(value => {console.log(value); return cleanKitchen() })
//         .then(value => {console.log(value); return takeOutTrash()})
//         .then(value => {console.log(value); console.log("you finished all the chores!")});




// walkDog(() => {
//     cleanKitchen(() => {
//         takeOutTrash(() => {
//             console.log("You finished all the chores!");
//         });
//     });
// }).catch(error => { console.error(error)});




// Async/Await = Async = makes a function return a promise
//               Await = makes an async function wait for a promise

//               Allows you write asynchronous code in asynchronous manner
//               Async does't have resolve or reject parameters
//               Everything after Await is placed in an event queue


// function walkDog(){
    
//     return new Promise((resolve, reject) => {

//         setTimeout(() => {

//             const dogWalked = true;
            
//             if(dogWalked){
//                 resolve("You walk the dog 🐕");
//             }
//             else{
//                 reject("You DIDN'T walk the dog")
//             }

//         }, 1500);

//     });
// }

// function cleanKitchen(){


//     return new Promise((resolve, reject) => {
//         setTimeout(() => {

//             const kitchenCleaned = true;

//             if(kitchenCleaned){
//                 resolve("You clean the kitchen 🧹");
//             }
//             else{
//                 reject("You DIDN'T clean the kitchen");
//             }


//         }, 2500);
//     });
// }

// function takeOutTrash(){

//     return new Promise((resolve, reject) => {

//         setTimeout(() => {

//             const trashTakenOut = true;

//             if(trashTakenOut){
//                 resolve("You take out the trash ♻");
//             }
//             else{
//                 reject("You DIDN'T take out the trash");
//             }

//         }, 500);
//     });

// }


// async function doChores(){


//     try{

//         const walkDogResult = await walkDog();
//         console.log(walkDogResult);
    
//         const cleanKitchenResult = await cleanKitchen();
//         console.log(cleanKitchenResult);
    
//         const takeOutTrashResult = await takeOutTrash();
//         console.log(takeOutTrashResult);
    
//         console.log("Yoo finished all the chores!");

//     }
//     catch(error){
//         console.error(error);
//     }

// }

// doChores();



// JSON = (JavaScript Object Notation) data-interchange format
//        Used for exchanging data between a server and a web applicatiob
//         JSON files {key:value} OR [value1, value2, value3]

//        JSON.stringify() = converts a JS object to a JSON string.
//        JSON.parse() = converts a JSON string to a JS object


// const names = ["Spongebob", "Patrick", "Squidward", "Sandy"];

// const person = {
//     "name":"Spongebob",
//     "age":30,
//     "isEmployed": true,
//     "hobbies":["jellyFising", "Karate", "Cooking"]
// };

// const people = [{ "name":"Spongebob","age":30, "isEmployed": true},
//                 {"name":"Patrick", "age":34,"isEmployed": false},
//                 {"name":"Squidward","age":50,"isEmployed": true},
//                 {"name":"Sandy","age":27,"isEmployed": false}];



// const jsonString = JSON.stringify(people);

// // console.log(jsonString);


// const jsonNames = `["Spongebob", "Patrick", "Squidward", "Sandy"]`;

// const jsonPerson = `{
//     "name":"Spongebob",
//     "age":30,
//     "isEmployed": true,
//     "hobbies":["jellyFising", "Karate", "Cooking"]
// }`;

// const jsonPeople = `[{ "name":"Spongebob","age":30, "isEmployed": true},
//                 {"name":"Patrick", "age":34,"isEmployed": false},
//                 {"name":"Squidward","age":50,"isEmployed": true},
//                 {"name":"Sandy","age":27,"isEmployed": false}]`;


// const parsedData = JSON.parse(jsonPeople);

// console.log(parsedData);


// fetch("people.json")
//     .then(response => response.json())
//     .then(values => values.forEach(value => console.log(value)))
//     .catch(error => console.error(error));



// fetch = Function used for making HTTP request to fetch resources.
//         (JSON style data, images, files)
//         Simplifies asynchronous data fetching in JavaScript and
//         used for interacting with APIs to retrieve and send
//         data asynchronous over the web.
//         fetch(url, {options})



