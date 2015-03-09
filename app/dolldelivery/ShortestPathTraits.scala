package dolldelivery

trait ShortestPathAlgorithm {
  def findShortestPath(start: String, end: String): (Int, Seq[String])
}
