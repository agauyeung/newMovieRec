
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/alphaneo1/new/newMovieRec/conf/routes
// @DATE:Sun Nov 29 22:36:54 PST 2015


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
