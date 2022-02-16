
const http = require('http');   
var fs = require("fs");
var ejs = require("ejs"); //npm install ejs  
const hostname = "127.0.0.1";   //jsp -> spring(framework)  nodejs -> express(서버)
const port=4000;  

var board_data=[
    {id:1, title:"제목1", contents:"내용1", writer:"작성자1"},
    {id:2, title:"제목2", contents:"내용2", writer:"작성자2"},
    {id:3, title:"제목3", contents:"내용3", writer:"작성자3"},
    {id:4, title:"제목4", contents:"내용4", writer:"작성자4"},
    {id:5, title:"제목5", contents:"내용5", writer:"작성자5"},
    {id:6, title:"제목6", contents:"내용6", writer:"작성자6"},
];

const server = http.createServer( (request, response)=>{

    fs.readFile("./html/board_list.html", "utf8", (error, data)=>{
        //error - 파일 읽다가 실패시 처리하기 위한 코드
        //data가 읽은 파일이 된다. 
        response.writeHead(200, {'Content-Type':'text/html'});
        //response.end(data);
        //ejs.render(파일데이터, {name:"홍길동", age:33})
        response.end(ejs.render(data, {board_data:board_data})); //클라이언트에 전송하기 
    });    
});

//서버가 listen함수를 호출해야 시작된다. 
server.listen(port, hostname, ()=>{
    console.log(`Server start  at http://${hostname}:${port}/`);
} )