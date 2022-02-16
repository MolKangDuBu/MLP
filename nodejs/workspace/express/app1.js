var express = require("express")

var app = express();//app 객체 생성

//미들웨어,
//use(get, post), get, post
app.get("/test", (request, response)=>{
    response.writeHead(200, {"Content-type": "text/html;charset:utf-8"});
    response.end("<h1>/test get</h1>");
});

app.post("/test2", (request, response)=>{
    response.writeHead(200, {"Content-type": "text/html;charset:utf-8"});
    response.end("<h1>/test2 get</h1>");
});

//http://127.0.0.1:4000/add?x=1&y=2
app.get("/add", (request, response)=>{
    var x = parseInt(request.query.x);
    var y= parseInt(request.query.y);
    response.writeHead(200, {"Content-type": "text/html;charset:utf-8"});
    response.end(`<h1>${x} + ${y} = ${x+y}</h1>`);
});
//http://127.0.0.1:4000/add/1/2
app.get("/add/:x/:y", (request, response)=>{
    var x = parseInt(request.params.x);
    var y= parseInt(request.params.y);
    response.writeHead(200, {"Content-type": "text/html;charset:utf-8"});
    response.end(`<h1>${x} + ${y} = ${x+y}</h1>`);
});

//http://127.0.0.1:4000/add
app.use(express.urlencoded({extended:true}));
app.post("/add", (request, response)=>{
    var x = parseInt(request.body.x);
    var y= parseInt(request.body.y);
    response.writeHead(200, {"Content-type": "text/html;charset:utf-8"});
    response.end(`<h1>${x} + ${y} = ${x+y}</h1>`);
});

app.use((request, response)=>{
    response.writeHead(200, {"Content-type": "text/html;charset:utf-8"});
    response.end("<h1>Hi Express</h1>");
});




app.listen(4000, ()=>{
    console.log("server start http://127.0.0.1:4000");
})