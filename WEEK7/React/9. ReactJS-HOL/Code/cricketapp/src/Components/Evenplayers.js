import React from 'react';
function Evenplayers({ playersList }) {
  const [, second, , fourth, , sixth] = playersList;

  return (
    <div>
      <h1>Even-Indexed Players</h1>
      <ul>
        <li>Second: {second.name} - {second.score}</li>
        <li>Fourth: {fourth.name} - {fourth.score}</li>
        <li>Sixth: {sixth.name} - {sixth.score}</li>
      </ul>
    </div>
  );
}
export default Evenplayers;