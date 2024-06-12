
// var name1 = "Soumya";
// console.log("Hello, Welcome to My node.js Project, " +name1+"!!!");
// console.log(typeof name1);

// var v1=100;
// console.log('v1 = '+v1+", data type is: "+ typeof v1);
 
// var v2="Soumya";
// console.log('v2 = '+v2+", data type is: "+ typeof v2);
 
// var v3=true;
// console.log('v3 = '+v3+", data type is: "+ typeof v3);

// console.log ( `${v1} `);
// console.log(`v1 = ${v1}`);
 
// console.log(`Next value of ${v1} is ${v1+1}`);
 
// console.log(`Previous value of ${v1} is ${v1-1}`);
 
// console.log(`Square of ${v1} is ${v1*v1}`);
 
// console.log(`Cube of ${v1} is ${v1*v1*v1}`);

// var name="Soumya Narsimha Namani";
 
// console.log(name);
// console.log(name.length);
// console.log(name.toUpperCase());
// console.log(name.toLowerCase());

// //Displaying the First and Last name of name

// console.log("First Name of "+name+" is " +name.substr(0, name.indexOf(' ')));
// console.log("Last name of "+name + " is "+ name.substr(name.lastIndexOf(' ')+1, name.length));

// //Data
// var d= new Date();
// console.log ( d.getDate());
// console.log ( d.getMonth()+1 ); //month return 0 to 11
// console.log ( d.getFullYear());
 
// console.log ( d.getHours());
// console.log ( d.getMinutes());
// console.log ( d.getSeconds());
 
// console.log ( d.getDate()); // return 0 to 6
 
// console.log ( d.toLocaleDateString());
// console.log( d.toLocaleTimeString());
 
// var v1=100;
// var v2=100;
 
// if ( v1==v2) 
//     console.log("Both are same");
// else
//     console.log("Not same");

//     var uname="kiran";
// var pwd="kumar";
 
// if ( uname=="kiran" && pwd=="kumar")
//     console.log("Credentials found correct..");
// else
//     console.log("Invalid input credentials...");


// var list = ["soumya", "namani", "shriuthi", "ajhdkd"]


// console.log("---------------- DIFF B/W FOR--IN AND FOR--OF --------------------")
// for(let i in list){
//     console.log(i);
// }

// for(let i of list){
//     console.log(i)
// }

// console.log("---------------------- ARRAYS -----------------")

// var items = ["pencil","eraser","sharpner","scale"];

// console.log ( items );
// console.log ( items );  //To display all items
// console.log ( items[0]);    //To display first item
// console.log ( items[1]);    //To display second item
 
// console.log ( items.length);    //To display count of items
// console.log ( items[items.length-1]);   //To display last item
 
// items = ["pencil","eraser","sharpner","scale"];
// console.log (`All items are: ${items}` );  //To display all items
// console.log ( `First item is: ${items[0]}`);    //To display first item
// console.log ( `Second item is: ${items[1]}`);    //To display second item
// console.log (`No. of items : ${items.length}`);    //To display count of items
// console.log (`Last item is: ${items[items.length-1]}` );   //To display last item
// console.log("--------------------------------------------")
// var items = new Array();
// items["one"] = "first";
// items["two"] = "second";
// items[3] = "third";
// items.push("fourth");
  
// for ( var i in items )
//     console.log ( `items[${i}] = ${items[i]}` );

// for( var i of items)
//     console.log(i); //WHY????

// console.log(items.slice())



// console.log("------------------------ JSON ----------------------")

// var e1={id:1, ename:"Allen", job:"Trainer", salary:5500};
 
// console.log ( e1.id );
// console.log ( e1.ename);
// console.log ( e1.job );
// console.log ( e1.salary);

// var e1={id:1, ename:"Allen", job:"Trainer", salary:5500};
 
// for ( var i in e1 )
//     console.log ( i );

