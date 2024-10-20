case class CaseClassExample( name : String , value  : Int){
    var integer : Int = value
    var str : String = name
    var id : Int = -1

    def func() = {
        println(integer + " " + str)
    }

    def this(name : String ,  value : Int , Id : Int) = {
        this(name, value)
        this.id = Id
    }
}


object RunExample{
    def main(args : Array[String]): Unit= {
        // we can create class without using  new  now...
        var obj = CaseClassExample("Riya" , 34)
        obj.func()

        // to use auxillary constructors
        var obj2 = new CaseClassExample("Rohan" , 54 , 21334)
        obj2.func() 



        val obj3  = obj.copy()
        obj3.func()


        val obj4 = obj3.copy(name = "Raj")
        obj4.func()
    }
}