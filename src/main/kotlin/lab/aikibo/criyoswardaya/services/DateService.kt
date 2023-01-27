package lab.aikibo.criyoswardaya.services

import java.util.*

class DateService {

    companion object {
        fun toDate(date: String): Date {
            var cal = Calendar.getInstance()
            cal.set(Calendar.YEAR, date.substring(0,4).toInt())
            cal.set(Calendar.MONTH, date.substring(4,6).toInt())
            cal.set(Calendar.DAY_OF_MONTH, date.substring(6,8).toInt())
            return cal.time
        }
    }

}