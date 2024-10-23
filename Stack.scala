import scala.collection.mutable.Stack


object Stack{
    def main(args : Array[String]) :  Unit  = {
        var st :  Stack[Int] = new Stack()

        st.push(6) // single item 
        st.push(2,3,4,5) // multiple items

        var top_ele : Int = st.pop() //return and remove top element

        var top_ele2  : Int = st.top // inspect top without removal 


        println("Stack Empty : " + st.isEmpty)

        // to remove all elements : clear
        st.clear()

        
        // traverse in stack
        for(ele <- st){
            println(ele)
        }


        //  to convert stack elements into list
        val stack_list : List[Int] =  st.toList

        // to reverse stack
        val rev_stack : Stack[Int] = st.reverse

        // to check whether a element exist : contains
        println("Stack contians 3 :"  + st.contains(3)) 

    }
}