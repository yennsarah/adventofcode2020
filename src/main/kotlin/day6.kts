import java.io.File

val testInput = "abc\n" +
        "\n" +
        "a\n" +
        "b\n" +
        "c\n" +
        "\n" +
        "ab\n" +
        "ac\n" +
        "\n" +
        "a\n" +
        "a\n" +
        "a\n" +
        "a\n" +
        "\n" +
        "b"

val puzzleInput = File("./day6_input.txt").readText()

val input = puzzleInput // puzzleInput testInput

val groups = input.split("\n\n").map { it.replace("\n", "") }
var sum = 0
groups.forEach { sum += it.toList().distinct().count() }

println("sum $sum")