import scala.annotation.tailrec
def insertSorted(element: Int, sortedList: List[Int]) : List[Int] =
    if (sortedList.isEmpty || element < sortedList.head) element :: sortedList
    else sortedList.head :: insertSorted(element, sortedList.tail)

insertSorted(3, List(1,2,4))
// How it has worked:
// 1 :: insertSorted(3, [2,4]) =
// 1 :: 2 :: insertSorted(3, [4]) =
// 1 :: 2 :: 3 :: [4] =
// [1,2,3,4]



def insertionSort(list: List[Int]): List[Int] = {
    def insertSorted(element: Int, sortedList: List[Int]): List[Int] = 
        if (sortedList.isEmpty || element <= sortedList.head) element :: sortedList
        else sortedList.head :: insertSorted(element = element, sortedList = sortedList.tail)

    if (list.isEmpty || list.tail.isEmpty) list
    else insertSorted(element = list.head, sortedList = insertionSort(list.tail))
}

insertionSort(List(1,4,3))
// How it has worked:
    // insertionSort(List(1,4,3))
    // insertSorted(1, insertionSort([4, 3])
    // insertSorted(1, insertSorted(4, insertionSort([3])))
    // insertSorted(1, insertSorted(4, [3])) // because [3].tail.isEmpty = true and it should return list itself i.e [3]
    // insertSorted(1, 3 :: insertSorted(4, [3].tail))) // since [3].isEmpty == false || 4 <= 3 == false
    // insertSorted(1, 3 :: 4 :: Nil) // since [3].tail.isEmpty == true so 4 :: Nil
    // Now 1 <= 3 i.e element <= sortedList.head == true so 1 :: 3 :: 4 :: Nil
    // Finally it will return 1 :: 3 :: 4 :: Nil = List(1, 3, 4)



val list = List(1,4, 3)
val sortedList = list.sortWith(lt = (a, b) => a < b)
val sortedListAnonymous = list.sortWith(_ < _)
val sortedListResevese = list.sortWith(_ > _)
val sortedListWithSortedFunctioon = list.sorted