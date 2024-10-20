object CurryingFunction{
    def add(x : Int , y : Int) =  x+y;


    def add2(x : Int) = (y : Int) => x+y;


    def main(args : Array[String]) : Unit = {
        println("Enter Two numbers  : ")
        val input1 : Int = scala.io.StdIn.readLine().toInt
        val input2 : Int = scala.io.StdIn.readLine().toInt

        println("Add : " +add(input1, input2))


        var sum = add2(3)
        var result = add2(3)(4);

        println("Add : " + sum(4))
        println("Add : " + result)
    }
}