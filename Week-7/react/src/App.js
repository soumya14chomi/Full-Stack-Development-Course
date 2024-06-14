import { Routes, Route } from 'react-router-dom';

import './App.css';
// import Hello from './component/Hello';
// import Message from './component/message'
// import Greetings  from './component/Greetings';
// import Person from './component/Person';
// import NameList from './component/NameList';
// import Counter from './component/Counter'
// import ParentComponent from './component/ParentComponent';
// import Lifecycle from './component/Lifecycle'
// import UnMount from './component/UnMount';
// import ErrorBoundary from './component/ErrorBoundary';
// import Hero from './component/Hero';
import HoverCounter from './component/HoverCounter';
import MouseClick from './component/MouseClick';
import HooksCounter from './Hooks/HooksCounter';
import HooksCounter2 from './Hooks/HooksCounter2';
import HooksCounter3 from './Hooks/HooksCounter3';
import ClassCounterOne from './Hooks/HooksCounter4';
import HooksCounter5 from './Hooks/HookCounter5';
import DataFetching from './Hooks/DataFetching';
import Navbar from './component/NavBar';
import Customer from './APIcalls/Customer';
import Customer2 from './APIcalls/Customer2';
import AddCustomer from './APIcalls/AddCustomer';
import UpdateCustomer from './APIcalls/UpdateCustomer';
import UpdateCustomr2 from './APIcalls/UpdateCustomr2';
import Test  from './component/Test';


function App() {
  return (
    <div className="App">
      <header className="App-header">
        {/* <img src ={logo} className = "App-logo" width = {100} height ={100}/> */}

          {/* <ParentComponent /> */}

          {/* <Lifecycle name = "Soumya"/> */}

          {/* <UnMount /> */}

          {/* <ErrorBoundary>
            <Hero name = "Super Man"/>
          </ErrorBoundary> */}
          {/* <HoverCounter />
          <MouseClick name ="mouse"/> */}

          {/* <HooksCounter /> */}
            {/* <HooksCounter2 /> */}
            {/* <HooksCounter3 /> */}
            {/* <ClassCounterOne />
             <HooksCounter5 /> 
            <DataFetching /> */}

    <Navbar />

    <Routes>
      <Route exact path="/" element={<HooksCounter />} />
      <Route exact path="/hcounter" element={<HoverCounter />} />
      <Route exact path="/hcounter2" element={<HooksCounter2 />} />
      <Route exact path="/hcounter3" element={<HooksCounter3 />} />
      <Route exact path="/classCounter" element={<ClassCounterOne />} />
      <Route exact path="/hcounter5" element={<HooksCounter5 />} />
      <Route exact path = "/DataFecting" element ={<DataFetching />}/>
      <Route exact path="/Customer" element = {<Customer2 />}/>
      <Route exact path ="/addCustomer" element = {<AddCustomer />} />
      <Route exact path= "/updateCustomer/:userId" element={<UpdateCustomr2 />} />
      <Route exact patg = "/test" element = {<Test />} />

      
    </Routes>
</header>
    </div>
  );
}

export default App;
