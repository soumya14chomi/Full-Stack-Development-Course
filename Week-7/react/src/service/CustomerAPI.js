import axios from "axios";

class CustomerAPIservice {

    constructor(){
        this.axiosInstance = axios.create({
            baseURL: "http://localhost:8081/users",
            timeout: 5000,
            headers: {
                Authorization: localStorage.getItem('access_token')
                    ? 'JWT ' + localStorage.getItem('access_token')
                    : null,
                'Content-Type': 'application/json',
                accept: 'application/json',
            }, 
        });
    }
    
    fetchUsers(){
        return axios.get("http://localhost:8081/users/fetchAll")
    }

    addUser(custDetails) {
        
        //console.log(custDetails);
        return this.axiosInstance.post("/signup" , JSON.stringify(custDetails));
    }

    deleteUser(id){
        console.log(id);
        return this.axiosInstance.post("/delete", id);
    }

    updateUser(userId, userDetails){
        return this.axiosInstance.post("/update/"+userId, JSON.stringify(userDetails));
    }
}
 
export default new CustomerAPIservice();