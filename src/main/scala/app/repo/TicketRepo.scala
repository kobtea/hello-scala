package app.repo

import app.model.TicketStatus._
import app.model._

object TicketRepo {
  private var map: Map[Long, Ticket] = Map(
    1L -> Issue(1L, "ひとつめのいしゅ"),
    2L -> Issue(2L, "ふたつめのいしゅ", Fixed),
    3L -> Bug(3L, "ひとつめのばぐ", description = "かたこりがはげしい"),
    4L -> Bug(4L, "ふたつめのばぐ", Fixed, "さんれんきゅうがたいふう")
  )

}
