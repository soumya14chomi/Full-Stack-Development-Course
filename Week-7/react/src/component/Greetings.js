import React from 'react'

const Greetings = (props) => {
  return (
    <>
        <div>
            <h1>
                Hello, {props.name} a.k.a {props.petName}
            </h1>
            {props.children}
        </div>    
    </>
  )
}

export default Greetings
