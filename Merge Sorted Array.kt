fun main(args: Array<String>) {
  // data to work with 
  var arr1 = intArrayOf(1, 2, 3, 4, 5)
  var arr2 = intArrayOf(1, 2, 3, 4, 6) 

  // the arr that will contain ordred merged arr 
  var arr = intArrayOf() 

  // loop in arr 1 
  for (i in arr1) {
    // push the items to the new arr 
    if(!arr.contains(i)){
      arr += i 
    }
  }

  // loop in arr 2
  for (i in arr2) {
    // push the items to the new arr 
    if(!arr.contains(i)){
      arr += i 
    }
  }

  // print the result 
  for (element in arr) {
        println(element)
  }
}
/*
[x] create new arr 
[x] loop in the arr 1 
[x] if new arr  doesn't include i push it 
[x] loop in the arr 2 
[x] if new arr doesn't include i push it 
[x] print the result 
*/
