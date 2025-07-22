package org.example

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val students = arrayOf("Ahmed", "Momen", "Hassan", "Mohamed", "Hamza", "Alaa")
    val studentGrades = mutableMapOf(
        "${students[0]}" to 50,
        "${students[1]}" to 100,
        "${students[2]}" to 60,
        "${students[3]}" to 70,
        "${students[4]}" to 10,
        "${students[5]}" to 5,
    )
    studentGrades["Moaz"] = 80
//    GenrateReport(studentGrades)
    val studentGrades1 = mapOf<String,Int>()
    GenrateReport(studentGrades1)
}

fun GenrateReport(studentGrades: Map<String, Int>){
    if(studentGrades.isNotEmpty()) {
        val filtered = studentGrades.filter { it.value >= 60 }
        filtered.forEach { println("${it.key}:${it.value}") }
    }else
        println("please fill the map with elements !")
}