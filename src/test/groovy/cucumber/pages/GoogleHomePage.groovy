package cucumber.pages

import cucumber.helpers.TestEnvironment
import org.openqa.selenium.By
import org.openqa.selenium.WebDriver


class GoogleHomePage extends BasePage {

    GoogleHomePage(WebDriver webDriver) {
        super(webDriver)
    }

    GoogleHomePage navigateToHomePage() {
        driver.get('http://www.google.com')
        return this
    }

    GoogleHomePage enterKeyword(String keyword) {
        driver.findElement(By.name('q')).sendKeys(keyword)
        return this
    }

    @SuppressWarnings("GrMethodMayBeStatic")
    void methodThatAcceptsTestEnvironment(TestEnvironment testEnvironment) {
        println "${testEnvironment.class.simpleName}"
    }
}
