package hotel.pages

import com.codeborne.selenide.Condition._
import com.codeborne.selenide.Selenide._

class TopPage extends NavigationBar {
  $("h2").shouldHave(exactText("このサイトはテスト自動化の学習用の練習サイトです。"))
}
