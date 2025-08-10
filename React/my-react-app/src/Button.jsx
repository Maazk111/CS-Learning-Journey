function Button(){


    // const styles = {
       
    //         backgroundColor: "hsl(200, 100%, 50%)",
    //         color: "white",
    //         padding: "10px 20px",
    //         borderRadius: "5px",
    //         border: "none",
    //         cursor: "pointer"
        
    // }

    // let count = 0;

    // const handleClick = (name) => {

    //     if(count < 3){
    //         count++;
    //         console.log(`${name} you clicked me ${count} time/s`)
    //     }
    //     else{
    //         console.log(`${name} stop clicking me`);
    //     }

    // };

    // const handleClick2 = (name) => console.log(`${name} stop clicking me`);

    const handleClick = (e) => { e.target.textContent = "OUCH! 🤕"};



    return(
        // <button className={styles} >Click me</button>

        // if there is Arg then add arrow function otherwise just a function name
        // <button onClick={() => handleClick2("Maaz Khan")}>Click me 👌</button>
        // <button onClick={() => handleClick("Rumaisa")}>Click me 👌</button>

        <button onDoubleClick={(e) => handleClick(e)}>Click me 👌</button>



    );

}

export default Button