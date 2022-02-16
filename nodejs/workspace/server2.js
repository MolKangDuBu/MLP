//was(ex 톰캣)가 따로 없음

const http = require('http'); //react에서는 import 구문으로 라이브러리 편입
// require - 필요한 모듈을 메모리로 가져온다.
var fs = require("fs");

const hostname = "127.0.0.1"; //jsp -> spring(framwork) nodejs -> express(서버)
const port = 4000;

//nodejs는 모든 함수가 비동기라 매개변수로 콜백함수가 거의 항상 있음
//콜백함수의 매개변수는 정해져있다. 시스템이 호출한다.
//createServer는 서버를 만드는건데 request, response 객체를 매개변수로 전달하는
//콜백함수를 전달해줘야함. 서블릿같은것
const server = http.createServer((request, response)=>{
    //클라이언트로부터 서버로 요청이 들어오면 이 함수가 호출된다.
    //request - 요청을 받는 객체이고
    //response - 응답을 할 객체이다.

    response.writeHead(200, {'Content-Type':'text/html; charset=utf-8'});
    
    //얘는 동기식으로 함수가 구성됨
    var data = fs.readFileSync("./html/index.html", "utf8");
    response.end(data);//클라이언트에 전송
});

//서버가 listen 함수를 호출해야 시작된다.
server.listen(port, hostname, ()=>{
    console.log(`Server start at http://${hostname}:${port}/`);
});