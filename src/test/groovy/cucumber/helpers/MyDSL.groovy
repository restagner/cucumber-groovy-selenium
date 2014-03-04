package cucumber.helpers

import cucumber.pages.GoogleHomePage
import cucumber.steps.support.TestEnvironment
import org.openqa.selenium.By
import org.openqa.selenium.WebDriver


class MyDSL {
    final TestEnvironment testEnvironment
    final WebDriver driver
    private GoogleHomePage googleHomePage

    MyDSL(TestEnvironment tstEnv) {
        testEnvironment = tstEnv
        driver = testEnvironment.driver
        googleHomePage = new GoogleHomePage(driver)
    }

    void onGoogleHomePage() {
        googleHomePage.navigateToHomePage()
    }

    void enterKeyword(String keyword) {
        googleHomePage.enterKeyword(keyword)
    }

    void clickSubmitButton() {
        driver.findElement(By.name('q')).submit()
    }

    String getThePageTitle() {
        googleHomePage.getPageTitle()
    }

    void exampleUseOfTestEnvironmentInMethod() {
        googleHomePage.methodThatAcceptsTestEnvironment(testEnvironment)
    }
}
