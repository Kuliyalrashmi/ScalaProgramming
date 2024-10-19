class GrandParent{
    val hair_color: String  = "Black"
    val eye_color : String  = "brown"
    val sirname : String = "nayal"
}

class Parent extends GrandParent{
    val height : Int = 140

}

class Child extends Parent{
    val name = "xyz"

    def myname() = {
        println(s"My name :${name}")
    }

    def more_info() = {
        println("Hair Color : "+ hair_color)
        println("Eye Color : " + eye_color)
        println("Sirname : " + sirname)
    } 
}


object Main{
    def main(args: Array[String]) : Unit =  { 
        var child = new Child()

        child.myname()
        child.more_info()
    }
}