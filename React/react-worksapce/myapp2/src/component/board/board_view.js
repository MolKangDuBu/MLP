import React from 'react';
import {Link,  useParams} from 'react-router-dom';
import axios from 'axios';
import {useState, useEffect} from 'react'
const Boardview = (props) => {

    let { id } = useParams();
    console.log(props);
        const [board, setBoard] = useState([]);
       //
        useEffect(()=>{
            console.log("id"+ id);
     
            axios.get(`http://localhost:9090/board/view/${id}`)
            .then((result)=>{
               
                setBoard(...board, result.data);
            })
            .catch((error)=>{
                console.log("Error : "+error);
            })
        }, []);
         
        
 

   


    return (
        <div>
            <div className="container" style={{margintop: "80px"}}>
        <h2>게시판 상세보기</h2>

        <table className="table table-hover">
            <tbody>
                <tr>
                    <th>제목</th>
                    <td colSpan="3">{board.title}</td>
                </tr>
                <tr>
                    <th>작성자</th>
                    <td>{board.writer}</td>
                   
                </tr>

                <tr>
                    <th colSpan="6" className="table-secondary">내용</th>
                </tr>
                <tr>
                    <td colSpan="6"></td>
                </tr>
                <tr>
                    <td colSpan="6">
                    {board.contents}
                    </td>
                </tr>
            </tbody>
        </table>
    </div>


    <div className="container mt-3" style={{"textAlign": "right"}}>

        <button type="button" className="btn btn-primary">Primary</button>
        <button type="button" className="btn btn-primary">Primary</button>
        <button type="button" className="btn btn-primary">Primary</button>
    </div>
        </div>
    );
};

export default Boardview;