/**
  * Created by 邱境德 on 2016/2/22.
  * List 3.7 Creating, initializing, and using a mutable map.
  */
import scala.collection.mutable.Map

val treasureMap = Map[Int, String]()
treasureMap += (1 -> "Go to island.")
treasureMap += (2 -> "Find big X on ground.")
treasureMap += (3 -> "Dig.")
println(treasureMap(2))
