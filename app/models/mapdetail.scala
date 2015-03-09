package dolldelivery

import scala.io.Source

case class mapdetail(maptext: String)

object mapdetail {
	val teststatus: Int = 1
	def load(filename: String) = {
    	val sourcefile = Source.fromFile(filename)
    	val lines = sourcefile.mkString

	}
}