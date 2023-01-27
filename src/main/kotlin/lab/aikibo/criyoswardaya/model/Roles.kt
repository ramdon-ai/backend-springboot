package lab.aikibo.criyoswardaya.model

import org.bson.types.ObjectId
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document(collection = "roles")
data class Roles(
    @Id
    var id: String,
    var role: String,
    var name: String
) {
    constructor(): this("", "", "")
    constructor(role: String, name: String): this(ObjectId().toString(), role, name)

    override fun toString(): String {
        return "[ " + id + " : " + role + " : " + name + " ]"
    }
}
