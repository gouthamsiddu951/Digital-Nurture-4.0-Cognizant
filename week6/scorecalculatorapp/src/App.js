import { CalculateScore } from './Components/CalculateScore';

function App() {
  return (
    <div>
      <CalculateScore 
        Name="Gowtham" 
        School="Vel Tech University" 
        total={284} 
        goal={300} 
      />
    </div>
  );
}

export default App;
