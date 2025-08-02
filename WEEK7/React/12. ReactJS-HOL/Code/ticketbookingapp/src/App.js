import logo from './logo.svg';
import './App.css';
import { useState } from 'react';
import LoginButton from './Components/LoginButton';
import LogoutButton from './Components/LogoutButton';
import Greeting from './Components/Greeting';

function App() {
  const [isLoggedIn,setisLoggedIn] = useState(false);
  function onClick(){
      setisLoggedIn(!isLoggedIn);
  }
  return (
    <div >
      <Greeting isLoggedIn={isLoggedIn} />
      {isLoggedIn?(
        <LogoutButton onClick = {onClick} />
      ):(
        <LoginButton onClick = {onClick}/>
      )}
    </div>
  );
}

export default App;