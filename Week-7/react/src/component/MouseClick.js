import React, { Component } from 'react';
import withCounter from './withCounter';

export class MouseClick extends Component {
   
  render() {
    // const {count, incrementCount} = this.props;
    const count = this.props.count;
    const incrementCount = this.props.incrementCount;
    console.log(this.props);
    return (
      <button onClick={incrementCount}> {this.props.name} was clicked {count} times </button>
    )
  }
}

export default withCounter(MouseClick, 10);