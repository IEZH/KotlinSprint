package lesson_13

class ContactY(val name: String, val numberPhone: Long, val company: String? = null)

fun main() {
    val listOfContacts = mutableListOf<ContactY>()

    val contact1 = ContactY("Ваня бро", 891522511335, null)
    listOfContacts.add(contact1)

    val contact2 = ContactY("Ден бро", 89265541125, "Сбер")
    listOfContacts.add(contact2)

    val contact3 = ContactY("Членосос", 89524854877,)
    listOfContacts.add(contact3)

    printContacts(listOfContacts)
}

fun printContacts(list: MutableList<ContactY>){
    list.forEach{
        println("${it.name} \n ${it.numberPhone} \n ${it.company ?: "[не указано]"} \n")
    }
}