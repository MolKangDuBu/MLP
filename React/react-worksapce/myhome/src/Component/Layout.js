import React from 'react';
import { Routes, Route, Outlet, Link } from 'react-router-dom';
import 'bootstrap/dist/css/bootstrap.min.css';
const Layout = () => {

    const Layout = () => {
        const activeStyle = {
            color: 'green',
            fontSize: '2rem'
        }
    }


    return (//class -> className
        <div>
            <nav className="navbar navbar-expand-sm bg-dark navbar-dark">
                <div className="container-fluid">
                    <ul className="navbar-nav">
                        <li className="nav-item">
                            <Link className="nav-link active" to="/">Home</Link>
                        </li>
                        <li className="nav-item">
                            <Link className="nav-link" to="/">회원가입</Link>
                        </li>
                        <li className="nav-item">
                            <Link className="nav-link" to="/board/list">게시판</Link>
                        </li>
                                               
                    </ul>
                </div>
            </nav>
            {/* 컴포넌트들이 이 위치에서 동작함 */}
            <div style={{"marginTop":"30px"}}>
                <Outlet/>
            </div>
        </div>
    );
};

export default Layout;