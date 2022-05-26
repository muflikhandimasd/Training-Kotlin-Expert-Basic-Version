fun main() {
//    String
    var firstName : String = "Muflikhan"
    var lastName : String = "Dwiprayogi"

//    String Trim Indent
    var address : String = """
        Ini adalah jalan belum jadi
        RT 1 RW 1 Dusun Nyusun
        Desa Pedesaan
    """.trimIndent()

    println(firstName)
    println(lastName)
    println(address)

//    Menggabungkan String
//    var fullName : String = firstName + " " + lastName
//    println(fullName)

//    String Template
    var fullName : String = "$firstName $lastName"
    var desc : String = "$fullName length : ${fullName.length}"
    println(desc)


}