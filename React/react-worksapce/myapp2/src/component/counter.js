//rsc
import React from 'react';
import {useState, useEffect} from 'react';
//함수명은 대문자
const Counter = () => {

    //변수
    //변수명, 변수에 값을 업데이트할 함수명, set변수명형태로 하자
    //useState 함수를 통해 값을 초기화함
    const [count, setCount] = useState(0);//변수를 생성하고 변수의 값을 초기화
    

    const increase =()=>{
        //alert("증가");
        //count+=1 이렇게 쓰면 값은 변경되지만 화면상에 출력이 안됨 -> refresh를 따로 해야함
        setCount(count+1);//값을 바꾸고 화면을 refresh
    }

    const decrease =()=>{
        //alert("감소");
        setCount(count-1);
    }

    return (
        <div>
            <div> 
                <div>현재카운트 :{count}</div>
                <button type = "button" onClick ={increase}>증가</button>
                <button type = "button" onClick ={decrease}>감소</button>
            </div>
        </div>
    );
};

export default Counter;