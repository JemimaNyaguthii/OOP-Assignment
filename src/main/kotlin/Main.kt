fun main(){
   var detail = Human("Jemima",18,58)
    detail.ate(4)
    detail.speak("Hello")
    detail.birthday(1)
    val user=information("Mary","Njeri","marynjeri@gmail.com",711283753,200)
    println(user.firstName)
    println(user.phoneNumber)



}
class Human( var name:String,var age:Int, var weight:Int) {
    fun ate(plus: Int) {
        weight+=4
        println("I am eating $weight kgs of food")

    }

    fun speak(speech: String) {
        println(speech)
    }

    fun birthday(add: Int){
        age+=1
        println(age)
    }
}
data class information(var firstName:String,var lastName:String,var email:String,var phoneNumber:Int,var password:Int)













