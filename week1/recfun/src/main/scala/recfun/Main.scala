package recfun
import common._

object Main {
  def main(args: Array[String]) {
    println("Pascal's Triangle")
    for (row <- 0 to 10) {
      for (col <- 0 to row)
        print(pascal(col, row) + " ")
      println()
          }
  
  }

  /**
   * Exercise 1
   */
  def pascal(c: Int, r: Int): Int = 
     /*if (c<r)*/
    if ((c==0)||(c==r)) 1
      else pascal(c,r-1)+pascal(c-1,r-1)

   
  /**
   * Exercise 2
   */
  def balance(chars: List[Char]): Boolean = 
        
       cheker(chars, "")
       
  	 def cheker(chars: List[Char], stack: String): Boolean = 
      if (chars.isEmpty)
        stack.isEmpty
      else if (chars.head == '(')
       cheker(chars.tail, chars.head + stack)
      else if (chars.head == ')')
        !stack.isEmpty && cheker(chars.tail, stack.tail)
      else
        cheker(chars.tail, stack)
    


  /**
   * Exercise 3
   */
  def countChange(money: Int, coins: List[Int]): Int = 
        if (money==0) 1 
        else if ((money<0)||(coins.isEmpty)) 0
        else countChange(money,coins.tail)+ countChange(money- coins.head,coins)
        
  

}
