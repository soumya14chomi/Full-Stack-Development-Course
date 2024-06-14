import React, {Component} from "react";
import Lifecycle2 from "./Lifecycle2"

class Lifecycle extends Component{

    constructor(props){
        super(props);
        this.state = {
            name : this.props.name
        }

        console.log("LifeCycle-1 Constructor");
    }

    static getDerivedStateFromProps(props, state){
        console.log("LifeCycle-1 getDerivedStateFromProps");
        return null;
    }

    componentDidMount(){
        console.log("From LifeCycle-1 componentDidMount");
    }

    shouldComponentUpdate(){
        console.log("From Lifecycle-1 shouldComponentUpdate");
        return true;
    }

    getSnapshotBeforeUpdate(prevProps, prevState, snapshot){
        console.log("Lifecycle-1 getSnapshotBeforeUpdate");
        return null;
    }

    componentDidUpdate(prevProps, prevState){
        console.log("From Lifecycle-1 componentDidUpdate");

    }

    changeState = () => {
        this.setState({
            name : "Name changed"
        })
    }

    render(){
        console.log("Lifecycle-1 render");
        return (
            <div>
                <div>LifeCycle-1 {this.state.name}</div>
                <button onClick={this.changeState}> Change State </button>
                <Lifecycle2 />
            </div>
        )
    }


}

export default Lifecycle