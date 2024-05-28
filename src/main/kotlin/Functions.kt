fun main() {

}

private fun getTribe(tribe: String): String {
    return "tribe"
}

// функция с аргументом по-умолчанию
private fun getTribe2(tribe: String = "orc"): String {
    return "tribe"
}

// функция с единственным выражением
private fun test1(number: Int): String {
    return when (number) {
        0 -> "Zero"
        else -> "Other"
    }
}
// функция с единственным выражением - альтернативный синтаксис
private fun test2(number: Int)          // не надо писать исходящий параметр и return
    = when (number) {
        0 -> "Zero"
        else -> "Other"
    }



