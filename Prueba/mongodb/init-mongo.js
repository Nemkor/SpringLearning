db.createUser(
    {
        user : "dani",
        pwd : "dani",
        roles : [
            {
                role : "readWrite",
                db : "prueba-db"
            }
        ]
    }
)