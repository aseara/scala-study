/**
  * Created by 邱境德 on 2016/2/26.
  * Listing 7.16 · Looping without break or continue.
  */

var i = 0
var foundIt = false

while (i < args.length && !foundIt) {
  if (!args(i).startsWith("-")) {
    if (args(i).endsWith(".scala"))
      foundIt = true
  }
  i = i + 1
}