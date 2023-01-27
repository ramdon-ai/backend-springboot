package lab.aikibo.criyoswardaya.controller

import lab.aikibo.criyoswardaya.model.Tamu
import lab.aikibo.criyoswardaya.services.TamuService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.CrossOrigin
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/tamu")
@CrossOrigin(origins = [ "*" ])
class TamuController {

    @Autowired
    lateinit var tamuService: TamuService

    // date format YYYYMMDD
    @CrossOrigin(origins = [ "*" ])
    @RequestMapping(value = [ "/get-by-date-between/{start}/{end}" ], method = [ RequestMethod.GET ])
    fun getByDateBetween(@PathVariable("start") start: String, @PathVariable("end") end: String) =
        tamuService.findByDateBetween(start, end)

    @CrossOrigin(origins = [ "*" ])
    @RequestMapping(value = [ "/get-all" ], method = [ RequestMethod.GET ])
    fun getAll() = tamuService.getAll()

    @CrossOrigin(origins = [ "*" ])
    @RequestMapping(value = [ "/save" ], method = [ RequestMethod.POST ])
    fun save(@RequestBody tamu: Tamu) = tamuService.save(tamu)

    @CrossOrigin(origins = [ "*" ])
    @RequestMapping(value = [ "/delete-by-id/{id}" ], method = [ RequestMethod.GET ])
    fun deleteById(@PathVariable("id") id: String) = tamuService.deleteById(id)

}