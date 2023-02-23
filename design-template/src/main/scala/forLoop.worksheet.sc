// list all combinations of numbers x and y where x is drawn from
// 1 to M and y is drawn from 1 to N
for( x <- 1 to 5; y <- 1 to 5) 
    yield (x,y)
// Is equivalent to
(1 to 5).flatMap(x =>  (1 to 5) map ( y => (x, y)))


def isPrime(x:Int): Boolean = 
    for(i <- 1 to x/2) 
        if (x / i == 0) false
    true

val n = 5
for
  i <- 1 until n  
  j <- 1 until i  
  if isPrime(i + j) 
yield (i, j)  

val mapp = Map[Int, Int]((1,2), (3,4))

val listA = List(2,7,11,15)
val target = 9
def findIndexes(xs: List[Int], target: Int): (Int, Int) = {
    val mapHolders: Map[Int, Int] = Map()
    xs match
        case Nil => (1,2)
        // case x :: s => {
        //     val nextSum = target - x
        //     if mapHolders.contains(nextSum) {
        //         (xs.get(x), xs.get(nextSum))
        //     }
        //     // mapHolders.add(x, xs.get(x))
        // }
        case _ => (1,2)
}