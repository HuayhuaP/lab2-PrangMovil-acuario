package ACUARIO


abstract class Pez {
    abstract val color: String
}

class Tiburon : Pez() {
    override val color: String = "gris"
    override fun comer() {
        println("cazar y comer peces")
    }
}

class PezPayaso : Pez() {
    override val color: String = "dorado"

    override fun comer() {
        println("comer algas")
    }


}


interface AccionPez {
    fun comer()
}



