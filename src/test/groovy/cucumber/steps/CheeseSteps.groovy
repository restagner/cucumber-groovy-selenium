package cucumber.steps

import cucumber.api.PendingException
import cucumber.helpers.MyDSL

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

Given(~/^I have something$/) { ->

}

When(~/^I act on it$/) { ->

}

Then(~/^I should see something else$/) { ->
    def message = "The scenario has not been executed due to defect = DE12345"
    MyDSL.logWarnMessage(message)
    throw new PendingException(message)
}