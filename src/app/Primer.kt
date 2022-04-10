// Defining a function
fun sayHi(): String {
    return "Hi"
}

fun main() {
    println("Holis")
    val name: String = "Edo"
    var name2: String = "Mcs"
    println(name + name2)
    // name = "no" <- Esto es ilegal bruh, variables val no pueden
    // ser modifivadas
    name2 = "Cs"
    println(name + name2)
    print("Hi")
    println(name)
    // Kotlin infiere los tipos de datos de las variables, sin embargo
    // serán variables no-null pues es lo predeterminado
    val edad = 24
    var contador = 1
    println(edad + contador) // Se imprime la suma de los valores
    println("$edad" + "$contador") // Se imprime la concatenación en String de los valores
    // Para que una variable sea nullable debe declarase su tipo
    // y agregarse un ?
    var anio: Int? = null
    println(anio)
    // anio = 2022
    if (anio != null) {
        println ("Es el año " + anio)
    } else {
        println("NO HAY AÑO AAAAAAAAAAAAAAH")
    }
    // do-while, when, incremento
    do {
        when (contador) {
            1 -> println("uno")
            2 -> println("dos")
            3 -> println("tres")
            else -> println("nono")
        }
        contador++
    } while (contador < 10)
    // while
    contador = 30
    while (contador > 15) {
        println(contador)
        contador--
    }
    // for en un rango de números
    for (i in 1..100) {
        print("$i ")
    }
    print("\n")
    // for en un rango de números con incremento distinto a 1
    /* for (i in 1..10 step 2) {
        print("$i ")
    }
    println("\n") */
    // for en un rango de números sin considerar el último
    for (i in 1 until 100) {
        print("$i ")
    }
    print("\n")

    // Con variables:

    var num1 = 50
    var num2 = 100

    for (i in num1 until num2) {
        print("$i ")
    }
    print("\n")

    // Con decremento

    for (i in 10 downTo 0) {
        print("$i ")
    }
    print("\n")

    // Con rango de caracteres

    for (i in 'a'..'m') {
        print("$i ")
    }
    print("\n")

    println(sayHi())
}
