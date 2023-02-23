val xs = LazyList.cons(1, LazyList.cons(2, LazyList.empty))

xs.filter(x => x >= 1)

LazyList(1, 2, 3)


def lazyRange(lo: Int, hi: Int) : LazyList[Int] = 
    if lo >= hi then LazyList.empty
    else LazyList.cons(lo, lazyRange(lo + 1, hi))

def ListRange(lo: Int, hi:Int) : List[Int] = 
    if lo >= hi then Nil
    else lo :: ListRange(lo + 1, hi)

val aLazy = lazyRange(1, 10)
val aFast = ListRange(1, 10) 


lazy val x = 3*4

println(x)

def expr = 
    val x = {print("x"); 1}
    lazy val y = {print("y"); 2}
    def z = { print("z"); 3}
    s"$z + $y + $x + $z + $y + $x"
println(expr)


//  Define the inifinate seq of natural numbers
def from(n:Int): LazyList[Int] = n #:: from(n + 1)

// List of all natual numbers:
val nats = from(0)

nats.take(10)

nats.take(10).toList
// List of all multiples of 4: 
val multipleof4 = nats.map(_ * 4)

multipleof4.take(10).toList


def sieve(s: LazyList[Int]): LazyList[Int] = 
    s.head #:: sieve(s.tail.filter(_ % s.head != 0))

val primes = sieve(from(2))

primes.take(100).toList