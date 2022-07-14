var h=require('http');
var server=h.createServer(function(req,res){
console.log("request received");
res.writeHead(200,{'content-type':'text/html'});
res.write("<h1>HELLO FROM NODE JS</h1>");
res.end();
});
server.listen(10000,function(){
console.log("server started at 10000");
})