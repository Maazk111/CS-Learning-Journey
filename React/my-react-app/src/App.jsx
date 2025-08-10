// HOW TO STYLE REACT COMPONENTS WITH CSS
// ---------------------------------------
// (not including external frameworks or preprocessors)


// 1. EXTERNAL
// 2. MODULES
// 3. INLINE

// props = read-only properties that are shared between components.
//          A parent component can send data to a child component.
//          <Component key=value /> 

// propTypes = a mechanism that ensures that the passed value
//             is of the correct datatype.
//             age: PropTypes.number 

// defaultProps = default values for props in case they are not
// passed from the parent component
//      name: "Guest"


// conditional rendering = allows you to control what gets rendered
//                         in your application based on certain conditions
//                         (show, hide, or change components)

// click event = An interaction when a user clicks on a specific element.
//               We can respond to clicks by passing
//               a callback to the onClick event handler.

// React hook = Special function that allows functional components
//              to use React features without writing class components (React v16.8)
//              (useState, useEffect, useContext, useReducer, useCallback, and more...)

// useState() = A React hook that allows the creation of a stateful variable
//              AND a setter function to update its value in the Virtual DOM.
//              [name, setName]

// onChange = event handler used primarily with form elements
//            ex. <input>, <textarea>, <select>, <radio>
//            Triggers a function every time the value of the input changes


// updater-function = A function passed as an argument to setState() usually
//     ex. setYear(y => y + 1)
//     Allow for safe updates based on the previous state
//     Used with multiple state updates and asynchronous functions
//     Good practice to use updater functions


// useEffect() = React Hook that tells React DO SOME CODE WHEN (pick one):
// 
//               This component re-renders
//               This component mounts+
//               The state of a value
//
// useEffect(function, [dependencies])
//
// 1. useEffect(() => {})          // Runs after every re-render
// 2. useEffect(() => {}, [])      // Runs only on mount
// 3. useEffect(() => {}, [value]) // Runs on mount + when value changes
//
// USES
//
// #1 Event Listeners
// #2 DOM manipulation
// #3 Subscriptions (real-time updates)
// #4 Fetching Data from an API
// #5 Clean up when a component unmounts


// useContext() = React Hook that allows you to share values
//                between multiple levels of components
//                without passing props through each level

// PROVIDER COMPONENT
// 1. import {createContext} from 'react';
// 2. export const MyContext = createContext();
// 3. <MyContext.Provider value={value}>
//        <Child />
//    </MyContext.Provider>

// CONSUMER COMPONENTS
// 1. import React, { useContext } from 'react';
//    import { MyContext } from './ComponentA';
// 3. const value = useContext(MyContext);


// useState() = Re-renders the component when the state value changes.

// useRef() = "Use Reference" Does not cause re-renders when its value changes.
//             When you want a component to "remember" some information, 
//             but you don't want that information to trigger new renders.

//             1. Accessing/Interacting with DOM elements
//             2. Handling Focus, Animations, and Transitions
//             3. Managing Timers and Intervals


import ComponentA from "./ComponentA.jsx";
import UseRefHook from "./useRefHook.jsx";
function App() {


  
  const fruits = [{id: 1, name:"apple", calories: 95},
                  {id: 2, name:"orange", calories: 45}, 
                  {id: 3, name:"banana", calories: 105}, 
                  {id: 4, name:"coconut", calories: 159}, 
                  {id: 5, name:"pineapple", calories: 37} ];

  const vegetables = [{id: 6, name: "potatoes", calories: 110},
                      {id: 7, name: "celery", calories: 15},
                      {id: 8, name: "carrots", calories: 25},
                      {id: 9, name: "corn", calories: 63},
                      {id: 10, name: "broccoli", calories: 50}];
      


  return (

      //  Components  -- reusable piece of UI. 
       
      // <Card />
      // <Card />
      // <Card />
      // <Card /> 

      // <Button />

     
      // Props (Properties) Props are used to pass data from one component to another.
      //   <Student  name="Spongebob" age={30} isStudent={true}/>
      //   <Student  name="Patrick" age={42} isStudent={false}/>
      //   <Student  name="Squidward" age={50} isStudent={false}/>
      //   <Student  name="Sandy" age={27} isStudent={true}/>
      //   <Student  />


      // <> <UserGreeting isLoggedIn={true} username="broCode" /></>


      // <>
      //         {/* {fruits.length > 0 ? <List items={fruits} category="Fruits" /> : null } */}

      //         {fruits.length > 0 && <List items={fruits} category="Fruits" />}


      //         {vegetables.length > 0 ? <List items={vegetables} category="Vegetables" /> : null }
      // </>

    //  <>
    //         < Button />

    //         < ProfilePicture />
            
    //  </>




    // <>
    //   <MyComponent />

    //   <Counter />

    // </>


    // <>
    //  < OnChange />
    // </>


    // <> 
    //   < ColorPicker />
    // </>


    // <>
    //       < UpdateObj/>
    //       < UpdateArrayOfObjects />
    // </>


    // <>
    // < ToDoList/>
    // </>


    // <>
    //   < UseEffectHook/>
    //   < UseEffectExample/>
    // </>


    // <>   
    //   < DigitalClock />
    // </>

    // <>
    //   <ComponentA />
    // </>

    <>
      < UseRefHook/>
    </>

  );
}

export default App;
