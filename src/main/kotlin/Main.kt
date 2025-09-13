fun main(args: Array<String>) {
    println("Введите натуральное число ")
    var input = readln()
    var number = input.toInt()

    if (number < 0) {
        println("Ошибка. Введено не натуральное число")
        return
    }

    var binaryNumber = ""

    while (number > 0) {
        binaryNumber = (number % 2).toString() + binaryNumber
        number /= 2
    }

    println("Двоичное представление введенного числа: $binaryNumber")

}