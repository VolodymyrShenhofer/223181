
// @GENERATOR:play-routes-compiler
// @SOURCE:D:/lab/Users/stud.WIZ/223277/conf/routes
// @DATE:Tue Feb 27 12:15:55 CET 2018


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
