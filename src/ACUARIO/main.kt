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
    val tiburon = Tiburon()
    val pezPayaso = PezPayaso()

    println("El color del tiburón es: ${tiburon.color}")
    tiburon.comer()

    println("El color del pez payaso es: ${pezPayaso.color}")
    pezPayaso.comer()
}

