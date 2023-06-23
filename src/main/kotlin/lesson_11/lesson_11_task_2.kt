package lesson_11

class UserX(
    val id: Int,
    val login: String,
    var password: String,
    val mail: String,
    var bio: String = "",
) {

    fun outputUserInformation() {
        println("User: $id $login $password $mail $bio")
    }

    fun recordInformationAboutYourself() {
        println("Введите информацию о себе:")
        bio = readln()
    }

    fun changePassword() {
        println("Введите пароль:")
        val inputPassword = readln()
        if (inputPassword == password) {
            println("Создайте новый пароль:")
            password = readln()
            println("Пароль изменен на $password")
        } else changePassword()

    }

    fun sendText(message: String) {
        println(message)
    }

}

fun main() {
        val user1 = UserX(
            id = 1,
            login = "Cat",
            password = "mymymy",
            mail = "cat@mail.ru",
        )

    user1.outputUserInformation()

    user1.recordInformationAboutYourself()

    user1.changePassword()

    user1.outputUserInformation()

    user1.sendText("привет медвед!")

}