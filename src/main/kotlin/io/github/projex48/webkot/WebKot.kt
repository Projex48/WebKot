package io.github.projex48.webkot

import io.github.projex48.webkot.actions.ElementActions
import io.github.projex48.webkot.config.WebKotConfig
import io.github.projex48.webkot.wait.WaitUtils
import io.github.projex48.webkot.utils.WebKotUtils.toXPath
import org.openqa.selenium.By
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement

/**
 * A Kotlin-based web automation library based on Selenium
 */
class WebKot(
    private val browser: Browsers
) {
    private val driver: WebDriver = WebDriverFactory.createDriver(browser)
    val webDriver: WebDriver get() = driver

    /**
     * Opens the browser to a specified URL
     * @param url The url to the website to open
     */
    fun open(url: String) {
        println("Opening URL: $url")
        driver.get(url)
    }

    /**
     * Gets an element from the DOM
     * @param xpath The xpath of an element in the DOM
     * @return A WebElement reference to the DOM element
     */
    fun getElement(xpath: String) : WebElement {
        println("Getting element at xpath: $xpath")
        return driver.findElement(xpath.toXPath())
    }

    /**
     * Waits until an element is visible
     * @param xpath The xpath of an element in the DOM
     * @param timeOutInSeconds The maximum time in seconds to wait, throws an error after.
     * @return A WebElement reference to the DOM element
     */
    fun waitUntilVisible(xpath: String, timeOutInSeconds: Long = WebKotConfig.defaultTimeout): WebElement {
        println("Waiting for element at xpath: $xpath")
        return WaitUtils.waitUntilVisible(driver, xpath.toXPath(), timeOutInSeconds)
    }

    /**
     * Waits until an element is clickable
     * @param xpath The xpath of an element in the DOM
     * @param timeOutInSeconds The maximum time in seconds to wait, throws an error after.
     * @return A WebElement reference to the DOM element
     */
    fun waitUntilClickable(xpath: String, timeOutInSeconds: Long = WebKotConfig.defaultTimeout): WebElement {
        println("Waiting for element to be clickable at xpath: $xpath")
        return WaitUtils.waitUntilClickable(driver, xpath.toXPath(), timeOutInSeconds)
    }

    /**
     * Clicks on an element
     * @param xpath The xpath of an element in the DOM
     */
    fun click(xpath: String) {
        println("Clicking on element at xpath: $xpath")
        ElementActions.click(driver, xpath.toXPath())
    }

    /**
     * Waits for an element to be clickable, then clicks it
     * @param xpath The xpath of an element in the DOM
     * @param timeOutInSeconds The maximum time in seconds to wait, throws an error after.
     */
    fun waitAndClick(xpath: String, timeOutInSeconds: Long = WebKotConfig.defaultTimeout) {
        println("Waiting to click element at xpath: $xpath")
        ElementActions.waitAndClick(driver, xpath.toXPath(), timeOutInSeconds)
    }

    /**
     * Enters text into the element
     * @param xpath The xpath of an element in the DOM
     * @param text The text to enter into the element
     */
    fun type(xpath: String, text: String) {
        println("Typing '$text' into element at xpath: $xpath")
        ElementActions.type(driver, xpath.toXPath(), text)
    }

    /**
     * Waits for an element to be visible, then enters text into it
     * @param xpath The xpath of an element in the DOM
     * @param text The text to enter into the element
     * @param timeOutInSeconds The maximum time in seconds to wait, throws an error after.
     */
    fun waitAndType(xpath: String, text: String, timeOutInSeconds: Long = WebKotConfig.defaultTimeout) {
        println("Waiting to type '$text' into element at xpath: $xpath")
        ElementActions.waitAndType(driver, xpath.toXPath(), text, timeOutInSeconds)
    }

    /**
     * Closes the browser
     */
    fun quit() {
        println("Closing browser")
        driver.quit()
    }

    /**
     * Closes the browser safely
     */
    fun quitSafely() {
        try {
            println("Closing browser safely")
            driver.quit()
        } catch (e: Exception) {
            println("Failed to quit the driver: ${e.message}")
        }
    }
}


