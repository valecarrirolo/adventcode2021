import readInput

// https://adventofcode.com/2021/day/2

fun day2() {
    fun part1(input: List<String>): Int {
        val inputToInt = input.map { it.split(" ") }.map { it[0] to it[1].toInt() }
        return 1
    }

    fun part2(input: List<String>): Int {
        return 1
    }

// test if implementation meets criteria from the description, like:
    val testInput = readInput("Day02_test")
//check(part1(testInput) == 150)
//check(part2(testInput) == 5)

    val input = readInput("Day02")
    println(part1(input))
    println(part2(input))
}
