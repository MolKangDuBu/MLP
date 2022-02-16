
const http = require('http');   
var fs = require("fs");
var pug = require("pug"); //npm install jade => npm install pug 
const hostname = "127.0.0.1";   //jsp -> spring(framework)  nodejs -> express(서버)
const port=4000;  
var dataList=
[
    { "url": "http://www.google.com", "title": "구글"     },
    { "url": "http://www.naver.com",    "title": "네이버" },
    { "url": "http://www.daum.net",     "title": "다음"     }
]

const server = http.createServer( (request, response)=>{

    fs.readFile("./html/test1.jade", "utf8", (error, data)=>{
        //error - 파일 읽다가 실패시 처리하기 위한 코드
        //data가 읽은 파일이 된다. 
        response.writeHead(200, {'Content-Type':'text/html; charset=utf-8'});
        var fn = pug.compile(data);
        response.end(fn({"rows":dataList})); //클라이언트에 전송하기 
    });    
});

//서버가 listen함수를 호출해야 시작된다. 
server.listen(port, hostname, ()=>{
    console.log(`Server start  at http://${hostname}:${port}/`);
} )