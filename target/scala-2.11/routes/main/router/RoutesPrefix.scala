
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/alphaneo1/newMovieRec/conf/routes
// @DATE:Wed Nov 25 02:29:04 PST 2015


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
