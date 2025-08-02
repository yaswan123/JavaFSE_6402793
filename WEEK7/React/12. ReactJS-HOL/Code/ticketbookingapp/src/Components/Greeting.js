import React from 'react'
import UserGreeting from './UserGreeting'
import GuestGreeting from './GuestGreeting';

function Greeting(props) {
  if(props.isLoggedIn){
    return <UserGreeting/>;
  }
  else
    return <GuestGreeting />;
}

export default Greeting