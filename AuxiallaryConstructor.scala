// sample class
class Sample{
    var x : Int = 45
    var y : String = "Hello"


    def call() ={
        print(x  + " "+  y);
    }


    def this(value : Int) = {
        this()
        this.x = value
    }


    def this(value1 : Int  , value2 : String) = {
        this(value1)
        this.y = value2
    }
}

object Main{
    def main(args: Array[String]) : Unit = {
        var obj = new Sample();

        obj.call()


        var obj2 = new Sample(4); 
        obj2.call()

        var obj3 = new Sample(4, "Riya")
        obj3.call()
    }
}