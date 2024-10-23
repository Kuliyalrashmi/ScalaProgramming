object  IteratorsWorking{
    def main(args : Array[String]) : Unit = {
        
        val arr : Array[Int] = Array(1,2,3,4,5,6)

        var iter = arr.iterator

        //  traversing using iterator
        while(iter.hasNext){
            print(iter.next + " ")
        }
        println()

        
        val arr2 : Array[Int] = Array(1,2,3,4,5,4,6)

        var iter2 = arr.iterator

        iter2 foreach println


        println("Max : " + iter.max)
        println("Min : " + iter.min)

        


    }
}