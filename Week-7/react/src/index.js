import React from 'react';
import ReactDOM from 'react-dom/client';
import './index.css';
import App from './App';
import reportWebVitals from './reportWebVitals';
import {BrowserRouter} from "react-router-dom"

const root = ReactDOM.createRoot(document.getElementById('root'));
root.render(
  <React.StrictMode>
    <BrowserRouter>
    
    <App />
    </BrowserRouter>
  </React.StrictMode>
); 

// // If you want to start measuring performance in your app, pass a function
// // to log results (for example: reportWebVitals(console.log))
// // or send to an analytics endpoint. Learn more: https://bit.ly/CRA-vitals
 reportWebVitals();
/*
const elem = React.createElement('div', '',
  React.createElement('h1', '', "Hello From React")
);


const list = React.createElement('ul', '',
  React.createElement('li', '', 'List Item 1'),
  React.createElement('li', '', 'List Item 2'),
  React.createElement('li', '', 'List Item 3'),
  React.createElement('li', '', 'List Item 4'),
  React.createElement('li', '', 'List Item 5'),
  React.createElement('li', '', 'List Item 6')
);


const users = [
  { username : 'user1', location : 'NY'},
  { username : 'user2', location : 'UK'},
  { username : 'user3', location : 'PA'},
  { username : 'user4', location : 'NJ'},
  { username : 'user5', location : 'LA'},
];

const elem2 = <ul>
  {
    users.map((user, index) =>{
      return <li key ={index}>
          {user.username+" from "+user.location}
         </li>
    })
  }
</ul>
// */
// ReactDOM.render(elem, document.getElementById('root'));
// ReactDOM.render(list, document.getElementById("root1"));
// ReactDOM.render(elem2, document.getElementById('root2'));

