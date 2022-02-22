fun main() {
    //atividade1()
    //atividade2()
    //atividade3()
    //atividade4()
    atividade5()
}

fun atividade1(): Unit {
    println("Digite o primeiro número:")
    val num1 = readLine()!!.toFloat()
    println("digite o segundo número:")
    val num2 = readLine()!!.toFloat()

    if (num1 > num2) {
        println("o primeiro número é maior que o segundo!!!")
    } else {
        println("o segundo número é maior que o primeiro")
    }
}

fun atividade2(): Unit {
    println("digite um número:")
    val num = readLine()!!.toFloat()

    if (num > 0)
        println("O número $num é positivo.")
    else {
        println("o número $num é negativo")
    }
}

fun atividade3(): Unit {
    println("Digite uma letra qualquer:")
    val letra = readLine()!!
    if (letra.equals("a", true) ||
        letra.equals("e", true) ||
        letra.equals("i", true) ||
        letra.equals("o", true) ||
        letra.equals("u", true)
    ) {
        println("A letra $letra é uma vogal")
    } else {
        println("A letra $letra é uma vogal")

    }
}

fun atividade4(): Unit {
    val jogo = Adivinha()
    println("Digite um número entre 0 e 10 para o seu palpite:")
    val palpite = readLine()!!.toInt()

    if (palpite in 0..10) {
        println(jogo.jogar(palpite))
    } else {
        println("Coloque um número entre 0 e 10, animal!")
    }
}

fun atividade5(): Unit {
    val jogo = Jokenpo()
    println("Escolha um número de 1 a 3 sendo 1=pedra 2=papel 3=tesoura")

    val objeto = readLine()!!.toInt()

    if (objeto in 1..3 ){
        println(jogo.jogar(objeto))
    } else
        println("Jogada invalida!")
}
