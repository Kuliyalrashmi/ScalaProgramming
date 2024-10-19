// class FieldScope{
//     val(name : String, age : Int) = ("Ram" , 34)

//     def intro() :String = {
//         s"My name is ${name} and my age is ${age}"
//     }
// }


// object Main{
//     def main(args : Array[String]): Unit = {
//         var obj = new FieldScope()

//         println(obj.intro()) 
//     }
// }



// class MethodParameter{

//     def findarea(length :  Int , bredth : Int):Int ={
//         var res = length * bredth
//         // println("area is : "+ res)
//         res
//     }  
// }

// object MethodParaMain{
//     def main(args : Array[String]):Unit = {
//         var obj = new MethodParameter()
//         // obj.findarea(4,8)
//         val result : Int = obj.findarea(10,13);
//         println(result); 
//     }
// }


class LocalVar{
    def sample_operation() = {
        val(x: Int , y:Int) = (3,4)
        
        val res  = x + y;
        res
    }
}


object Main{
    def main(args : Array[String]):Unit = {
        var obj = new LocalVar()
        println(obj.sample_operation())
    }
}