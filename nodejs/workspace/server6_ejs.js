//was(ex 톰캣)가 따로 없음

const http = require('http');
var fs = require("fs");
var ejs = require("ejs") // npm install ejs
const hostname = "127.0.0.1";
const port = 4000;


const server = http.createServer((request, response)=>{
  
    
    fs.readFile("./html/test.html", "utf8", (error, data)=>{
        //error - 파일을 읽다가 실패시 처리하기 위한 코드
        //data가 읽은 파일이 된다.
        response.writeHead(200, {'Content-Type':'text/html;'});
        //response.end(data);
        //ejs.render(파일데이터, {JSON데이터})
        //response.end(ejs.render(data));
        response.end(ejs.render(data, {name:"홍길동", age:33}));//클라이언트에 전송
    });
 
   
});

server.listen(port, hostname, ()=>{
    console.log(`Server start at http://${hostname}:${port}/`);
});