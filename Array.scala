import Array._

object ArrayConcept{
    def main(args : Array[String]) : Unit = {
        // to ways to initialize array , also array is mutable

        // static
        var arr = Array(2,3,4,4,5,6)

        // dynamic
        var arr2 = new Array[Int](4) // values initially filled with zeroes.. 


        // updation and insertion is done thorugh indexing

        arr(1) = 3
        arr2(3) = 129


        for(values <- arr){
            print(values + " ")
        }
        println()

        for(values <- arr2){
            print(values + " ")
        }
        println()



        // Multi-dimensional Array

        var arr3 = Array.ofDim[Int](4,4) 
        var arr4 = Array(Array(3,2,3,4) , Array(12,3,2,5))

        for{
            i <- 0 until 2
            j <- 0 until 4
        }
        print(arr4(i)(j) + " ")

        println()





        // appending elements in array
        arr = Array(1,2,3,4)

        arr = arr :+ 3 // append single
        arr = arr ++ Array(1,2,3,45) // append multiple
        arr = 4 +: arr  // prepend single
        arr = Array(4,5,6) ++: arr // prepend multiple

        for(x <- arr){
            print(x + " ")
        }

    }
}