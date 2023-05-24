data class HintsApiResult(
    val records: Array<HintsRecords>

)

data class HintsRecords(
    val id: String,
    val fields: Hint
)

data class Hint(
    val id: Int
    val name: String
    val latidude: Double
    val longitude: Double
)