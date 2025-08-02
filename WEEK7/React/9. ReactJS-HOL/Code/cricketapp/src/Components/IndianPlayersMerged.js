import React from 'react'
import { Indianplayers } from './Indianplayers'
function IndianPlayersMerged() {
  return (
    <div>
        <h1>List of Indian Merged Players Merged:</h1>
        <ul>
            {Indianplayers.map((player)=>(
                <li>Mr. {player} Player</li>
            ))}
        </ul>
    </div>
  )
}

export default IndianPlayersMerged;