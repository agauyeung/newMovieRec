
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/alphaneo1/login/conf/routes
// @DATE:Sun Dec 06 17:15:46 PST 2015


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
