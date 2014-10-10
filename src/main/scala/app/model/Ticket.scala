package app.model

// MEMO: `sealed`をつけると`Ticket`をmixinできるのはこのファイル内だけ
sealed trait Ticket {
  val id: Long
  val title: String
  val status: TicketStatus
}

case class Issue(id: Long,
                 title: String,
                 status: TicketStatus = TicketStatus.Open) extends Ticket

case class Bug(// MEMO: デフォルトだとpublicなvalになる
               id: Long,
               title: String,
               status: TicketStatus = TicketStatus.Open,
               // MEMO: private val hoge: String, みたいな書き方もできる
               description: String) extends Ticket
