package lab.aikibo.criyoswardaya.repo

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.slf4j.LoggerFactory
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class DesaRepoTest {

    @Autowired
    lateinit var repo: DesaRepo
    val log = LoggerFactory.getLogger(DesaRepoTest::class.java)

    @Test
    fun getAllTest() {
        val result = repo.findAll()
        log.info("jumlah data : " + result.size)
        Assertions.assertNotNull(result)
    }

    @Test
    fun countByKodeTest() {
        val result = repo.countByKode("001")
        log.info("jumlah data : " + result.toString())
        Assertions.assertEquals(1, result)
    }

    @Test
    fun findByKodeTest() {
        val result = repo.findByKode("001")
        log.info("isi data : " + result.get(0).toString())
        Assertions.assertEquals(result.get(0).kode, "001")
    }

}