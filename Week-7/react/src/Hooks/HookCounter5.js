import React, {useEffect, useState} from "react";

function HooksCounter5() {
    const [count, setCount] = useState(0);
    const [name, setName] = useState('');

    useEffect(() => {
        console.log("updating the Document Title");
        document.title = "You clicked the Mouse " +count  + " times";
    }, [count])
    return ( 
        <div>
            
            <input type ="text" value ={name} onChange={e => setName(e.target.value)}/> <br/>
            {/* Name : {name} */}
            <button onClick={ () => setCount(count+1)}>
                useEffect Example - Click {count} times
            </button>

        </div>
     );
}

export default HooksCounter5;