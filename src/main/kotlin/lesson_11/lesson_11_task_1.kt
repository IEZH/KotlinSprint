package lesson_11
class User(
    val id: Int,
    val login: String,
    val password: String,
    val mail: String,
) {

}
fun main() {
    val user1 = User(
        id = 1,
        login = "Cat",
        password = "mymymy",
        mail = "cat@mail.ru",
    )

    val user2 = User(
        id = 2,
        login = "Dog",
        password = "afafaf",
        mail = "dog@mail.ru",
    )
    println(user1.id)
    println(user1.login)
    println(user1.password)
    println(user1.mail)
    println(user2.id)
    println(user2.login)
    println(user2.password)
    println(user2.mail)

}