// var employees = [
//     {id:201,ename:"Allen",job:"Admin",salary:12000},
//     {id:202,ename:"Bobby",job:"Programmer",salary:15000},
//     {id:203,ename:"Cathe",job:"Trainer",salary:21000},
//     {id:204,ename:"David",job:"Developer",salary:18000}
// ];
// for ( var i=0 ; i<employees.length ; i++ )
//     console.log ( employees[i].id+" "+employees[i].ename+" "+employees[i].job+ " "+employees[i].salary);
// for ( let e of employees)
//     console.log ( e.id+" "+e.ename+" "+e.job+" "+e.salary);
// employees.unshift({id:101,ename:"Sunil",job:"Trainer",salary:20000});        //Add row in the begining
// employees.push({id:105,ename:"Swathi",job:"Manager",salary:9500})
// for ( let e of employees)  //iterate on each record    
//         console.log(e);





// console.log("--------------------- MODULE EXPORTS AND IMPORTS -------------------------");

// var m1 = require("./Module1.js");
// console.log("Imported:")
// console.log(m1.myName);
// console.log(m1.myAge);

// var people = require("./Module1").people;
 
// for ( let p of people)
//     console.log(`${p.id} ${p.pname} ${p.gender} ${p.age}`);




// console.log("================================================== FUNCTIONS ================================");

// var sayHello = function(){
//     console.log("Good Morning!");
// }
// sayHello()

// var printName  = function(myName){
//     console.log("Hello!!"+myName);
// }

// printName("Soumya")


// function mulTable(n){
//     console.log("PRINTING "+i+" TABLE");
//     for(var i=1; i<=n;i++){
//         console.log(`${n} * ${i} = ${n*i}`);
//     }
// }

// mulTable(10);

// var wishes = require('./Module1').wishes; 

// wishes();

// (function(){
//     console.log("From anonymous Functions");
// }) ();

// (function (args) {
//     console.log("From parametrized anonymous Functions:"+args)
// }) ("Args");
// console.log("=========================================================================")

// console.log("============================= ARROW FUNCTIONS ===========================");

// var wishes = () => console.log("In Arrow Function");

// wishes();

// var withParamsSquare = x => x*x;

// console.log("Square of "+10+": "+withParamsSquare(10));

// var withParamsCube = x => x*x*x;

// console.log("Cube of "+10+": "+withParamsCube(10));

// var add = (x, y) => x+y;

// console.log("sum of 10+20:"+add(10, 20));

// var upper = x => x.toUpperCase();

// console.log("To upper case of soumya:"+upper("soumya"));

// var len = x => x.length();

// var firstName = x => x.substr(0, x.indexOf(' '));
// var lastName = x => x.substr(x.lastIndexOf(' ')+1);

// var myName = "Soumya Namani";
// console.log("FirstName:"+firstName(myName)+" LastName:"+lastName(myName));

// var module = require('./Module1.js');

// console.log(module.square(10));

// console.log("=========================================================================================");

// console.log("=================================== ASYNCHRONOUS FUNCTIONS ===============================");

// function display(cb){       //Callback is a function contains function as arugment
//     cb();   
// }
// function morning(){
//     //statements taking 1 min to execute
//     console.log("Good Morning!");
// }
// function afternoon(){
//     //statements taking 1 min to execute
//     console.log("Good Afternoon!");
// }
 
// display(morning);
// display(afternoon);


// var calculateNumber = function(num, op){
//     return op(num);
// };

// var square = x => x*x;

// var factorial = function(x){
//     let f=1;
//     for(var i=1; i<=x;i++)
//         f=f*i;
//     return f;
// }


// console.log("Square: "+calculateNumber(10, square));
// console.log("Factorial:"+calculateNumber(10, factorial));

// //display(display);
// console.log("===========================================================================================");


// console.log("=================================File System ===============================================");


// var fs =require("fs");

// //Create folder Asynchronously
// // fs.mkdir("AsyncFolder", function(){
// //     console.log("Folder Created Sucessfully");
// // });

// // fs.mkdirSync("SyncFolder", function(){
// //     console.log("Sync Folder Creation successful");
// // });

