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
}

