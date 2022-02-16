const http = require('http');   //react 에서는  import  구문으로 라이브러리 편입 
const hostname = "127.0.0.1";   //jsp -> spring(framework)  nodejs -> express(서버)
const port=4000;  
const fs = require("fs");
var url = require('url');  //get방식으로 정보 받았을때 파라미터 처리 모듈 
var queryString = require("querystring"); //이전버전
 
//npm install @ungap/url-search-params 

const server = http.createServer( (request, response)=>{
    
    console.log( request.url); //정보 가져오는거 확인
    var pathName = url.parse(request.url, true).pathname;
    console.log("pathname : ", pathName )

    if(request.method=="POST" && pathName=="/person")//맵핑
    {
        request.on('data', (data)=>{

            var params = queryString.parse(data.toString());//이전버전
            var params2 = new URLSearchParams(data.toString());
            console.log( data.toString());

            console.log("name : ", params["name"]);
            console.log("age : ", params["age"]);
            
            console.log(params2);
            console.log("name : ", params2.get("name"));
            console.log("age : ", params2.get("age"));
            
            response.writeHead(200, {"Content-Type":"text/html"});
            response.end("query receive");

        })
        
    }

});

//서버가 listen함수를 호출해야 시작된다. 
server.listen(port, hostname, ()=>{
    console.log(`Server start  at http://${hostname}:${port}/`);
} )