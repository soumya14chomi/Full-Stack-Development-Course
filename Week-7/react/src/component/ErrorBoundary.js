import React, { Component } from 'react'

export class ErrorBoundary extends Component {
constructor(props){
    super(props);
    this.state = {
        hasError : false
    }
}

static getDerivedStateFromError(error){
    console.log("From Error Handler");
    return {
        hasError : true
    }
}

componentDidCatch(error, info){
    console.log(error);
    console.log(info);
}

  render() {
      
        if(this.state.hasError){
            return <h1> Joker is not a hero </h1>
        }
        return this.props.children;
  }
}

export default ErrorBoundary