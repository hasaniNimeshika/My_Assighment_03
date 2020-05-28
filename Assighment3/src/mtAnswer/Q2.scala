package mtAnswer

object Q2 {

  
  def main(args:Array[String]){
     println("Enter a number : ")
     var n = scala.io.StdIn.readInt() 
    primeSeq(n)
   
    
  }
  
 
  def primeSeq(n:Int):Unit= {
   if(prime(n)==1)
     {
      println(n)
    }
    primeSeq(n-1)
   
       
  }
  def prime(p:Int,n:Int=2):Int= n match {
   case x if(x==p) => 1
   case x if GCD(p,x)>1 => 0
   case x => prime(p,x+1)
}
    def GCD(a:Int,b:Int):Int=b match{
    case 0 => a
    case x if x>a => GCD(x,a)
    case x => GCD(x,a%x)
}

}