package entities

data class Individuo(
        val processos: List<Int>
)


fun getExecutionTime(total:Int):Int{
        return total*11064 - (total*total) + (total*(total+1)/2)
}
