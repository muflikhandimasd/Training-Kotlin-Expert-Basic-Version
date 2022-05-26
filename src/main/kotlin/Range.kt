fun main() {


//    val range: IntRange = 1..100
//    val range2 = 500..1000

    val range = 1000 downTo 100 step 12
    println(range.count())
    println(range.contains(20))
    println(range.contains(200))
    println(range.first)
    println(range.last)
    println(range.step)




}