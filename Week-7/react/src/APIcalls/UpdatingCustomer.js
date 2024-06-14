import React from 'react';
import { useNavigate } from 'react-router-dom';
import { Link } from 'react-router-dom';

const UpdatingCustomer = (props) => {
    const navigate = useNavigate();
    const handleClick = () =>{
        console.log(props);
        navigate("/updateCustomer", {state : props.customer});
    }
  return (
    <div>

      <Link class = "nav-link" to = {`/updateCustomer/{props.customer.userid}`}> Update Customer</Link>

    </div>
  );
}

export default UpdatingCustomer;