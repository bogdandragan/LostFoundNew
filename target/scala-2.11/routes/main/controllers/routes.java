
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/bogdan/IdeaProjects/LostFoundNew/conf/routes
// @DATE:Sat Jan 16 22:34:21 EET 2016

package controllers;

import router.RoutesPrefix;

public class routes {
  
  public static final controllers.ReverseAssets Assets = new controllers.ReverseAssets(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseAnnouncement Announcement = new controllers.ReverseAnnouncement(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseAdministration Administration = new controllers.ReverseAdministration(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseHome Home = new controllers.ReverseHome(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseAccount Account = new controllers.ReverseAccount(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final controllers.javascript.ReverseAssets Assets = new controllers.javascript.ReverseAssets(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseAnnouncement Announcement = new controllers.javascript.ReverseAnnouncement(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseAdministration Administration = new controllers.javascript.ReverseAdministration(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseHome Home = new controllers.javascript.ReverseHome(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseAccount Account = new controllers.javascript.ReverseAccount(RoutesPrefix.byNamePrefix());
  }

}
