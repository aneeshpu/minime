var app = Sammy('#main', function() {
    this.use('Mustache');
    this.get('#/', function() {
        var context = this;
        this.load('api/hello', {json : true})
        .then(function(data){
            context
            .render('greeting.mustache',data)
            .replace(context.$element());
        });
    });

    this.get('#/about', function() {
            this
            .render('about.mustache')
            .replace(this.$element());
    });
    
    this.get("#/git", function(){
            this
            .render('git.mustache')
            .replace(this.$element());
    });

    this.put('#/git', function(){
        var context = this;
        var user = context.params.user;
        this.load('api/git/' + user)
        .then(function(data){
            $('#followers').text(data);
        });
        return false;
    });
});
