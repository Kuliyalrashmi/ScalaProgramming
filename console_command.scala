object ReadWriteScala{
  def main(args : Array[String]) : Unit = {
    // to take input from user

    val str : String = scala.io.StdIn.readLine(); // this will only take string as input;
    val num : Int = scala.io.StdIn.readInt();


    // to print : print and println;
    println("Integer : " + num)
    print("String : " + str)

    println()

    val str2 : String = "Listen Rashmi, I got a new way to print this. We can directly use string formatting we have to use s before string and use {} to place the variable in it "

    println( s"Note : ${str2}");
  }
}