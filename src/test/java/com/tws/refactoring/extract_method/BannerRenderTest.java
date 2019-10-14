package com.tws.refactoring.extract_method;

import com.tws.refactoring.extract_variable.BannerRender;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class BannerRenderTest {
    @Test
    public void should_return_ie_on_mac_when_platform_is_mac_and_browser_is_ie() {
        String platform = "MAC";
        String browser = "IE";

        String banner = new BannerRender().renderBanner(platform, browser);

        assertEquals( "IE on Mac?", banner);
    }

    @Test
    public void should_return_banner_when_platform_is_windoze_and_browser_is_ie() {
        String platform = "windoze";
        String browser = "IE";

        String banner = new BannerRender().renderBanner(platform, browser);

        assertEquals( "banner", banner);
    }

    @Test
    public void should_return_banner_when_platform_is_Mac_and_browser_is_chrome() {
        String platform = "MAC";
        String browser = "chrome";

        String banner = new BannerRender().renderBanner(platform, browser);

        assertEquals( "banner", banner);
    }

    @Test
    public void should_return_banner_when_platform_is_windoze_and_browser_is_chrome() {
        String platform = "windoze";
        String browser = "chrome";

        String banner = new BannerRender().renderBanner(platform, browser);

        assertEquals( "banner", banner);
    }
}
