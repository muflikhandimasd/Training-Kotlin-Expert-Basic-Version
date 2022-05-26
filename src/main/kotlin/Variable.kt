fun main() {
//    Variable
//    val firstName = "Muflikhan"
//    val age = 22
//
//    println(firstName)
//    age = 23//Error : Val cannot be reassigned

//    Nullable
    var name : String? = null
    name = "Muflikhan"
    println(name)
//    Error : Karena cara akses nullable salah
//    println(name.length)

//    Cara akses yg benar
    println(name?.length)

    println("App Name : $APPLICATION , Version : $VERSION")

}
//Variable Constant
//Diset Global, diluar main Function
const val APPLICATION = "Belajar Kotlin"
const val VERSION = "1.0.0"

