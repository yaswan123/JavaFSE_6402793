import React from 'react';
import playerslist from './Playerslist';
function Listofplayers() {

  const players70 = playerslist.filter(player => player.score < 70);
  return (
    <div>
        <h1>List of Players:</h1>
        <ul>
            {playerslist.map((player)=>(
                <li>Mr. {player.name} - <span>{player.score}</span></li>
            ))}
        </ul>
        <h1>List of Players having score Less than 70:</h1>
        <ul>
            {players70.map((player)=>(
                <li>Mr. {player.name} - <span>{player.score}</span></li>
            ))}
        </ul>
    </div>
  );
}

export default Listofplayers;