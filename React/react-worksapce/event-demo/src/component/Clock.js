import React from 'react';
import PropTypes from 'prop-types';

class Clock extends React.Component {

    constructor(props){
        super(props);
        this.state = {
            date:new Date()
        }
    }

    componentDidMount(){
        console.log("mount");
        this.timerID = setInterval(()=>this.setState({date:new Date}), 1000);
        //state 에 저장된 변수를 직접 바꾸면 시스템이 언제 바뀐건지 알 수 없어서 반영을 못한다
        //그래서 setState라는 함수를 제공한다. setState함수를 통해서 state변수의 값을 수정하면
        //변경된 값을 보고 화면을 다시 수정한다.(다시 랜더링함)
    }

    componentWillUnmount(){
        console.log("unmount");
        clearInterval(this.timerID);
    }

    render() {
        return (
            <div>
                <h1 style={{'color':'red'}}>{this.state.date.toLocaleDateString()} {this.state.date.toLocaleTimeString()}</h1>
            </div>
        );
    }
};



export default Clock;