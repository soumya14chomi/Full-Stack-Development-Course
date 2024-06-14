import React from 'react'

const ChildComponent = (props) => {
  return (
    <div>

        <button onClick = {() => props.greetHandler('child')}> Greet Parents </button>
    </div>
  )
}

export default ChildComponent