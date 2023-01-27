package lab.aikibo.criyoswardaya.model

import org.bson.types.ObjectId
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import java.util.Date

@Document(collection = "tamu")
data class Tamu(
    @Id
    var id: String,
    var jnsKegiatan: String,
    var kdWilayah: String,
    var keperluan: String,
    var tamu: String,
    var tanggal: Date
) {
    constructor(): this("", "", "", "", "", Date())
    constructor(jnsKegiatan: String, kdWilayah: String, keperluan: String, tamu: String, tanggal: Date):
            this(ObjectId().toString(), jnsKegiatan, kdWilayah, keperluan, tamu, tanggal)

    override fun toString(): String {
        return "[ " + id + " : " + jnsKegiatan + " : " + kdWilayah + " : " + keperluan + " : " + tamu + " : " +
                tanggal + " ]"
    }
}
