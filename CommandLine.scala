object CMDArgument{
    def main(args : Array[String]){
        println("Arguments passed :")

        // this will loop out all elements
        for(arg <- args){
            println(arg);
        }

        // Listen Rashmi, You can also access throungh indexing. but if you try to access element out of bound it will through you a error... 

        println(args(0)) 
        println(args(2)) 
        
    }
}