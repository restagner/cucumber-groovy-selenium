## 1.4.1
* bumped version of junit to 4.13.1

## 1.4.0
* bumped version of cucumber to 1.2.5
* replaced use of FirefoxDriver with ChromeDriver
* included instructions on setting up ChromeDriver

## 1.3.0
* bumped versions of the following
    * groovy to 2.4.7
    * selenium to 2.53.0
    * the upgrade to Selenium required implementing `beforeNavigateRefresh()` and `afterNavigateRefresh()` in the MyWebDriverEventListener.  It appears that the API for `WebDriverEventListener` has changed.

## 1.2.0
* bumped versions of the following
    * groovy to 2.4.4
    * selenium to 2.47.1
    * cucumber to 1.2.4
    * gmavenPlus to 1.5

## 1.1.0
* added HISTORY.md file
* bumped version of groovy to 2.4.1
* bumped version of selenium to 2.44.0
* bumped version of cucumber to 1.2.2
* configured cucumber options to also use the junit formatter
* removed the `.cucumber` directory -- this is no longer supported in the latest version of cucumber
* switched selenium over to use the `HtmlUnit` driver


## 1.0.0
* initial release
