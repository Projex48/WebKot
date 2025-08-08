package io.github.projex48.webkot.utils

import org.openqa.selenium.By

/**
 * Util functions for convenience
 */
object WebKotUtils {
    /**
     * Converts a String to a Selenium XPath
     */
    fun String.toXPath(): By = By.xpath(this)
}