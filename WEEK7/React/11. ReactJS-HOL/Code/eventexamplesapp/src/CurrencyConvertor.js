import React, { useState } from 'react';
function CurrencyConvertor() {
  const [amount, setAmount] = useState('');
  const [currency, setCurrency] = useState('Euro');
  const handleSubmit = (e) => {
    e.preventDefault();
    let converted = 0;
    if (currency === 'Euro') 
    {
      converted = parseFloat(amount) * 80;
    } 
    else if(currency==='Rupee')
    {
        converted=parseFloat(amount)/80;
    }
     else 
    {
      alert("Currency not supported");
      return;
    }
    alert(`Converting to ${currency} Amount is ${converted}`);
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
        />
        <br /><br />

        <label>Currency: </label>
        <select
          value={currency}
          onChange={(e) => setCurrency(e.target.value)}
        >
          <option value="Euro">Euro</option>
          <option value="Rupee">Rupee</option>
        </select>
        <br /><br />
        <button type="submit">Submit</button>
      </form>
    </div>
  );
}
export default CurrencyConvertor;
