//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
  /*  Task: Maps, Sets, Pairs, and Triples (Using Functions)
    Requirements:* 1. Map, Mutable Map, HashMap, TreeMap
    1. Create a Map:*/

   // 1.1. Declare an immutable Map of strings to integers with the values ("apple" to 3, "banana" to 2, "cherry" to 5).
        val fruits= mapOf("apple" to 3, "banana" to 2, "cherry" to 5, "pineapple" to 4,"Apricot" to 6)

         //  1.2. Use a loop to iterate through the map and print each key-value pair using entries.
        for ((k,v) in fruits.entries){
                println("$k: $v")
        }
        // 1.3. Use the getValue function to retrieve the value for the key "banana" and print it.
        // return value
        val searchResult = fruits["banana"]

        // // return true or false
        val searchResult3=   "banana" in fruits.keys
        println(searchResult3)
        //   1.4. Check if the map contains the key "apple" using containsKey and print the result.
        // return true or false
        val searchResult2=   fruits.containsKey("apple")

        //2.5. Sort the mutable map by key in ascending order and print the sorted map.
        val sortedFruits = fruits.keys.sorted()
        println(sortedFruits)
        /*  2. Set, Mutable Set, HashSet, TreeSet
1. Create a Set:
1.1. Declare an immutable Set of integers with the values [1, 2, 3, 4,
5].*/
        val setOfNumber:Set<Int> = setOf<Int>(1, 2, 3, 4, 5)


 // 1.2 Use a loop to iterate through the set and print each value.
        setOfNumber.forEach { println(it) }

        //1.3. Check if the set contains the value 3 using the contains operator and print the result.
       val containValue= setOfNumber.contains(3 )
        println(containValue)

        // 2. Create a Mutable Set:
//2.1. Declare a MutableSet of strings with the values ["apple","banana", "cherry"].
        val mutableSetOfFruits= mutableSetOf("apple","banana", "cherry")

//2.2. Add the value "date" to the mutable set.
        mutableSetOfFruits.add("orange")
//2.3. Remove the value "banana" from the mutable set.
        mutableSetOfFruits.remove("banana")
//2.4. Use a loop to iterate through the mutable set and print each value using forEach.
        mutableSetOfFruits.forEach { println(it) }
//2.5. Convert the mutable set to a sorted list and print the sorted list.
        val  newSortedList =mutableSetOfFruits.toSortedSet()
        println(newSortedList)
//3. Pair and Triple
//1. Working with Pairs:
//1.1. Declare a Pair of a string and an integer with the values ("apple", 5).
        val (fruit,price) = "apple" to 5
        val  pair : Pair<String,Int> = "apple" to 5
//1.2. Access the first and second elements of the pair and print them.
        println(pair.first)
        println(pair.second)
//1.3. Create a list of pairs with the values [("one", 1), ("two", 2), ("three", 3)].
        var listOfPairs :List<Pair<String,Int>>  = listOf(("one" to 1), ("two" to 2), ("three" to 3))
//1.4. Use a loop to iterate through the list of pairs and print each pair.
        for(pair in listOfPairs){
                println(pair.first)
                println(pair.second)
        }
//2. Working with Triples:
//2.1. Declare a Triple of a string, an integer, and a double with the values ("apple", 5, 1.1).
        val triple :Triple<String,Int,Double> = Triple("apple", 5,1.1)
//2.2. Access the first, second, and third elements of the triple and print them.
        println(triple.first)
        println(triple.second)
        println(triple.third)

//2.3. Create a list of triples with the values [("one", 1, 1.1), ("two", 2, 2.2), ("three", 3, 3.3)].
        val listOfTriples :Set<Triple<String,Int,Double>> = mutableSetOf<Triple<String,Int,Double>>(Triple("one", 1, 1.1), Triple("two", 2, 2.2), Triple("three", 3, 3.3))
//2.4. Use a loop to iterate through the list of triples and print each triple.
        for(triple in listOfTriples){
                println(triple.first)
                println(triple.second)
                println(triple.third)
        }

//4. Removing Duplications Using Set
//1. Handling Duplications:
//1.1. Declare a List of integers with the values [1, 2, 3, 2, 4, 5, 3, 6, 1].
     //   val listOfInteger:List<Int> = listOf(1, 2, 3, 2, 4, 5, 3, 6, 1)
//1.2. Create a MutableList to store duplicated elements.
      //  val duplicated: MutableList<Int> = mutableListOf()

        // Original list of integers
        val listOfInteger: List<Int> = listOf(1, 2, 3, 2, 4, 5, 3, 6, 1,55,65,4,4,7,7)
        val sorted = listOfInteger.sorted()



// Create a MutableList to store duplicated elements
        val duplicated:MutableSet<Int> = mutableSetOf()
        for(i in listOfInteger){
                for(v in  listOfInteger.indices){
                        if (v!=listOfInteger.size-1){
                                if(i==listOfInteger[v+1]){
                                        duplicated.add(i)
                                }
                        }

                }
        }


// Iterate through the list using index


// Print results
        println("******")
        println(duplicated.size) // Print the number of unique duplicated elements
        println(duplicated)      // Print the list of duplicated elements

//1.3. Use a loop to iterate through the list and add any element that
//appears more than once to the MutableList of duplicates.
//1.4. Print the MutableList of duplicated elements.
//2. Remove Duplications Using Set:
//2.1. Convert the original list to a Set to remove all duplications.
//2.2. Convert the Set back to a list.
//2.3. Print the list after removing duplications.
//3. Check for Duplications with Additional Elements:
//3.1. Add additional elements [2, 7, 8, 3] to the original list.
//3.2. Convert the updated list to a Set to remove any new
//duplications.
//3.3. Print the list after removing the new duplications.

}