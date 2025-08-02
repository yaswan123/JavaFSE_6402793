import React from 'react';

function Oddplayers({ playersList }) {
  const [first, , third, , fifth] = playersList;

  return (
    <div>
      <h1>Odd-Indexed Players</h1>
      <ul>
        <li>First: {first.name} - {first.score}</li>
        <li>Third: {third.name} - {third.score}</li>
        <li>Fifth: {fifth.name} - {fifth.score}</li>
      </ul>
    </div>
  );
}
export default Oddplayers;