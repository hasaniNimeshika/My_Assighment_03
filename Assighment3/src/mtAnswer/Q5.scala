package mtAnswer

object Q5 {
  def main(args:Array[String]){
     println("Enter a number : ")
     var n = scala.io.StdIn.readInt()
     println("Sum is = "+findSum(n-1))
    
  }
  
   def findSum(n:Int):Int={
  if(isEven(n)==true)
  {
     if(n!=0)
    {
      return n + findSum(n-1)
    }
   else
    {
      return n
    }
  }
  else
  {
    return findSum(n-1)
  }
}
  def isEven(n:Int):Boolean= n match{
  case 0 => true
  case _ => isOdd(n-1)
}
  
  def isOdd(n:Int):Boolean = !(isEven(n))

}