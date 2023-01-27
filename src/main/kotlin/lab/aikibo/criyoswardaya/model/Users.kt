package lab.aikibo.criyoswardaya.model

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document(collection = "users")
data class Users(
    @Id
    var id: String,
    var email: String,
    var role: String,
    var kdWilayah: String
) {
    constructor(): this("", "", "", "")

    override fun toString(): String {
        return "[ " + id + " : " + email + " : " + role + " : " + kdWilayah + " ]"
    }
}
