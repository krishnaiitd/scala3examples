val a = List(1,2,3,5,10)

a.filter(p => p %2 != 0).sum
def f(x:Int) = List(x-1, x+1)
val b = a.flatMap(x => f(x))
a.foldLeft(0)((x, elm) => x+1)


def abs(x:Int) = if x < 0 then -1 * x else x
val aa = List(1,-1, -5)
aa.map(x => abs(x))