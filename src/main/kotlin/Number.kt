fun main() {
//    INTEGER
    var age : Byte = 127
    var height : Short = 1212
    var integer : Int = 12234234
    var long : Long = 1212239999L
    println(age)


//    FLOATING POINT NUMBER
    var sample : Float = 12.23F
    var dou : Double = 3.227389382


//    LITERALS
    var decimalLiteral : Int = 34824
    var hexaDecimal : Int = 0xfff
    var binaryDec : Int = 0b10100101

//    Undescore
    var age2 : Byte = 1_2_7
    var height2 : Short = 1212
    var integer2 : Int = 122_342_34
    //    Underscore itu supaya mudah dibaca aja, ga akan terbaca sebagai program
    var long2 : Long = 121_223_9999L

//    Conversion
    var angka : Int = 100

    var byte: Byte = angka.toByte()
    var short:Short = angka.toShort()
    var long3 : Long = angka.toLong()
    var float : Float = angka.toFloat()
    var double : Double = angka.toDouble()

    
}