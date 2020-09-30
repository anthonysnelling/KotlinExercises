
class Login<T>(name: T, password: T){
    init {
        println("Name: $name Password: $password")
    }
}

class Person2(username: String, password: String){
    var username: String? = null
    var password: String? = null
    init {
        this.username = username
        this.password = password
        println("Person Class")
    }
}

fun main (args: Array<String>){

    var login = Login<String> ("John", "John")
    var login2 = Login<Int> ( 12, 23)
    var login3 = Login<Boolean>(true, false)

    val person = Person2("Paulo", "Paul")

    var user = Login<Person2>(person, person)
}