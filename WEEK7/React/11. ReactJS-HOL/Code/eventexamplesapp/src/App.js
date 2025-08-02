import './App.css';
import { useState } from 'react';
import CurrencyConvertor from './CurrencyConvertor.js';
function App() {
  const [count, setCount] = useState(0);
  const [message, setMessage] = useState('');
  const handleIncrement = () => {
    sayHello();
    incrementValue();
  };
  const incrementValue = () => {
    setCount(count + 1);
  };
  const sayHello = () => {
    alert("Hello! Counter increased by value:"+count);
  };

  const handleDecrement = () => {
    setCount(count - 1);
    alert("Hello! Counter decreased by value:"+count);
  };

  const Welcome = (msg) => {
    alert(msg);
  };

  const handlePress = (e) => {
    alert("I was clicked");
  };

  return (
    <div>
      <h2>Count: {count}</h2>
      {message && <p style={{ color: 'blue' }}>{message}</p>}
      <button onClick={handleIncrement}>Increment</button>
      <button onClick={handleDecrement}>Decrement</button>
      <br /><br />
      <button onClick={() => Welcome("welcome")}>Say Welcome</button>
      <br /><br />
      <button onClick={handlePress}>Click on me</button>
      <br /><br />
      <CurrencyConvertor />
    </div>
  );
}

export default App;
