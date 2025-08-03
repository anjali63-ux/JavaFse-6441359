import React, { useState } from 'react';
import './App.css';

// Greeting Component
function Greeting({ isLoggedIn }) {
  return (
    <div>
      {isLoggedIn ? <h2>Welcome back</h2> : <h2>Please sign up.</h2>}
    </div>
  );
}

// Login Button
function LoginButton({ onClick }) {
  return (
    <button onClick={onClick}>
      Login
    </button>
  );
}

// Logout Button
function LogoutButton({ onClick }) {
  return (
    <button onClick={onClick}>
      Logout
    </button>
  );
}

// Main App
function App() {
  const [isLoggedIn, setIsLoggedIn] = useState(false);

  const handleLoginClick = () => {
    setIsLoggedIn(true);
  };

  const handleLogoutClick = () => {
    setIsLoggedIn(false);
  };

  return (
    <div className="App">
      <Greeting isLoggedIn={isLoggedIn} />

      {isLoggedIn ? (
        <LogoutButton onClick={handleLogoutClick} />
      ) : (
        <LoginButton onClick={handleLoginClick} />
      )}
    </div>
  );
}

export default App;
