import kotlin.random.Random

fun main(args: Array<String>) {
    val firstName = "Roy"
    val lastName = "Martinez"
    println(firstName + " " + lastName)

    var salary = 300000
    println("First year pay me $" + salary)
    var firstSalary = salary

    salary = 400000
    println("Second year pay me $" + salary)

    fun calculateVariation(firstSalary: Int, secondSalary: Int): Int {
        return secondSalary - firstSalary
    }
    println("Variation salary: $${calculateVariation(300000, 400000)}")

    var intString = 32.toString()
    println("Int to string: ${intString}")

    when (salary) {
        in 0..200000 -> println("Bad salary")
        in 200001..300000 -> println("Medium salary")
        in 300001..500000 -> println("Good salary")
        else -> println("Amazing")
    }

    val nullableName: String? = "RoyMartinez"
    val length = nullableName?.length ?: -1
    println(length)

    val cordinates = Pair(2, 3)
    val (x, y) = cordinates
    println("x = $x and y = $y")

    val cordinatesDouble = Pair(2.1, 3.1)
    val (m, n) = cordinatesDouble
    println("m = ${cordinatesDouble.first} and n = ${cordinatesDouble.second}")

    val cordinatesMixt = Pair(1.1, 2)
    val (b,c) = cordinatesMixt
    println("b = ${cordinatesMixt.first} and c = ${cordinatesMixt.second}")

    val material3D = Triple(1,2,3)
    val (x1,y1,z1) = material3D
    println("x1 = ${material3D.first} and y1 = ${material3D.second} and z1 = ${material3D.third}")

    val (x2,y2,_) = material3D
    println("x2 = ${material3D.first} and y2 = ${material3D.second}")

    /*Boolean IF*/
    val yes1 = true
    val no1 = false

    val yes2 = true
    val no2 = false

    println("Yes1 = Yes2 ${yes1 == yes2}")
    println("No1 == No2 ${no1 == no2}")

    var doesOneEqualTwo = (1==2)
    println("Does 1 = 2 : $doesOneEqualTwo")

    doesOneEqualTwo = (1 != 2)
    println("Does 1 != 2 : $doesOneEqualTwo")

    val guess = "dog"
    val dogEqualCat = guess == "cat"
    println(dogEqualCat)

    val myAge = 30
    val isTeenager = myAge>=13 && myAge<=19
    println("isTeenager = $isTeenager")

    val theirAges = 39
    val bothTeenagers = (theirAges>=13 && theirAges<=19) && (myAge>=13 && myAge<=19)
    println("bothTeenagers : $bothTeenagers")

    val student = "Roy Martinez"
    val author = "Kevin Moore"
    val authorIsStudent = (student == author)
    println("Author Is Student :$authorIsStudent")

    val studentBeforeAuthor = student < author
    println("Student Before Author: $studentBeforeAuthor")

    if (isTeenager){
        println("Im teenager")
    } else{
        println("Im not a teenager")
    }

    val answer = if (myAge>=13&&myAge<=19) "Im teenager" else "Im not teenager"
    println("Answer: $answer")

    var hoursWorked = 45
    var price = 0.0
    if (hoursWorked>40){
        val hoursOver40 = hoursWorked - 40
        price += hoursOver40*50
        hoursWorked -= hoursOver40
    }
    price += hoursWorked*25
    println(price)

//While( ) Loop
    var i = 1
    while (i<10){
        print(i)
        i++
    }
    println()
    println("-----------")

    i=1
    do{
        print(i)
        if (i==5){
            break
        }
        i++
    }while (i<10)

    //Challenge
    var counter = 0
    while (counter<10){
        println("Counter: $counter")
        counter++
    }

    counter = 0
    var roll = 0
    val random = Random
    do{
        roll = random.nextInt(6)
        counter+=1
        println("After $counter roll(s), roll is $roll")
    }while (roll!=0)
    println(random)






//Nullables
    //Challenge
    val myFavoriteSong: String? = "Bohemian Rhapsody"

    fun printFavoriteSong(song :String?){
        println("myFavoriteSong: $song ")
    }
    printFavoriteSong(myFavoriteSong)


    var result : Int? = 10
    println("Result: $result")
    result = 30
    println("Result: $result")
    println(result+1)
    val newResult = result?.plus(5)
    println(newResult)

    var w : Int? = null
    if (w != null){
        w += 1
    }
    println(result!! + 1)

    //Challenge Nullables
    fun printNickname(nickname : String?){
        println("Your nickname is: ")
        //nickname?.let{println(nickname)}? : println("No nickname")
    }
    printNickname("Roy")


//Arrays
    val evenNumbers = arrayOf(1,2,3,4)
    val evenNumbers2 : Array<Int> = arrayOf(1,2,3,4)
    val intNumbers = intArrayOf(1,2,3,4)

    var players = arrayOf("Alice", "Bob", "Dan", "Eli", "Frank")
    for (name in players){
        if (name == "Dan") println(players.indexOf("Dan"))
    }

    val scores = arrayOf(2,2,8,6,1)

    var index = 0
    for (names in players){
        println("${index+1}. $names - ${scores[index]}")
        index+=1
    }

//List
    val names = listOf("Anna", "Brian", "Craig", "Donna")
    println(names)

    val teamNames = mutableListOf<String>()
    teamNames.addAll(names)
    teamNames.add("Sam")
    teamNames.add("George")
    println(teamNames)

    println(teamNames[0])
    println(teamNames.indexOf("Anna"))

    teamNames.remove("George")
    println(teamNames)

    for (member in teamNames){
        println("Team Member: $member")
    }

    //Challenge List
    val myStates = mutableListOf<String>()
    val states = listOf("Lima", "Trujillo", "Arequipa", "Cuzco", "Piura", "Cañete")
    myStates.addAll(states)
    myStates.add("Ica")
    println(myStates)

    fun printStates(states : List<String>){
        for (index in 0..states.size-1){
            if (index != 3){
                println("State: ${index+1} ${states[index]}")
            }
        }
    }

    printStates(states)

    var variables = listOf("Roy", 30, 2018, "Psycologhy")
    println(variables)

//Maps
    var namesAndScores = mapOf("Anna" to 2, "Brian" to 2, "Craig" to 8, "Donna" to 6)
    println(namesAndScores)
    println(namesAndScores["Anna"])
    println(namesAndScores["Greg"])
    println(namesAndScores.isEmpty())
    println(namesAndScores.count())

    val royData = mutableMapOf("Name" to "Roy", "Age" to "30", "Profession" to "Fireman", "City" to "Oakland")
    println(royData)

    royData["Profession"] = "Pilot"
    println(royData)

    royData.remove("City")
    println(royData)

    for ((player, score) in namesAndScores){
        println("$player - $score")
    }

    for (player in namesAndScores.keys){
        println("$player, ${namesAndScores[player]}")
    }

    //Challenge Maps
    val myMap = mutableMapOf("name" to "Roy", "profession" to "programmer", "country" to "peru", "state" to "lima", "city" to "lima")
    println(myMap)

    myMap["city"] = "buenos aires"
    myMap["country"] = "argentina"
    println(myMap)

    fun printPlayers(person : Map<String, String>){
        val state = if (person.containsKey("state")) person["state"] else ""
        val city = if (person.containsKey("city")) person["city"] else ""
        println("Person lives in $city, $state")
    }
    val person1 = mapOf("state" to "AA", "city" to "OAK")
    printPlayers(myMap)

    /*
    Rules of thumb
    Big collections:
        Array: if order matters
        Maps: if need to frequently search
        List: if you need to add and remove items
    Small collections:
        Choose what feels natural
    */


    

}

