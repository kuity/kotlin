// IS_APPLICABLE: false
class Foo {
    fun Bar(y: Int, x: Int): Int {
        if (x < y) {
            return 1
        }
        else<caret> {
            if (x > y) {
                return 2
            }
            else {
                return 3
            }
            println("Happy Birthday!")
            val messedUp = 512
        }
    }
}