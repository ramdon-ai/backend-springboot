package lab.aikibo.criyoswardaya.controller

import lab.aikibo.criyoswardaya.model.Desa
import lab.aikibo.criyoswardaya.services.DesaService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.CrossOrigin
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/desa")
@CrossOrigin(origins = [ "*" ])
class DesaController {

    @Autowired
    lateinit var service: DesaService

    @RequestMapping(value = [ "/get-all" ], method = [ RequestMethod.GET ])
    @CrossOrigin(origins = [ "*" ])
    fun getAll() = service.getAll()

    @RequestMapping(value = [ "/save" ], method = [ RequestMethod.POST ])
    @CrossOrigin(origins = [ "*" ])
    fun save(@RequestBody desa: Desa) = service.save(desa)

    @RequestMapping(value = [ "/find-by-kode/{kode}"], method = [ RequestMethod.GET ])
    @CrossOrigin(origins = [ "*" ])
    fun findByKode(@PathVariable("kode") kode: String): Desa {
      val result = service.findByKode(kode)
      if(result.isEmpty()) return Desa()
      else return result.get(0)
    }

}