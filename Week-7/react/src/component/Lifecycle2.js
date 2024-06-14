import React, {Component} from "react";

class Lifecycle2 extends Component{

    constructor(props){
        super(props);
        this.state = {
            name : "Ryan"
        }

        console.log("LifeCycle-2 Constructor");
    }

    static getDerivedStateFromProps(props, state){
        console.log("LifeCycle-2 getDerivedStateFromProps");
        return null;
    }

    componentDidMount(){
        console.log("From LifeCycle-2 componentDidMount");
    }

    shouldComponentUpdate(){
        console.log("From Lifecycle-2 shouldComponentUpdate");
        return true;
    }

    getSnapshotBeforeUpdate(prevProps, prevState, snapshot){
        console.log("Lifecycle-2 getSnapshotBeforeUpdate");
        return null;
    }

    componentDidUpdate(prevProps, prevState){
        console.log("From Lifecycle-2 componentDidUpdate");

    }

   

    render(){
        console.log("Lifecycle-2 render");
        return (
            <div>
                LifeCycle-2
            </div>
        )
    }


}

export default Lifecycle2