// blah
fun getGreeter(greeting: String): (String) -> String {
    return { name: String -> "$greeting, $name!" }
}

fun main() {
    // greetings
    val goodbye = getGreeter("Auf Wiedersehen")
    val hello = getGreeter("Hello")
    val welcome = getGreeter("Welcome")

    // test
    println(goodbye("Neelam"))   
    println(hello("Ahana"))    
    println(welcome("Chrislyn"))  
}

main ()
