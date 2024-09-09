fun main() {

}

open class Vehicle(var name: String = "Транспорт", var velocity: Int = 0) {
    open fun start() {
        println("$name начал движение ($velocity км/ч)")
    }

    // Метод для остановки
    open fun stop() {
        println("$name остановился")
    }
}

class Boat(name: String = "Лодка", velocity: Int = 4) : Vehicle(name, velocity){
    override fun start(){
        println("$name начал плыть ($velocity км/ч)")
    }

    override fun stop() {
        println("$name сбросила якорь ($velocity км/ч)")
    }
}

class Plane(name: String = "Самолет", velocity: Int = 100) : Vehicle(name, velocity){
    override fun start(){
        println("$name взлетел ($velocity км/ч)")
    }

    override fun stop() {
        println("$name сел на посадку ($velocity км/ч)")
    }
}

class Tank(name: String = "Танк", velocity: Int = 50) : Vehicle(name, velocity){
    override fun start(){
        println("$name начал выдвигаться на позицию ($velocity км/ч)")
    }

    override fun stop() {
        println("$name занял позицию ($velocity км/ч)")
    }
}