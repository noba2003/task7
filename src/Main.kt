//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
  /*  Task: Maps, Sets, Pairs, and Triples (Using Functions)
    Requirements:* 1. Map, Mutable Map, HashMap, TreeMap
    1. Create a Map:*/

   // 1.1. Declare an immutable Map of strings to integers with the values ("apple" to 3, "banana" to 2, "cherry" to 5).
        val fruts= mapOf("apple" to 3, "banana" to 2, "cherry" to 5)
         //  1.2. Use a loop to iterate through the map and print each key-value pair using entries.
        for ((k,v) in fruts.entries){
                println("$k: $v")
        }
        // 1.3. Use the getValue function to retrieve the value for the key "banana" and print it.
        // return value
        val searchResult = fruts["banana"]

        // // return true or false
        val searchResult3=   "banana" in fruts.keys
        println(searchResult3)
        //   1.4. Check if the map contains the key "apple" using containsKey and print the result.
        // return true or false
        val searchResult2=   fruts.containsKey("apple")
}