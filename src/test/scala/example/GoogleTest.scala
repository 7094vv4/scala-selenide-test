package example

import com.codeborne.selenide.CollectionCondition.sizeGreaterThan
import com.codeborne.selenide.Condition.text
import com.codeborne.selenide.Selenide.open

class GoogleTest extends munit.FunSuite {
  test("user can search") {
    open("https://duckduckgo.com")
    new GooglePage().searchFor("selenide java")

    val results: SearchResultsPage = new SearchResultsPage()
    results.getResults().shouldHave(sizeGreaterThan(1))
    results.getResult(0).shouldHave(text("Selenide: concise UI tests in Java"))
  }
}
