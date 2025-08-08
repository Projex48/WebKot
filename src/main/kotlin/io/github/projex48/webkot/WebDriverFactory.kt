package io.github.projex48.webkot

import io.github.bonigarcia.wdm.WebDriverManager
import org.openqa.selenium.WebDriver

object WebDriverFactory {
    fun createDriver(browser: Browsers): WebDriver {
        return when (browser) {
            Browsers.CHROME -> WebDriverManager.chromedriver().create()
            Browsers.CHROMIUM -> WebDriverManager.chromiumdriver().create()
            Browsers.EDGE -> WebDriverManager.edgedriver().create()
            Browsers.FIREFOX -> WebDriverManager.firefoxdriver().create()
            Browsers.IE -> WebDriverManager.iedriver().create()
            Browsers.OPERA -> WebDriverManager.operadriver().create()
            Browsers.SAFARI -> WebDriverManager.safaridriver().create()
        }
    }
}
