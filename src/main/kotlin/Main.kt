fun main() {
string("akirachix")
    println(Sole("Omara Emmanuel Etuk",1))
    println(str("Kotlin now"))

    myName("Ityaku")
    myName("Priscila")

    my("Omara Emma")
    my("Eyolu Yuvy")

    call("My mother is Jane")
    call("Aunty Asayo")
}



//Assignment 3: Strings
//1. Given a string “akirachix”. Write a function that prints out a string composed
//of the first, third and fourth characters of the string (2 points)
fun string(name:String){
 println(name[0])
 println(name[2])
 println(name[3])



}






//2. Write a function that takes in 2 parameters, name and age and returns a
//String with this structure “Hi, my name is x and I am y years old.” Where x and
//y are the provided name and age respectively. (3 points)
fun Sole(name:String,age:Int):String{
    var words="Hi my name is $name and I am $age year old"
    return words

}

//3. Write a function that takes in a String and returns its length (2 points)
fun str(named:String):Int{
    var people=named.length
    return people
}

//4. Write a function that takes in a name and prints out “That’s me!” when your
//name is passed to it, otherwise it prints out “I don’t know who that is” (3
//points)
fun myName(names:String){
    var mynames = "Ityaku"
    if (names == mynames){
        println("That's me")
    }

    else{
        println("I don't know who that is")
    }
}

//5. Write a function that takes in a name and prints out “Yes,it’s me!” when your
//name is passed to it, otherwise it prints out “I am not sure who you are” (3
//points)
fun my(name: String){
    var mine="Omara Emma"
    if(name == mine){
        println("Yes,it's me!")
    }
    else{
        println("I am not sure who you are")
    }
}






//6. Write a function that takes in a name and prints out “Yes,that's true!” when your
//country is passed to it, otherwise it prints out “I don't know” (3
//points)
fun call(name:String){
    var named="My mother is Jane"
    if(name==named){
        println("Yes,that's true")
    }
    else{
        println("I don't know")
    }
}