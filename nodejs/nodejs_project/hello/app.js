var createError = require('http-errors');
var express = require('express');
var path = require('path');
var cookieParser = require('cookie-parser');//쿠키
var logger = require('morgan');//로그

//url - 함수 연결코드
//-----------------------------------------------
var indexRouter = require('./routes/index');
var usersRouter = require('./routes/users');
var testRouter = require('./routes/test');
var test2Router = require('./routes/test2');

var board1Router = require('./routes/board1');
var board2Router = require('./routes/board2');
//-----------------------------------------------
var app = express();

//환경설정 - 웹환경을 설정(스프링의 web.xml처럼)
//변수가 __로 시작하는 변수는 내장변수이다. 직접 만들지않아도 nodejs가 가지고있음
//__driname : 현재 디렉토리 정보
// view engine setup
app.set('views', path.join(__dirname, 'views'));
app.set('view engine', 'ejs');


//미들웨어 - 중간에 단계별로 필요한 조치를 하기 위해서 거친다.
app.use(logger('dev'));
app.use(express.json());
app.use(express.urlencoded({ extended: false }));
app.use(cookieParser());
app.use(express.static(path.join(__dirname, 'public')));

//-----------------------------------------------
app.use('/', indexRouter); // / 인덱스
app.use('/users', usersRouter);// /users 사용자파일로
app.use('/test', testRouter);
app.use('/test2', test2Router);
app.use('/board1', board1Router);
app.use('/board2', board2Router);
//-----------------------------------------------

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
