//was따로 없음 우리가 만들어서 쓴다. 

const http = require('http');
const hostname = "127.0.0.1";
const port = 4000;
const fs = require("fs");
var url = require('url'); //get방식으로 정보를 받았을때 파라미터 처리 모듈

const server = http.createServer((request, response) => {

    console.log(request.url);//정보 가져오는거 확인
    var pathName = url.parse(request.url, true).pathname;
    console.log("pathname : ", pathName);
    if (request.method == "GET") {



        //파라미터 분리하기
        var query = url.parse(request.url, true).query;
        // response.end(`${query.x}+${query.y}= ${query.x+query.y}`);
        var x = parseInt(query.x);
        var y = parseInt(query.y);
        if (pathName == "/add") {
            response.writeHead(200, { "Content-Type": "text/html" });
            response.end(`${x}+${y}= ${x + y}`);
        }else if (pathName == "/sub") {
            response.writeHead(200, { "Content-Type": "text/html" });
            response.end(`${x}-${y}= ${x - y}`);
        }else if (pathName == "/mul") {
            response.writeHead(200, { "Content-Type": "text/html" });
            response.end(`${x}x${y}= ${x * y}`);
        }else if (pathName == "/div") {
            response.writeHead(200, { "Content-Type": "text/html" });
            response.end(`${x}/${y}= ${x / y}`);
        }
    }


});


server.listen(port, hostname, () => {
    console.log(`Server start  at http://${hostname}:${port}/`);
})