package io.github.projex48.webkot.actions

import io.github.projex48.webkot.config.WebKotConfig
import io.github.projex48.webkot.wait.WaitUtils.waitUntilClickable
import io.github.projex48.webkot.wait.WaitUtils.waitUntilVisible
import org.openqa.selenium.By
import org.openqa.selenium.WebDriver

object ElementActions {
    fun click(driver: WebDriver, by: By) {
        driver.findElement(by).click()
    }

    fun type(driver: WebDriver, by: By, text: String) {
        driver.findElement(by).sendKeys(text)
    }

    fun waitAndClick(driver: WebDriver, by: By, timeOutInSeconds: Long) {
        waitUntilClickable(driver, by, timeOutInSeconds).click()
    }

    fun waitAndType(driver: WebDriver, by: By, text: String, timeOutInSeconds: Long) {
        waitUntilVisible(driver, by, timeOutInSeconds).sendKeys(text)
    }
}