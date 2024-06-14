import React, {Component, useState} from "react";
import CustomerAPI from "../service/CustomerAPI";

class AddCustomer extends Component {
    
    // const [custname, setCustName] = useState('');
    // const [email, setEmail] = useState('');
    // const [gender, setGender] = useState('');
    // const [nationality, setNationality] = useState('');
    // const [age, setAge] = useState(0);
    // const [mobile, setMobile] =useState('');
    constructor(props) {
        super(props);
        
        this.state = {
            "name" : 'react',
            "email" : 'react@react.com',
            "mobile" : '8989898989    ',
            "gender" : 'F',
            "nationality" : 'Indian',
            "age" : 0,
            "message" : ''
        }
        // this.addingCustomer = this.addingCustomer.bind(this);
    }



    addingCustomer = () => {
        CustomerAPI.addUser(this.state)
            .then((response) => {
                this.setState({message :  JSON.stringify(response.data), error: ''});
            })
            .catch((error) =>{
                console.log(error);
                this.setState({
                    message :  error.response.data.name+","
                                    +error.response.data.mobile+","
                                    +error.response.data.age+","
                                    +error.response.data.email+","
                                    +error.response.data.gender+","
                                    +error.response.data.nationality

                })
            });

        // console.log(this.state);
    }
    state = {  }
    render() { 
        return ( 
            <div>
                <h2> Give User Details</h2>
                <form>
                    Enter Name : <input type ="text" id = "custName" name = "custName" onChange={e => this.setState({ "name" :  e.target.value} )}/> <br/>
                    Enter Email : <input type ="text" id = "email" name = "email" onChange={ e => this.setState({ "email" : e.target.value})}/> <br/>
                    Enter mobile : <input type ="text"  onChange={(e) => this.setState( {"mobile" : e.target.value})}/> <br />
                    Enter gender : <input type ="text"  onChange={(e) => this.setState({"gender": e.target.value})} /><br />
                    Enter age : <input type ="number"  onChange={(e) => this.setState({ "age" : e.target.value})} /><br/>
                    Enter nationality : <input type ="text"  onChange={(e) => this.setState({ "nationality": e.target.value})} /><br/>
                    
                    <button type ="button" value = "Add Customer" onClick = {this.addingCustomer}> Add Customer </button>
                    {this.state.message && <p>{this.state.message}</p>} {/* Conditionally render the message */}
                </form>
            </div>
         );
    }
}
 
export default AddCustomer;