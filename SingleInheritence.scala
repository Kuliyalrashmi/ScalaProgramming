class Parent{
    var name : String  = "rithika"
}


class Child extends Parent{
    var age  = 12;

    def details() : String = {
        return s"age of child is : ${age} and parent name is  ${name}"
    } 
}


object Main{
    def main(args : Array[String]) : Unit = {
        var obj = new Child()
        println(obj.details());
    }
}