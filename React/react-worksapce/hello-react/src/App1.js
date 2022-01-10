import React from 'react';
//react.js라는 파일로부터 React 상용하기 위해 끌고옴

//함수 - 화살표함수표기
const App1 = () => {
    return (
        <div>
            <h1>This is component</h1>
        </div>
    );
};

//파일 외부에서 이 함수를 호출가능하게 해야함.
export default App1;