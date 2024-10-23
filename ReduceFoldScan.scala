object ReduceFoldScan{
    def main(args : Array[String]) : Unit = {
        // Reduce : Reduce function is applied on collection data structure in scala that contains lists, sets, maps, sequence and tuples. Parameter in the reduce function is a binary operation which merges all the elements from the collection and returns a single value. The first two values is combined with the binary operation and the resultant of that operation combines with the next value of the collection and atlast we obtain a single value.
        
        var seq : Seq[Int] = Seq(1,2,3,4)

        println(s"Seq : $seq")

        val sum : Int = seq.reduce((x,y) => x+y) 
        println("Sum : " + sum)

        val max : Int = seq.reduce((x,y) => math.max(x,y))
        println("Max : " + max)
        
        val max2 : Int = seq.reduce( _  max _ )
        println("Max : "+ max2)

        val min : Int = seq.reduce((x,y) => math.min(x,y))
        println("Max : " + max)
        
        val min2 : Int = seq.reduce( _  min _ )
        println("Max : "+ min2)





        // Fold : Like reduce fold also takes a binary operation which merges all the elements from the collection and returns a single value. The difference is that fold allows us to define an initial value. Due to this property, fold can also manage empty collections. If the collection is empty, the value initialized becomes the final answer. 

        val seq2 : Seq[Double] = Seq(1.0,2.0,3.0,4.0,5.0)

        val seq2_sum : Double = seq2.fold(0.0)((x ,y) => x+y)

        println("Sum : " + seq2_sum)



        // scan : Scan function takes the binary operation as parameter and returns the value for each element in collection for that operation. It returns each iteration for that binary operator in the collection. In scan also we can define the initial value.

        val numbers: Seq[Int] = Seq(4, 2, 1, 6, 9) 

        val run_sum = numbers.scan(0)( _ + _ )

        println("Running Sum :" + run_sum)

        

    }
}