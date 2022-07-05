import java.math.BigInteger
import java.util.DoubleSummaryStatistics
import kotlin.math.pow

fun main(args: Array<String>) {
    println("Hello World!")
//    calculMoyenneFixe()
//    calculMoyenneVariable()
//    grainDeRiz()
    grainDeRiz2()
//    println("Program arguments: ${args.joinToString()}")

}

fun calculMoyenneFixe() {
    println("Entrez le nombre de valeurs :")
    var nombreValeurs = readLine()!!.toInt()
    var listeNotes = ArrayList<Int>()
    var totalNotes = 0
    println("Vous souhaitez calculer la moyenne de $nombreValeurs notes")


    for (i in 1..nombreValeurs) {
        println("Valeur :")
        listeNotes.add(readLine()!!.toInt())
    }

    for (note in listeNotes) {
        totalNotes += note
    }
    println("La moyenne est de " + totalNotes / (nombreValeurs) + "/20")
}

fun calculMoyenneVariable() {
    var listeNotes = ArrayList<Int>()
    var totalNotes = 0
    println("Calculez la moyenne des notes suivantes")
    do {
        println("Note (-1 pour terminer) : ")
        listeNotes.add(readLine()!!.toInt())
    } while (listeNotes.last() != -1)
    listeNotes.removeLast()
    for (note in listeNotes) {
        totalNotes += note
    }
    println("La moyenne est de " + totalNotes / (listeNotes.size) + "/20")


}

fun grainDeRiz() {
    var grainsDeRiz: Double = 1.0
    val facteur = 2
    var nombreDeCases = 64
    var totalGrainsDeRiz: Double = 1.0
    println("Vous souhaitez connaitre le nombre de grains de riz sur la case :")
    nombreDeCases = readLine()!!.toInt()

//    println("Vous aurez $grainsDeRiz grains de riz sur la case 1")
    for (i in 2..nombreDeCases) {
        grainsDeRiz *= facteur
        totalGrainsDeRiz += grainsDeRiz
//        println("Vous aurez $grainsDeRiz grains de riz sur la case $i")
    }
    println("Vous aurez $grainsDeRiz grains de riz sur la case $nombreDeCases")
    println("Vous aurez obtenu $totalGrainsDeRiz grains de riz sur la case $nombreDeCases")
    var deuxPuissance63:Double = 2.0
    deuxPuissance63 = deuxPuissance63.pow((nombreDeCases-1))
    println("Deux puissance 64-1 est égal à : $deuxPuissance63")

}fun grainDeRiz2() {
    var grainsDeRiz: BigInteger = BigInteger.ONE
    val facteur:BigInteger = BigInteger.TWO
    var nombreDeCases = 64
    var totalGrainsDeRiz: BigInteger = BigInteger.ZERO
    println("Vous souhaitez connaitre le nombre de grains de riz sur la case :")
    nombreDeCases = readLine()!!.toInt()

    for (i in 1..nombreDeCases) {
        grainsDeRiz = facteur.pow(i-1)
        totalGrainsDeRiz = totalGrainsDeRiz.add(grainsDeRiz)
//        println("Vous aurez $grainsDeRiz grains de riz sur la case $i")
    }
    println("Vous aurez $grainsDeRiz grains de riz sur la case $nombreDeCases")
    println("Vous aurez obtenu $totalGrainsDeRiz grains de riz sur la case $nombreDeCases")
