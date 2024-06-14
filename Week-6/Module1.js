var myName = "Soumya";
var myAge =25;

module.exports.myName = myName;
module.exports.myAge = myAge;

var people = [
    {id:1,pname:"Anil",gender:"Male",age:25},
    {id:2,pname:"Bobby",gender:"Female",age:28},
    {id:3,pname:"Cathe",gender:"Female",age:25},
    {id:4,pname:"Eman",gender:"Female",age:26},
    {id:5,pname:"David",gender:"Male",age:28}
];
module.exports.people = people;






var sayHello = function(){
    console.log("From Module1, Good Morning!");
}
var display = function(){
    console.log("From Module1, Good Evening!");
}
module.exports.wishes  =  new Date().getHours() <12  ?sayHello : display;



module.exports.square = x => x*x;


employees = [
    {id:1,ename:"Kiran",job:"Trainer",salary:5500},    
    {id:2,ename:"Anil",job:"Developer",salary:5200},    
    {id:3,ename:"Sunil",job:"Programmer",salary:4500},    
    {id:4,ename:"Swathi",job:"Trainer",salary:5900}
];

module.exports.employees =employees;

module.exports.app = function(app){
    app.get('/exports', function(request, response){
        response.json({msg : "Hello!! From Different File"});
    });

    app.get('/exports/employees', function(request, response){
        response.json(employees);
    });

    var empMod = require("./empModule");


    app.get('/exports/getEmployee/:id', function(request, response){
        var eId = request.params.id;
        var e ={};
        for(var i in empMod){
            if(i.id === eId){
                e = empMod[i.id];
                break;
            }
        }
        response.json(e);
    });
}