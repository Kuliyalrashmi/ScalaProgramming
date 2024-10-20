object AnonymousFunction{
    
    var add = (val1 : Int , val2 : Int) => val1 + val2;

    var concat= (str : String , ptr : String) => str + ptr;

    var wild = (_1 : Int  , _2 : String) =>  _1 + _2;
    
    def main(args : Array[String]) : Unit = {
        println("Result : " + add(3,4))

        println("Concatenated String : " + concat("Keep going" ," Just be Consistent"))


        println("Wild : " + wild( 45 , " 24"))
    }
}