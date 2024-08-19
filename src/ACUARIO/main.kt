package ACUARIO

fun construirAcuario() {


    val miAcuario = Acuario(ancho = 25, largo = 25, alto = 40)
    miAcuario.imprimirTamano()

    val miTorre = Acuario.TanqueTorre(diametro = 25, alto = 40)
    miTorre.imprimirTamano()
}


fun main() {
    construirAcuario()
    crearPeces()
}


fun crearPeces() {
    val tiburón = Tiburón()
    val pezPayaso = PezPayaso()

    println("El color del Tiburón es: ${tiburón.color}")
    println("El color del Pez Payaso es: ${pezPayaso.color}")
}

