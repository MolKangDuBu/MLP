require('dotenv').config(); //emv 파일을 읽어서 accesskey와 secretkey를 받아드림
const axios = require('axios'); //(axios)ajax 전용 라이브러리
const CryptoJS = require("crypto-js"); //암호화 라이브러리

const access_key = process.env.access_key;
const secret_key = process.env.secret_key;

const requestMethod = "GET";
const hostName = 'https://geolocation.apigw.ntruss.com'
const requestUrl= '/geolocation/v2/geoLocation'

const timeStamp = Math.floor(+new Date).toString();//floor 내림 함수

//naver 서버에 api 여청을 할때 요청 정보를 헤더에 암호화해서 전송한다.
function makeSignature(secretKey, method, baseString, timestamp, accessKey) {
  const space = " ";
  const newLine = "\n";
  let hmac = CryptoJS.algo.HMAC.create(CryptoJS.algo.SHA256, secretKey);

  hmac.update(method);
  hmac.update(space);
  hmac.update(baseString);
  hmac.update(newLine);
  hmac.update(timestamp);
  hmac.update(newLine);
  hmac.update(accessKey);
  const hash = hmac.finalize();

  return hash.toString(CryptoJS.enc.Base64);
}

  //서버로 데이터를 보내기위해서 JSON형태로
  const sortedSet = {};
  sortedSet["ip"] = "211.179.139.15";//IP_ADDRESSS
  sortedSet["ext"] = "t";
  sortedSet["responseFormatType"] = "json";//답을 json으로 받는다
  
  // const sortedSet=[{"ip" : "ipaddress",
  //    "ext" :"t",
  //    "responseFormatType": "json"
  //   }] 위와 같음


  //reduce는 앞에 연산결과와 누적하고자 할때 사용하는 함수


  let queryString = Object.keys(sortedSet).reduce( (prev, curr)=>{
    return prev + curr + '=' + sortedSet[curr] + '&';
  }, "");

  queryString = queryString.substr(0, queryString.length -1 );


  const baseString = requestUrl + "?" + queryString;
  const signature = makeSignature(secret_key, requestMethod, baseString, timeStamp, access_key);

  const config = {
    headers: {
      'x-ncp-apigw-timestamp': timeStamp,
      'x-ncp-iam-access-key' : access_key,
      'x-ncp-apigw-signature-v2': signature
    }
  }

  axios.get(`${hostName}${baseString}`, config)
    .then( response=>{ 
      console.log(response); 
      // const address =response.data.geoLocation;
      // console.log(address.r1+" "+address.r2+" "+address.r3)
      // console.log(address.lat+" "+address.long);

    })
    .catch( error =>{ console.log(error.response.data ); 
    })



