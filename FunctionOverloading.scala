class FunctionOverload{
    def add_value(a : Int):Int = {
        println("sum : " + a)
        a
    }

    def add_value(a : Int , b : Int) : Int ={
        println("sum : " + (a+b));
        a+b
    }

    def add_value(a : Int , b : Int , c : Int): Int = {
        println("Sum : " + (a+b+c));
        a+b+c
    } 
}

object FunctionOverload{
    def main(args : Array[String]) : Unit = {
        var obj = new FunctionOverload()

        obj.add_value(3)
        obj.add_value(4,5)
        obj.add_value(5,6,7)
    }
}