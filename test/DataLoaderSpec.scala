package dolldelivery

import scala.io.Source
import org.specs2._

object FileLoaderSpec extends mutable.Specification {
  "FileLoader" should {
    val validator = new Validator(MapSyntax)
    val extractor = new Extractor(validator)
    val loader = new FileLoader(extractor)
    val dataFiles = Seq(
      "public/test_data_1.txt",
      "public/test_data_2.csv"
    )
    
    "checking for lines of file ot output" in {
        val mapdetailTest = mapdetail.teststatus
        mapdetailTest must equalTo(1)
    }
    
    "load all the edges from a file" in {
      val (_, _, edges) = loader.load(dataFiles(0))
      edges.length must be equalTo(23)
    }

    "load the correct start/end vertices" in {
      val (start, end, _) = loader.load(dataFiles(0))
      start must be equalTo("Kruthika's abode")
      end must be equalTo("Craig's haunt")
    }
  }
}
