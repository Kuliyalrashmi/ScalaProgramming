// default constructor share same body as class
class Constructors(name : String , age : Int){
    private var id : Int = 45

    def info() = {
        println("Name : " +  name)
        println("Age : " + age)
        println("Id : " + id)
    }

    // auxillary constructor defined by this  and must call previous constructor in first line
    def this(name : String , age : Int , id : Int) = {
        this(name , age)
        this.id = id
    } 
}

object ConstructorsMain{
    def main(args : Array[String]):  Unit = {
        var obj = new Constructors("Riya" , 21)
        var obj2 = new Constructors("Sikha" , 21 , 456)

        obj.info()
        obj2.info()
    }
}