const router=require('express').Router();
const adding=require('./productclass').adding;
const cors = require('cors'); 
const a1=new adding();
server.use(cors());
server.use(parser.json());
server.get('/',(req,res)=>{
    res.setHeader('content-type','application/json');
    res.end(JSON.stringify({
        add1 : a1.display()
    }));
});
server.post('/add1',(rq,rs)=>
{
    res.setHeader('content-type','application/json');
  res.end(JSON.stringify(
     {
         add1:a1.add3(rq.body)
     }));
})

module.exports.cartroutes=router;