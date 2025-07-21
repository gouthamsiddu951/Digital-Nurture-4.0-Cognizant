// src/App.test.js
import { render, screen } from '@testing-library/react';
import App from './App';

test('renders Posts heading', () => {
  render(<App />);
  const heading = screen.getByText(/Posts/i);
  expect(heading).toBeInTheDocument();
});
