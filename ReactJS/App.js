import logo from './logo.svg';
import './App.css';
// import Example from './P1_ReactExample';
//import A from './P2_A'
//import B from './P2_B'
//import C from './P2_C'
//import StateEffect from './P3_useState&Effect'
import Details from './P4_Details'

const person = {
name:"Shaik Ibrahim",
age:23,
branch:"CSE"
}

function App() {
  return (
    <div className="App">
    <Details />
    </div>
  );
}

export default App;