import React from 'react';
import './App.css';
import CalculateScore from './Components/CalculateScore';

function App() {
  return (
    <div className="App">
      <CalculateScore 
        name="Anjali"
        school="SKDR"
        total={450}
        goal="Upcoming Cognizant Employee"
      />
    </div>
  );
}

export default App;
