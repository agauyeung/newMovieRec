
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/alphaneo1/new/newMovieRec/conf/routes
// @DATE:Mon Nov 30 22:07:56 PST 2015


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
