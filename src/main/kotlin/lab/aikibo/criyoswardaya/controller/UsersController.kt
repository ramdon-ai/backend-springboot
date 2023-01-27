package lab.aikibo.criyoswardaya.controller

import lab.aikibo.criyoswardaya.model.Users
import lab.aikibo.criyoswardaya.param.ResponseData
import lab.aikibo.criyoswardaya.repo.UsersRepo
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/users")
@CrossOrigin(origins = [ "*" ])
class UsersController {

    @Autowired
    lateinit var usersRepo: UsersRepo

    @CrossOrigin(origins = [ "*" ])
    @RequestMapping(value = [ "/all" ], method = [ RequestMethod.GET ])
    fun getAll(): List<Users> = usersRepo.findAll()

    @CrossOrigin(origins = [ "*" ])
    @RequestMapping(value = [ "/save" ], method = [ RequestMethod.POST ])
    fun save(@RequestBody param: Users): ResponseData {
        val result = usersRepo.save(param)
        if(result != null) {
            return ResponseData(ResponseData.success)
        } else return ResponseData(ResponseData.failed)
    }

    @CrossOrigin(origins = [ "*" ])
    @RequestMapping(value = [ "/delete/{id}" ], method = [ RequestMethod.GET ])
    fun delete(@PathVariable("id") id: String): ResponseData {
        usersRepo.deleteById(id)
        return ResponseData(ResponseData.success)
    }

    @CrossOrigin(origins = [ "*" ])
    @RequestMapping(value = [ "/get-by-email/{email}" ], method = [ RequestMethod.GET ])
    fun getByEmail(@PathVariable("email") email: String) = usersRepo.findByEmail(email)

}