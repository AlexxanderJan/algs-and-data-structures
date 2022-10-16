class HelloWorld {
    fun getPrintStatement(): String {
        return "Hello, world!"
    }
}

fun functionalPrintStatement(): String {
    return "Hello, world!"
}

fun main() {
    print(HelloWorld().getPrintStatement())
}
