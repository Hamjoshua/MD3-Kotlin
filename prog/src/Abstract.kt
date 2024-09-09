abstract class Figure(){
    abstract fun area(): Double
    abstract fun perimeter(): Double
}

class Rectangle(val width: Double, val height: Double) : Figure() {
    override fun area(): Double {
        return width * height
    }

    override fun perimeter(): Double {
        return 2 * (width + height)
    }
}

class Circle(val radius: Double) : Figure() {
    override fun area(): Double {
        return Math.PI * radius * radius
    }

    override fun perimeter(): Double {
        return 2 * Math.PI * radius
    }
}

class Triangle(val a: Double, val b: Double, val c: Double) : Figure() {
    override fun area(): Double {
        // Используем формулу Герона для вычисления площади
        val s = (a + b + c) / 2
        return Math.sqrt(s * (s - a) * (s - b) * (s - c))
    }

    override fun perimeter(): Double {
        return a + b + c
    }
}