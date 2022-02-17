var express = require('express');
var router = express.Router();

/* GET home page. */
router.get('/', function(req, res, next) {
  res.render('test', { name:"홍기동", age:20 });
});


router.get('/a', function(req, res, next) {
    res.render('test2', { x:10, y:20, z:30});
});


module.exports = router;
