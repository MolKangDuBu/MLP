import logo from './logo.svg';
import './App.css';
import App1 from './App1.js';

function App() {
  //css를 파일로 별도의 외부파일로 처리할때의 문법은 기존 css와 다르지않음.
  //그러나 컴포넌트 안에 기술할때는 다른 문법을 사용함.
  //background-color => backgroundColor(스네이크 표기법 => 카멜표기법으로 바뀜.)
  //태그에 class를 기술할때 react가 class 라는 키워드를 다른 목적으로 쓰기 때문에
  //class를 사용하지 못하고 className으로 사용해야함.

  let mystyle={
    color : "white",
    backgroundColor :"darkred",
    padding : '20px 0px 20px 0px'
  }
  
  
  return (
    <div className="App">
      <header className="App-header">
        <h1 style={mystyle}>hello react!!</h1>
        <h1 style={{color:'blue', backgroundColor:'yellow'}}>Hi</h1>
        <hr></hr>
        <App1/>
        <App1/>
        <App1/>
      </header>
    </div>
  );
}

export default App;
