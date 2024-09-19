// Bingo problem

fun bingoWord(word: String): String {
    // Code to get the uppercase version of the first letter 
    val firstLetter = word.first().uppercase()
    //code to get the length of the word
    val lengthOfWord = word.length
    //returning the first letter & the length
    return "$firstLetter $lengthOfWord"
}

fun main() {
    // testing it 
    println("Bingo word for 'Yes' is: ${bingoWord("yes")}")
    println("Bingo word for 'Bob' is: ${bingoWord("bob")}")
    println("Bingo word for 'life' is: ${bingoWord("life")}")
    println("Bingo word for 'kotlin' is: ${bingoWord("kotlin")}")
}

main ();
