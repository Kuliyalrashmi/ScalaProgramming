object PatternMatching{

    def main(args : Array[String]) : Unit = {
        println("Welcome to Scala Pattern Matching")
        println("press 1 for Greet .")
        println("press 2 for Question .")
        println("press anything else ..")

        val input : Int  = scala.io.StdIn.readLine().toInt

        println(helper(input));  
    }
    
    def helper(input : Int) : String  = input match {
        case 1 => "Hello Rash, this is little similar to switch in cpp right.."
        case 2 => "What your are thinking right now !!. (learning is fun)"
        case _ => "Going to sleep. Byee!!"
    }
}