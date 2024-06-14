import React, { Component } from 'react'

export class User1 extends Component {
    componentWillUnmount(){
        console.warn("component call");
        alert('User deleted');
    }
  render() {
    return (
      <div>
        <h3> User Name: Soumya</h3>
        <h3>Email : soumya@gmail.com</h3>

      </div>
    )
  }
}

export default User1