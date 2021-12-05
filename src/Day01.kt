// https://adventofcode.com/2021/day/1

fun main() {
    fun part1(input: List<String>): Int {
        val inputToInt = input.map { it.toInt() }
        var nIncreased = 0
        inputToInt.forEachIndexed { index, current ->
            if (index > 0 && current > inputToInt[index - 1]) {
                nIncreased++
            }
        }
        return nIncreased
    }

    fun part2(input: List<String>): Int {
        val inputToInt = input.map { it.toInt() }
        var sumIncreased = 0
        val sumWindowed = inputToInt.windowed(3).map { it[0] + it[1] + it[2] }
        sumWindowed.forEachIndexed { index, current ->
            if (index > 0 && current > sumWindowed[index - 1]) {
                sumIncreased++
            }
        }
        return sumIncreased
    }

    // test if implementation meets criteria from the description, like:
    val testInput = readInput("Day01_test")
    check(part1(testInput) == 7)
    check(part2(testInput) == 5)

    val input = readInput("Day01")
    println(part1(input))
    println(part2(input))
}
