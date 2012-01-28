var app = Sammy('#main', function() {
    this.use('Mustache');
    this.get('#/minime', function() {
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
});
