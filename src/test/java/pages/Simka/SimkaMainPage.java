package pages.Simka;

import pages.Common;

public class SimkaMainPage {
    public static void openUrl(String url){
        Common.setUpChrome();
        Common.openUrl(url);
    }
}
