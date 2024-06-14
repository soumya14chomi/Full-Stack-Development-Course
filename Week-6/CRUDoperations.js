var express = require("express");
var app = express();

app.set('view engine', 'ejs');

app.use(express.urlencoded({ extended: true })); 

var employees  = require("./empModule");

var fs =require("fs");

app.get('/', function(request, response){
    var obj = {employees:employees};
    response.render('empCrudOps', obj);
});

app.get('/fetchAll', function(request, response){
    var obj = {employees : employees};
    response.render("EmpList", obj);
})

app.get('/getByID', function(request, response){
    var obj = {msg : 'Provide an employee Id', emp:{
        id :'',
        ename : '',
        salary : '',
        job :''
    }};
    response.render('getEmployeeByID', obj);
});

app.post('/getById', function(request, response){
    var id = request.body.id;
    var obj ={msg : "Employee fetched", emp: ''};
    for( var emp of employees){
        if(emp.id == id){
            obj.emp = emp;
            break;
        }
    }
    response.render('getEmployeeByID', obj);
});

app.get('/deleteById', function(request, response){
    var obj = {msg : 'Provide an employee Id to Delete', emp:{
        id :'',
        ename : '',
        salary : '',
        job :''
    }};
    response.render('deleteEmployeeByID', obj);
})

app.post('/deleteById', function(request, response){
   // JsonArray employees =  require("./empModule");
    var eid = request.body.id;
    var obj = {msg : 'Employee Deleted', emp: ''};
    for(var i =0; i<employees.length; i++){
       // console.log(employees[i]);
        if(employees[i].id == eid){
            obj.emp = employees[i];
            //console.log(obj.emp);
            employees.splice(i,1)
            fs.writeFile('empModule.js', "module.exports = "+JSON.stringify(employees), (err) =>{
                if(err) 
                    console.log("Error Deleting Employee");
            });
        } 
    }
    response.render('deleteEmployeeByID', obj);
});

app.get('/addEmployee', function(request, response){
    var obj = {msg :'Add Employee Details', emp:{
        id:'',
        ename:'',
        job:'',
        salary:''
    }};
    response.render('addEmployee', obj);
});

app.post('/addEmployee', function(request, response){
    var eid = request.body.id;
    var ename = request.body.name;
    var salary = request.body.salary;
    var job = request.body.job;
    var obj = {msg : 'Employee Added', emp: {
        id: eid,
        ename : ename,
        job : job,
        salary : salary
    }};
    console.log(typeof employees);
    employees.push(obj.emp);

    let employeejson = "module.exports = "+ JSON.stringify(employees);
    fs.writeFile("empModule.js", employeejson, (err) => console.log(err));
    response.render('addEmployee', obj);

});

app.listen(9001, () => console.log(" Service Listening..."));