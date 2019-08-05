const UserConstants = {
    mongo: {
        url : 'mongodb://localhost:',
        port : 27017,
        db : 'userjwt',
        collections: {
            user : 'user',
            otp:'otp'
        }
    }
}

module.exports = {
    UserConstants
}