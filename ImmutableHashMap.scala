import scala.collection.immutable.HashMap

object Immut_HashMap{
    def main(args : Array[String]): Unit = {
        val immMap = HashMap("apple" -> 3 , "banana" -> 5)

        val upd_map = immMap + ("orange" -> 6)

        
    }
}