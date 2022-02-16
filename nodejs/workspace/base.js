//was(ex 톰캣)가 따로 없음

const http = require('http');
var fs = require("fs");

const hostname = "127.0.0.1";
const port = 4000;


const server = http.createServer((request, response)=>{
  
    response.writeHead(200, {'Content-Type':'text/html; charset=utf-8'});
    
 
    var data = fs.readFileSync("./html/index.html", "utf8");
    response.end(data);
});

server.listen(port, hostname, ()=>{
    console.log(`Server start at http://${hostname}:${port}/`);
});