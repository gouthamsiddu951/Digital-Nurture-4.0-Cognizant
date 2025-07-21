import React from 'react';

// Office data list
const officeList = [
  {
    name: "IndiQube Alpha",
    rent: 50000,
    address: "BTM Layout, Bangalore",
    image: process.env.PUBLIC_URL + "/91s.jpeg"
  },
  {
    name: "WeWork Prestige",
    rent: 75000,
    address: "Koramangala, Bangalore",
    image: process.env.PUBLIC_URL + "/co.jpeg"
  },
  {
    name: "CoWrks",
    rent: 65000,
    address: "Manyata Tech Park, Bangalore",
    image: process.env.PUBLIC_URL + "/indi.jpeg"
  },
  {
    name: "91Springboard",
    rent: 40000,
    address: "HSR Layout, Bangalore",
    image: process.env.PUBLIC_URL + "/we.jpeg"
  }
];

function App() {
  return (
    <div style={{ padding: '20px', fontFamily: 'Arial' }}>
      <h1 style={{ color: '#2c3e50', textAlign: 'center' }}>🏢 Office Space Rental Portal</h1>

      {officeList.map((office, index) => {
        const rentStyle = {
          color: office.rent < 60000 ? 'red' : 'green',
          fontWeight: 'bold'
        };

        return (
          <div
            key={index}
            style={{
              border: '1px solid #ccc',
              padding: '15px',
              marginBottom: '20px',
              borderRadius: '10px',
              display: 'flex',
              alignItems: 'center',
              gap: '20px'
            }}
          >
            <img
              src={office.image}
              alt={office.name}
              style={{
                width: '300px',
                height: '200px',
                objectFit: 'cover',
                borderRadius: '8px'
              }}
            />
            <div>
              <h2>{office.name}</h2>
              <p><strong>Address:</strong> {office.address}</p>
              <p><strong>Rent:</strong> <span style={rentStyle}>₹{office.rent}</span></p>
            </div>
          </div>
        );
      })}
    </div>
  );
}

export default App;
