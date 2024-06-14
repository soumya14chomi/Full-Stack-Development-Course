import axios from "axios";

class APIservice {
    fetchUsers(){
        return axios.get("https://jsonplaceholder.typicode.com/users")
    }
}
 
export default new APIservice();