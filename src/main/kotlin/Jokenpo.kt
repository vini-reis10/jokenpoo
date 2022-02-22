import kotlin.random.Random

// 1 - PEDRA
// 2- PAPEL
// 3- TESOURA

class Jokenpo {
    fun jogar(jogador: Int): String {
        val computador = Random.nextInt(1, 3)

        return if (jogador == 1 && computador == 3 ||
            jogador == 2 && computador == 1 ||
            jogador == 3 && computador == 2) "você venceu!" else "computador venceu!"
    }

}