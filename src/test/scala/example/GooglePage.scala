package example

import com.codeborne.selenide.Selenide.$
import org.openqa.selenium.By

class GooglePage {
  def searchFor(text: String): Unit = {
    $(By.name("q")).`val`(text).pressEnter()
  }
}
