// Concept of Enumeration introduce to deal with constant options while dealing with specific case. It also ensure that user cannot modify anything  

// think Suppose we have initated something that require weekdays and we know that days are fixed

object EnumExample extends Enumeration{
    type EnumExample = Value

    val first_day = Value(1, "Sunday")
    val second_day = Value(2, "Monday")
    val third_day = Value(3, "Tuesday")
    val forth_day = Value(4, "Wednesday")
    val fifth_day = Value(5, "Thursday")
    val sixth_day = Value(6, "Friday")
    val seventh_day = Value(7, "Saturday");


    def main(args : Array[String]): Unit = {
        println("Welcome to your Week Scheduler Rashmi : ")

        println(s"Days: ${this.values.mkString(", ")}") 

        println("Choose the day you want to Schedule : Enter (1,2,3,4,5,6,7) ")
        val day_id = scala.io.StdIn.readLine().toInt

        val day_choosed: Value = day_id match {
            case 1 => first_day
            case 2 => second_day
            case 3 => third_day
            case 4 => forth_day
            case 5 => fifth_day
            case 6 => sixth_day
            case 7 => seventh_day
            case _ => throw new IllegalArgumentException("Invalid day selected!")
        }

        println("Enter Your Action for Scheduled Day Rashmi")
        val work : String  = scala.io.StdIn.readLine()

        println("Done!!")

        println(s"Rashmi you have Scheduled ${day_choosed} for ${work}")

    }
}