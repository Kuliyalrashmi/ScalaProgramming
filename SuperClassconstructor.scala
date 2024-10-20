class Parent(var message : String){
    println(message)
}

class Child(message : String) extends  Parent(message){

    println("Child Constructor Called")

    def call() = {
        println("Function called")
    }
}


object CallingSuperClass{
    def main(args : Array[String]) : Unit = {
        var obj = new Child("Create")
    }
}