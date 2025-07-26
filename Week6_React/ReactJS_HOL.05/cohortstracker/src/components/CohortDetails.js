import React from 'react';
import styles from './CohortDetails.module.css'; // Importing CSS module

function CohortDetails(props) {
  // Destructure the properties passed to this component
  const { cohortName, status, startDate, trainer, mentor, support, issue } = props;

  // Apply green if status is 'ongoing', otherwise blue
  const headingStyle = {
    color: status.toLowerCase() === 'ongoing' ? 'green' : 'blue',
  };

  return (
    <div className={styles.box}> {/* Apply .box class from CSS */}
      <h3 style={headingStyle}>{cohortName}</h3>
      <p>Started On: {startDate}</p>
      <p>Status: {status}</p>
      <p>Completed By: {trainer}</p>
      <p>Mentor: {mentor}</p>
      <p>Support: {support}</p>
      <p>Key Issue: {issue}</p>
    </div>
  );
}

export default CohortDetails;
