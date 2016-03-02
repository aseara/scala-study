/**
  * Created by 邱境德 on 2016/3/1.
  * Listing 9.5 · Using a by-name parameter.
  */
var assertionsEnabled = true

def byNameAssert(predicate: => Boolean) =
  if (assertionsEnabled && !predicate
    throw new AssertionError