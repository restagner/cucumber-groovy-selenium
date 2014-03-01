package cucumber.steps.support

import cucumber.api.groovy.Hooks
import cucumber.helpers.MyDSL
import cucumber.runtime.ScenarioImpl
import org.openqa.selenium.WebDriver
import org.openqa.selenium.firefox.FirefoxDriver

this.metaClass.mixin(Hooks)

class CustomWorld {
    WebDriver driver
    MyDSL myDSL

    CustomWorld() {
        driver = new FirefoxDriver()
        myDSL = new MyDSL(driver)
    }
}

World {
    new CustomWorld()
}

Before() {
    println "BEFORE hook called"
    println "WEB DRIVER OBJECT: $driver"
}

After() { ScenarioImpl scenario ->
    try {
        println "AFTER hook called"
        println "STEP STATUS: ${scenario.status}\n\n\n"
    } finally {
        driver.quit()
    }

}


