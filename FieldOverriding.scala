class Shape2{
    val desc : String = "Welcome to Shape class"

    def call() : String = {
        desc
    }
}


class Rect extends Shape2{
    override val desc =  "This is Rectangle" 
}

class Square extends Shape2{
    override val desc = "This is Square"
}


object Main{
    def main(args:  Array[String]) : Unit = {
        var obj  = new Shape2()
        println(obj.call())


        var obj2 = new Rect()
        println(obj2.call())

        var obj3 = new Square()
        println(obj3.call())
    }
}