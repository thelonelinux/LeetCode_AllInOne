# Here we will include topics for Search, Sort, Stack and Queues



## Main for interview questions in overall Data Structure
* learning link : https://www.interviewbit.com/data-structure-interview-questions/
* includes topics like stack, queue, hashing, collision, linkedlist vs array, graph, trees and some deep dive DSA interview questions
* It is important to learn only when you are able to bring approach with coding. that's only then it is useful, else
* it is like just seeing the question again, but you don't know the appraoch and code. so



#### Search algorithm
* 1. Linear search (simple search)
* 2. binary search (It is done here in non-recursive manner check in code)




#### Sorting Algorithm
* 1. Merge Sort : 
* Use this as it will always work in O(N) time complexity in every case whether be best, worst or average case
* Approach : divide the array recursively, and then merge the divided sub-arrays in sorted manner in main array again. this is the approach. code implemented and well 
* explained, check in code
* ###-----###
* ###-----###
* 2. Quick Sort : 
* don't give more focus on it as it will sometimes go O(n),
* Approach : 
* A. Do Partition
  * Here we pick one pivot element. 
  * Pivot element is taken as last element only here. 
  * (we can also take median, random or first element also as pivot, pivot is used later to divide our main array in two sub-arrays)
  * Pivot : (Pivot should be such that, it should be like some approximate middle element after partition is done or when chose pivot is placed in it's sorted position,
  * So it may not always be possible, the pivot we chose is always the one which divides our main array equally. So take in note on this)
  * Now from (i = 0 to i=high-1 ) //as arr[n-1] or arr[high] is  chosen as our pivot
    * We want to move smaller element than our pivot to left side of main array and larger elements at right side of our main array
    * We do the swapping.
    * Once we complete this swapping
    * We come out of the loop
  * Now put our pivot to its sorted position. i.e. next larger element in the swapped main array and then swap our pivot with it
  * And then return the index of our pivot element.
* Now using this pivot index pi, divide our subarray as arr[lower to pi-1] and arr[pi+1 to higher], in this subarray recursively call partition call and so on.
* At the end we will get the sorted element
* ###-----###
* ###-----###
* 3. Heap Sort :
* Heap sort algo has limited use because quicksort and mergesort are better in practice . Nevertheless, the heap data structure itself is enormously used.
* Approach : 
* Here most important is to understand heapify algorithm. and then rest all we can easily sort the array
* Here we have to treat our main array as max heap binary tree with i(0) as parent and 2*i+1 and 2*i+2 as it's two child on left and right respectively.
* In max heap, we have to bring max element on the parent node.
* so this process is called heapify of array or binary tree. so we make use of this array and use this like binary tree.
* Heapify Approach : 
  * for given array, it's size n, and the index i, is the index of sub-tree where heapify we have to do. 
  * (Note, we will do heapify on those elements only where it's chilc is present, else no heapify will work for node with no child)
  * heapify(arr, n, i) ; //i=index of sub-tree, where we are going to do heapify
  * So our main target is to find largest element and it's index among the three node, i.e. parent, left child and right child
  * and whoever is max, we will store it's index in largest
  * and if the largest index is not parent, means one of it's child is max, so this means the sub-tree is affected in child level also. 
  * so do heapify or call heapify in child node also recursively, so that too will update for max heap
* ###-----###
* ###-----###
* Comparator and other built in sort technique see in the notes PDF only.





#### Stack and Queue
* Stack and queue implementation code see in self notes in here in this folder.
* Also stack and queues only code based competitive programming questions are usually asked, and not in interview, so check those kind of questions only
* No need to do implementation code, as that is easy now
* Learn interview related questions on this like 
* 1. Implement stack using 2 queue and implement queue using two stack and other questions in this data structure
* https://www.geeksforgeeks.org/implement-stack-using-queue/
* Remember notes are not important, you need to know the approach and able to code is only way to clear coding round