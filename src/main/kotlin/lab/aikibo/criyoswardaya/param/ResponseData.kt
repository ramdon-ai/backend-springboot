package lab.aikibo.criyoswardaya.param

data class ResponseData(
    var status: String
) {
    companion object {
        val success = "00";
        val failed = "99";
    }
}
