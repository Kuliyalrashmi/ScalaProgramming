import scala.collection.mutable.HashMap



object HashMap{
    def main(args : Array[String]) : Unit = {
        // initialize hashmap
        val hashmap = new HashMap[String , Int]()

        // to insert values
        hashmap += ("a" -> 1)
        hashmap += ("b" -> 2)

        //  you can use put method to insert
        hashmap.put("c" ,3)
        hashmap.put("d" ,4)

        // update values 
        hashmap("c") = 34

        // to access value : get()
        println("value for 'a' : " + hashmap.get("a")) // it will throw error or give non for wrong access
        hashmap.getOrElse("c", -1)

        // to check whether a key exist : contains()
        println("Map contains 'c' : " + hashmap.contains("c"))


        //  traversing in map
        for((key ,value) <- hashmap){
            println(s"Key : ${key} = Value : ${value}")
        }

        for(key <- hashmap.keys){
            println(key)
        }

        for(value <- hashmap.values){
            println(value)
        }

        // using immutable Hashmap
        val updated = hashmap.map{case (k,v) => (k,v*v)}

        for((key,value) <- updated){
            println(s"{$key} : "+ value)
        }

        
        val filtered = hashmap.filter{ case (k,v) => v > 3}
        
        for((key,value) <- filtered){
            println(s"${key} : "+ value)
        }

        
    }
}