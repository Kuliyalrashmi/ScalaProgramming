import scala.collection.immutable._

object LinkListCollection{
    def main(args : Array[String]) : Unit = {
        // to initialize a empty list 
        val list :  List[Nothing] = List()

        println("Empty List : " + list)

        // to create List with elements (we have to ensure that all elements are of same type)
        
        val list2 : List[String] =  List("Morning" , "starts" , "with" , "Scala Collection")

        println("String List : " + list2)

        // note  : List is immutable in nature 

        // operations : 

        println("Head of list2 : " + list2.head) // return first element of list

        println("Tail of list2 :" + list2.tail) // return all elements set excluding the head of list

        println("list1 is empty : " + list.isEmpty) // to check whether list is empty or not ?


        //  to append elemnt in last

        val new_list = list2 :+ "new_element"

        println("After adding element : " + new_list)

        // to append element in first 

        val new_list2 = "first_ele" :+ new_list

        println("Append element at front : " + new_list2)


        // reversing list
        println("Reversing list : " + new_list.reverse)


        // you can also create List  by  :: 
        val temp_list  : List[Int] = 2 :: 4 :: 5 :: Nil



        // to apply a function to all elements : map
        val squares  = temp_list.map(x => x*x)
        println(squares)


        // applying filter(condition) to element
        val even_numbers = temp_list.filter(x => x %2 == 0)
        println(even_numbers)

        // reduce : combine elments by performing binary operation
        var integer_list : List[Int] = List(2,3,5,6,7)
        var sum = integer_list.reduce((x,y) => x+y) 
        println(sum) 


        // forall : to check whether all elements follow a specific condition
        var positive = integer_list.forall(_ > 0)
        println("All elements are postive : " + positive)



        // exists : to check a specific condition is followed by atleast one element
        val temp : List[Int] = 3 :: 4 :: 5 :: 6 :: Nil 
        println("5 present  on not : " + temp.exists(_ == 5))



        //  take : to get first n element
        val first_2 =  temp.take(2)
        println("new list : " + first_2) 


        //  drop  : to remove first n elements
        val remove_2 =  temp.drop(2)
        println("new list :" + remove_2)


        // to combine two lists in pairs  : zip
        val x : List[Int] = List(1,2,3,4)
        val y : List[Int] = List(4,5,6,7)
        val pairs = x.zip(y)
        println("pairs : " + pairs)


        //  to split list within a specific condition
        integer_list = 1 :: 2 :: 3 ::  4 :: 5 :: Nil

        var(even ,odd) = integer_list.partition( _  % 2 == 0) 

        println("Even : " + even + " odds : " + odd)


        //  find  : to get first element that specify the condition
        println("first value greater than 3" + integer_list.find(_ > 5))


        // distinct  : remove all duplicate element of list 
        integer_list = 1 :: 1 :: 1 :: 2 :: 2  :: 3 :: 4 :: Nil
        println(integer_list.distinct)

        // comparision function : sortwith()
        println("Descending Order : " +integer_list.sortWith(_ > _))

        // to make list a string : mkString()
        println("string represent :" + integer_list.mkString(", "))
    } 
}