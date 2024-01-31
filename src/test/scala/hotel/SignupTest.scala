package hotel

import com.codeborne.selenide.Selenide._
import hotel.pages.SignupPage
import hotel.pages.TopPage

import java.time.LocalDate

class SignupTest extends munit.FunSuite {
  override def afterEach(context: AfterEach): Unit = clearBrowserCookies()

  test("ユーザの新規登録ができること") {
    val topPage: TopPage = open("/ja/", classOf[TopPage])

    val signupPage: SignupPage = topPage.goToSignupPage()
    signupPage.setEmail("new-user@example.com")
    signupPage.setPassword("password")
    signupPage.setPasswordConfirmation("password")
    signupPage.setUserName("新規ユーザ1")
    signupPage.setRank(一般会員)
    signupPage.setAddress("神奈川県横浜市港区")
    signupPage.setTel("01234567891")
    signupPage.setGender("女性")
    signupPage.setBirthday(LocalDate.parse("2000-01-01"))
    signupPage.setNotification(true)
    signupPage.submit()
  }
}
