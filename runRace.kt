fun main() {
    val runners = mutableListOf<String>()
    val times = mutableListOf<Int>()
    
    // Get the names and times of the runners
    for (i in 1..3) {
        print("Enter the name of runner $i: ")
        runners.add(readLine()!!)
        print("Enter the time taken by runner $i (in minutes): ")
        times.add(readLine()!!.toInt())
    }
    
    // Sort the runners based on their times
    val sortedRunners = runners.zip(times).sortedBy { it.second }.map { it.first }
    
    // Display the names of the runners in the order they finished
    println("The runners finished in the following order:")
    sortedRunners.forEachIndexed { i, runner ->
        println("${i + 1}. $runner")
    }
}
