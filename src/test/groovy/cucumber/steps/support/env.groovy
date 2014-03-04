package cucumber.steps.support

import cucumber.api.groovy.Hooks
import cucumber.helpers.MyDSL
import cucumber.runtime.ScenarioImpl
import org.openqa.selenium.WebDriver

this.metaClass.mixin(Hooks)

class CustomWorld {
    final WebDriver driver
    final TestEnvironment testEnvironment
    final MyDSL myDSL

    CustomWorld() {
        testEnvironment = new TestEnvironment()
        driver = testEnvironment.loadEnvironment()
        myDSL = new MyDSL(testEnvironment)
    }

}

World {
    new CustomWorld()
}

Before() {
    println "BEFORE hook called"
    println "WEB DRIVER SELECTED: ${driver.class.simpleName}"
}

After() { ScenarioImpl scenario ->
    try {
        println "AFTER hook called"
        println "STEP STATUS: ${scenario.status}\n\n\n"
    } finally {
        driver.quit()
    }

}