// // fs.mkdir("AsyncFolder1", function(err){
// //     if(!err){
// //         console.log("Folder created success");
// //     }
// //     else{
// //         console.log("Failed:"+err);
// //     }
// // });

// try{

//     fs.mkdir("AsyncFolder", function(err){
//         if(err){
//             console.log("Failed Async folder creation because:"+err);
//         }
//         else{
            
//             console.log("  Async Folder Created Successfully");
//         }
//     });
// }catch{
//     console.log("Failed to Create Async Folder");
// }

// try{
//     fs.rmdir("AsyncFolder", function(err){
//         if(err){
            
//         console.log("Failed to remove Async Folder because:"+err);
//         }
//         else{
//             console.log("Async Folder Removed Successfully");
//         }
//     });
// }catch{
//     console.log("Async Folder not removed");
// }

// try{

//     fs.mkdir("SyncFolder", function(err){
//         if(err){
//             console.log("Failed Sync folder creation because:"+err);
//         }
//         else{
            
//             console.log("  Sync Folder Created Successfully");
//         }
//     });
// }catch{
//     console.log("Failed to Create Sync Folder");
// }

// try{
//     fs.rmdir("SyncFolder", function(err){
//         if(err){
            
//         console.log("Failed to remove Sync Folder because:"+err);
//         }
//         else{
//             console.log("Sync Folder Removed Successfully");
//         }
//     });
// }catch{
//     console.log("Sync Folder not removed");
// }


// try{
//     fs.readFile("./AsyncFolder1/sample.txt", 'utf8', function(err, data){
//         if(err){
//             console.log("Cannot read Async file beacause:"+err);
//         }
//         else{
//             console.log("Read successful"+data);
//         }
//     })
// }catch{
//     console("Read Failed");
// }
// try{
//     var data = 
//     fs.writeFile("./AsyncFolder1/sample.txt", "\n Second Line",function(err){
//         if(!err){
//             console.log("Data write Succesful:");
//         }
//     });

// }catch{
//     console.log("Write not successful");
// }



// console.log("=============================================================================================");

// console.log("========================================= PROMISES ==========================================");

// var status = true;

// var promise1 = new Promise(function(resolve, reject){
//     if(status){
//         resolve("Promise satisfied, request processed!!");
//     }
//     else{
//         reject("Promise not satisfied, requesr not processed!!");
//     }
// });

// promise1
//     .then(function(response){
//         console.log(response);
//     }).catch(function(error){
//         console.log(error);
//     });
// promise1.then(x => console.log(x))
//         .catch(x => console.log(x));

// var questionedTrained =false;

// var willStudentPass = new Promise(function(resolve, reject){
//     if(questionedTrained){
//         var status = {result : "PASS", grade : "Applicable"};
//         resolve(status);
//     }
//     else{
//         var status = {question: "Out of Syllabus",result : "FAIL"};
//         reject(status);
//     }
// });

// var verifyWithStudent = function() {
//     willStudentPass.then(x => console.log(x)).catch(x => console.log(x));
// };
// verifyWithStudent();

// var fs = require("fs");

// var fileData = {};

// function getFile1(){
//     return new Promise(function(resolve, reject){
//         fs.readFile("./AsyncFolder1/sample.txt", function(err, data){
//             if(!err)
//                 resolve(data.toString());
//             else
//                 reject("No data in file1");
//         });
//     });
// }

// getFile1().then(function(data){
//     fileData.f1 = data;
//     console.log(fileData.f1);
// }).catch(function(data){
//     console.log("Error:"+data);
// });

// var fileData = {};

// var getFile1 = function(){
//     return new Promise(function(resolve, reject){
//         fs.readFile("./AsyncFolder1/sample.txt", function(err, data){
//             if(!err)
//                 resolve(data.toString());
//         });
//     });
// }

// var getFile2 = function(){
//     return new Promise(function(resolve, reject){
//         fs.readFile("./AsyncFolder1/sample1.txt", function(err, data){
//             if(!err)
//                 resolve(data.toString());
//         });
//     });
// }

