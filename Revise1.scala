class ConsolePractise{
    def console() : Unit = {
        print("Enter String : " )
        var str : String = scala.io.StdIn.readLine()

        print("Enter Integer : ")
        var num : Int = scala.io.StdIn.readInt() 

        print("Enter Any Double Value : ")
        var doub : Double = scala.io.StdIn.readDouble()


        // print commands : printf(), println() , print()

        print("Value of str :" + str + "\n")

        printf("value of num : %d" , num)

        println("Value  of doub : " + doub)
    }
}

class PatternMatching{
    private var str : String  = ""
    private var num : Int = -1 

    def put_num(val1 : Int) : Unit = {
        num = val1
    }

    def put_str(val2 : String): Unit = {
        str = val2
    }


    def match_num(value : Int) : String = {
        return value match {
            case 1 => "1"
            case 2 => "2"
            case _ => "neither 1 nor 2"  
        }
    }

    def match_str(value : String) : String = {
        return value match{
            case "a" => "A"
            case "b" => "B"
            case _ => "Neither a nor b"
        }
    }

    def command() : Unit = {
        println("Enter Any Character : ")
        val input1 : String = scala.io.StdIn.readLine()
        put_str(input1)

        println("Enter any Number : ")
        val input2 : Int = scala.io.StdIn.readInt()
        put_num(input2)

        println("result : " + match_num(input2))
        println("result : " + match_str(input1))
    }  
}

class Enumer{

    object Weeks extends Enumeration{
        type Weeks = Value

        // Example of Week
        val first = Value(0 ,"Sunday")
        val second = Value(1,"Monday")
        val third = Value(2,"Tuesday")
        val forth = Value(3,"Wednesday")
        val fifth = Value(4,"Thursday")
        val sixth = Value(5,"Friday")
        val seventh = Value(6,"Saturday")
    }

    def all_values(): Unit = {
        println("Days : " + Weeks.values)
    }

    def Get_Id(week_day : String): Option[Int] = {
        Weeks.values.find(_.toString() == week_day).map(_.id)
    }
}

class VariableScoping{
    private var str : String = ""
    private var num : Int = -1


    def FieldScope(string : String , integer : Int): Unit = {
        str = string 
        num = integer
    }

    def LocalScope( ) : Int = {
        var x  = scala.io.StdIn.readLine().toInt
        var res : Int = num *num 
        res
    }
}


class RangePractise{
    protected var start = 0 
    protected var end = 0 
    protected var step = 0

    def Range_func1(start: Int , stop : Int, step : Int) = {
        Range(start , stop + 1, step).toArray
    }

    def Range_func2(start : Int , stop : Int,  step: Int) = {
        (start until stop by step).toArray
    }

    def Range_func3(start : Int, stop : Int) = {
        (start to stop).toArray
    }

    def call() : Unit = {
        var (ip1 ,ip2 , ip3) = (0,0,0) 

        println("Enter Value for Start , Stop and Step")
        ip1 = scala.io.StdIn.readInt()
        ip2 = scala.io.StdIn.readInt()
        ip3 = scala.io.StdIn.readInt()

        var arr1 : Array[Int] = Range_func1(ip1,ip2,ip3)
        var arr2 : Array[Int] = Range_func2(ip1,ip2,ip3)
        var arr3 : Array[Int] = Range_func3(ip1,ip2)

        println("Range1 : ")
        for(value <- arr1){
            print(value + " ")
        }
        println()
        println("Range2 : ")
        for(value <- arr2){
            print(value + " ")
        }
        println()
        println("Range3 : ")
        for(value <- arr3){
            print(value + " ")
        }
        println()
    }
}

class ControlStatement{
    def practise(): String = {
        var input:  Int = scala.io.StdIn.readInt()

        if(input < 10) {
            return "Less than 10"
        }
        else if(input  < 50){
            return "Less than 50"
        }
        return "none"
    }
}

class InnerClassImplement{
    def call():  Unit = {
        println("outer function called")
    }
    class inner_class{
        
        def call() : Unit = {
            println("inner function called")
        }
    }
}

class InheritenceExample{
    class SimpleInheritence{
        class Parent{
            var str: String = "Parent"
        }


        class Child extends Parent{
            var str2 : String = "child"
        }


        def call() : Unit = {
            val child_obj = new Child()
            println(child_obj.str2)
            println(child_obj.str)
        }
    }

    class MultiLevelInheritence{
        class GrandFather(value1 : Int , value2 : String){
            println(s"${value2} Sends : ${value1}")
        }


        class Father(value3 : Int , value4 : String) extends GrandFather(450000, "Grandfather"){
            println(s"${value3} Sends : ${value4}")
        }

        class Child extends Father(942093209 , "Father"){
            var value_ch  : Int = 35400
            var str_value : String  = "children"
            println(s"${str_value} Sends : ${value_ch}")
        }


        def call() : Unit = {
            var child_obj = new Child()
        }
    }

    class HeirerchialInheritence{
        class Father{
            val value = "some values are given"
        }

        class Son1 extends Father{
        }

        class Son2 extends Father{
        }

        class Son3 extends Father{
        }


        def call() : Unit = {
            var son1 = new Son1()
            var son2 = new Son2()
            var son3 = new Son3()

            println("values from father : " + son1.value + " " + son2.value + " " + son3.value)
        }
    }


    class MultipleInheritence{

        trait Father {
            def fatherFunc(): Unit = {
                println("Father function")
            }
        }

        trait Mother {
            def motherFunc(): Unit = {
                println("Mother function")
            }
        }

        class Child extends Father with Mother {

            override def fatherFunc(): Unit = {
                println("Child overriding Father's function")
                super.fatherFunc()  
            }

            override def motherFunc(): Unit = {
                println("Child overriding Mother's function")
                super.motherFunc()  
            }

            def callAll(): Unit = {
                fatherFunc() 
                motherFunc() 
            }
        }

        def call(): Unit = {
            val child = new Child()
            child.callAll()
        }

    }
}



object Practise{
    def main(args : Array[String]) : Unit = {

        // io : console
        // var cons = new ConsolePractise()
        // cons.console()


        // Pattern matching
        // var pm = new PatternMatching()
        // pm.command()



        // enumeration
        // var en = new Enumer()
        // en.all_values()
        // println("Saturday : " + en.Get_Id("Saturday"))


        // Range
        // var rang = RangePractise()
        // rang.call()


        // Control Stats
        // var cs = new ControlStatement()
        // println("result : " + cs.practise())


        // InnerClass
        // val icl = new InnerClassImplement()
        // icl.call()
        // val iicl = new icl.inner_class()
        // iicl.call()


        // daimond problem
        val inher = new InheritenceExample()
        val multi_inherit = new inher.MultipleInheritence()
        multi_inherit.call()
    }
}