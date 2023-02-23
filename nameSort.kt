fun main() {
    val people = listOf(people("Charlie",54), people("Leslie", 34),
            people("Andy", 11))
     
    println("Sorting by ascending: ")
    val sortedPeople = people.sortedBy { people -> people.name }
    sortedPeople.forEach { p -> println(p.name) }
}

class people(val name: String,marks : Int)
