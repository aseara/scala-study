/**
  * Created by 邱境德 on 2016/2/25.
  * Listing 7.1 · Scala’s idiom for conditional initialization.
  */

val filename =
  if(!args.isEmpty) args(0)
  else "default.txt"