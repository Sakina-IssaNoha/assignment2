fun main(){
  greeting()
    rem(7,5)
   add(30,34,5,9)
    fact()
}


fun greeting(){
    var name = "sakina"
    println("hello "+ name)

}
fun rem(a:Int,b:Int){
    var rem = a % b
    println(rem)
}
fun add(a:Int,b:Int,c:Int,d:Int){
    var sum = a + b + c + d
    println(sum)
}
fun fact(){
    var fact ="am simple"
    println(fact)
}