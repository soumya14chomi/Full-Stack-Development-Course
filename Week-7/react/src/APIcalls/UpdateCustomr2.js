import React, { useState } from 'react'
import { json, useParams } from 'react-router-dom';
import CustomerAPI from '../service/CustomerAPI';
import { useLocation } from 'react-router-dom';



const UpdateCustomr2 = (props) => {
    // console.log("UseParams():"+useParams());
    const {state} = useLocation();
    // console.log("Pramas:"+props);
    //console.log("state Name:"+state + " Class:"+typeof state);
    const {userId : custId} = useParams(); 
        const [name, setName] = useState(state["name"] || '');
        const [email, setEmail] = useState(state["email"] || '');
        const [mobile, setMobile]  = useState(state["mobile"] || '');
        const [gender, setGender] = useState(state["gender"] || '');
        const [age, setAge] = useState(state["age"] || 0);
        const [nationality, setNationality] = useState(state["nationality"] || '');
        // console.log("State Name" + state.name);
    const [message, setMessage] =useState("");
    const updateCustomer = (custId) => {
        // console.log("Customer Id:" + custId)
        var details = {
            "name" : name,
            "email" :email,
            "mobile" : mobile,
            "gender" : gender,
            "age" :age,
            "nationality" : nationality
            
        }
        CustomerAPI.updateUser(custId, details)
            .then((response) => {
                setMessage( JSON.stringify(response.data));
            })
            .catch((error) =>{
                console.log(error);
            });
        }
  return (
    <div>
                <h2> Update Customer Details</h2>
                <form>
                    Enter Name : <input type ="text" id = "custName" value  = {name} onChange={e => setName( e.target.value )}/> <br/>
                    Enter Email : <input type ="text" id = "email" value = {email}  onChange={ e => setEmail(e.target.value)}/> <br/>
                    Enter mobile : <input type ="text" value = {mobile} onChange={(e) => setMobile(  e.target.value)}/> <br />
                    Enter gender : <input type ="text" value = {gender}  onChange={(e) => setGender(e.target.value)} /><br />
                    Enter age : <input type ="number" value = {age} onChange={(e) => setAge( e.target.value)} /><br/>
                    Enter nationality : <input type ="text" value = {nationality} onChange={(e) => setNationality( e.target.value)} /><br/>
                    
                    <button type ="button" onClick={ () => updateCustomer(custId)}> Update Details</button>
                    {message && <p>{message}</p>} {/* Conditionally render the message */}
                </form>
        </div>
  )
}

export default UpdateCustomr2;