//  futures provide a way to handle asynchronous computations without blocking the main thread.

// A Future represents a value that might not be available yet but will be at some point in the future. For example, imagine you request data from a website. You won't get the result immediately, but when the data is ready, the future will hold that value.



import scala.concurrent.Future
import scala.concurrent.ExecutionContext.Implicits.global
import scala.util.{Success, Failure}

object FuturesExample{

    def greet(): Future[String] = Future {
        Thread.sleep(2000) 
        "Hello, Future!"
    }

    def get_len(mssg : String) : Future[Int] = Future{
        Thread.sleep(1000)
        mssg.length
    }




    def main(args : Array[String]) : Unit = {
        val res = for {
            greet_msg <- greet()
            len <- get_len(greet_msg)
        } yield len


        res.onComplete{
            case Success(len) => println(s"length of string : $len")
            case Failure(exception) => print(s"went Wrong!! : $exception")
        }

        Thread.sleep(4000)
    }
}