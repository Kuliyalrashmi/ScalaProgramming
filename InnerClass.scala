class OuterClass{
    val value1 : Int = 24;
    val value2 : String = "This is OuterClass"

    def call():String = {
        return  value2
    }

    class InnerClass{
        val inner_value1 : Int = 45
        val inner_value2 : String = "This is InnerClass" 


        def call2():String = {
            return inner_value2
        }
    }
}


class ObjectInsideClass{
    object inner_object{
        val t : Int = 1;

        def method()= {
            println("object inside class.")
        }
    }
} 


object ClassInsideObject{
    class inner_class{
        val i  =10

        def func()= {
            println("class inside a object.")
        }
    }
}




object Main{
    def main(args : Array[String]):Unit = {

        // simple implementation of class
        
        val outer_obj = new OuterClass();
        println(outer_obj.call())

        val inner_obj = new outer_obj.InnerClass()
        
        println(inner_obj.call2())


        // object inside class implementation

        val obj2 = new ObjectInsideClass().inner_object.method();


        // class inside object implementation

        new ClassInsideObject.inner_class().func()

    }
}