fun main() {
    // Instance of class Human
    val person = Human("Florence" ,19, 43)
    println(person.name)
    println(person.age)
    println(person.weight)
    person.eat(2)
    person.speak("My name is Florence, I'm 19 years old. How are you? What's your name?")
    person.birthday()

    // Instance of data class User
    var myUser = User("Beth", "Wangui", "bethwangui@gmail.com", "+25472000000", "Wa112e@#./")
    println(myUser.firstName)
    println(myUser.lastName)
    println(myUser.email)
    println(myUser.phoneNumber)
    println(myUser.password)
}


    /*
    Question 1
    Create a class called Human with these attributes: name, age, weight. It has

    the following functions:
    - eat(foodWeight: Int) :Prints “I am eating {foodWeight} kgs of food”
    and increments the human’s weight by the weight of the food eaten
    - speak(speech: String) :Prints the string passed to it
    - birthday( ) :Increments the human’s age by 1
    Create an instance of this human class and invoke all its functions
    */

class Human(var name: String, var age: Int, var weight: Int){
    fun eat(foodWeight: Int) {
        println("I am eating $foodWeight kgs of food.")
        weight += foodWeight
    }
        fun speak(speech: String) {
            println("$speech")
        }
        fun birthday(){
            age++
            println(age)
        }
}


/*
    Question 2
    Create a data class User with these fields: firstName, lastName, email,

    phoneNumber, password. Create an instance of User and print out any 2
    attributes.
 */

data class User(var firstName: String, var lastName: String, var email: String, var phoneNumber: String, var password: String)