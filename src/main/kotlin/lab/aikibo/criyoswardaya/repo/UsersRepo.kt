package lab.aikibo.criyoswardaya.repo

import lab.aikibo.criyoswardaya.model.Users
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository

@Repository
interface UsersRepo: MongoRepository<Users, String> {

    fun findByEmail(email: String): List<Users>

}