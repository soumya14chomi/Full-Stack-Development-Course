import React from "react";
import Person from "./Person";

function NameList() {
    const names = ['Soumya', 'Mouni', 'Sravani', 'Akanksha'];

    const persons = [
        {
            id : '1',
            name : names[0],
            age : 23,
            skill : 'Java'
        },
        {
            id : '2',
            name : names[1],
            age : 34,
            skill :'Python'
        },
        {
            id : '3',
            name : names[2],
            age : 12,
            skill : 'AWS'

        },
        {
            id : '4',
            name : names[3],
            age :23,
            skill : 'Pharm'
        }
    ];

    const personList = persons.map(person => <Person index = {person.id} person={person}/>)
    const nameList = names.map((name, index) => <h2 key = {index}> {index+1}) {name}</h2> ) 

    return (
        <div>
            {nameList}
            {personList}
        </div>
    )
};

export default NameList;