import java.util.Scanner
fun main(args: Array<String>) = with(Scanner(System.`in`)){
    val N = nextInt()
    val F = nextInt()
    var num = N
    for(i in N.toString().take(N.toString().length-2).toInt()*100..N+100) {
        if(i % F != 0){
          num++  
        } else {
            num = i
            break
        }
    }
    
    
    print(num.toString().takeLast(2))
}