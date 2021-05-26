fun main() {
    var veggieChoice: Int

    println("Welcome to Cadieux's roadside Veggies")

    do {
        println("Please choose your vegetable")
        println("1: Tomatoes")
        println("2: Peppers")
        println("3: Carrots")
        println("4: Beets")
        println("5: Onions")
        println("6: Exit these veggies")

        print("Veggie Choice: ")
        veggieChoice = readLine()!!.toInt()

        if (veggieChoice!=6){
            println("Great choice!  What else you want? \n")
        }

    }while(veggieChoice!=6)

        println("Thanks for checking out my veggies!")
}