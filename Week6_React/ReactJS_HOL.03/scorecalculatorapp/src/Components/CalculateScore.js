import React from 'react';
import './myScoreStyle.css';

function CalculateScore(props) {
  const total = props.total;
  const average = total / 5;

  return (
    <div className="container">
      <h2>Student Details:</h2>
      <p><strong>Name:</strong> {props.name}</p>
      <p><strong>School:</strong> {props.school}</p>
      <p><strong>Total:</strong> {props.total}</p>
      <p><strong>Average:</strong> {average}</p>
      <p><strong>goal:</strong> {props.goal}</p>
      
    </div>
  );
}

export default CalculateScore;

