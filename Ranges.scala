object RangeExample{
    def main(args : Array[String]): Unit = {
        // to get a series of element with specific gap interval , we have Range()

        val range1  = Range(1,8)

        for(values <- range1){
            print(values +" ")
        }
        println()

        // to get range from 1 to 20 by differnce of 2

        var range2 = Range(1,20,2)

        for(values <- range2){
            print(values + " ")
        }
        println()

        // to get this series we can also use (until - by)

        var range3 = 1 until 20 by 2

        for(values <- range3){
            print(values + " ")
        }
        println()

        // or to get a constant series we can use ( to )

        var range4  = 1 to 20

        for(values <- range4){
            print(values+ " ")
        }
        println()


        // upper bond is not including we can also include it by using '.inlcusion'
        
        var temp_range = Range(4,20,4).inclusive

        for(values <- temp_range){
            print(values+ " ")
        }
    }
}