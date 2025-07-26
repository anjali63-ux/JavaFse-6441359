import React from 'react';
import CohortDetails from './components/CohortDetails';

function App() {
  return (
    <div>
      <h2>Cohorts Details</h2>
      <CohortDetails
        cohortName="INTADM1001 - .NET FSD"
        status="Completed"
        startDate="26-Dec-2022"
        trainer="Completed"
        mentor="Sandeep"
        support="Karthik"
        issue="App Issue"
      />
      <CohortDetails
        cohortName="ADM21F104 - Java FSD"
        status="Ongoing"
        startDate="13-Dec-2021"
        trainer="Ongoing"
        mentor="Elisa Smith"
        support="Cameron"
        issue="Nil"
      />
      <CohortDetails
        cohortName="CDH21F2035 - Java FSD"
        status="Ongoing"
        startDate="28-Dec-2022"
        trainer="Ongoing"
        mentor="John Doe"
        support="Jack"
        issue="None"
      />
    </div>
  );
}

export default App;
