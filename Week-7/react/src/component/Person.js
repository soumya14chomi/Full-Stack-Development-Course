import React from 'react'

function Person(props) {
    const person = props.person;
    const key = props.index;
  return (
    <div>
        <h2>
            {key}) I am {person.name}, and I am {person.age} years old. I am proficient in {person.skill}
        </h2>


    </div>
  )
};

export default Person


