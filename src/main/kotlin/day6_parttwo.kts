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

data class Group(val answers: List<String>)

val groups = input.split("\n\n").map { Group(it.split("\n")) }

var sum = 0
groups.forEach { group ->
    val intersect = group.answers.reduce { acc, s -> s.toList().intersect(acc.toList()).toString() }
        .replace("[", "")
        .replace("]", "")
        .replace(" ", "")
        .replace(",", "")
    // println("$intersect ${intersect.count()}")
    sum += intersect.count()
}

println("sum $sum")