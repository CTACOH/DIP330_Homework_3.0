

object Square_Root {
  def square(x: Double) = x * x  
  def improve(y: Double, x: Double) = (y + x / y) / 2
  def isGoodEnough(y: Double, x:Double) = math.abs(square(y) - x) < 0.001
  def sqrtIter(y: Double, x:Double): Double = 
    if (isGoodEnough(y,x)) y
    else sqrtIter(improve(y,x), x)
  def sqrt(x: Double): Double = sqrtIter(1.0, x)
  
  def main(args: Array[String]) {
    var x = 16
    print(sqrt(x))
  }
}