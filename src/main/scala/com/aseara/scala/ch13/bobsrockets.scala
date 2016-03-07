/**
  * Created by 邱境德 on 2016/3/4.
  * Listing 13.4 · Concise access to classes and packages.
  */
package bobsrockets {

  package navigation {
    class Navigator {
      // No need to say bobsrockets.navigation.StarMap
      val map = new StarMap
    }
    class StarMap
  }
  class Ship {
    // No need to say bobsrockets.navigation.Navigator
    val nav = new navigation.Navigator
  }
  package fleets {
    class Fleet {
      // No need to say bobsrockets.Ship
      def addShip() { new Ship }
    }
  }
}

package bobsrockets {
  package navigation {
    package launch {
      class Booster1
    }
    class MissionControl {
      val nav = new Navigator
      val booster1 = new launch.Booster1
      val booster2 = new bobsrockets.launch.Booster2
      val booster3 = new _root_.launch.Booster3
    }
  }
  package launch {
    class Booster2
  }
}
