

fun main() {
    val rectangulo1 = Rectangulo(4.0, 5.0)
    println(rectangulo1)

    val rectangulo2 = Rectangulo(5.0, 8.0)
    println("El rectangulo con base de ${rectangulo2.base} y altura de ${rectangulo2.altura}. Tiene un area de ${rectangulo2.calcularArea()} y un perimetro de ${rectangulo2.calcularPerimetro()}. Perfecto pa una mesa (por la cara)")

    val rectangulo3 = Rectangulo(-1.0, 5.0)
    println(rectangulo3)

    val rectangulo4 = Rectangulo(1.0, -5.0)
    println(rectangulo4)

    val rectangulo5 = Rectangulo(-4.0, -5.0)
    println(rectangulo5)
}