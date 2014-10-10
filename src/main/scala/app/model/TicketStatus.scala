package app.model

// MEMO: classで定義すれば型として扱える
sealed class TicketStatus

// MEMO: objectだけでは型として扱えない
object TicketStatus {
  case object Open extends TicketStatus
  case object Fixed extends TicketStatus
}
