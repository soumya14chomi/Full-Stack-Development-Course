import React, {useState} from "react";



function HooksCounter2() {

    const initialCount =0;
    const [count, setCount] = useState(0);
  return (
    <div>
        Count : {count} <br/>
        <button onClick={() => setCount(initialCount)} >Reset </button><br/>
        <button onClick={() => setCount(count+1)} > Increment </button><br/>
        <button onClick={() => setCount(count>0? count-1 : 0)} > Decrement </button><br/>
        <button onClick={() => setCount(count+5)} >Increment 5</button><br/>
    </div>
  )
}

export default HooksCounter2