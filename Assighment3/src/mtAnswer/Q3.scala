package mtAnswer

object Q3 {
  def main(args:Array[String]){
      println("Enter a number : ")
     var n = scala.io.StdIn.readInt()
     println("Sum is = "+findSum(n))
  }
  
  def findSum(n:Int):Int={
    if(n!=0)
    {
      return n + findSum(n-1)
    }
    else
    {
      return n
    }
  }
}