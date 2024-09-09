import kotlin.math.sqrt

fun main() {
    task3_1()
    task3_2()
}

private fun sqr(n: Double): Double {
    return n * n
}

private fun discriminant(a: Double, b: Double, c: Double): Double {
    return b * b - 4 * a * c
}

private fun rootsNumber(a: Double, b: Double, c: Double): Int {
    val disc = discriminant(a, b, c)
    return when {
        disc > 0 -> 2 // Два корня
        disc == 0.0 -> 1 // Один корень
        else -> 0 // Нет корней
    }
}

private fun quadraticRoot(a: Double, b: Double, c: Double) {
    val disc = discriminant(a, b, c)
    when (rootsNumber(a, b, c)) {
        2 -> {
            val root1 = (-b + sqrt(disc)) / (2 * a)
            val root2 = (-b - sqrt(disc)) / (2 * a)
            println("Корни уравнения: x1 = $root1, x2 = $root2")
        }

        1 -> {
            val root = -b / (2 * a)
            println("Единственный корень уравнения: x = $root")
        }

        0 -> {
            println("Нет действительных корней.")
        }
    }
}

private fun task3_1() {
    print("Введите число: ")
    val sqrtValue = readln().toDouble();
    println("Квадрат числа ${sqr(sqrtValue)}: ${sqr(sqrtValue)}")
}

private fun task3_2() {
    print("Введите коэффициент a: ")
    val a = readln().toDouble();
    print("Введите коэффициент b: ")
    val b = readln().toDouble();
    print("Введите коэффициент c: ")
    val c = readln().toDouble();

    println("Дискриминант уравнения: ${discriminant(a, b, c)}")
    println("Количество корней: ${rootsNumber(a, b, c)}")
    quadraticRoot(a, b, c)
}