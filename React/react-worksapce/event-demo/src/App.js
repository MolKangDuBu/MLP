import logo from './logo.svg';
import './App.css';
import ShoppingList from './component/shoppingList';
import Clock from './component/Clock';
import Count from './component/Count';
import Calc from './component/Calc';
import Payment from './component/payment';
function App() {

  const Data={
    headTitle:"Welcome react",
    contextTitle : "react.js is ",
    contentBody:"It's front end library"
  };//JSON객체


  return (
    <div>
        <h1>값을 저장하기 - 데이터 저장</h1>
        <p>{Data.headTitle}</p>
        <p>{Data.contextTitle}</p>
        <p>{Data.contentBody}</p>
        {/* props는 부모 컴포넌트로부터 자식컴포넌트에 값을 전달하기 위한 객체이다 */}
         <ShoppingList name ="김의형" address="서울시"/>  
        <Clock/><br></br>
        <Count/><br></br>
        <Calc/><br></br>
        <Payment/>
    </div>
  );
}

export default App;
