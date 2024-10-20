object CallbyValue{


    def curr_func1 (x : Int , y : Int) = x+y

    def curr_func2(x : Int) = (y : Int) => x+y

    var anonymous_func = (x:  Int , y  : Int) => x+y 

    def call_by_value(x : Int) : Unit = {
        // same values used of x for both 
        println("value after adding 1: " + (x+1))

        println("Again value after adding 1 : " + (x+1));
    }

    def call_by_ref(x : =>Int) : Unit  ={
        // first x  got update ... 
        println("value after adding 1: " + (x+1))

        // new value of x got used ...
        println("Again value after adding 1 : " + (x+1));
    }


    def main(args :  Array[String]) : Unit = {

        var i = 1;

        call_by_value{
            // first it compute the expression and the do function call...
            i+=1
            i
        }

        var j = 1
        
        call_by_ref{
            // first compute the expression and then send it to function
            j+=1;
            j;
        }
    }
}