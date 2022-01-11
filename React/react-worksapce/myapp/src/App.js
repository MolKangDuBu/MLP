import logo from './logo.svg';
import './App.css';
import About from './component/about';
import Home from './component/home';
import { Routes, Route, Outlet, Link } from "react-router-dom";

//라우팅 - url이 오면 호출될 페이지에 대한 정보를 지정하는 것
//Routes
function App() {
  return (
    <div>
      <Routes>
        {/* 이 아래 라우터를 둔다 */}
        <Route path="/" element={<Layout />}>
          <Route index element={<Home />}></Route>
          <Route path="About" element={<About />}></Route>
        </Route>
        
      </Routes>

    </div>
  );
}

export default App;

//화면에 보여지는 메뉴
function Layout() {
  return (
    <div>
      <nav>
        <ul>
          <li><Link to="/">Home</Link></li>
          {/* a 태그를 쓰면 페이지 전체를 다시 부르게 됨
              바꾸려면 Link를 사용함.
              to = "접근url" */}
          <li><Link to="/About">About</Link></li>
        </ul>
      </nav>

      <div style={{'marginTop' : '90px'}}>
      </div>
      {/* 위에 있는 링크를 클릭했을때 Outlet위치에 보임 */}
      <Outlet />
    </div>
  )
}
