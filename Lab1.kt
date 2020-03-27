//3
/*fun main(args: Array<String>){
   var num = 123
    println(counter(num))
}

fun counter(inputValue:Int):Int{
    val str = "$inputValue см."
    println(str)
    return str.length
}*/

//4
fun counter(a:Int,b:Int) = if (a >; b) a else b{
    "$a см.".length
    }

//6-7
fun main(args: Array<String>) {
    if (args.size == 0) {
        println("Please provide a name as a command-line argument") 
    }
    else{
        println("Hello, ${args[0]}!")
    }
}

//8
fun main(args: Array<String>) {
    println("Имя: ${args[0]}")
    println("Отчество: ${args[1]}")
    println("Фамилия: ${args[2]}")
}

//9
fun main(args: Array<String>) {
    println("Первое слогаемое: ${args[0]}")
    println("Второе слогаемое: ${args[1]}")
    val a = args[0].toInt() + args[1].toInt()
    println("Сумма: $a")
}

//10
fun main(args: Array<String>) {
    println("Hello, ${args[0]}")
    println("Hello, ${args[1]}")
    println("Hello, ${args[2]}")
}

//14
fun main(args: Array<String>) {
    for (index in args.indices){
        println("item at $index is ${args[index]}")
    }
}

//15
fun main(args: Array<String>) {
    var i = 0
    while(i<args.size){
        println("item at $i is ${args[i]}")
        i++
    }
}