var app = Sammy('#main', function() {
    this.use('Mustache');
    this.get('#/hello', function() {
        var context = this;
        this.load('api/hello', {json : true})
        .then(function(data){
            context
            .render('greeting.mustache',data)
            .appendTo(context.$element());
        });
    });
});
