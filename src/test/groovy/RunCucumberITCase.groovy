import cucumber.api.junit.Cucumber
import cucumber.api.CucumberOptions
import org.junit.runner.RunWith

@RunWith(Cucumber.class)
@CucumberOptions (
        format = ["pretty", "junit:target/cucumber.xml"]
        , monochrome = true
        , features = ["classpath:features"]
        , glue = ["src/test/groovy/cucumber/steps"]
        , tags = ["~@manual"]
)
class RunCucumberITCase {
}
