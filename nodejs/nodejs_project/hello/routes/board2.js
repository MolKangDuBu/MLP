var express = require('express');
var router = express.Router();
var mysql = require("mysql");

var pool= mysql.createPool( 
{
    connectionLimit:20,
    host:"localhost", 
    user:"user01",
    password:"1234",
    database:"mydb",
    port : 3306
});

/* GET home page. */
//http://127.0.0.1:3000/board2/  => 다른 라우터에 떠넘긴다
router.get('/', function(req, res, next) {
    res.redirect('/board2/list/1');
});
  
router.get('/list/:page', function(req, res, next) {

    var page=req.params.page;
    console.log(page); 
    //비동기 
    pool.getConnection( (err, connection)=>{
        console.log( err );
        var start = (parseInt(page)-1)*10;
        var sql = `select * from board
                   order by id desc 
                   limit ${start}, 10`;
        console.log( sql );
        
        connection.query(sql, (err, result)=>{
            res.render("board/board_list", {result:result}); //데이터만 보낸다 
            connection.release(); //디비해제        
        });
    });
});



//next 예를 들어서 하나의 함수에서 일을 끝내고 다른 라우터한테 일을 또 시켜야할때 
//next() 를 호출하면 된다. 라우터 사슬
router.post("/insert", (req, res, next)=>{
    var title = req.body.title;
    var contents = req.body.contents;
    var writer = req.body.writer; 

    var sql = `insert into board (title, writer, contents) 
            values('${title}', '${writer}', '${contents}')`;
    console.log(sql);
    
    pool.getConnection( (err, connection)=>{
        connection.query(sql, (err, rows)=>{
            //insert 쿼리의 경우 rows 는 의미가 없다. 
            if(err) //에러가 있으면 출력하자  
            {
                console.log( err ); 
                res.send(JSON.stringify({result:"fail"}));
            }
            else
                res.send(JSON.stringify({result:"success"})); 
            connection.release(); //연결해제하기 
        });
    });
})

//http://localhost:3000/board1/view/1 
router.get('/view/:id', function(req, res, next) {

    var id=req.params.id;
    console.log(id); 
    //비동기 
    pool.getConnection( (err, connection)=>{
        console.log( err );
       
        var sql = `select * from board
                   where id=${id}`;
        console.log( sql );
        connection.query(sql, (err, result)=>{
            res.render("board/board_view", {result:result[0]});//데이터는 배열로옴
           // res.send(JSON.stringify(result)); //데이터만 보낸다 
            connection.release(); //디비해제        
        });
    });
});


//write 페이지이동임 
router.get('/insert', (req, res)=>{
    res.render("board/board_write");
});

module.exports = router;








