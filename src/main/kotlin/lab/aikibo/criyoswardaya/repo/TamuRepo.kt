package lab.aikibo.criyoswardaya.repo

import lab.aikibo.criyoswardaya.model.Tamu
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository
import java.util.Date

@Repository
interface TamuRepo: MongoRepository<Tamu, String> {

    fun findByTanggalBetween(start: Date, end: Date): List<Tamu>

}