package ACUARIO


abstract class Pez {
    abstract val color: String
}

class Tiburón : Pez() {
    override val color: String = "gris"
}

class PezPayaso : Pez() {
    override val color: String = "dorado"
}
