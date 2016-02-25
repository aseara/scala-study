/**
  * Created by 邱境德 on 2016/2/25.
  * Listing 7.2 · Calculating greatest common divisor with a while loop.
  */
def gcdLoop(x: Long, y: Long) = {
  var a = x
  var b = y
  while (a != 0) {
    val temp = a
    a = b % a
    b = temp
  }
  b
}
