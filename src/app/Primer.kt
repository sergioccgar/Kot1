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
    println(edad + contador)
    // Para que una variable sea nullable debe declarase su tipo
    // y agregarse un ?
    var anio: Int? = null
    println(anio)
    anio = 2022
    if (anio != null) {
        println ("Es el año " + anio)
    }
}
