package org.example

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    //initialize array and mutable map for whole task
    val students = arrayOf("Ahmed", "Momen", "Hassan", "Mohamed", "Hamza", "Alaa")
    val studentGrades = mutableMapOf(
        students[0] to 50,
        students[1] to 100,
        students[2] to 60,
        students[3] to 70,
        students[4] to 10,
        students[5] to 5,
    )
    studentGrades["Moaz"] = 80
    val graduateStudents = (studentGrades.filter { it.value >= 60 }.keys).toSet() //set of graduated students using filter
    //Requirement 1: Create and Populate Collections
    println(graduateStudents)

    //Requirement 2: Looping and Searching
    println("\nStudent\tGrade")
    for (item in studentGrades)
    {
        if(item.key !in graduateStudents) //if name is not exist in graduated set then print it
            println("${item.key} \t ${item.value}")
    }

    //Requirement 3: Transforming and Filtering with map and filter
    println()
    studentGrades
        .filter { it.value >= 80 }
        .map { it.key.uppercase() }
        .forEach { println(it) }

    //Requirement 4: Reducing and Aggregation
    println()
    println(studentGrades.values.reduce { a,b -> a+b })
    val formatedString = studentGrades.entries.fold(""){acc,(name,grade) ->
        if (acc.isEmpty()) //if to format string and take off " | " in last iteration
            "$name: $grade"
        else
            "$acc | $name: $grade"
    }
    println(formatedString)

    //Requirement 5: Mini Scenario – Student Report Generation
    println()
    GenrateReport(studentGrades)
    val emptyMap = mapOf<String, Int>()
    GenrateReport(emptyMap)

}

fun GenrateReport(studentGrades: Map<String, Int>){
    if(studentGrades.isNotEmpty()) //check if map is not empty
    {
        val filtered = studentGrades.filter { it.value >= 60 }
        filtered.forEach{println("${it.key}: ${it.value}")}
    }
    else
        println("please fill the map with elements !")
}