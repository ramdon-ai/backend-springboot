package lab.aikibo.criyoswardaya.controller

import lab.aikibo.criyoswardaya.model.Roles
import lab.aikibo.criyoswardaya.param.ResponseData
import lab.aikibo.criyoswardaya.services.RolesService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/roles")
@CrossOrigin(origins = [ "*" ])
class RolesController {

    @Autowired
    lateinit var service: RolesService

    @CrossOrigin(origins = [ "*" ])
    @RequestMapping(value = [ "/get-all" ], method = [ RequestMethod.GET ])
    fun getAll() = service.getAll()

    @CrossOrigin(origins = [ "*" ])
    @RequestMapping(value = [ "/save" ], method = [ RequestMethod.POST ])
    fun save(@RequestBody param: Roles): ResponseData {
        val result = service.save(param)
        if(result != null) {
            return ResponseData(ResponseData.success)
        } else return ResponseData(ResponseData.failed)
    }



}