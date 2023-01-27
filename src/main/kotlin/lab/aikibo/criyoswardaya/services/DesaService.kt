package lab.aikibo.criyoswardaya.services

import lab.aikibo.criyoswardaya.model.Desa
import lab.aikibo.criyoswardaya.param.ResponseData
import lab.aikibo.criyoswardaya.repo.DesaRepo
import org.slf4j.LoggerFactory
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class DesaService {

    @Autowired
    lateinit var repo: DesaRepo
    val log = LoggerFactory.getLogger(DesaService::class.java)

    fun getAll() = repo.findAll()

    fun save(desa: Desa): ResponseData {
        val result = repo.save(desa)
        if(result == null) return ResponseData(ResponseData.failed)
        else return ResponseData(ResponseData.success)
    }

    fun delete(id: String): ResponseData {
        repo.deleteById(id)
        return ResponseData(ResponseData.success)
    }

    fun findByKode(kode: String) = repo.findByKode(kode)

}