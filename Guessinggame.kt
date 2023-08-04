import kotlin.random.Random

fun main() {
    val secretNumber = Random.nextInt(1, 100)

    var numTries = 0
    var numTriesLeft: Int
    var gameWon = false

    println("Let's play Guess a number!")
    println("--------------------------")
    println("I have chosen a number between 0 and 100.")
    println("Can you guess what the number is?")

    while (true) {
        numTriesLeft = MAX_TRIES - numTries

        if (numTriesLeft == 1) {
            println("This is your last try")
        } else {
            println("You have $numTriesLeft tries left")
        }

        var guessedNumber: Int

        do {
            print("Guess a number: ")
            guessedNumber = readLine()!!.toIntOrNull()!!

            val isNumberValid = guessedNumber in 1..99

            if (!isNumberValid) {
                println("Please enter a number between 0 and 100")
            }
        } while (!isNumberValid)

        if (guessedNumber > secretNumber) {
            println("Too high")
        } else if (guessedNumber < secretNumber) {
            println("Too low")
        } else {
            println("Your guess was correct!")
            gameWon = true
            break
        }

        numTries++

        if (numTries >= MAX_TRIES) {
            println("Game over!")
            break
        }
    }

    println("The secret number was: $secretNumber")

    if (gameWon) {
        val score = numTriesLeft * POINTS_PER_TRY_LEFT

        println("Congrats! You won")
        println("Your score was: $score")
    }
}

const val MAX_TRIES = 7
const val POINTS_PER_TRY_LEFT = 100
