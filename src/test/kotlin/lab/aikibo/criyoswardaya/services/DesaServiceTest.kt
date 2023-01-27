package lab.aikibo.criyoswardaya.services

import lab.aikibo.criyoswardaya.model.Desa
import lab.aikibo.criyoswardaya.param.ResponseData
import lab.aikibo.criyoswardaya.repo.DesaRepo
import org.bson.types.ObjectId
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.slf4j.LoggerFactory
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class DesaServiceTest {

    @Autowired
    lateinit var service: DesaService
    val log = LoggerFactory.getLogger(DesaServiceTest::class.java)

    @Test
    fun getAllTest() {
        val result = service.getAll()
        log.info("jumlah data : " + result.size)
        Assertions.assertNotNull(result)
    }

    @Test
    fun insertTest() {
        val result = service.save(Desa(ObjectId().toString(), "999", "AAA"))
        log.info(result.toString())
        Assertions.assertEquals("00", result.status)
    }

    @Test
    fun updateTest() {
        var data = service.findByKode("999").get(0)
        data.nama = "BBB"
        val result = service.save(Desa(data.id, data.kode, data.nama))
        log.info(result.toString())
        Assertions.assertEquals(ResponseData.success, result.status)
    }

    @Test
    fun deleteTest() {
        val data = service.findByKode("999").get(0)
        val result = service.delete(data.id)
        log.info(result.status)
        Assertions.assertEquals(ResponseData.success, result.status)
    }

}