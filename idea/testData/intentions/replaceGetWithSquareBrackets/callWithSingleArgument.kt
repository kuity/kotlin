class Foo() {
    var bar = 10
    fun get(x: Int): Int {
        return x * 2
    }
    fun set(y: Int) {
        bar = y
    }
}

fun main(x: Int, y: Int) {
    var member = Foo()
    var num = member.<caret>get(10)
}