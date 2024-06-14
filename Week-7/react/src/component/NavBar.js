import React from 'react'
import { Link } from 'react-router-dom'

const Navbar=()=>{
    return(
        <>
        <nav class="navbar navbar-expand-md navbar-dark bg-dark fixed-top">
    <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarsExampleDefault" aria-controls="navbarsExampleDefault" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
  
    <div class="collapse navbar-collapse" id="navbarsExampleDefault">
      <ul class="navbar-nav mr-auto">
        <li class="nav-item active">
                   <Link class="nav-link" to="/">Hover Counter 1 <span class="sr-only">(current)</span></Link>
        </li>
        <li class="nav-item">
          <Link class="nav-link" to='hcounter'>HookCounterOne</Link>
        </li>
        <li class="nav-item">
          <Link class="nav-link" to='hcounter2'>HookCounter2</Link>
        </li>
        <li class="nav-item">
          <Link class="nav-link" to="hcounter3">HookCounter 3 </Link>
        </li>
        <li class="nav-item">
            <Link class="nav-link" to="hcounter4">HookCounter4</Link>
          </li>
          <li class="nav-item">
            <Link class="nav-link" to="classCounter">ClassCounterOne</Link>
          </li>
          
          <li class="nav-item">
            <Link class="nav-link" to="hcounter5">HookCounter5</Link>
          </li>
          <li class="nav-item">
            <Link class="nav-link" to="Customer"> Customer Details</Link>
          </li>
          <li class="nav-item">
            <Link class="nav-link" to="test"> Test</Link>
          </li>
      </ul>
    </div>
  </nav>
    </>
    )
}

export default Navbar