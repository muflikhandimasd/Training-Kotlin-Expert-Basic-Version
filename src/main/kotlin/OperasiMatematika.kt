fun main() {

//Operasi Matematika
    val result : Int = 10 / 3
    println(result)

    val result2 : Double = 10.0 / 3.0
    println(result2)

    val result3 = 10 + 10 / 2
    println(result3)

//    Augmented Assignments
    var total : Int = 0
    val barang1 : Int =100
    total += barang1
    val barang2 : Int = 200
    total += barang2
    val barang3 : Int = 300
//    total = total + barang3
//    total sekarang = total sebelumnya + barang3
    total += barang3

    total++
    total++
    total--
    println(total)

    val suhu = -10
    println(suhu)

    val sehat = true
    println(!sehat)


}