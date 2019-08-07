const MongoClient = require('mongodb').MongoClient;
const UserConstants = require('./tictactoedb').UserConstants; 
class UserService {
    fetchUsers(callback){
        MongoClient.connect(UserConstants.mongo.url,(err,conn)=>{
            conn.db(UserConstants.mongo.db).collection('projects').find().toArray((error,users)=>{
                if(!error){
                    console.log(users);
                    callback(users);
                }
            });
        });
    }
    
    add(_user,callback){
        MongoClient.connect(UserConstants.mongo.url,(err,conn)=>{
            conn.db(UserConstants.mongo.db).collection('projects').insert(_user,(err,response)=>{
                callback(err,response);
            });
        });
    }
}

module.exports = {
    UserService
}