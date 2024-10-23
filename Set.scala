import scala.collection.mutable.Set

object SetImplement{
    def main(args : Array[String]) : Unit = {
        // initializing  empty set
        var st = Set.empty[Int]

        // to add elment :  += 
        st += 3

        // to remove element
        st -= 3

        //  to get size : size
        println("Size : " + st.size)

        // union : all unique
        val set1 = Set(1, 2, 3)
        val set2 = Set(3, 4, 5)

        println("Union : " + set1.union(set2))

        println("Intersect : " + set1.intersect(set2)) // for common

        println("Difference : " + set1.diff(set2)) // present in one not in another


        // traverse :
        for(eles <- set1)
        {
            println(eles)
        }


        // to get subset

        var globalset = Set(1,2,3,4,5,6)
        
        println("Is (1,2,3) a subset : " + Set(1,2,3).subsetOf(globalset))


        println("Max : " + globalset.max)
        println("Min : " + globalset.min)

        //  convert to list 

        println("list :" + globalset.toList)

        

    }
}