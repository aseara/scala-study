/**
  * Created by 邱境德 on 2016/2/26.
  * Listing 7.4 · Calculating greatest common divisor with recursion.
  */

def gcd(x: Long, y: Long): Long =
 if (y == 0) x else gcd(y, x % y)
