object TypeHeirarchy{
    
    def main(args:  Array[String]) : Unit = {
        // using Any as type you can store any values combination inside  
        var my_list : List[Any] = List(243 , 45.0 , "arr" , 'v' , false)


        my_list.foreach(elements => println(elements)) 


        var my_list2 : List[AnyRef] = List("Hello World!!" , "Scala Programming")

        my_list2.foreach(eles => println(eles))


    }
} 