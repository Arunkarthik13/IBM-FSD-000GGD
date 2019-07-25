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
router.post('/buy',(req,res)=>
{
  res.setHeader('content-type','application/json');
       p1.buy(req.body)
})
module.exports.userroutes=router;