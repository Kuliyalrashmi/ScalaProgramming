object FunctionCreation{
    
    // def : for function creation  () -> to pass paramters then define return type
    // Unit  means void ... 
    // def function_name( variable : data_type , variable : datatype ) : return type = { instructions}...
    
    
    def func1() : Unit = {
        println("hi there i am working on Scala Programming") 
    }
    
    def func2(field : String) : Unit = {
        println(s"Working on my passionate field  : ${field}")
    }

    def func3(field :String , years : Double  ) : Unit = {
        println(s"Working on my passionate field  : ${field} from ${years}")
    }


    // if want to return function
    def return_int(val1 : Int , val2 : Int) : Int = {
        return (val1 + val2);
    }

    def return_string(str : String , ptr : String) : String ={
        str + ptr;
    } 


    def main(args : Array[String]) : Unit = {
        func1()

        func2("Data")

        func3("Data" , 0.1)

        print("Value :" + return_int(3,4))

        print("Concatenated String : " + return_string("Not have enough time", " Work hard"));
    }
}