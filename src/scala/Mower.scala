/**
 * This class allows you to create the mower that will execute the commands provided by the initial file.
 * @param coordinateX coordinate on the x-axis
 * @param coordinateY coordinate on the y-axis
 * @param orientation orientation of the mower
 * @param commandMower list of commands to be executed by the mower
 */

class Mower(var coordinateX: Int, var coordinateY: Int, var orientation: String, val commandMower: List[String]) extends ReadInstructions {

  def initialization(): Unit = {
    println(s"The initial position of the mower is ($coordinateX, $coordinateY, $orientation)\n")
    println("Unit test :")

    /** allows you to know the initial coordinates of the mower */
  }

  def moveToLeft(): Unit = {
    orientation match {
      case "N" => orientation = "W"
      case "W" => orientation = "S"
      case "S" => orientation = "E"
      case "E" => orientation = "N"
    }
    println (s"moveToLeft : $orientation")

    /** allows the mower to be turned to the left */
  }

  def moveToRight(): Unit = {
    orientation match {
      case "N" => orientation = "E"
      case "E" => orientation = "S"
      case "S" => orientation = "W"
      case "W" => orientation = "N"
    }
    println(s"moveToRight : $orientation")

    /** allows the mower to be turned to the right */
  }

  def moveForward(orientation: String): Unit = {
    if ("N" == orientation & coordinateY < widthRectangle) coordinateY += 1
    if ("W" == orientation & coordinateX > 0) coordinateX -= 1
    if ("S" == orientation & coordinateY > 0) coordinateY -= 1
    if ("E" == orientation & coordinateX < heightRectangle) coordinateX += 1
    println(s"moveForward ($coordinateX, $coordinateY, $orientation)")

    /** allows the mower to move forward one square while respecting the limitations of the lawn */
  }

  def commandExecute(): Unit = {
    for (i <- commandMower) {
      if (i == "A") this.moveForward(orientation)
      if (i == "D") this.moveToRight()
      if (i == "G") this.moveToLeft()
    }
    /** depending on the command list, allows the mower to move forward, turn left or right */
  }

  def finalPosition(): Unit = {
    println("End of unit test.\n")
    println(s"The final position of the mower is ($coordinateX, $coordinateY, $orientation)")

    /** allows you to know the final coordinates of the mower */
  }

  this.initialization()
  this.commandExecute()
  this.finalPosition()

}