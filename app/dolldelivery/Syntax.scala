package dolldelivery

object MapSyntax extends DataSyntax {
  // Map edge lines look like
  // Map("startLocation" -> "<alphanumeric>", "endLocation" -> "<alphanumeric", "destination" -> <digits>)
  // All the cruft is just allowing for whitespace
  val edgeRegex = """Map\("startLocation"\s*->\s*"(.*)"\s*,\s*"endLocation"\s*->\s*"(.*)"\s*,\s*"distance"\s*->\s*(\d+)\),?"""
  val startVertexRegex = """startingLocation:\s*"(.+)""""
  val endVertexRegex = """targetLocation:\s*"(.+)""""
}

object CsvSyntax extends DataSyntax {
  // We'll take csv in the form of v1, v2, distance
  val edgeRegex = """^s*(.*)\s*,\s*(.*)\s*,\s*(\d+)"""
  val startVertexRegex = """startingLocation:\s*(.+)"""
  val endVertexRegex = """targetLocation:\s*(.+)"""
}
