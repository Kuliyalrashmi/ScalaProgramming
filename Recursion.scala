import scala.annotation.tailrec
object Recursion{
    def fact(value : Int) : Int = {
        if(value == 1) 1

        else value * fact(value-1)
    }

    def gcd(x : Int , y : Int) : Int ={
        if(y == 0) x
        else gcd(y , x % y)
    } 



    // tail recursive function 
    def factorial2(value : Int) : Int = {

        @tailrec def fast_factorial(value : Int, occur : Int): Int = {
            if(occur <= 1) value
            else fast_factorial(value * occur , occur-1);
        }

        fast_factorial(1, value)
    }

    def main(args : Array[String]) : Unit = {
        println(fact(3))

        println(gcd(14,18))

        println(factorial2(3))
    } 


}