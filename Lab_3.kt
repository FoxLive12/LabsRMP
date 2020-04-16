//1
/*fun main(args: Array<String>) {
    val numbers = arrayOf<Int>(1, 2, 3, 4, 5)
    println(numbers.indices)
    for((index, value) in numbers.withIndex()){
    	println("Значение индекса $index равно $value")
    }
}*/

//2
/*fun main(args: Array<String>){
    var arr = emptyArray<String>()
    var i = 0
    while(i<10){
        arr += i.toString()
        i++
    }
    println(arr.size)
*/

//3
/*fun main(args: Array<String>){
    var array = arrayOfNulls<String>(5)
    array.set(0, "a")
	array.set(1, "b")
    array.set(2, "c")
	array.set(3, "d")
    array.set(4, "e")
    println(array.get(0))
    println(array.get(4))
}*/

//4
/*fun main(args: Array<String>){
   val myArray = Array(7, { i -> i * 2 })
    println(myArray[4])
    println(myArray[6]) 
}*/

//5
fun main(args: Array<String>){
    val arr = arrayOf<Int>(1, 2, 3, 4, 5)
	arr.forEach {i -> println(i)}
}
fun main(args: Array<String>){
    val arr = arrayOf<Int>(1, 2, 3, 4, 5)
	arr.forEachIndexed { index, value->println("$index - $value")
}
}

//6
fun main(args: Array<String>){
    val arr = arrayOf<Int>(1, 2, 3, 4, 5)
    var i = args[0].toInt()
    val b = args[1].toInt()
    while (i<b){
        arr[i] = arr[i] * (-1)
        i++
    }
    println(arr.contentToString())
}

//7
fun main(args: Array<String>){
    val num = setOf(1, -2, 3, -4, 5)
    val part = num.partition{
    	it < 0
	}	
    println(part)
}

//8
fun main(args: Array<String>){
    val ihs = hashSetOf(7, 2, 3, 4, 5)
    
    ihs.add(1)
    println(ihs)
    
    println(ihs.contains(2))
    
    ihs.remove(3)
    println(ihs)
    
    println(ihs.indices)
    
    println(ihs.count())
    
    ihs.clear()
    println(ihs)
    
    println(ihs.isEmpty())
}

//9
fun main(args: Array<String>){
   val word = listOf("Hello", "World", "!")
   println(word.get(2))
   println(word.size)
   println(word.getOrElse(3){"Слова закончились"})
   for(w in word) print (w)

   var num = listOf(1, 2, 3, 4, 5)
   var a = num.map{it * it} //возводит каждый элемент в квадрат
   println(a)
   println(num.all {it < 5}) // false
}

//10
fun main(args: Array<String>){
    val mp1 = mapOf("beverage" to 2.7, "meal" to 12.4)
    val mp2 = mp1.mapValues{it.value.toString() + "$"}
    println(mp2)
}

//11
fun main(args: Array<String>){
    val currenciesMutableMap:MutableMap<String, String> = mutableMapOf("Гривна" to "Украина", "Доллар" to "США", "Лира" to "Турция")
    println("Страны: ${currenciesMutableMap.values}")
    println("Валюты: ${currenciesMutableMap.keys}")
    
    println(currenciesMutableMap.containsKey("Гривна"))
    
    println(currenciesMutableMap.containsValue("Россия"))
    
    println(currenciesMutableMap.count())
}