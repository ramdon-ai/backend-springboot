package lab.aikibo.criyoswardaya.services

import lab.aikibo.criyoswardaya.model.Users
import lab.aikibo.criyoswardaya.repo.UsersRepo
import org.bson.types.ObjectId
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.slf4j.LoggerFactory
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class UsersServiceTest {

    @Autowired
    lateinit var service: UsersService
    val log = LoggerFactory.getLogger(UsersServiceTest::class.java)

    @Test
    fun getAllTest() {
        val result = service.getAll()
        log.info("jumlah data : " + result.size)
        Assertions.assertNotNull(result)
    }

    @Test
    fun insertTest() {
        val result = service.save(Users(ObjectId().toString(), "test@mail.com", "admin", "000"))
        log.info("datanya : " + result.toString())
        Assertions.assertNotNull(result)
    }

    @Test
    fun updateTest() {
        val result = service.save(Users("62da083102e9cb4bce50b541", "tester@mail.com", "desa", "001"))
        log.info("datanya : " + result.toString())
        Assertions.assertNotNull(result)
    }

    @Test
    fun deleteTest() {
        service.delete("62da083102e9cb4bce50b541")
        Assertions.assertTrue(true)
    }

}