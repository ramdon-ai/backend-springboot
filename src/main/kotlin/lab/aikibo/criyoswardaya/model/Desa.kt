package lab.aikibo.criyoswardaya.model

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document(collection = "desa")
data class Desa(
    @Id
    var id: String,
    var kode: String,
    var nama: String
) {
    constructor(): this("", "", "")

    override fun toString(): String {
        return "[ " + id + " : " + kode + " : " + nama + " ]"
    }
}
