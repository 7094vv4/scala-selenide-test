package hotel

sealed trait Rank {
  val value: String
}
case object プレミアム会員 extends Rank {
  val value = "premium"
}
case object 一般会員 extends Rank {
  val value = "normal"
}
