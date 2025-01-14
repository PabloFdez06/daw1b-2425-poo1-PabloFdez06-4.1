class Rectangulo(val base: Double, val altura: Double) {

    fun calcularArea() : Double = base * altura

    fun calcularPerimetro() : Double = (base * altura) * 2

    init {
        require(base > 0) {"La base debe ser mayor que 0"}
        require(altura > 0) {"La altura debe ser mayor que 0"}
    }

    override fun toString(): String {
        return "Un rectangulo de base: $base, y altura: $altura. Tiene un area de: ${calcularArea()}, y un perimetro de: ${calcularPerimetro()}."
    }
}