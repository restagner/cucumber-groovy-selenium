package cucumber.environment

import cucumber.eventlistener.MyWebDriverEventListener
import cucumber.helpers.User
import org.openqa.selenium.WebDriver
import org.openqa.selenium.firefox.FirefoxDriver
import org.openqa.selenium.support.events.EventFiringWebDriver


class TestEnvironment {
    WebDriver driver

    TestEnvironment() {}

    WebDriver loadEnvironment() {
        readCommandLineArguments()
        loadConfiguration()
        return loadSelenium()
    }

    private void readCommandLineArguments() {
        // read from command line
    }

    @SuppressWarnings("GrMethodMayBeStatic")
    private void loadConfiguration() {
        def testDataConfigFile = 'src/test/resources/config/testdata.config.groovy'
        ConfigObject conf = new ConfigSlurper().parse(new File(testDataConfigFile).toURI().toURL())
        Map config = conf.flatten()

        println "--------- Test data read from $testDataConfigFile\n\n"
        User cheryl = config.get('testdata.users.cheryl') as User
        println "\t\tCheryl's Hub Id  = ${cheryl.hubId}"
        println "\t\tCheryl's Entitlements = ${cheryl.entitlements}\n"

        User patrick = config.get('testdata.users.patrick') as User
        println "\t\tPatrick's Hub Id = ${patrick.hubId}"
        println "\t\tPatricks's Entitlements = ${patrick.entitlements}\n"

        User jack = config.get('testdata.users.jack') as User
        jack.hubId = 'SCALJ'
        jack.password = 'jack'
        println "\t\tJack's Hub Id    = ${jack.hubId}"
        println "\t\tJacks's Entitlements = ${jack.entitlements}\n"
        println "--------------------------------------------------------------------------\n"
    }

    @SuppressWarnings("GrMethodMayBeStatic")
    private WebDriver loadSelenium() {
        driver = new EventFiringWebDriver(new FirefoxDriver()).register(new MyWebDriverEventListener())
        return driver
    }
}
