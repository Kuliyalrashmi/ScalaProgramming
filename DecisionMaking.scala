object DecisionMaking{
    def main(args : Array[String]) : Unit ={
        println("Enter Any Number : ")
        val input : Int = scala.io.StdIn.readLine().toInt

        if(input > 10){
            println("greater than 10")
        }
        else if(input == 10){
            println("Equals 10")
        }
        else{
            println("greater 10")
        }
    }
}