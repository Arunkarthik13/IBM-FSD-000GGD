const router=require('express').Router();
const prod=require('./productclass').prod;
const cors = require('cors'); 
const p1=new prod();
server.use(cors());
server.use(parser.json());
server.get('/',(req,res)=>
{
    res.setHeader('content-type','application/json');
      res.end(JSON.stringify(
         {
            products:p1.display()
         }));
});
module.exports.userroutes=router;