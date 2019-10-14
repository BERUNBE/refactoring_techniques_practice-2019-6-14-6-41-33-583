package com.tws.refactoring.extract_variable;

public class BannerRender {
    public String renderBanner(String platform, String browser) {
        boolean platformIsMac = platform.toUpperCase().contains("MAC");
        boolean browserIsIe = browser.toUpperCase().contains("IE");
        return platformIsMac && browserIsIe ? "IE on Mac?" : "banner";
    }
}
