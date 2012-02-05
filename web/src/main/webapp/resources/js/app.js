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

    this.get('#/linkedin', function() {
            var context = this;
            this.load('api/linkedin', {json : true})
            .then(function(data){
                context
                .render('linked.mustache',data)
                .replace(context.$element());
            });
        });

});
