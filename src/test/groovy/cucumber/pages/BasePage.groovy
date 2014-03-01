package cucumber.pages

import org.openqa.selenium.By
import org.openqa.selenium.WebDriver
import org.openqa.selenium.support.ui.ExpectedConditions
import org.openqa.selenium.support.ui.WebDriverWait


class BasePage {
    final WebDriver driver

    BasePage(WebDriver webDriver) {
        driver = webDriver
    }

    String getPageTitle() {
        WebDriverWait wait = new WebDriverWait(driver, 10)
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText('Images')))

        return driver.getTitle()
    }

}
