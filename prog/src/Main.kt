import java.util.Scanner;

fun main() {
    task8_1()
    task8_2()
}

fun task8_1(){
    val scanner = Scanner(System.`in`)

    // Ввод данных
    print("Введите первое число: ")
    val num1 = scanner.nextDouble()
    print("Введите второе число: ")
    val num2 = scanner.nextDouble()
    print("Введите знак операции (+, -, *, /): ")
    val operation = scanner.next()

    // Выполнение операции
    val result = when (operation) {
        "+" -> num1 + num2
        "-" -> num1 - num2
        "*" -> num1 * num2
        "/" -> {
            if (num2 == 0.0) {
                println("Ошибка: Деление на ноль.")
                return
            }
            num1 / num2
        }

        else -> {
            println("Ошибка: Неизвестная операция.")
            return
        }
    }

    // Вывод результата
    println("Результат: $result")
}

fun task8_2(){
    var words: Array<String?> = arrayOf("adad", null, "adad", null)

    words.forEach {
        // if
        if (it != null){
           println("if: ${it.replaceFirstChar(Char::titlecase)}")
        }

        // ?
        println("-?: ${it?.replaceFirstChar(Char::titlecase)}")

        // let
        it.let {
            println("--let: ${it?.replaceFirstChar(Char::titlecase) }")
        }

        // elvis operator
        val elvisValue = it?.replaceFirstChar(Char::titlecase) ?: "empty"
        println("---elvis: ${elvisValue}")
    }
}