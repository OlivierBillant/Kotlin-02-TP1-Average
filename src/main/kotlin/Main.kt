fun main(args: Array<String>) {
    println("Hello World!")
//    calculMoyenneFixe()
    calculMoyenneVariable()
//    println("Program arguments: ${args.joinToString()}")

}

fun calculMoyenneFixe() {
    println("Entrez le nombre de valeurs :")
    var nombreValeurs = readLine()!!.toInt()
    var listeNotes = arrayListOf<Int>()
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
    var listeNotes = arrayListOf<Int>()
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