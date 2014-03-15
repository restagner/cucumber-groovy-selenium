package cucumber.steps

import cucumber.api.PendingException
import static cucumber.api.groovy.EN.*

Given(~'^I am on Google home page$') { ->
    println "\n\tInside step 'I am on Google home page'"
    myDSL.onGoogleHomePage()
    myDSL.exampleUseOfTestEnvironmentInMethod()
}

When(~'^I enter the keyword of "([^"]*)"$') { String keyword ->
    myDSL.enterKeyword(keyword)
}

When(~'^click the Submit button$') { ->
    myDSL.clickSubmitButton()
}

Then(~'^the page title returned is "([^"]*)"$') { String expectedPageTitle ->
    def actualPageTitle = myDSL.getThePageTitle()
    assert expectedPageTitle == actualPageTitle : "The expected page title, '$expectedPageTitle', does not match the actual,'$actualPageTitle'"
}