package models

import play.api.libs.json.Json

case class mapdetail(maptext: String)

object mapdetail {
	implicit val mapdetailFormat = Json.format[mapdetail]
}