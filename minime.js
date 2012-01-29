var connect = require('connect');
var GitHubApi = require('github').GitHubApi;

var github = new GitHubApi(true);

var api = connect.router(function(app){
    app.get('/hello', function(req, res, next){
        res.end('{"greeting":"hello minime"}');
    });
    
    app.get('/git/:user', function(req, res, next){
        var user = req.params.user;
        github.getUserApi().getFollowers(user, function(err, followers){
            res.end(JSON.stringify(followers));
        });
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
