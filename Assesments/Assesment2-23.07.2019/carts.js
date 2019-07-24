const router=require('express').Router();
const adding=require('./productclass').adding;
const a1=new adding();
router.get('/',(req,res)=>{
    res.setHeader('content-type','application/json');
    res.end(JSON.stringify({
        add1 : a1.display()
    }));
});
router.post('/add1',(rq,rs)=>
{
    rs.setHeader('content-type','application/json');
  rs.end(JSON.stringify(
     {
         add1:a1.add3(rq.body)
     }));
})

module.exports.cartroutes=router;