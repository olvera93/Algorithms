package google

class BoatsToSavePeople {

    fun numRescueBoats(people: Array<Int>, limit: Int): Int {
        val sortedPeople = people.sorted()
        var smallest = 0
        var biggest = sortedPeople.size - 1

        var boats = 0

        while (biggest >= smallest) {
            if (sortedPeople[smallest] + sortedPeople[biggest] <= limit) {
                biggest -= 1
                smallest += 1
            } else {
                biggest -= 1
            }
            boats += 1
        }
        return boats
    }
}

fun main() {
    val boats = BoatsToSavePeople()
    val people = arrayOf(3, 5, 3, 4)
    val limit = 5
    println(boats.numRescueBoats(people, limit))
}