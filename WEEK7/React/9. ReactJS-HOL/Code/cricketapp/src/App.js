import { useState } from 'react';
import Allplayers from './Components/Allplayers';
import Listofplayers from './Components/Listofplayers';
import './App.css'; 

function App() {
  const [flag, setFlag] = useState(true);

  function changeFlag(e) {
    setFlag(e.target.checked);
  }

  return (
    <div className="">
      <div style={{ textAlign: 'center', margin: '30px' }}>
        <input
          type="checkbox"
          id="toggle"
          checked={flag}
          onChange={changeFlag}
        />
        <label htmlFor="toggle" className="switch-label">
          Toggle View
        </label>
        <p>Now the flag value is: {flag.toString()}</p>
      </div>

      {flag ? <Listofplayers /> : <Allplayers />}
    </div>
  );
}

export default App;
