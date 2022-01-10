import React from 'react';
import PropTypes from 'prop-types';

class Count extends React.Component {


    //함수를 생성자에서 등록해야함
    constructor(props){
        super(props);
        this.state={"count":0};
        
        this.onIncrease = this.onIncrease.bind(this);
        this.onDecrease = this.onDecrease.bind(this);
    }


    onDecrease = () => {
        this.setState({ "count": this.state.count - 1 });
    }
    onIncrease = () => {
        this.setState({ "count": this.state.count + 1 });
    }



    render() {
        return (
            <div>
                <h1>{this.state.count}</h1>
                <button type='button' onClick={ this.onIncrease}>+</button>&nbsp;&nbsp;
                <button type='button' onClick={ this.onDecrease}>-</button>
            </div>
        );
    }
}

export default Count;





