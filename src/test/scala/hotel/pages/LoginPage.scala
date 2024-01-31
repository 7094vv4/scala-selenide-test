package hotel.pages

import com.codeborne.selenide.Selenide._
import com.codeborne.selenide.SelenideElement

class LoginPage extends NavigationBar {
  def getEmailMessage(): SelenideElement = $("#email-message")
}
