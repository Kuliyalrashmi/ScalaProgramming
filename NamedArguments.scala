object NamedArguments{

    def func(first : String , middle : String , last : String) : String = {
        s"My name is ${first} ${middle} ${last}"
    }

    def main(args  : Array[String]): Unit = {

        // in norma calling you have to ensure proper value goes to each parameter
        println(func("Rashmi" , "" , "Kuliyal"))

        // but due to named argument calling , i can change the order without any mess
        println(func( last =  "Kuliyal" , middle = "",first  = "Rashmi"))

    }
}