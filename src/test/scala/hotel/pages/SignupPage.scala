package hotel.pages

import com.codeborne.selenide.Condition._
import com.codeborne.selenide.Selectors._
import com.codeborne.selenide.Selenide._
import hotel.Rank

import java.time.LocalDate

class SignupPage extends NavigationBar {
  $("h2").shouldHave(exactText("会員登録"))

  def setEmail(email: String): Unit = $("#email").setValue(email)
  def setPassword(password: String): Unit = $("#password").setValue(password)
  def setPasswordConfirmation(password: String): Unit =
    $("#password-confirmation").setValue(password)
  def setUserName(username: String): Unit = $("#username").setValue(username)
  def setRank(rank: Rank): Unit = $(byName("rank")).selectRadio(rank.value)
  def setAddress(address: String): Unit = $("#address").setValue(address)
  def setTel(tel: String): Unit = $("#tel").setValue(tel)
  def setGender(gender: String): Unit = $("#gender").selectOption(gender)
  def setBirthday(birthday: LocalDate): Unit = {
    val input = Option(birthday) match {
      case Some(value) => value.toString()
      case None        => ""
    }
    executeJavaScript(
      "arguments[0].value = arguments[1]",
      $("#birthday"),
      input
    )
  }
  def setNotification(checked: Boolean): Unit =
    $("#notification").setSelected(checked)
  def submit(): MyPage = {
    $("#signup-form > button").click()
    page(classOf[MyPage])
  }
}
