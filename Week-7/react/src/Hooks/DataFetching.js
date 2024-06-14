import axios from "axios";
import React, {useState, useEffect} from "react";

function DataFetching() {

    const [post, setPost] = useState({});
    const [id, setId] = useState(2);
    const [idFromButtonClick, setButtonId] = useState(2);

    useEffect(() => {
        axios
        .get(`https://jsonplaceholder.typicode.com/posts/${id}`)
        .then(res => {
            console.log(res.data);
            setPost(res.data);

        })
        .catch(err =>{
            console.log(err);
        })
    }, [id, idFromButtonClick]);
    const handleClick = ()=>{
        setButtonId(id);
    }
    return (  
        <div>

            <input type ="text" value ={id} onChange={e => setId(e.target.value)} />
            <button type = "button" class = "btn btn-primary" onClick={handleClick}> Fetch Data </button>
            <div>Id: {post.id}</div>
            <div>Title : {post.title}</div>
            <div>Body : {post.body}</div>
        </div>

    );
}

export default DataFetching;