// async function main(){
//     fileData.f1 = await getFile1();
//     fileData.f2 = await getFile2();
//     console.log(fileData);
// }

// main();


// console.log("=============================================================================================");



// var http = require("http");

// var server = http.createServer(function(request, response){

//     response.writeHead(200, {
//         'content-type' :'text/plain' 
//     });
//     response.write("Hello Client..!!");
//     response.end();

// });

// server.on('request', function(){
//     console.log("Connecting with Client...!");
// })

// server.listen(9000, function(){
//     console.log("Server listening...");
// });

// var http = require("http");             //step1
 
// var server = http.createServer(function(request,response){
//     response.writeHead(200,{'content-type':'text/plain'});
//     response.write("Hello client...\n");
//     response.write("Welcome to client server architecture!");
//     console.log("Server responding to client...");
//     response.end();
// });       //step2
 
// server.listen(9000,() =>     console.log("Server started listening...") );

var e1 = { id :1, ename : 'Soumya', job : 'Trainer', salary :5500};

var module = require("./Module1");


var http = require("http");             //step1
var fs = require("fs");

function showPage(fname,req,resp){
    fs.readFile(fname,function(err,data){
        resp.writeHead(200,{"Content-type":"text/html"});
        if ( !err ){
            resp.write(data);
            resp.end();
        }
    });
}
// var server = http.createServer(function(req,resp){  
//     var fname = req.url;
//     fname=  fname.substring(1); //remove / in the url
//     if ( fname=='')
//         fname='index';
//     fname+=".html";
//     showPage(fname,req,resp);
// });
// server.listen(9000,function(){
// console.log("Server started listening");
// });

 
var server = http.createServer(function(request,response){
    // response.writeHead(200,{'content-type':'text/json'});

    // response.write("Hello client...\n");
    // response.write(JSON.stringify(e1));

    // response.write("\nSending an Array\n");
    
    // response.write(JSON.stringify(module.employees));

    // response.writeHead(200, {
    //     'content-type' : 'text/html'
    // });

    // response.write("<h2> HTML RESPONSE TO CLIENT </h2>");

    // var data = "Hello From Server, Here is the List!!";
    // var fruits = ['apple', 'banana', 'mango', 'grapes'];
    // var msg = `<h1> HTML content </h1>
    // <ol>
    // ${fruits.map(x => '<li>' +x+'</li>').join(' ')}
    // </ol>
    // <hr/>
    // `;
    // response.write(msg);


    // var msg2 =`<h2>Employees List</h2>
    // <table border="1">
    // <tr>
    //     <th>Emp ID </th>
    //     <th>Ename </th>
    //     <th>Job </th>
    //     <th>Salary</th>
    // </tr>
    //     ${module.employees.map(e=> '<tr>'+'<td>'+e.id+'</td>'+
    //                                 '<td>'+e.ename+'</td>'+
    //                                 '<td>'+e.job+'</td>'+
    //                                 '<td>'+e.salary+'</td>'+
    //     '</tr>').join(' ')}
    // </table>
    // <hr/>
    // `;
    // response.write(msg2);
    // console.log(request.method);
    // var fs = require('fs');
    
    // if(request.method == "GET"){ 
    //         //response.write("Inside If");
    //         fs.readFile('index.html', 'utf8', function(err, data){
    //         if(!err)  {
    //             response.write(data);
    //         }
    //         else{
    //             console.log("Error Occured:"+err);
    //         }
    //     })
    // }
    //  else if(request.method == "POST"){
    //         fs.readFile("homepage.html", 'utf8', (err, data) => {
    //             if(err){
    //                 console.log("Error Occured"+err);
    //             }
    //             else
    //                 response.write(data)
    //         });
    //     };
    var fs = require("fs");
    var fname = request.url;
    console.log(fname);
    fname=  fname.substring(1); //remove / in the url
    if ( fname=='')
        fname='index1';
    fname+=".html";
    showPage(fname,request,response);
});   //step2
 


server.listen(9000,() =>     console.log("Server started listening...") );



