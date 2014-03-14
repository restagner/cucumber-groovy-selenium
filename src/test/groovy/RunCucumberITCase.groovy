import cucumber.api.junit.Cucumber
import org.junit.runner.RunWith

@RunWith(Cucumber.class)
@Cucumber.Options(
        format = ["pretty"]
        , monochrome = true
        , features = ["classpath:features"]
        , glue = ["src/test/groovy/cucumber/steps"]
        , tags = ["~@manual"]
        , dotcumber = ".cucumber"
)
class RunCucumberITCase {
}
