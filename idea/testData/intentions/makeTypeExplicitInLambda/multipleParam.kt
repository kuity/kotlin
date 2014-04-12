class TestingUse {
    fun test2(sum: (a: Int, b: Int) -> Int, c: Int): Int {
        return sum(c, 5)
    }
}

fun main() {
    val num = TestingUse().test2({(x, y) -> x + y<caret>}, 4)
}
