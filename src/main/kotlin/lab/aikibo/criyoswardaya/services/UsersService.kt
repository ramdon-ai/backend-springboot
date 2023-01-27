package lab.aikibo.criyoswardaya.services

import lab.aikibo.criyoswardaya.model.Users
import lab.aikibo.criyoswardaya.param.ResponseData
import lab.aikibo.criyoswardaya.repo.UsersRepo
import org.slf4j.LoggerFactory
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class UsersService {

    @Autowired
    lateinit var repo: UsersRepo
    val log = LoggerFactory.getLogger(UsersService::class.java)

    fun getAll() = repo.findAll()

    fun save(users: Users): ResponseData {
        val result = repo.save(users)
        if(result == null) {
            return ResponseData(ResponseData.failed)
        } else return ResponseData(ResponseData.success)
    }

    fun delete(id: String): ResponseData {
        repo.deleteById(id)
        return ResponseData(ResponseData.success)
    }

}