// List Set -> immutable distinct items container...
import scala.collection.immutable.ListSet

object ListScala{
    def main(args : Array[String]) :  Unit = {
        // initialize empty listset
        var list_set : ListSet[String] = ListSet();

        // to add elments :  +
        var new_list_set = list_set + "value1"

        println("ListSet : " + new_list_set)

        // to check element exist : contains
        println("Contains 'temp' : " + list_set.contains("temp"))


        // to remove element : -
        list_set = new_list_set - "value1"


        // to add mulitple list set : ++
        var list_set1 : ListSet[String] = ListSet("hi" , "hello")
        var list_set2 : ListSet[String] = ListSet("scala" , " is intresting")
        val concat_listset = list_set1 ++ list_set2
        println("Final ListSet :" + concat_listset)


        // union : get all unique elmenets from both set
        println("Union : " + list_set1.union(list_set2))

        // Interset : Common from both
        println("Intersection : " + list_set1.intersect(list_set2))
        
        // difference : Present in one not in another 
        println("Difference : " + list_set1.diff(list_set2))


    }
}