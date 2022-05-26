fun main() {

    val finalExam = 80
    val attendant = 76
    val extraCurricular = 80

    val passExam = finalExam > 75
    val passAttendant = attendant > 75
    val passExtra = extraCurricular > 75

    val pass = passExam && passAttendant && passExtra
//    val pass = (passExam && passAttendant) && passExtra
//    val pass =( (passExam && passAttendant) && passExtra)
    println(pass)


}