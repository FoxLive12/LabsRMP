//1
fun main(args: Array<String>){
    class Person{
        var name: String="Tom"
        var age: Int=13
    }
    val cl: Person=Person()
    cl.name = "Dima"
    cl.age = 18
    
    println(cl.name + " " + cl.age)
}

//2
fun main(args: Array<String>){
    class Person{
        var name: String="Dima"
        get(){
            return field.toUpperCase()
        }
        set(value){
            if(value.length >= 2){
                field = value
            }
        }
        var age: Int=18
    }
    val cl: Person = Person()
    println(cl.name)
    cl.name =  "Vlad"
    println(cl.name)
}

//3
fun main(args: Array<String>){
    class Gate(mSwing: Int, IN: Int, OUT: Int, CLOSED: Int){
        val IN = 1
        val OUT = -1
        val CLOSED = 0
        var mSwing: Int = 0
        fun getSwingDirection(): Int = mSwing
        fun setSwing(pol: Int): Boolean{
            if (pol == IN  pol == OUT  pol == CLOSED)
            {
                mSwing = pol
                return true
            } 
            return false
        }
        fun open(pol: Int): Boolean{
            if (pol == IN || pol == OUT){
                setSwing(pol)
                return true
            } 
            return false
        }
        fun close(){
            mSwing = CLOSED
        }
        fun thru(count: Int): Int{
            if (count == IN) return count
            if (count == OUT) return -count
            if (count == CLOSED) return count
            return 0
        }
        override fun toString(): String{
            if (mSwing == CLOSED){
 		return "Ворота закрыты"
		}
            if (mSwing == IN){ 
		return "Ворота открыты во внутрь"
		}
            if (mSwing == OUT){ 
		return "Ворота открыты наружу"
		}
            return "Ворота открыты в неправильную сторону"
        }
    }
    val q = Gate()
    println(q.toString())
}

//4
fun main(args: Array<String>){
    interface Clickable{
    	fun click()
}   
    class Button : Clickable{
        override fun click() = println("I was clicked")
    }
}

//5
fun main(args: Array<String>){
    interface Clickable{ 
    	fun click() = println("Hello world!")
	}
    
    interface Example{ 
    	fun click() = println("I was clicked")
	}
    
    class Button : Clickable, Example{
        override fun click() = super<Example>.click()
    }
    val bttn = Button()
    bttn.click()
}