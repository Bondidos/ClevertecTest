package test1

import kotlin.math.pow
import kotlin.math.sqrt

fun main() {

    val point1 = Point(
        getRandomInt(),
        getRandomInt(),
        getRandomInt()
    )
    val point2 = Point(
        getRandomInt(),
        getRandomInt(),
        getRandomInt()
    )
    val point3 = Point(
        getRandomInt(),
        getRandomInt(),
        getRandomInt()
    )

    print("Given points with random Int values: \nFirst: $point1 \nSecond: $point2 \nThird: $point3")

    val result = when {
        point1 == point2 -> distanceBetweenTwoPoints(point1, point3)
        point2 == point3 -> distanceBetweenTwoPoints(point1, point2)
        point1 == point3 -> distanceBetweenTwoPoints(point1, point2)
        else -> {
            distanceBetweenTwoPoints(point1, point2) + distanceBetweenTwoPoints(point2, point3)
        }
    }
    print("\nCalculating.........................................")
    println("\nDistance between First -> Second -> Third: $result")

}

data class Point(
    val x: Int,
    val y: Int,
    val z: Int
) {
    override fun equals(other: Any?): Boolean {
        return if (other is Point) {
            this.x == other.x && this.y == other.y && this.z == other.z
        } else false
    }

    override fun hashCode(): Int {
        var result = x
        result = 31 * result + y
        result = 31 * result + z
        return result
    }

    override fun toString(): String {
        return this.javaClass.simpleName + " (x = $x, y = $y, z = $z)"
    }
}

private fun getRandomInt() = (Int.MIN_VALUE..Int.MAX_VALUE).random()

private fun distanceBetweenTwoPoints(a: Point, b: Point): Double {
    return if (a == b) 0.0 else {
        val deltaX = (b.x - a.x).toDouble()
        val deltaY = (b.y - a.y).toDouble()
        val deltaZ = (b.z - a.z).toDouble()
        sqrt(deltaX.pow(2) + deltaY.pow(2) + deltaZ.pow(2))
    }
}