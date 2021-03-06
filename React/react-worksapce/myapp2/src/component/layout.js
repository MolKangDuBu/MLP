import React from 'react';
import {Link, Outlet} from 'react-router-dom';
const Layout = () => {
    return (
        <div>
      {/* A "layout route" is a good place to put markup you want to
          share across all the pages on your site, like navigation. */}
      <nav>
        <ul>
          <li>
            <Link to="/">Home</Link>
          </li>
          <li>
            <Link to="/board/list">게시판</Link>
          </li>
          <li>
            <Link to="/dashboard">Dashboard</Link>
          </li>
          <li>
            <Link to="/nothing-here">Nothing Here</Link>
          </li>
        </ul>
      </nav>

      <hr />
      <Outlet /> {/*위의 메뉴를 눌면 이부분에 나타남*/}
    </div>
    );
};

export default Layout;