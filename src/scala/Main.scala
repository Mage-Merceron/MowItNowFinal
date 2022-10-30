object Main extends App {

  val mowerExecute = new ReadInstructions
  val initialPosition = mowerExecute.coordinatesMower

  val instructions = mowerExecute.command
  var countMower = 1

  for ((i, j) <- initialPosition zip instructions) {
    println(s"\nMower number $countMower :")
    new Mower(i.split(" ").head.toInt, i.split(" ").tail.head.toInt, i.split(" ").last, j.split("").toList)
    countMower += 1
  }
}
