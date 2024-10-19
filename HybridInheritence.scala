class Top{
    def func1() = {
        println("Inherited from Top")
    }
}


trait Middle1 extends Top{
    def func() = {} 
}

trait Middle2 extends Top{
    def func2() = {}
}


class Bottom extends Middle1 with Middle2{
    override def func() = {
        println("Called from Bottom (Middle1) function")
    }

    override def func2() = {
        println("Called from Bottom (Middle2) function")
    }


    def self() = {
        println("Own function from bottom")
    }
}


object main{
    def main(args : Array[String]): Unit = {
        var obj  = new Bottom();

        obj.func()
        obj.func2()
        obj.func1()
        obj.self()
    }
}