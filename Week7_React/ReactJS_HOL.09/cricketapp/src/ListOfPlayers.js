// ListOfPlayers.js
import React from 'react';

const ListOfPlayers = ({ players }) => {
  return (
    <ul>
      {players.map((item, index) => (
        <li key={index}> {item.name} <span>({item.score})</span></li>
      ))}
    </ul>
  );
};

export const ScoreBelow70 = ({ players }) => {
  const filtered = players.filter(item => item.score < 70);
  return (
    <ul>
      {filtered.map((item, index) => (
        <li key={index}>{item.name}</li>
      ))}
    </ul>
  );
};

export default ListOfPlayers;
