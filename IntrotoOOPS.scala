class Student{
    var name : String  =  "xyz"
    var age : Int  = 12

    def print(name : String,  age : Int): String ={
        s"My name is ${name} and age is ${age}"
    }
}


class Employee(name : String , age : Int , id : Int , specialize : String){
    println(s"Name : ${name}")
    println(s"Age : ${age}")
    println(s"Id : ${id}")
    println(s"Specialized in : ${specialize}")
}

object OOPSFundamental{
    def main(args : Array[String]):Unit = {
        val obj  = new Student()

        println(obj.print("Rakesh" , 24))


        val obj2 = new Employee("Ram" , 34 , 9320843 , "Quality Analyst") 
    }
}