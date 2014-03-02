package cucumber.helpers

import cucumber.pages.GoogleHomePage
import org.openqa.selenium.By
import org.openqa.selenium.WebDriver


class MyDSL {
    def name
    WebDriver driver
    private GoogleHomePage googleHomePage

    MyDSL(WebDriver webDriver) {
        name = 'My DSL class'
        driver = webDriver
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
}
