import React from 'react';
import {Link, useNavigate} from 'react-router-dom';
import axios from 'axios';
import {useState, useEffect} from 'react'


const Boardlist = () => {


    const [board, setBoard] = useState([]);
    useEffect(()=>{
  
        axios.get("http://localhost:9090/board/list")
        .then((result)=>{
            setBoard(...board, result.data);
        })
    }, []);


    return (
        <div>
   
            <div className="container" style={{margintop: "80px"}}>
        <h2>게시판</h2>

        <div className="input-group mb-3"  style={{margintop: "20px"}}>
            <button type="button" className="btn btn-primary dropdown-toggle" data-bs-toggle="dropdown">
                
              </button>
              <ul className="dropdown-menu">
                <li><a className="dropdown-item" href="#">제목</a></li>
                <li><a className="dropdown-item" href="#">내용</a></li>
                <li><a className="dropdown-item" href="#">제목+내용</a></li>
              </ul>
            <input type="text" className="form-control" placeholder="Search"/>
            <button className="btn btn-success" type="submit">Go</button>
        </div>
        <table className="table">
            <colgroup>
                <col width="8%"/>
                <col width="*%"/>
                <col width="12%"/>
            </colgroup>
            <thead className=" table-secondary">
                <tr>
                    <th>No</th>
                    <th>제목</th>
                    <th>작성자</th>
                </tr>
            </thead>
            <tbody>
                {
                    board.map((obj, i)=>{
                        return(
                            <tr key ={obj.id}>
                            <td>{obj.id}</td>
                            <td style={{textAlign:'left'}}><Link to ={`/board/view/${obj.id}`}>{obj.title}</Link></td>
                            <td>{obj.writer}</td>
                        </tr>
                        )
                    })
                }
            
            </tbody>
        </table>
    </div>
 
    <div>

        <ul className="pagination pagination justify-content-center">
            <li className="page-item"><a className="page-link" href="#">Firsts</a></li>
            <li className="page-item"><a className="page-link" href="#">1</a></li>
            <li className="page-item"><a className="page-link" href="#">2</a></li>
            <li className="page-item"><a className="page-link" href="#">3</a></li>
            <li className="page-item"><a className="page-link" href="#">4</a></li>
            <li className="page-item"><a className="page-link" href="#">5</a></li>
            <li className="page-item"><a className="page-link" href="#">Last</a></li>
        </ul>
    </div>

    <div className="container mt-3" style={{"textAlign": "right"}}>

        <Link to ="/board/write" className="btn btn-primary">글쓰기</Link>
       
    </div>

        </div>
    );
};

export default Boardlist;