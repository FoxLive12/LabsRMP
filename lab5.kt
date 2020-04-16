//1
package com.example.myapplication
class Student(private var id: Int) {
    private var exams: Array<ExamResult>
    private inner class ExamResult(name: String) {
	private var name: String = name
        private var mark: Int = 0
        private var passed: Boolean = false

        fun passExam(){
            passed = true
        }

        fun setMark(mark: Int){
            this.mark = mark
        }

        open fun getMark() = mark

        fun getPassedMark() : Int{
            val PASSED_MARK: Int = 4;
            return PASSED_MARK
        }

        fun getName() = name
        fun isPassed() = passed

    }
    fun setExam(name: Array<String>, marks: IntArray) {
        if (name.size != marks.size)
            throw IllegalArgumentException()
        exams = Array(name.size) { ExamsResult("null") }
        for (i in name.indices)
        {
            exams.set(i, ExamsResult(name[i]))
            exams[i].setMark(marks[i])
            if (exams[i].getMark() >= exams[i].getPassedMark())
                exams[i].passExam()
        }
    }
        override fun toString: String(){
            var res = "Студент: $id\n"
            for (i in exams.indices) {
                if (exams[i].isPassed())
                res += exams[i].getName() + " сдал \n"
            else
                res += exams[i].getName() + " не сдал \n"
        }
        return res
    }

}


package com.example.myapplication
object AnySession {
    fun main(args: Array<String>){
    var stud: Student = Student(822201)
    var ex: Array<String> = arrayOf("Механика", "Программирование")
    var marks: Array<Int> = arrayOf(2, 9)
    stud.setExams(ex, marks)
    println(stud.toString())
}

//2
package com.example.myapplication

fun main(args: Array<String>) {
    //вызов статического метода
    Ship.LifeBoat.down()
    //создание объекта статического класса
    val lf = Ship.LifeBoat() //вызов обычного метода
    lf.swim()
}

package com.example.myapplication
open class Ship {
    private val id = 0
    class LifeBoat {
        fun swim() {
            println("отплытие шлюпки")
        }
        companion object {
            fun down() {
                println("шлюпки на воду!")
            }
        }
    }
}

//4
/прямоугольник/
class Rectangle(val width: Float, val height: Float) : Figure()
{override fun perimeter(): Float{
        return width * 2 + height * 2;
    }
override fun area(): Float{
        return width * height;
    }
}
/треугольник/
class treug(val height: Float, val a:Float,val b:Float,val c:Float):Figure(){
override fun perimeter(): Float{
return a+b+c
}
override fun area(): Float{
return (a*height)/2
}
/трапеция/
class trap(val height: Float, val a:Float,val b:Float,val c:Float,val d:Float):Figure(){
override fun perimeter(): Float{
return a+b+c+d
}
override fun area(): Float{
return ((a+b)/2)height
}