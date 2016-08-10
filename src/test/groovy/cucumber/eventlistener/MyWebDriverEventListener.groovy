package cucumber.eventlistener

import groovy.util.logging.Slf4j
import org.openqa.selenium.By
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import org.openqa.selenium.support.events.WebDriverEventListener

@Slf4j
class MyWebDriverEventListener implements WebDriverEventListener {
    @Override
    void beforeNavigateTo(String s, WebDriver webDriver) {
        log.info("Navigating to '{}'", s)
    }

    @Override
    void afterNavigateTo(String s, WebDriver webDriver) {

    }

    @Override
    void beforeNavigateBack(WebDriver webDriver) {

    }

    @Override
    void afterNavigateBack(WebDriver webDriver) {
        log.info("Navigated back to '{}'", webDriver.currentUrl)
    }

    @Override
    void beforeNavigateForward(WebDriver webDriver) {

    }

    @Override
    void afterNavigateForward(WebDriver webDriver) {
        log.info("Navigated forward to '{}'", webDriver.currentUrl)
    }

    void beforeNavigateRefresh(WebDriver webDriver) {

    }

    void afterNavigateRefresh(WebDriver webDriver) {

    }

    @Override
    void beforeFindBy(By by, WebElement webElement, WebDriver webDriver) {
        if (webElement != null) {
            log.info("Attempting to locate element by '{}'", by)
        }
    }

    @Override
    void afterFindBy(By by, WebElement webElement, WebDriver webDriver) {
        if (webElement == null) {
            log.debug("Element could not be found by '{}'", by)
        } else {
            log.info("Found web element = '{}' by '{}'", webElement, by)
        }
    }

    @Override
    void beforeClickOn(WebElement webElement, WebDriver webDriver) {

    }

    @Override
    void afterClickOn(WebElement webElement, WebDriver webDriver) {
        log.info("Clicked on web element = '{}'", webElement)
    }

    @Override
    void beforeChangeValueOf(WebElement webElement, WebDriver webDriver) {
        def valueBeforeChange = webElement.getAttribute('value')
        if (!valueBeforeChange.isEmpty()) {
            log.info("Original value is '{}'", valueBeforeChange)
        }
    }

    @Override
    void afterChangeValueOf(WebElement webElement, WebDriver webDriver) {
        def valueAfterChange = webElement.getAttribute('value')
        if (!valueAfterChange.isEmpty()) {
            log.info("Value has been changed to '{}' for web element = '{}'", valueAfterChange, webElement)
        }
    }

    @Override
    void beforeScript(String script, WebDriver webDriver) {
        log.info("Attempting to execute script: {}", script.trim().replaceAll(/\s/, ' '))
    }

    @Override
    void afterScript(String script, WebDriver webDriver) {
    }

    @Override
    void onException(Throwable throwable, WebDriver webDriver) {

    }
}
