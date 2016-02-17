/**
 * Created with IntelliJ IDEA.
 * User: 境德
 * Date: 2015/7/11
 * Time: 16:44
 */

import scala.collection.{mutable => m}

val treasureMap = m.Map[Int, String]()
treasureMap += (1 -> "Go to island.")
treasureMap += (2 -> "Find big X on ground.")
treasureMap += (3 -> "Dig.")

print(treasureMap(2))