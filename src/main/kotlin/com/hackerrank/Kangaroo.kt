import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)

    val x1 = sc.nextInt()
    val v1 = sc.nextInt()
    val x2 = sc.nextInt()
    val v2 = sc.nextInt()

    println(canJumpToSameLocation(x1, v1, x2, v2))
}

fun canJumpToSameLocation(x1: Int, v1: Int, x2: Int, v2: Int): String {
    if (x1 < x2 && v1 < v2) return "NO"
    return if (v1 != v2 && (x1 - x2) % (v2 - v1) == 0) "YES" else "NO"
}

