const products=require('./products').products;
const add1=require('./products').add1;
class prod
{
    constructor(){
        this.products=products;
    }
    display()
    {
        return this.products;
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