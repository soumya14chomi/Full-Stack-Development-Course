import React, { Component } from "react";
import CustomerAPI from "../service/CustomerAPI";

class DeleteCustomer extends Component{

    constructor(props){
        super(props);
        this.state = {
            "userId" : props.id
        }
    }

    deleteCustomer = (userId) => {
        console.log(this.state);
        
        CustomerAPI.deleteUser(this.state.userId)
            .then(()=>{
                console.log("Delete Succesful");
                window.location.reload();
            })
            .catch((error) =>{
                console.log("Error Deleting User"+error);
            });
    }    
    render(){
        return (
            <div>
                <button className = {this.props.className} onClick = {this.deleteCustomer} > Delete </button>

            </div>
        )
    }
        
}

export default DeleteCustomer;