package hotel.pages

import com.codeborne.selenide.Condition._
import com.codeborne.selenide.Selenide._

class MyPage {
  $("h2").shouldHave(exactText("マイページ"))
}
