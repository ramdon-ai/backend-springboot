package lab.aikibo.criyoswardaya.services

import lab.aikibo.criyoswardaya.model.Tamu
import lab.aikibo.criyoswardaya.repo.TamuRepo
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class TamuService {

    @Autowired
    lateinit var repo: TamuRepo

    fun getAll() = repo.findAll()

    // format YYYYMMDD
    fun findByDateBetween(start: String, end: String) = repo.findByTanggalBetween(DateService.toDate(start), DateService.toDate(end))

    fun save(tamu: Tamu) = repo.save(tamu)

    fun deleteById(id: String) = repo.deleteById(id)



}