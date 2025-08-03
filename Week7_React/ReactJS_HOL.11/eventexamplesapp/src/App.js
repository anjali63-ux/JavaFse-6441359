import React, { useState } from 'react';
import './App.css';

function CurrencyConverter() {
  const [amount, setAmount] = useState('');
  const [currency, setCurrency] = useState('');

  const handleSubmit = (e) => {
    e.preventDefault();

    if (currency.toLowerCase() === 'euro') {
      const converted = parseFloat(amount) * 80;
      alert(`Converting to Euro Amount is ${converted}`);
    } else {
      alert('Please enter "Euro" as the currency');
    }
  };

  return (
    <div>
      <h2 style={{ color: 'green' }}>Currency Convertor!!!</h2>
      <form onSubmit={handleSubmit}>
        <label>Amount: </label>
        <input
          type="number"
          value={amount}
          onChange={(e) => setAmount(e.target.value)}
        /><br /><br />
        <label>Currency: </label>
        <input
          type="text"
          value={currency}
          onChange={(e) => setCurrency(e.target.value)}
        /><br /><br />
        <button type="submit">Submit</button>
      </form>
    </div>
  );
}

function App() {
  const [count, setCount] = useState(0);

  const increment = () => {
    setCount(count + 1);
  };

  const sayHello = () => {
    alert("Hello Member1");
  };

  const handleIncrement = () => {
    increment();
    sayHello();
  };

  const decrement = () => {
    setCount(count - 1);
  };

  const sayWelcome = (msg) => {
    alert(msg);
  };

  const onPress = () => {
    alert("I was clicked");
  };

  return (
    <div className="App">
      <h2>{count}</h2>
      <button onClick={handleIncrement}>Increment</button>
      <button onClick={decrement}>Decrement</button>
      <br /><br />
      <button onClick={() => sayWelcome("welcome")}>Say welcome</button>
      <br /><br />
      <button onClick={onPress}>Click on me</button>
      <br /><br />
      <CurrencyConverter />
    </div>
  );
}

export default App;
