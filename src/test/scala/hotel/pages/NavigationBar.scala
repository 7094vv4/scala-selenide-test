package hotel.pages

import com.codeborne.selenide.Selectors._
import com.codeborne.selenide.Selenide._

trait NavigationBar {
  def goToLoginPage(): LoginPage = {
    $(byLinkText("ログイン")).click()
    page(classOf[LoginPage])
  }

  def goToSignupPage(): SignupPage = {
    $(byLinkText("会員登録")).click()
    page(classOf[SignupPage])
  }

  def goToPlansPage(): PlansPage = {
    $(byLinkText("宿泊予約")).click()
    page(classOf[PlansPage])
  }
}
