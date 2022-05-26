fun main() {

    val names : Array<String> = arrayOf("Muflikhan", "Dimas", "Dwiprayogi")
    val ages : Array<Int> = arrayOf(10, 23, 34)
//    names = arrayOf("") //Ini yang gabisa karena ini val
//    Val itu yang gabisa diubah variablenya
//    Isi datanya bisa diubah
    names[0] = "Muhammad"
    println(names[0])

//    Val kok datanya bisa berubah?
    /*
    * Val itu mengubah si Variablenya, bukan mengubah isi datanya
    * Jadi kita gabisa ubah variablenya
    * Tapi kita bisa usah isi variablenya
    * */

val members : Array<String?> = arrayOfNulls(5)
    members[0] = "Muflikhan"
//    members[1] = 10 //Error karena bukan String atau Null
    println(members[1])

}