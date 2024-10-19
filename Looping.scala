object Looping{
    def main(args : Array[String]):Unit = {
        // while loop
        
        println("Enter number of times 'Hello' get print : ")
        var occur : Int = scala.io.StdIn.readInt();

        while(occur > 0){
            println("Hello")
            occur = occur-1;
            // occur -=1;
        } 


        // do while loop

        var occur2 : Int = scala.io.StdIn.readInt()

        do{
            println(s"value is : ${occur2}")
            occur2 -=1;
        }while(occur2 > 0)
    }
}