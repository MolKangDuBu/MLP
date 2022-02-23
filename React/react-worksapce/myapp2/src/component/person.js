import React from 'react';
import {useState, useEffect} from 'react';
const Person = () => {
    //배열
    const [personList, setPersonList] = useState([]);
    
    //맨처음에 화면에 랜더링 될때 전달된 콜백함수가 호출된다.
    //...personList : 모던스크립트에 있는 문법, 앞의 배열에 다른 데이터 추가
    useEffect(()=>{
        console.log("wwwww");
        setPersonList(
            ...personList,
        [ {id :1, name:'ㅇㅇㅇ', phone : '010-0000-0001'},
        {id :2, name:'ㅁㅁㅁ', phone : '020-0000-0001'},
        {id :3, name:'ㄱㄱㄱ', phone : '030-0000-0001'}]
        )
    }, []);

    return (
        <div>
            <table>
             
                     {personList.map((obj, index)=>{
                         return (
                             <tr>
                             <td>{obj.id}</td>
                             <td>{obj.name}</td>
                             <td>{obj.phone}</td>
                             </tr>                             
                         )
                     })}
                
            </table>
        </div>
    );
};

export default Person;