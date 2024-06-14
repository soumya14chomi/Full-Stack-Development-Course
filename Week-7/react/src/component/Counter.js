import { Component } from "react";

class Counter extends Component{
    constructor(){
        super();
        this.state = {
            count : 0
        }
    }

    increment(){
        this.setState((prevState) => ({
            count : prevState.count+1
        }));

    }

    incrementFive(){
        console.log("Inside Increment");
            this.increment();
            this.increment();
            this.increment();
            this.increment();
            this.increment();
    }

    render(){
        return (
            <div>
                <h3> Count = {this.state.count}</h3>
                <button onClick={ () => this.incrementFive()} > Click to Increment Counter </button>
            </div>
        )
    }
};

export default Counter;