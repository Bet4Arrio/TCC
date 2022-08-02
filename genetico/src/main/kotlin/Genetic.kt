data class Solution(
    val processors: List<Int>,
    val time: Int
)

fun solutionFactory(processes: List<Int>): Solution {
    var accumulative = 0
    val processList = processes.map { it -> accumulative += it; accumulative; }
    var lastTime = 0
    val maxTime = processList.map {
        val contTime = lastTime
        lastTime = it
        getDifferenceExecutionTime(it, contTime)
    }.maxOrNull() ?: 0
    return Solution(processors = processes, time = maxTime)
}

fun getExecutionTime(total: Int) = total * 11064 - (total * total) + (total * (total + 1) / 2)

fun getDifferenceExecutionTime(begin: Int, end: Int) = (getExecutionTime(begin) - getExecutionTime(end))

fun mege_numbers(a:Int, b:Int): Int {
    val aStr = a.toString(2).toList()
    val bStr = b.toString(2).toList()
    val new_number_bin = (aStr zip bStr).map{ it ->
        if((0..1).random() == 1)  it.first else it.second
    }
    val strBin= new_number_bin.joinToString("")
    val son = Integer.parseInt(strBin, 2)
    return son
}

fun makeRalation(i1: Solution, i2: Solution):Solution {
    val genes = i1.processors zip i2.processors
    var accumulative = 0
    val son_select =  genes.map {

    }
}

class Genetic(
    private val totalImgs: Int = 11064,
    private val maxThreads: Int = 30
) {

    fun fit() {}



    fun initPopulation() {
    }

    fun generateNewPopulation() {}

    fun genSolution(): Solution {
        var restProcess = this.totalImgs
        val listOfProcess = (1..this.maxThreads).map {
            if (restProcess > 0) {
                val randomNumber = (0..restProcess).random()
                restProcess -= randomNumber
                if (it == this.maxThreads) restProcess else randomNumber
            } else {
                0
            }
        }
        return solutionFactory(listOfProcess)
    }
}

fun main() {
    val a = Genetic()

    println(a.genSolution())
}
