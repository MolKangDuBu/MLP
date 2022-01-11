import React, { useEffect } from 'react';
import { useState, userEffect } from 'react';//Hook 이라는 개념이 추가됨
import axios from 'axios';
const BoardList = () => {

    const [board, setBoard] = useState([]);//board 변수에 배열을 저장함
    //componentDidMount 대신에 useEffect훅을 사용

    useEffect(() => {
        console.log("이곳에서 데이터를 불러와야함");
        //...board 배열의 전개, 앞의 배열에 데이터 덧붙이기
        // setBoard(...board, [
        //     { id: 1, name: "ㅎㅇ", email: "asd@naver.com" },
        //     { id: 2, name: "23", email: "aaa@naver.com" },
        //     { id: 3, name: "234", email: "sss@naver.com" },
        //     { id: 4, name: "345", email: "ddd@naver.com" },
        //     { id: 5, name: "45", email: "fff@naver.com" }
        // ]);
        let url = "http://localhost:3000/guestbook";
        axios.get(url)
        .then((response)=>{
            console.log(response.data.data);
            setBoard(...board, response.data.data);
        })
        .catch((error)=>{
            console.log(error);
        })
    }, []);

    return (
        <div className='container'>
            <h2>게시판 목록</h2>

            <div className="input-group mb-3" style={{"marginTop":"20px"}}>
                <button type="button" className="btn btn-primary dropdown-toggle" data-bs-toggle="dropdown">
                    선택하세요
                </button>
                <ul className="dropdown-menu">
                    <li><a className="dropdown-item" href="#">제목</a></li>
                    <li><a className="dropdown-item" href="#">내용</a></li>
                    <li><a className="dropdown-item" href="#">제목+내용</a></li>
                </ul>
                <input type="text" className="form-control" placeholder="Search"></input>
                <button className="btn btn-secondary" type="submit">Go</button>
            </div>

            <table className="table table-hover ">
                <thead className="table-secondary">
                    <tr>
                        <th>ID</th>
                        <th>Title</th>
                        <th>Writer</th>
                        <th>Contents</th>
                    </tr>
                </thead>
                <tbody>{
                    board.map(function (object, i) {
                        return (
                            <tr key={i}>
                                <td>{object.id}</td>
                                <td>{object.title}</td>
                                <td>{object.writer}</td>
                                <td>{object.contents}</td>
                            </tr>
                        )
                    })

                }


                </tbody>
            </table>
        </div>
    );


}







export default BoardList;