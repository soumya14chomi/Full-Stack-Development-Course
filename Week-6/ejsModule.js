const bodyParser = require("body-parser");
var express = require("express");

var app =express();
app.set('view engine', 'ejs');

app.use(express.urlencoded({ extended: true })); 

app.get('/', function(request, response){
    response.render("index");
});

app.get('/employee', function(request, response){
    var obj = {
        name : "Soumya",
        age :25,
        title : "Dev"
    };

    response.render("index1", obj);

});


app.get('/square/:n', function(request, response){
    var n = request.params.n;
    var msg = `Square of ${n} is ${n*n}`;
    var obj = {msg: msg};

    response.render("index2", obj);
});

app.get('/listOfFruits', function(request, response){
    var fruits = ["apple", "banana", "mango"];
    var obj = {fruits : fruits}

    response.render("fruitsPage", obj);
});

app.get('/multiplicationTable/:n', function(request, response){
    var n = request.params.n;
    var obj = {n : n};

    response.render("multiplicationTables", obj);
})

app.get('/post', function(request, response){
    var obj = { msg : "Welcome to get Method"};

    response.render("postSample", obj);
})

app.post('/post', function(request, response){

    var name = request.body.name1;
    var obj = { msg : `Welcome Back to post method:${name}`};

    response.render("postSample", obj);
});

app.use(express.urlencoded({ extended: true })); 
app.get('/search', function(request, response){
    var obj = {id : '', ename : '', job :'', salary:''}
    response.render('empolyeePage', obj);
});


app.post('/search', function(request, response){
    var id = request.body.id;
    var employees = require("./empModule");
    var emp ={};
    for(var employee of employees){
        if(employee.id == id){
            emp = employee;
            break;
        }
    }
    response.render('empolyeePage', emp);
})

app.listen(9001, () => console.log(" Service Listening..."));