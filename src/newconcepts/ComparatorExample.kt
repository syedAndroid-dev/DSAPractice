package newconcepts

data class Person(
    val name: String,
    val age: Int,
)

fun comparatorBasics() {
    //Compare by age
    val ageComparator = Comparator<Person> { o1, o2 -> o1.age.compareTo(o2.age) }

    //Compare by name thenBy age
    val ageNameComparator = compareBy<Person> { it.name }.thenBy { it.age }
    val persons = listOf(Person(name = "syed", age = 44),Person(name = "abbas", age = 42),Person(name = "Ibu", age = 38))

    val sortedPersons = persons.sortedWith(comparator = ageNameComparator)

    for(i in sortedPersons){
        println(i)
    }
}

fun main() {
    comparatorBasics()
}