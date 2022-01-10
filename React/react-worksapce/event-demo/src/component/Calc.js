import React from 'react';
import PropTypes from 'prop-types';

class Calc extends React.Component {

    constructor(props) {
        super(props);
        this.state = { "result": 0, "x": 0, "y": 0 };
        this.Add = this.Add.bind(this);
        this.Sub = this.Sub.bind(this);
        this.Mul = this.Mul.bind(this);
        this.Div = this.Div.bind(this);
    }
    x = (e) => {
        this.setState({ "x": e.target.value });
    }
    y = (e) => {
        this.setState({ "y": e.target.value });
    }

    Add = () => {
        this.setState({ result: parseInt(this.state.x) + parseInt(this.state.y) });
    }

    Sub = () => {
        this.setState({ result:parseInt(this.state.x) - parseInt(this.state.y)});
    }


    Mul = () => {
        this.setState({ result: parseInt(this.state.x) * parseInt(this.state.y)});
    }


    Div = () => {
        this.setState({ result:parseInt(this.state.x) / parseInt(this.state.y)});
    }




    render() {
        return (
            <div>
                x:<input type="text" onChange={this.x} ></input> &nbsp;&nbsp;
                y:<input type="text" onChange={this.y} ></input>
                <br></br><br></br>
                Result:<h1>{this.state.result}</h1>

                <button type='button' onClick={this.Add}>+</button>&nbsp;&nbsp;
                <button type='button' onClick={this.Sub}>-</button>&nbsp;&nbsp;
                <button type='button' onClick={this.Mul}>*</button>&nbsp;&nbsp;
                <button type='button' onClick={this.Div}>/</button>


            </div>
        );
    }
}

export default Calc;