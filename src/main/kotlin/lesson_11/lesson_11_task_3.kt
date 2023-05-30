package lesson_11

class Room(
    val cover: String,
    val title: String,
    val listOfParticipants: List<Participant>,
    )

class Participant(
    val avatar: String,
    val nickname: String,
    val status: List<String> = listOf("разговаривает", "микрофон выключен", "пользователь заглушен"),
)

    fun longClickOnAvatar() {
        // Подсветить никнейм участника при долгом нажатии на аватарку
    }

fun main() {
    val participant1 = Participant(
        avatar = "картинка с Бэтменом",
        nickname = "Batman_1",
        status = listOf("Разговаривает"),
    )

    val participant2 = Participant(
        avatar = "картинка с Робином",
        nickname = "Robin",
        status = listOf("микрофон выключен"),
    )

    val roomOfComicsDC = Room(
        cover = "картинка Лиги справедливости",
        title = "Комната для любителей комиксов DC (Marvel сосать)",
        listOfParticipants = listOf(participant1, participant2),
    )

    val participant3 = Participant(
        avatar = "картинка с Железным человеком",
        nickname = "Iron Man_777",
        status = listOf("разговаривает"),
    )

    val participant4 = Participant(
        avatar = "картинка с Халком}",
        nickname = "Hulk_21",
        status = listOf("пользователь заглушен"),
    )

    val roomOfComicsMarvel = Room(
        cover = "картинка Мстителей",
        title = "Комната для любителей комиксов Марвел (DC говно)",
        listOfParticipants = listOf(participant3, participant4),
    )

}