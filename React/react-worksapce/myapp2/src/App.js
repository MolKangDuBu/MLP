import logo from './logo.svg';
import './App.css';
import Counter from './component/counter';
import Person from './component/person';
import {Routes, Route} from 'react-router-dom';
import Layout from './component/layout';
import 'bootstrap/dist/css/bootstrap.min.css'
import Boardlist from './component/board/board_list';
import Boardwrite from './component/board/board_write';
import Boardview from './component/board/board_view';

function App() {
  return (
    <div className="App">
        <Routes>
          <Route path="/" element={<Layout/>}>
            <Route index element= {<Person/>}/>
            <Route path="board/list" element={<Boardlist/>}/>
            <Route path="board/write" element= {<Boardwrite/>}/>
            <Route path="board/view/:id" element= {<Boardview/>}/>
     
          </Route>
        </Routes>
   
    </div>
  );
}

export default App;
