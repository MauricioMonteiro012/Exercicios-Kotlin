fun main(Args: Array<String>){
    println(soma(12, 17))
    println(soma(2))
}
 
fun soma(a: Int, b: Int = 2): Int {
    return a + b

}