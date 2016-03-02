/**
  * Created by 邱境德 on 2016/3/1.
  * Listing 9.3 · Defining and invoking a curried function.
  */

def curriedSum(x: Int)(y: Int) = x + y

curriedSum(1)(2)