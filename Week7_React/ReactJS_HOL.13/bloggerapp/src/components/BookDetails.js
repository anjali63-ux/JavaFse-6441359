import React from 'react';

function BookDetails({ books }) {
  return (
    <div style={{ borderRight: '2px solid green', paddingRight: '20px' }}>
      <h2>Book Details</h2>
      <ul>
        {books.map((book, index) => (
          <li key={index}>
            <h4>{book.name}</h4>
            <p>₹{book.price}</p>
          </li>
        ))}
      </ul>
    </div>
  );
}

export default BookDetails;
