import React, {Component} from 'react';

class Message extends Component{
    constructor(props){
        super(props);
        this.state = {
            message : props.message
        }
    }

    changeMessage(){
        this.setState({
            message : 'Thank you for subscribing'
        })
    };

    clickHandler() {
        console.log("Message logged");
        this.setState({message : "Bye Bye!!"});
    }

    // clickHandler = () => {
    //     console.log("Message logged");
    //     this.setState({message : "Bye Bye!!"});
    // }

    render(){
        return(
            <div>
                <h1> {this.state.message} </h1>
                {/* <button onClick={ () => this.changeMessage()}> Subscribe </button> */}
                <button onClick={() => this.clickHandler()}> Click </button>
            </div>
        )
    }
}


export default Message