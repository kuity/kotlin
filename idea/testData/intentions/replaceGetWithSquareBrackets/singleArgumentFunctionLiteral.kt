class Foo() {
    var bar = 10
    fun get(func: (Int, Int) -> Boolean) {
        func(5, 10)
    }
    fun set(y: Int) {
        bar = y
    }
}
fun main(x: Int, y: Int) {
    var member = Foo()
    member.get() { x, <caret>y -> x < y }
}