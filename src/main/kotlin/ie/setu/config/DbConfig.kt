package ie.setu.config

import org.jetbrains.exposed.sql.Database

class DbConfig{

    //NOTE: you need the ?sslmode=require otherwise you get an error complaining about the ssl certificate
    fun getDbConnection(): Database {

        return Database.connect(
            "jdbc:postgresql://ec2-54-147-33-38.compute-1.amazonaws.com:5432/dd1alnffpluckj?sslmode=require",
            driver = "org.postgresql.Driver",
            user = "decoqpkgvcdpue",
            password = "c03e409c7da188b020d3be9238b88e61fa4b4fb4ecd0d6551523dec6daf1d78a"
        )
    }

}