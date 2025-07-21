import React, { useState } from 'react';

function CurrencyConverter() {
  const [rupees, setRupees] = useState('');
  const [euros, setEuros] = useState('');

  const handleSubmit = () => {
    const euroRate = 0.011; // 1 INR = 0.011 EUR
    const converted = (parseFloat(rupees) * euroRate).toFixed(2);
    setEuros(converted);
  };

  return (
    <div style={{ marginTop: '30px' }}>
      <h2>Currency Converter</h2>
      <input
        type="number"
        placeholder="Enter INR"
        value={rupees}
        onChange={(e) => setRupees(e.target.value)}
      />
      <button onClick={handleSubmit}>Convert</button>
      {euros && <p>Euro: €{euros}</p>}
    </div>
  );
}

export default CurrencyConverter;
