import React, {Component} from "react";
import CustomerAPI from "../service/CustomerAPI";
import {useParams} from "react-router-dom";

class UpdateCustomer extends Component {
    
    constructor(props) {
        super(props);
        console.log(props.customer);
        this.state = {
            "userId" : 0,
            "name" : '',
            "email" : '',
            "mobile" : '',
            "gender" : '',
            "nationality" : '',
            "age" : 0,
            "message" : ''
        }
        // this.addingCustomer = this.addingCustomer.bind(this);
    }
    componentDidMount() {
        const id = this.props.match.params.id;
        this.setState({ id :id})
    }


    updateCustomer = () => {
        CustomerAPI.updateUser(this.state)
            .then((response) => {
                this.setState({message :  JSON.stringify(response.data), error: ''});
            })
            .catch((error) =>{
                this.setState({message : error});
            });

        // console.log(this.state);
    }
    state = {  }
    render() { 
        return ( 
            <div>
                <h2> Update Customer Details</h2>
                <form>
                    Enter Name : <input type ="text" id = "custName" value  = {this.state.name} onChange={e => this.setState({ "name" :  e.target.value} )}/> <br/>
                    Enter Email : <input type ="text" id = "email" value = {this.state.email}  onChange={ e => this.setState({ "email" : e.target.value})}/> <br/>
                    Enter mobile : <input type ="text" value = {this.state.mobile} onChange={(e) => this.setState( {"mobile" : e.target.value})}/> <br />
                    Enter gender : <input type ="text" value = {this.state.gender}  onChange={(e) => this.setState({"gender": e.target.value})} /><br />
                    Enter age : <input type ="number" value = {this.state.age} onChange={(e) => this.setState({ "age" : e.target.value})} /><br/>
                    Enter nationality : <input type ="text" value = {this.state.nationality} onChange={(e) => this.setState({ "nationality": e.target.value})} /><br/>
                    
                    {this.state.message && <p>{this.state.message}</p>} {/* Conditionally render the message */}
                </form>
            </div>
         );
    }
}
 
export default UpdateCustomer;