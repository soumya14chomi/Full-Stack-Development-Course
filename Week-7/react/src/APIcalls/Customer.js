import React, {Component} from "react";
import APIservice from "../service/APIservice";
import { Link } from "react-router-dom";

class Customer extends Component {
    constructor(props) {
        super(props);
        this.state = {
            customer : []
        }
    }
    componentDidMount(){
        this.loadEmployeeList();
    }
    loadEmployeeList(){
        APIservice.fetchUsers()
        .then((response)=>{
            this.setState({customer : response.data});
        })
    }
    render() { 
        return (  
            <div>
                <h2 className="text-center" >Customer Details</h2>

                <Link class = "nav-link" to ="/adduser" > Add Customer</Link>

                <table className="table table-striped">
                    <thead>
                        <tr>
                            <th> ID</th>
                            <th>Name</th>
                            <th> UserName </th>
                            <th> Email </th>
                            <th> Action </th>
                        </tr>
                    </thead>
                    <tbody>
                        {
                            this.state.customer.map(
                                customer => 
                                    <tr key = {customer.id}>
                                        <td> {customer.id}</td>
                                        <td>{customer.name}</td>
                                        <td>{customer.username}</td>
                                        <td>{customer.email}</td>
                                        <td>
                                            <button className="btn btn-success">Delete</button>
                                            <button className ="btn btn-success">Update</button>
                                        </td>
                                    </tr>
                            )
                        }
                    </tbody>
                </table>
            </div>

        );
    }
}
 
export default Customer;