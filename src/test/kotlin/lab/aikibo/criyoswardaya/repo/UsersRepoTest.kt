package lab.aikibo.criyoswardaya.repo

import lab.aikibo.criyoswardaya.model.Users
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Test
import org.slf4j.LoggerFactory
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import java.util.*

@SpringBootTest
class UsersRepoTest {

    @Autowired
    lateinit var repo: UsersRepo

    val log = LoggerFactory.getLogger(UsersRepoTest::class.java)

    @Test
    fun saveTest() {
        val result = repo.save(Users(UUID.randomUUID().toString(), "tonjong@brebes.go.id",
            "kecamatan", "000"))
        Assertions.assertNotNull(result)
    }

    @Test
    fun getAllTest() {
        val result = repo.findAll()
        result.forEach {
            log.info(it.toString())
        }
        Assertions.assertNotNull(result)
    }

    @Test
    fun findByEmailTest() {
        val result = repo.findByEmail("tamami.oka@gmail.com")
        result.forEach {
            log.info(it.toString())
        }
        Assertions.assertNotNull(result)
    }

}