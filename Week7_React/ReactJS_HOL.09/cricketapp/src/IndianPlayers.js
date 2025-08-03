// IndianPlayers.js
import React from 'react';

export function OddPlayers([, first, , third, , fifth]) {
  return (
    <ul>
      <li>First: {first}</li>
      <li>Third: {third}</li>
      <li>Fifth: {fifth}</li>
    </ul>
  );
}

export function EvenPlayers([first, , third, , fifth]) {
  return (
    <ul>
      <li>{first}</li>
      <li>{third}</li>
      <li>{fifth}</li>
    </ul>
  );
}

const T20Players = ["First Player", "Second Player", "Third Player"];
const RanjiTrophyPlayers = ["Fourth Player", "Fifth Player", "Sixth Player"];
export const IndianPlayers = [...T20Players, ...RanjiTrophyPlayers];
