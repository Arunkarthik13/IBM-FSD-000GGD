const server = require('express').Router();
const UserService = require('./emailservice').UserService;
const userService = new UserService();
// apis
server.get('/status',(rq,rs)=>{
    rs.status(200).json({
        message : 'Security Service is Running'
    });
});
// sign up
server.post('/register',(rq,rs)=>{
    userService.addemail(rq.body,(err,res)=>{
        if(err){
            rs.status(402).json({
                message : 'Unable to proceess the request',
                trace : err
            });
        }else{
            rs.status(200).json({
                message : 'User registered successfully',
                users : res 
            });
        }
    });
});
server.post('/verify',(req,res)=>
{

    userService.verifyuser(req.body.otp,(err,rs,time1)=>
    {
        console.log(time1);
        if(err){
            res.status(402).json({
                message : 'Unable to proceess the request',
                trace : err
            });
        }else{
            
            if(rs[0]==null)
            {
                res.status(402).json({
                    message : 'otp not verified ',
                });
            }
            else if(req.body.otp==rs[0].otp1&&rs[0].time>=time1)
            {
               res.status(200).json(
                {
                message : 'otp verified successfully',
                
                });
               // createpassword(req.body.otp,req.otp.pass(r,s));
            }
        else
        {  }
    }
    })
})

module.exports = {
    server
}