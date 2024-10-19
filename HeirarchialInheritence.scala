import scala.annotation.internal.Child
class Parent{
    var name : String = "kuliyal"
}

class Child1 extends Parent{
    var age : Int = 32

    def details() = {
        println(s"Sirname : ${name} and age : ${age}")
    } 
}

class Child2 extends Parent{
    var age: Int = 12

    def details() = {
        println(s"Sirname : ${name} and age : ${age}")
    }
}

class Child3 extends Parent{
    var age : Int = 24

    def details() = {
        println(s"Sirname : ${name} and age : ${age}")
    } 
}


object Main{
    def main(args : Array[String]) : Unit = {
        var child1 = new Child1()
        var child2 = new Child2()
        var child3 = new Child3()

        child1.details()
        child2.details()
        child3.details()
    }
}