const express = require('express');
const server = express();
const parser = require('body-parser');
const cors = require('cors');
const userroutes = require('./prousers').userroutes;
const cartroutes = require('./carts').cartroutes;
// apply json parser
server.use(parser.json());
// apply cors
server.use(cors());
server.use('/products','userroutes');
server.use('/cart','cartroutes');
const port=7100;
server.listen(port,()=>
{
   console.log(`Port started at ${port}`);
});