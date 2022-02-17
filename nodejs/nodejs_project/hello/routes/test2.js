var express = require('express');
var router = express.Router();

//http://127.0.0.1:3000/test2?x=5&y=4
router.get('/', function(req, res, next) {
    var x = parseInt(req.query.x);
    var y = parseInt(req.query.y);
    res.render('result', { x:x, y:y, result:x+y});
});

//http://127.0.0.1:3000/test2/5/4
router.get('/:x/:y', function(req, res, next) {
    var x = parseInt(req.params.x);
    var y = parseInt(req.params.y);
    res.render('result', { x:x, y:y, result:x+y});
});


//http://127.0.0.1:3000/test2/
router.post('/', function(req, res, next) {
    var x = parseInt(req.body.x);
    var y = parseInt(req.body.y);
    res.render('result', { x:x, y:y, result:x+y});
});




module.exports = router;
