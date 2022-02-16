//was따로 없음 우리가 만들어서 쓴다. 

const http = require('http');   //react 에서는  import  구문으로 라이브러리 편입 
//require -  필요한 모듈을 메모리로 가져온다 

const hostname = "127.0.0.1";   //jsp -> spring(framework)  nodejs -> express(서버)
const port=4000;  
const fs = require("fs");
//nodejs 는 모든 함수가 비동기라 매개변수로 콜백함수가 거의 항상 있다. 
//콜백함수의 매개변수는 정해져있다. 콜백은 내마 만들고 호출은 시스템이 한다. 
//createServer 는 서버를 만드는건데 request, response  객체를 매개변수로 전달하는 
//콜백함수를 전달해줘야 한다. 서블릿 
const server = http.createServer( (request, response)=>{
    
    //header, body
    //get  -  header 만 보낸다. 
    //post - header 를 먼저 보내고 body를 따로 보낸다
    
    if(request.method=="GET")
    {
        response.writeHead(200, {"Content-Type":"text/html"});
        var data = fs.readFileSync("./html/index.html", "utf8");
        response.end(data);
    }
    else if(request.method=="POST")
    {
        //데이터가 계속 흘러온다 
        //데이터가 계속 수신하다가 수신이 끝나면 콜백함수를 호출한다 
        request.on('data', function(data){
            //수신받은 데이터가   data 라는 매개변수로 전달받는다 
            //파일을 수신한다던가. 아니면 그밖의 데이터들을 data로 받는다 
            console.log("ddddddddddddd");
            response.writeHead(200, {"Content-Type":"text/html"});
            var item = fs.readFileSync("./html/index.html", "utf-8");
            response.end(item);
        });
    }

});

//서버가 listen함수를 호출해야 시작된다. 
server.listen(port, hostname, ()=>{
    console.log(`Server start  at http://${hostname}:${port}/`);
} )