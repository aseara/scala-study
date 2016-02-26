/**
  * Created by 邱境德 on 2016/2/26.
  * Listing 7.15 · A match expression that yields a value.
  */

val firstArg = if (args.nonEmpty) args(0) else ""
val friend = firstArg match {
  case "salt" => "pepper"
  case "chips" => "salsa"
  case "eggs" => "bacon"
  case _ => "huh?"
}
println(friend)