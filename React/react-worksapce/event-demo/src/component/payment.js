import React from 'react';
import PropTypes from 'prop-types';

class Payment extends React.Component{

    constructor(props){
        super(props);

        this.state = {"pay":0, "time":0, "result":0};
        this.pm = this.pm.bind(this);
    }

    pay =(e)=>{
        this.setState({"pay":e.target.value});
    }

    time =(e)=>{
        this.setState({"time":e.target.value});
    }

    pm= ()=>{
        
        this.setState({"result":parseInt(this.state.pay)*parseInt(this.state.time)});
        
    }

    
    render() {
        return (
            <div>
                시간당 급여액: <input type="text" onChange={this.pay}></input>&nbsp;&nbsp;
                근무시간 :<input type="text" onChange={this.time}></input>
                주급 :<span>{this.state.result}</span><br></br>

                <button type='button' onClick={this.pm}>계산</button>
            </div>
        );
    }
}


export default Payment;