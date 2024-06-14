import React, { Component } from 'react';
import User1 from './User1';

export class UnMount extends Component {
    constructor(){
        super();
        this.state = {
            toggleUser : true
        }
    }
  render() {
    return (
      <div>
        <h1>{
                this.state.toggleUser ? <User1/> : null
            }</h1>
            <button onClick={ () => {this.setState ({toggleUser : !this.state.toggleUser})}}>
                 Delete User Info 
            </button>

      </div>
    )
  }
}

export default UnMount