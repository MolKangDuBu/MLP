import axios from 'axios';
import React from 'react';
import {useState} from 'react';
import {Link, useNavigate} from 'react-router-dom';


const Boardwrite = () => {

    let history = useNavigate();//url 이동용 스택
    //공통의 변수
    const [inputs, setInputs] =useState({title:'', contents:'', writer:''});

    //inputs를 분해해서 각각의 변수로 저장한다.  디스트럭션-모던스크립트
    const {title, writer, contents}=inputs;

    //이벤트에 반응할 이벤트 핸들러
    const onChange = (e)=>{
        //이벤트가 발생하면 이벤트가 발생한 객체의 정보가 전달된다.
        //e.target는 이벤트가 발생한 객체의 name과 value 등의 속성이 저장되어 있는데
        //두개의 값을 분해해서 각자 저장한다.
        const{value, name} = e.target;

        //const value = e.target.value;
        //const name = e.target.name;
        //console.log("name : ", name, "value : ", value);
        setInputs({...inputs, [name]:value});
    }


    const onSubmit=(e)=>{
        e.preventDefault();//서버이동 막기 submit함수 막기
        axios.post("http://127.0.0.1:9090/board/insert", inputs)
        .then(res=>{
            console.log(res.data);
            alert("등록되었습니다.");
            history("/board/list");
        })        
        .catch((err)=>{
            console.log("Error : "+err);
        })
        
    }

    return (
        <div>
            <form onSubmit={onSubmit}>
              <div className="form-group">    
                  <label>제목:  </label>
                  <input  type="text" className="form-control" name="title" 
                  value ={title} onChange={onChange}/>
              </div>
              <div className="form-group">    
                  <label>이름:  </label>
                  <input  type="text" className="form-control" name="writer"
                   value ={writer} onChange={onChange}/>
              </div>
              <div className="form-group">    
                  <label>내용:  </label>
                  <input  type="text" className="form-control" name="contents"
                   value ={contents} onChange={onChange}/>
              </div>
              <div className="form-group">    
             
                <input type="submit" value="등록"className="form-control"/>
              </div>
            </form>
        </div>
    );
};

export default Boardwrite;