fun main() {

    //интервал
    val number = 1
    if(number in 0 .. 5) {          // интервал -  ..
        println(1)
    }

    // логический оператор в объявлении переменной
    val flag: Boolean = (number != 1) && (number > 2)
    val number2 = if (flag) 1
    else if (flag) 2
    else 0

    // if-else
    if(number < 0 || number == 1) {
        println(1)
    } else if (number > 3) {
        println(2)
    } else {
        println(3)
    }

    // if-else упрощенный синтаксис
    if(number < 0 || number == 1) println(1)
    else if (number > 3) println(2)
    else println(3)

    // when
    val tribe = 1
    val tribeTitle = when(tribe) {
        1 -> "dwarf"
        in 2 .. 4 -> "gnome"
        1 -> "orc"
        else -> "human"
    }

    // when без аргументов
    val tribeTitle2 = when {
        tribe == 1 -> "dwarf"
        tribe < 2 -> "gnome"
        else -> "human"
    }


}


