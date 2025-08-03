// App.js
import React from 'react';
import ListOfPlayers, { ScoreBelow70 } from './ListOfPlayers';
import { OddPlayers, EvenPlayers, IndianPlayers } from './IndianPlayers';

function App() {
  const flag = true;

  const players = [
    { name: "Nithish Reddy", score: 80 },
    { name: "Klaseen", score: 65 },
    { name: "Head", score: 70 },
    { name: "Pat Cummins", score: 75 },
    { name: "Shami", score: 60 },
    { name: "Abhisek", score: 40 },

  ];

  if (flag) {
    return (
      <div>
        <h1>List of Players</h1>
        <ListOfPlayers players={players} />

        <h1>List of Players having Scores Less than 70</h1>
        <ScoreBelow70 players={players} />
      </div>
    );
  } else {
    return (
      <div>
        <h1>Indian Team</h1>
        <div>
          <h3>Odd Players</h3>
          <OddPlayers players={IndianPlayers} />
        </div>

        <div>
          <h3>Even Players</h3>
          <EvenPlayers players={IndianPlayers} />
        </div>

        <h3>List of Indian Players Merged:</h3>
        <ul>
          {IndianPlayers.map((player, index) => (
            <li key={index}>{player}</li>
          ))}
        </ul>
      </div>
    );
  }
}

export default App;
