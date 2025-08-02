import React from 'react'
import playersList from './Playerslist'
import Oddplayers from './Oddplayers'
import Evenplayers from './Evenplayers'
import IndianPlayersMerged from './IndianPlayersMerged'
function Allplayers() {
  return (
    <div>
        <Oddplayers playersList={playersList}/>
        <Evenplayers playersList={playersList} />
        <IndianPlayersMerged />
    </div>
  )
}

export default Allplayers