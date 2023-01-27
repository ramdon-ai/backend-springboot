package lab.aikibo.criyoswardaya.services

import lab.aikibo.criyoswardaya.model.Roles
import lab.aikibo.criyoswardaya.param.ResponseData
import lab.aikibo.criyoswardaya.repo.RolesRepo
import org.slf4j.LoggerFactory
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class RolesService {

    @Autowired
    lateinit var repo: RolesRepo
    val log = LoggerFactory.getLogger(RolesService::class.java)

    fun getAll() = repo.findAll()

    fun save(role: Roles): ResponseData {
        val result = repo.save(role)
        if(result == null) return ResponseData(ResponseData.failed)
        return ResponseData(ResponseData.success)
    }

    fun delete(id: String): ResponseData {
        repo.deleteById(id)
        return ResponseData(ResponseData.success)
    }

}