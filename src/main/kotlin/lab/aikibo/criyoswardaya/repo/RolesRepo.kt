package lab.aikibo.criyoswardaya.repo

import lab.aikibo.criyoswardaya.model.Roles
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository

@Repository
interface RolesRepo: MongoRepository<Roles, String> {
}