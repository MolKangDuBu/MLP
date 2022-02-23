require('dotenv').config();  //env 파일을 읽어서 access key와 secret key를 받아들인다
const axios = require('axios'); //axios는 ajax 전용라이브러리  
const CryptoJS = require("crypto-js"); //암호화 라이브러리 

const requestMethod = "POST";
const requestUrl= 'https://6n8ltxobn9.apigw.ntruss.com/custom/v1/14436/1d425634c4152bcd758bf9f31aeac7b4419ff490f10e336cf99b23f76d17ccaf/infer';
const secret_key="TlZEeFhlYnpyTEJWa09PR2pvY0NQWVRXcnRNZURnVkw=";
const timeStamp = Math.floor(+new Date).toString(); //floor-내림함수

const requestBody = {
  "images": [
    {
      "format": "jpg",
      "name": "medium",
      "data": null,
      "url": "https://beautifulfund.org/bf/files/common/img/business_license.jpg"
    }
  ],
  "lang": "ko",
  "requestId": "string",
  "resultType": "string",
  "timestamp": timeStamp,
  "version": "V1"
}
  
  
const config = {
  headers:{
    'X-OCR-SECRET':secret_key,
    'Content-Type':'application/json'
  }
}

axios.post(requestUrl, requestBody, config)
  .then( 
    response=>{ 
      //console.log( response.data ); 
      var data = response.data;
      var number = data.images[0].fields[0].inferText;
      var name = data.images[0].fields[1].inferText;
      console.log(number+"\n"+name);
      //console.log(data.)
    
    })
  .catch( 
    error =>{ 
      console.log( error); 
  })

