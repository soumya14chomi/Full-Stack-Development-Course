 var express = require("express");  
// var app = express();
// app.get('/', function(request, response){
//     response.send("Hello Client!!! Restful Services Started from GET!!")
// });

// app.post('/', function(request, response){
//     response.send("Hello Client!!! Restful Services Started from POST!!!")
// })

// app.put('/', function(request, response){
//     response.send("Hello Client!!! Restful Services Started from PUT!!!")
// })

// app.delete('/', function(request, response){
//     response.send("Hello Client!!! Restful Services Started from DELETE!!!")
// });

// app.get('/',function(req,resp){
//     resp.send("Hello from API");
// });
// app.get('/time',function(req,resp){
//     var time= new Date().toLocaleTimeString();
//     resp.send(`Time is: ${time}`);
// });
// app.get('/date',function(req,resp){
//     var date = new Date().toLocaleDateString();
//     resp.send(`Date is: ${date}`);
// });
// app.get('/wishes/:name',function(req,resp){
//     var name = req.params.name;
//     resp.send(`Hello ${name}`);
// });
// app.get('/square/:n',function(req,resp){
//     var n = req.params.n;
//     resp.send(`Square of ${n} is: ${n*n}`)
// });
// app.get('/addition/:a/:b',function(req,resp){
//     var a = Number(req.params.a);
//     var b =Number( req.params.b);
//     var c = a+b;
//     resp.send(`Add of ${a} and ${b} is: ${c}`);
// });

// app.get('/json', function(request, response){
//     var emp ={
//         id:1, 
//         name : "soumya",
//         title: "Dev"
//     };
//     response.json(emp);
// })


// app.listen(9000, () => console.log("API Started listening!!"));


var app = express();

var routes = require("./appModule");
routes(app);
app.listen(9000, () => console.log("API Started Listening..."));

