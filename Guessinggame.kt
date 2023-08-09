import kotlin.math.roundToInt
import kotlin.random.Random

fun main() {
    val secretNumber = (Math.random()*100).roundToInt()

    println("Can you the guess the number I'm thinking of? (1-100)")
   val guess = Integer. parseInt(readLine())
 
 if (guess == secretNumber) {
     println("You did it!! Wow Congrats:)")
} else { 
 println("Better luck next time!")
 }
}
