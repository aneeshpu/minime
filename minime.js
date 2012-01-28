var connect = require('connect');

var api = connect.router(function(app){
    app.get('/hello', function(req, res, next){
        res.setHeader("Content-Type", "application/json");
        res.end("{greeting:'hello minime'}");
    });
});

connect(connect.static(__dirname + '/public'))
.use(connect.logger())
.use("/minime", function(req, res, next){
    if ('GET' != req.method) {return next();}
    res.setHeader('Location', 'index.html');
    res.end();
  })
.use(connect.favicon())
.use('/api', api)
.listen(3000);
