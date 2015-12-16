
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/agauyeung/cs490/newMovieRec/conf/routes
// @DATE:Thu Dec 10 17:41:59 PST 2015


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
