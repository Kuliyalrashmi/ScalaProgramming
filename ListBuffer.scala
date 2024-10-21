// ListBuffer used when we know that list is continuously changing 
// it effeciently append and prepend elements

import scala.collection.mutable.ListBuffer

object ListBuffer{
    def main(args:  Array[String]) : Unit = {
        // initialize empty list buffer
        var list_buff = new ListBuffer[String]()

        // adding elements
        list_buff += "working"

        //  adding multiple elements
        list_buff += ("on" , "scala" , "listbuffer")


        // append method is also used to add
        list_buff.append("new element") // single
        list_buff.append("temp" , "temp2" , "Temp3") // multiple


        println("Buffer : "   + list_buff)


        // to remove elements

        list_buff -= "working"

        list_buff -= ("on" , "scala")

        list_buff.remove(0)

        list_buff.remove(1, 3)

        println("buffer  :" + list_buff)


        // insert : to add element at specific index

        list_buff.insert(1,"working")

        println("Buffer : " + list_buff)


        // update : to modify element at specific index
        list_buff.update(0, "diluted")


        // to make listBuffer into list 

        var list = list_buff.toList

        println("List : " + list)
    }
}