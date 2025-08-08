package io.github.projex48.webkot.wait

import org.openqa.selenium.By
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import org.openqa.selenium.support.ui.ExpectedConditions
import org.openqa.selenium.support.ui.WebDriverWait
import java.time.Duration

object WaitUtils {
    /**
     * Waits for an element to be visible
     * @param xpath The xpath of an element in the DOM
     * @param timeOutInSeconds The max time to wait for an element before throwing an error
     */
    fun waitUntilVisible(driver: WebDriver, by: By, timeOutInSeconds: Long): WebElement {
        val wait = WebDriverWait(driver, timeOutInSeconds)
        return wait.until(ExpectedConditions.visibilityOfElementLocated(by))
    }

    fun waitUntilClickable(driver: WebDriver, by: By, timeOutInSeconds: Long): WebElement {
        val wait = WebDriverWait(driver, timeOutInSeconds)
        return wait.until(ExpectedConditions.elementToBeClickable(by))
    }
}