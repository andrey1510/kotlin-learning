fun main() {

    val colors: MutableList<String> = mutableListOf("red", "orange", "white")
    println(colors)

    println(colors.get(0))
    println(colors[1])
    println(colors.getOrElse(4){"no color"})

    colors.removeAt(2)
    colors.remove("orange")
    colors.add("black")                 // добавляет последним элементом
    colors.add(0, "green")  // добавляет указанным номером в индекс и сдвигает остальные
    println(colors)

    colors[0] = "grey"      // заменяет элемент по указанному номеру в индекс
    println(colors)




}
