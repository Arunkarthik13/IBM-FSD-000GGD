const email=require('./products').email;
const nodemailer=require('nodemailer');
class emai
{
    constructor()
    {
        this.user={
        service: email.smtp.service,
        auth:
             {
               user: email.smtp.user,
               pass  : email.smtp.pass
              }
        }
        this.mailer=nodemailer.createTransport(this.user);
    }
    emailattachment(userobj)
    {
        if(userobj.from=null)
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
    }
}
module.exports.emai=emai;