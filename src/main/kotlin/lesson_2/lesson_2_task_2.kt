package lesson_2

fun main() {
    val staff = 50
    val interns = 30
    val salaryOfStaff = 30000
    val salaryOfInterns = 20000
    val expensesForStaff = staff * salaryOfStaff
    val allExpenses = (staff * salaryOfStaff) + (interns * salaryOfInterns)
    val averageSalary = ((staff * salaryOfStaff) + (interns * salaryOfInterns)) / 80

    println(expensesForStaff)
    println(allExpenses)
    println(averageSalary)
}