const router=require('express').Router();
const prod=require('./productclass').prod; 
const p1=new prod();
router.get('/',(req,res)=>
{
    res.setHeader('content-type','application/json');
      res.end(JSON.stringify(
         {
            products:p1.display()
         }));
});
module.exports.userroutes=router;