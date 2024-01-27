package example

import com.codeborne.selenide.ElementsCollection
import com.codeborne.selenide.SelenideElement
import com.codeborne.selenide.Selenide.$
import com.codeborne.selenide.Selenide.$$

class SearchResultsPage {
  def getResults(): ElementsCollection = {
    $$("[data-testid=\"result\"]")
  }
  def getResult(index: Int): SelenideElement = {
    $("#r1-" + index)
  }
}
