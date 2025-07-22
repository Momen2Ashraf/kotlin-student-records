package org.example

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val students = arrayOf("Ahmed","Momen","Hassan","Mohamed")
    val studentGrades = mutableMapOf(
        "${students[0]}" to 50,
        "${students[1]}" to 100,
        "${students[2]}" to 60,
        "${students[3]}" to 70
    )
    studentGrades["Hamza"] = 60
    val graduatedStudents = setOf(studentGrades.filter { it.value >= 60 })
    println(graduatedStudents)
}