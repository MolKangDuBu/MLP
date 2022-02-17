var express = require('express');
var router = express.Router();
var mysql = require("mysql");


var pool = mysql.createPool(
    {
        connectionLimit:20,
        host:"localhost",
        user:"user01",
        password:"1234",
        database:"mydb",
        port: 3306
    }
);

//http://127.0.0.1:3000/board/ => 다른 라우터에 떠넘김
router.get('/', function(req, res, next) {
    res.redirect('/board1/list/1');
  });

router.get('/list/:page', function(req, res, next) {

    var page = req.params.page;
    console.log(page);


  pool.getConnection((err, connection)=>{
      console.log("Error : "+err);
      var start = (parseInt(page)-1)*10;
        var sql = `select * from board
                    order by id desc
                    limit ${start}, 10`;         
        console.log(sql);
        connection.query(sql,(err, result)=>{
            res.send(JSON.stringify(result));//데이터만 보낸다
            connection.release();//DB해제
        });
  });  

});

//next는 하나의 함수에서 일을 끝내고 다른 라우터한테 일을 또 시켜야할때 호출함
//next() 를 호출
router.post("/insert", (req, res, next)=>{
    var title = req.body.title;
    var contents = req.body.contents;
    var writer = req.body.writer;

    var sql = `insert into board(title, writer, contents)
                values('${title}', '${writer}', '${contents}')`;
    console.log(sql);

    pool.getConnection((err, connection)=>{
        connection.query(sql,(err, rows)=>{
            //insert 쿼리의 경우 rows는 의미가 없음
            if(err)console.log(err);//에러가 날 경우 출력
            else res.send(JSON.stringify({result:"success"}));
            connection.release();
        });
    })
});



router.get('/view/:id', function(req, res, next) {

    var id = req.params.id;
    console.log(id);


  pool.getConnection((err, connection)=>{
      console.log("Error : "+err);
  
        var sql = `select * from board
                   where id =${id}`;         
        console.log(sql);
        connection.query(sql,(err, result)=>{
            res.send(JSON.stringify(result));//데이터만 보낸다
            connection.release();//DB해제
        });
  });  

});

module.exports = router;
