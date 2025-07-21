import React, { useState } from 'react';

// Greeting components
function GuestGreeting() {
  return <h1>Please sign up.</h1>;
}

function UserGreeting() {
  return <h1>Welcome back</h1>;
}

// Button components
function LoginButton(props) {
  return <button onClick={props.onClick}>Login</button>;
}

function LogoutButton(props) {
  return <button onClick={props.onClick}>Logout</button>;
}

// Main App Component
function App() {
  const [isLoggedIn, setIsLoggedIn] = useState(false);

  // Toggle functions
  const handleLoginClick = () => setIsLoggedIn(true);
  const handleLogoutClick = () => setIsLoggedIn(false);

  // Conditional element
  let button;
  let greeting;

  if (isLoggedIn) {
    greeting = <UserGreeting />;
    button = <LogoutButton onClick={handleLogoutClick} />;
  } else {
    greeting = <GuestGreeting />;
    button = <LoginButton onClick={handleLoginClick} />;
  }

  return (
    <div style={{ textAlign: 'center', marginTop: '50px' }}>
      {greeting}
      {button}
    </div>
  );
}

export default App;
