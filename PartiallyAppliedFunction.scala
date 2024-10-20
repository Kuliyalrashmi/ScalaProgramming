object PartiallyAppliedFunction{
    def main(args : Array[String]) : Unit = {


        def mult(x : Int , y : Int) : Int = {
            x *y 
        }


        val res = mult(3 , _);

        println(res(3))



        def mult2(val1 : Int , val2 : Int)  : Int ={
            val1 * val2
        } 


        // applying curring apporach 
        var res2 = (mult2).curried

        println(res2(3)(4))


    } 
}