object Strings{
    def main(args : Array[String]) : Unit = {
        // using val means you are creating string literal 
        val str : String = "Hi there i am "
        // using var means creating string object 
        var ptr : String = "Welcome"

        // ... note thar both val and var are immutable(cannot perform changes)

        // functions : 

        println("Length : " + str.length())

        println("Character at index  4 : " + str.charAt(4))

        println("Replace t with d  : "  + str.replace('t' , 'd'))

        println("Substring from index 4 :"  + str.substring(4,8))

        // to create immutable string we use StringBuilder


        var mut_string = new StringBuilder("This is mutable String")

        // to add character 

        var add_char =  mut_string += 'c'
        println("After adding c : " + add_char)


        // to add string

        var add_string = mut_string ++= "new string added"
        println("After adding string : " + add_string)


        // to add numerical value
        add_string.append(24);
        println("After adding numerical value : " + add_string)

        add_string.clear();
        println("Clear string :" + add_string)

    }
}