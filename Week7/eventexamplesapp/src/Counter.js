import React, { Component } from 'react';

class Counter extends Component {
  constructor(props) {
    super(props);
    this.state = {
      count: 0,
    };

    // Binding for 'this'
    this.handleIncrement = this.handleIncrement.bind(this);
    this.sayHello = this.sayHello.bind(this);
    this.sayWelcome = this.sayWelcome.bind(this);
  }

  handleIncrement() {
    this.setState({ count: this.state.count + 1 });
    this.sayHello();
  }

  handleDecrement = () => {
    this.setState({ count: this.state.count - 1 });
  }

  sayHello() {
    console.log('Hello! You clicked increment.');
  }

  sayWelcome(message) {
    alert(`Welcome message: ${message}`);
  }

  handleSyntheticEvent = (event) => {
    alert("I was clicked!");
    console.log("Synthetic Event:", event);
  }

  render() {
    return (
      <div>
        <h2>Counter: {this.state.count}</h2>
        <button onClick={this.handleIncrement}>Increment</button>
        <button onClick={this.handleDecrement}>Decrement</button>
        <br /><br />
        <button onClick={() => this.sayWelcome("Welcome to the React Event App!")}>Say Welcome</button>
        <br /><br />
        <button onClick={this.handleSyntheticEvent}>OnPress</button>
      </div>
    );
  }
}

export default Counter;
