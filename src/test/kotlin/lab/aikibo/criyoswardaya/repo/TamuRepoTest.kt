package lab.aikibo.criyoswardaya.repo

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.slf4j.LoggerFactory
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class TamuRepoTest {

    @Autowired
    lateinit var repo: TamuRepo
    val log = LoggerFactory.getLogger(TamuRepoTest::class.java)

    @Test
    fun getAllTest() {
        val result = repo.findAll()
        log.info("jumlah data: " + result.size)
        Assertions.assertNotNull(result)
    }

}