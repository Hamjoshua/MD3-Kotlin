//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    // 1 task
    val number:String = readln()
    val sum:Int = number.first().digitToInt() + number.last().digitToInt()
    println("Сумма первой и второй цифры введенного числа $number равна $sum")

    // 2 task
    var inputLine:String = readln()
    var nums: IntArray = intArrayOf()

    while (inputLine != "0"){
        inputLine = readln()
        nums += inputLine.toInt()
    }

    println("Количество: ${nums.count()}\nСумма: ${nums.sum()}\nСр. знач.: ${nums.average()}")

    // 3 task
    var rightNumber:Int =  (0..10).random()

    println("Загадано число от 0 до 10. Попробуйте угадать!")

    while (true) {
        print("Введите ваше число: ")
        val guess = readLine()?.toIntOrNull()

        if (guess == null) {
            println("Некорректный ввод. Пожалуйста, введите целое число.")
        } else {
            if (guess > rightNumber) {
                println("Много!")
            } else if (guess < rightNumber) {
                println("Мало!")
            } else {
                println("Угадал!")
                break
            }
        }
    }
}