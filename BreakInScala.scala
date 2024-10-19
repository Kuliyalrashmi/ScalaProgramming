import scala.util.control.Breaks._

object BreakExample{
    def main(args : Array[String]):Unit ={
        println("Enter Upper Limit : ")
        var x : Int = scala.io.StdIn.readLine().toInt

        breakable{
            for(value <- 0 to 100){
                if( value > x){
                    break()
                }
                else{
                    print(value + " ")
                }
            }
        }

    }
}