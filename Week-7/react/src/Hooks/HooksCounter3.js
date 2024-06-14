import React, {useState} from "react";

function HooksCounter3() {
    const [name, setName] = useState({firstName : '', lastName : ''});
    console.log(name);
    return (  
        <form>
            <label>FirstName</label>
            <input type = "text" value = {name.firstName} onChange = {e => setName({...name, firstName: e.target.value})}/> <br/>
            <label>LastName</label>
            <input type = "text" value = {name.lastName} onChange = {e => setName({...name, lastName: e.target.value})}/>
            <h4> Your FirstName is {name.firstName}</h4>
            <h4> Your LastName is {name.lastName}</h4>

        </form>
    );
}

export default HooksCounter3;