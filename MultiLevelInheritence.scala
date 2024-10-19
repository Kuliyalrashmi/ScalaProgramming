trait Mother{
    def func() : Unit{}
}


trait Father{
    def func2() : Unit{}
}


class child extends Mother with Father{
    def func() = {
        println("Trait 1")
    }

    def func2() = {
        println("Trait 2")
    }
}


object main{
    def main(args : Array[String]): Unit = {
        var obj  = new child()

        obj.func()
        obj.func2()
    }
}