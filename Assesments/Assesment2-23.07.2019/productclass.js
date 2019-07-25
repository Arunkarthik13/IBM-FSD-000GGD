const products=require('./products').products;
const add1=require('./products').add1;
const emai=require('./emailservice').emai;
const ema=new emai();
class prod
{
    constructor(){
        this.products=products;
    }
    display()
    {
        return this.products;
    }
    buy(u)
    {
        let userobj={
       sub:"user registration",
       body:`<div>Dear user ${u.name}</div>
             <div>Thank you for ordering</div>`,
       from:null,
       to:u.email
        }
        ema.emailattachment(userobj);
    }
}
class adding
{
    constructor(){
        this.add1=add1;
    }
    display()
    {
        return this.add1;
    }
    add3(u1)
    {
        this.add1.push(u1);
        return this.add1;
    }
}
module.exports.prod = prod;
module.exports.adding=adding;