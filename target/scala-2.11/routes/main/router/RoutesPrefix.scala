
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/bogdan/IdeaProjects/LostFoundNew/conf/routes
// @DATE:Sun Jan 17 12:42:33 EET 2016


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
