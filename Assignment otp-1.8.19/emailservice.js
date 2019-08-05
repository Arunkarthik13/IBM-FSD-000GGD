const client = require('mongodb').MongoClient;
const otp=require('otp-generator');
const nodemailer=require('nodemailer');
const UserConstants = require('./mongo.utils').UserConstants;

class Service {
    constructor()
    {
        this.user={
            service: 'gmail',
            auth:
                 {
                   user: 'arunkaliyappan1998@gmail.com',
                   pass  : 'arunkarthick3'
                  }
            }
            this.mailer=nodemailer.createTransport(this.user);
    }
    //verifyuser
    verifyuser(_otp1,callback){
        var date=new Date();
        var time1=date.getTime();
        console.log(time1);
        const _url = UserConstants.mongo.url + UserConstants.mongo.port;
        client.connect(_url,(err,connection)=>{
            connection.db(UserConstants.mongo.db).collection(UserConstants.mongo.collections.user).find({otp1: _otp1,time:{$gt:time1}}).toArray((err,response)=>{
                callback(err,response,time1);
            });
        });
    }
    //generate-otp
    generateotp(){

         const _otp=otp.generate(6,{specialChars:false});
        return _otp;
    }
    //createpassword
    // createpasssword(otp,pass,callback) 
    // {
    //     date=new Date();
    //     time1=date.getTime();
    //     const _url = UserConstants.mongo.url + UserConstants.mongo.port;
    //     client.connect(_url,(err,connection)=>{
    //         connection.db(UserConstants.mongo.db).collection(UserConstants.mongo.collections.user).find({otp1:otp}).toArray((err,response)=>{
                
    //             callback(err,response);
    //         });
    //     });
    // }
    //get the user details to send to email
    addemail(_user,callback){
        // update password
        const otp1=this.generateotp();
        let userobj={
            sub:"Welcome to IBM",
            body:`<div>Dear ${_user.name} your one time paasword to verify and for joining in IBM:${otp1}</div>
                  <div>You have to verify your otp Quickly</div>`,
            from:null,
            to:_user.email
        }
        if(userobj.from==null)
        {
            userobj.from=this.user;
        }
        this.mailer.sendMail(
            {
                from:userobj.from,
                to:userobj.to,
                subject:userobj.sub,
                html:userobj.body
            },(err,res)=>
            {
                if(err)
                {
                    console.log('Email error');
                    return 'FAilure';
                }
                else{
                    console.log('Email sent');
                    return 'Email sent successfully';
                }
            } )  
            var date=new Date();       
        var time=date.getTime()+120000;    
        console.log(time);
        const _url = UserConstants.mongo.url + UserConstants.mongo.port;
        client.connect(_url,(err,connection)=>{
            connection.db(UserConstants.mongo.db).collection(UserConstants.mongo.collections.user).insert({email:_user.email,name:_user.name,otp1,time},(err,response)=>{
                callback(err,response);
            });
        });
    } // end of email
}

module.exports={
    UserService : Service
}