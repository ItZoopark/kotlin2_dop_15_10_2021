
open class Person(protected var name: String = "", protected var age: Int = 0){

    init {
        println("Новый пользователь был создан!")
    }

    var height: Float = 0.0f
        set(value) {
            if(value < 0.0f){
                println("Некорректные данные")
            }
            else if (value > 300.0f){
                println("Такого не может быть!")
            }
            else{
                field = value
            }
        }
    get() {
        return field/100
    }

    fun setData(name: String, age: Int){
        this.name = name
        this.age = age
    }

    protected fun convertAgeToDay(){
        println("Вы прожили дней: ${age*365}")
    }

    open fun show(){
        println("$name, $age")
    }
}

class Employee(name: String, age: Int, private var exp: Int) : Person(name, age) {

    override fun show(){
        println("$name, $age имеет опыт работы: ${exp.toString()}")
    }

    fun ageToDays(){
        convertAgeToDay()
    }
}
fun main(){

    var emp1 = Employee("Вася", 16, 5)
    emp1.show()
    emp1.ageToDays()
    var person2 = Person("Вася", 16)
    person2.show()
//    var person3 = Person()
//    person2.setData("Vasya", 16)
//    person2.height = -1.0f
//    println(person2.height)
//    person2.show()
//    var person1 = Person("Ivan", 15)
//    person1.show()


}