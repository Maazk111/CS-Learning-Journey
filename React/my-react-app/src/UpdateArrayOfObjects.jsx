import React, { useState } from "react";

// He Split the object into multiple arrays
function UpdateArrayOfObjects(){

    const [cars, setCars ] = useState([]);
    const [carYear, setCarYear] = useState(new Date().getFullYear());
    const [carMake, setCarMake] = useState("");
    const [carModel, setCarModel] = useState("");


    function handleAddCar(){
        const newCar = {year: carYear, 
                        Make: carMake, 
                        Model: carModel};

        setCars(c => [...c, newCar]);    

        setCarYear(new Date().getFullYear());
        setCarMake("");
        setCarModel("");


    }

    function handleRemovecar(index){
        setCars(c => c.filter((_, i) => i!==index));
    }

    function handleYearChange(event){
        setCarYear(event.target.value);
    }

    function handleMakeChange(event){
        setCarMake(event.target.value);

    }

    function handleModelChange(event){
        setCarModel(event.target.value);

    }


    return( <div>
       
                <h2>List of Car Objects</h2>
                <ul>
                    {cars.map((car, index) => 
                        <li key={index} onClick={() => handleRemovecar(index)} >
                            {car.year} {car.Make} {car.Model}
                        </li> )}

                </ul>

                <input type="number" value={carYear} onChange={handleYearChange}/><br />
                <input type="text" value={carMake} onChange={handleMakeChange} 
                       placeholder="Enter car make" /><br />
                <input type="text" value={carModel} onChange={handleModelChange} 
                       placeholder="Enter car model" /><br />     

                <button onClick={handleAddCar} >Add Car</button>         
    </div> );
}

export default UpdateArrayOfObjects