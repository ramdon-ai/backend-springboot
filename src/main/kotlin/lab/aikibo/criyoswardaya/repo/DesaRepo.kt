package lab.aikibo.criyoswardaya.repo

import lab.aikibo.criyoswardaya.model.Desa
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository

@Repository
interface DesaRepo: MongoRepository<Desa, String> {

    fun countByKode(kode: String): Int
    fun findByKode(kode: String): List<Desa>

}