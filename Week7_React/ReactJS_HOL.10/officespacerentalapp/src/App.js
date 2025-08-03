import React from 'react';
import './App.css';

function App() {
  const heading = "Office Space , at Affordable Range";
  const imgURL = "https://via.placeholder.com/250"; // You can replace with actual office image

  const officeList = [
    { Name: "DBS", Rent: 50000, Address: "Chennai" },
    { Name: "SmartWorks", Rent: 75000, Address: "Hyderabad" }
  ];

  return (
    <div className="App">
      <h1>{heading}</h1>
      {officeList.map((item, index) => {
        // Apply class based on Rent
        let rentColor = item.Rent <= 60000 ? 'textRed' : 'textGreen';
        return (
          <div key={index} style={{ marginBottom: "30px" }}>
            <img src={imgURL} alt="Office Space" width="25%" height="25%" />
            <h2>Name: {item.Name}</h2>
            <h3 className={rentColor}>Rent: Rs. {item.Rent}</h3>
            <h3>Address: {item.Address}</h3>
          </div>
        );
      })}
    </div>
  );
}

export default App;
