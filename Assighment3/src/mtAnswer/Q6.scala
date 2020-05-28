package mtAnswer

object Q6 {
  
  def main(args:Array[String]){
     println("Enter a number : ")
     var n = scala.io.StdIn.readInt() 
     fibonacciSeq(n)
   
  }
  
  def fibonacci(n:Int):Int={
    if(n == 0 || n == 1)
    {
        return n;
    }
    
    else
    {
        
        return fibonacci(n-1) + fibonacci(n-2);
    }
    
  }
   def fibonacciSeq(n:Int):Unit= {
    if (n > 0) 
      {
      fibonacciSeq(n-1)
      }
     println(fibonacci(n))
}


  
}