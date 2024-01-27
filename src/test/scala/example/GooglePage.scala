package example

import org.openqa.selenium.By
import com.codeborne.selenide.Selenide.$
import com.codeborne.selenide.Selenide.page

class GooglePage {
  def searchFor(text: String): Unit = {
    $(By.name("q")).`val`(text).pressEnter()
  }
}
