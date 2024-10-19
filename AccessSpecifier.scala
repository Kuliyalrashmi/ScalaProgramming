class AccessSpecifier{
    private var value : Int = 45
    protected var str : String =  "Hello Protected Member"
    var x : Int = 4 

    def display() = {
        println("Value : " + value)
        println("String : "+  str)
    }
}


object Main{
    def main(args : Array[String]) : Unit =  {
        var obj= new AccessSpecifier()

        obj.display()
        println(obj.x)
    }
}