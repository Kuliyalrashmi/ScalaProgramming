trait Shape{
    def area() : Double = 0.0;
}


class Rect(length : Double , bredth : Double) extends Shape{
    override def area() : Double = {
        length * bredth
    }
}

class Circle(radius : Double) extends Shape{
    override def area() :Double  = {
        math.Pi * radius * radius
    }
}

class Square(length : Double) extends Shape{
    override def area():Double = {
        length * length
    }
}


object RunExample{
    def main(args : Array[String]) : Unit  = {
        var rect = new Rect(4,5);
        println("Area :" + rect.area())


        var circle = new Circle(4.6)
        println("Area :" + circle.area())

        var square = new Square(4)
        println("Area :" + square.area())
    }
}