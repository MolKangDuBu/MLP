var createError = require('http-errors');
var express = require('express');

//미들웨어 - 중간에서 각자 담당업무가있어서 
var path = require('path');
var cookieParser = require('cookie-parser');
var logger = require('morgan');
var cors=require('cors'); //npm install --save cors 

//라우터 : url -> 동작할 함수를 연결하는 작업 
var indexRouter = require('./routes/index');
var usersRouter = require('./routes/users');
var guestbookRouter = require('./routes/guestbook');

var app = express();

// view engine setup- html로 서비스 할때 
app.set('views', path.join(__dirname, 'views'));
app.set('view engine', 'ejs');

//미들웨어를 연결한다 
app.use( cors( {
  origin:true, 
  credentials:true
}));

app.use(logger('dev'));
app.use(express.json());
app.use(express.urlencoded({ extended: false }));//자동 utf-8 인코딩 
app.use(cookieParser());//쿠키담당
app.use(express.static(path.join(__dirname, 'public')));
//css, image, js 파일 있는곳 

//스프림에서 @RequestMapping 이 라우터 
app.use('/', indexRouter);
app.use('/users', usersRouter);
app.use('/guestbook', guestbookRouter);

// catch 404 and forward to error handler
app.use(function(req, res, next) {
  next(createError(404));
});

// error handler
app.use(function(err, req, res, next) {
  // set locals, only providing error in development
  res.locals.message = err.message;
  res.locals.error = req.app.get('env') === 'development' ? err : {};

  // render the error page
  res.status(err.status || 500);
  res.render('error');
});

module.exports = app;
