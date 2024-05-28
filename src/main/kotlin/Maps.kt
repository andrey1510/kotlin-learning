fun main() {

    // объявить и инициализировать:
    val planets: Map<Int, String> = mapOf(
        Pair(1, "Mercury"),
        Pair(2, "Venus")
    )
    val numbers = mutableMapOf(
        "one" to 1,
        "two" to 2,
        "two" to 3)

    // получить все ключи / значения / пары ключ-значение
    println(    numbers.keys    )
    println(    numbers.values  )
    println(    numbers.entries )

    // получить значение по ключу:
    println(    numbers["one"]  )
    println(    numbers.getValue("one")  )
    println(    numbers.getOrElse("four"){"no number"}   )
    println(    numbers.getOrDefault("four","default key")   )

    // добавить новую пару / заменить значение по ключу:
    numbers["one"] = 111
    numbers.put("four", 4)
    numbers += "five" to 5
    numbers += mapOf(           // сразу несколько
        "six" to 6,
        "seven" to 7
    )
    numbers.putAll(listOf(      // сразу несколько
        "eight" to 9,
        "nine" to 8)
    )

            // получить значение по ключу / добавить новую пару, если ключа нет:
    numbers.getOrPut("two") { 222 }

    // удалить Pair ключ-значение:
    numbers.remove("three")

}











