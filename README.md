# 🕸️ WebKot

A Kotlin-based wrapper for Selenium WebDriver, designed for simplicity, reliability, and developer happiness.

WebKot streamlines the WebDriver experience by wrapping common Selenium tasks in a clear, idiomatic Kotlin API. Ideal
for UI testing, automation, and scraping — without boilerplate.

## 🚀 Features

✅ Easy browser launch with sensible defaults

✅ Element interaction using XPath

✅ Built-in explicit waits (visibility, clickability)

✅ Clean, readable API for click, type, waitAndClick, etc.

✅ Safe browser shutdown

✅ Logging for all major actions

### 📦 Installation

WebKot is under development — publishing instructions will go here when available. For now, use it as a local module or
import the source directly.

### 🔧 Supported Browsers

* Chrome
* Chromium
* Edge
* Firefox
* IE
* Opera
* Safari

### ✨ Getting Started

1. Create a WebKot instance

   `val webkot = WebKot(Browsers.CHROME)`
2. Open a URL

   `webkot.open("https://example.com")`
3. Interact with elements

   `webkot.waitAndClick("//button[@id='login']")
   webkot.waitAndType("//input[@name='username']", "my_username")
   webkot.type("//input[@name='password']", "my_password")
   webkot.click("//button[@type='submit']")`
4. Close the browser
   
   `webkot.quitSafely()`

### 🤝 Contributing
Contributions, ideas, and feedback are welcome!

Feel free to fork, open issues, or submit PRs.