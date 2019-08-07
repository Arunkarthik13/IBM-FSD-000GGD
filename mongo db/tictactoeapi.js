const express = require('express');
const parser = require('body-parser');
const cors = require('cors');
const UserConstants = require('./tictactoedb').UserConstants;
const userRoutes = require('./tictactoe').userRoutes;

const server = express();
const PORT = 7100;
server.use(parser.json());
server.use(cors());

server.get('/status',(rq,rs)=>{
    rs.status(200).json({
        message : UserConstants.messages.mainStatus
    });
});

// bind user routes
server.use('/game/tictactoe',userRoutes);

server.listen(PORT,()=>{
    console.log(`Server Started at ${PORT}`);
});

