import scala.io.Source

/**
 * This class allows to read and store in variables the instructions provided by the file contained in the Resources.
 */

class ReadInstructions { //constructor
  //Import the file
  val resources: List[String] = Source.fromResource("Instructions").getLines().toList

  //Coordinates of the lawn
  val widthRectangle: Int = resources.head.split(" ").head.toInt
  val heightRectangle: Int = resources.head.split(" ").last.toInt

  //command
  var coordinatesMower: List[String] = resources.filter(_.length == 5)
  val command: List[String] = resources.filter(_.length > 5)
}
