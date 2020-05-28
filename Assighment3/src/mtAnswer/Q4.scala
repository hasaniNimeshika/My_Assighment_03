package mtAnswer

object Q4 {
  def main(args:Array[String]){
    println("Enter a number : ")
     var n = scala.io.StdIn.readInt() 
     if(isEven(n)==true)
     {
       println("the numer is even number")
     }
     else
     {
       println("the numer is odd5 number")
     }
  }
  
  def isEven(n:Int):Boolean= n match{
  case 0 => true
  case _ => isOdd(n-1)
}
  
  def isOdd(n:Int):Boolean = !(isEven(n))

}