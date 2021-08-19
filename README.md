A project that shows _one way_ of combining the following: [Cucumber-JVM](https://github.com/cucumber/cucumber-jvm), [Groovy](http://groovy.codehaus.org/) and [Selenium](http://docs.seleniumhq.org/).

To run the tests, simply type <code>mvn clean verify</code> from the command-line. You may also run the tests, by executing the <code>RunCucumberITCase</code> file from within an IDE (like IntelliJ IDEA)

### Setup ChromeDriver

1. download a copy of [ChromeDriver](https://sites.google.com/a/chromium.org/chromedriver/downloads)
2. create a directory on your file system. For example, on Mac `/Users/<user name>/chromedriver`. On Windows `C:/Users/<user name>/chromedriver`
3. copy the `.zip` file downloaded in step 1 into the directory created in step 2
4. unzip the file
5. add the directory created in step 2 to your `PATH` environment variable
