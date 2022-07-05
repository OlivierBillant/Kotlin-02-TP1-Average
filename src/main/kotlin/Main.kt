import java.math.BigInteger

fun main(args: Array<String>) {
    println("Hello World!")
//    calculMoyenneFixe()
//    calculMoyenneVariable()
    grainDeRiz()
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
    var grainsDeRiz:Double = 1.0
    val facteur = 2
    var nombreDeCases = 64
    println("Vous souhaitez connaitre le nombre de grains de riz sur la case :")
    nombreDeCases = readLine()!!.toInt()

//    println("Vous aurez $grainsDeRiz grains de riz sur la case 1")
    for (i in 2..nombreDeCases) {
        grainsDeRiz *= facteur
    }
        println("Vous aurez $grainsDeRiz grains de riz sur la case $nombreDeCases")
}