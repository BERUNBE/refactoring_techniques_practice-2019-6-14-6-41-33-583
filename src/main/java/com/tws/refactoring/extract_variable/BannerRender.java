package com.tws.refactoring.extract_variable;

public class BannerRender {
    public String renderBanner(String platform, String browser) {
        boolean platformIsMac = platform.toUpperCase().indexOf("MAC") > -1;
        boolean browserIsIe = browser.toUpperCase().indexOf("IE") > -1;
        return platformIsMac && browserIsIe ? "IE on Mac?" : "banner";
    }
}
