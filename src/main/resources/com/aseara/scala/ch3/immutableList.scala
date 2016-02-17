/**
 * Created with IntelliJ IDEA.
 * User: 境德
 * Date: 2015/7/11
 * Time: 12:54
 */

val oneTwo = List(1, 2)
val threeFour = List(3, 4)
val oneToFour = oneTwo ::: threeFour
println(oneTwo + " and " + threeFour + " were not mutated.")
println("Thus, " + oneToFour + " is a new list.")