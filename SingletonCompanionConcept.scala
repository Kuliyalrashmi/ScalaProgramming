// singleton object works as same as static . No need to create instance , it is the entrypoint for execution , it is globally accessible , it can extend class and traits as well
// if object name is same as class then we can say that it is companion object

class CompanionExample{
    val str1 : String = "Value1"
    val str2 : String = "Value2"

    def show() = {
        println(str1)
        println(str2)
    }
}

// name same as class : Companion object 
object CompanionExample{
    def main(args : Array[String]): Unit = {
        var obj = new CompanionExample();

        obj.show();
    }
}