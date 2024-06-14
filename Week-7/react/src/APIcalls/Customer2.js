import React, {Component} from "react";
import { Link } from "react-router-dom";
import CustomerAPI from "../service/CustomerAPI";
import DeleteCustomer from "./DeleteCustomer";
import UpdateCustomer from "./UpdateCustomer";
import UpdatingCustomer from "./UpdatingCustomer";

class Customer2 extends Component {
    constructor(props) {
        super(props);
        this.state = {
            customers : []
        }
        
    }
    componentDidMount(){
        this.loadEmployeeList();
        
        console.log(this.state);
    }
    loadEmployeeList(){
        CustomerAPI.fetchUsers()
        .then((response)=>{
            this.setState({customers : response.data});
            
        })
        .catch((error) =>{
            console.log(error);
        })
    }

    render() { 
        return (  
            <div>
                <h2 className="text-center" >Customer Details</h2>

                <Link class = "nav-link" to ="/addCustomer" > Add Customer</Link>

                <table className="table table-striped">
                    <thead>
                        <tr>
                            <th> ID</th>
                            <th>Name</th>
                            <th> Email </th>
                            <th> Gender</th>
                            <th> Nationality </th>
                            <th> Age </th>
                            <th> Action </th>
                        
                        </tr>
                    </thead>
                    <tbody>
                        {
                            this.state.customers.map(
                                customer => 
                                    <tr key = {customer.userId}>
                                        <td> {customer.userId}</td>
                                        <td>{customer.name}</td>
                                        <td>{customer.email}</td>
                                        <td>{customer.gender}</td>
                                        <td> {customer.age}</td>
                                        <td>{customer.nationality}</td>
                                        
                                        <td>
                                            <DeleteCustomer id = {customer.userId} className="btn btn-success" />
                                            <Link class = "nav-link" to = {{ 
                                                pathname : `/updateCustomer/${customer.userId}`
                                                }}
                                                
                                                state =  {customer} > 
                                                Update Customer 
                                                </Link>
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
 
export default Customer2;