import java.net.Inet4Address
import java.net.Inet6Address
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter
import java.util.*

/**
 * Created by arpitagarwal on 16/08/17.
 * Programs resource URL - http://www.programmingsimplified.com/java-source-codes
 */


fun main(args: Array<String>) {
//    helloWorld("Hello world")
//    ifElse(5)
//    forLoop(10)
//    printAlphabets()
//    multiplicationTable(9)
//    getInpurFrmUser()
//    oddEven(4)
//        fahToCel(101)
//    classesModifiersConstructorsMethods()
//    exceptionHandling("24ddfdsfsdfsdfsdfdsfsdfsdfsfdsfdsfsdfsfdfssfdfdfs")
//    swapping(3,5)
//    largestElement(listOf(3, 4, 5, 2, 2, -1))
//    factorial(786)
//    primes(7)
//    armstrongNo(1)
//    floydsTriangle(15)
//    reserveString("hulaloop")
//      palindrome("s")
//    val classVar = C().bar()
//    val classVar = D().foo()
//    compareStrings("afds","afds")
//    linearSearch()
//    binarySearch()
//      substring("fun")
//    displayDateTime()
//    randomNo()
//    garbageCollector()
//    ipAddress()
//    reverseNumber(3463000)
//    addMatrix()
//    transposeOfMatrix()
//    multiplyMatrix()
//    bubbleSort(mutableListOf(3,5,6,2,6,6,-1,45,3))
//    openNotePad()
}


/**
 * Hello world
 */
fun helloWorld(input: String) {
    println(input)
}

/**
 * if else
 * enter two no a,b and compare
 */
fun ifElse(n: Int) {

    val remainder = if (n % 2 == 0) {
        println("$n is even")
        0
    } else {
        println("$n is odd")
        1
    }

    println(remainder)
}

/**
 *For Loop
 */
fun forLoop(n: Int) {

    for (i in 0..n) {
        println(i)
    }
}

/**
 * While loop
 */
fun whileLoop(n: Int) {
    var i = 0
    do {
        println(i++)
        i++
    } while (i < n)
}

/**
 * Print Alphabets
 */
fun printAlphabets() {
    val ch = 'A'

    //Here instead of ch you can direct use 'A'
    for (i in 'A'..'z') {
        if (i.toInt() < 'Z'.toInt() || i.toInt() > 'a'.toInt()) {
            println(i)
        }

    }
}

/**
 * Multiplication Table
 */
fun multiplicationTable(n: Int) {

    for (i in 1..10) {
        println("$n*" + i + "=" + (n * i))
    }
}

/**
 * Get input from user , in this case we are using scanner but there are other ways also
 */
fun getInpurFrmUser() {
    val scn = Scanner(System.`in`)
    print("Enter 1st integer no")

    //Instead of int you can specify other types also
    val a: Int = scn.nextInt()
    print("Enter 2nd integer no")
    val b: Int = scn.nextInt()

    println("$a+$b=" + (a.plus(b)))
    //Or println(a+","+b)
}

/**
 * odd even Done above in else if
 */
fun oddEven(n: Int) {
    val remainder = if (n % 2 == 0) {
        println("$n is even")
        0
    } else {
        println("$n is odd")
        1
    }
}

/**
 * Fahrenheit to Celcius
 * Here is subcategory for all types of numbers
 * here we are restricting the decimal to 2 decimal places
 */
fun fahToCel(n: Number) {
    var d = n.toDouble()
    d = (((d - 32) * 5) / 9)

    println("$d".format(2))
    println("%.2f".format(d))
    println()
}

/**
 * Access Modifiers
 * Java static method
 * multiple classes
 * Constructors
 *TODO For above topics Read https://kotlinlang.org/docs/reference/classes.html
 */
fun classesModifiersConstructorsMethods() {
    //TODO - write classes,constructors,modifiers,nested classes, overriding classes and imterfaces
}

/**
 * Exception handling
 * You can use try,catch, final as in java
 * "throw" keyword in Kotlin
 * https://kotlinlang.org/docs/reference/exceptions.html
 */
fun exceptionHandling(message: String) {
    throw IllegalArgumentException(message)
}

/**
 * Swapping
 * No need to write conventional swap just use "also" function in kotlin
 * TODO -Read  https://medium.com/@tpolansk/the-difference-between-kotlins-functions-let-apply-with-run-and-else-ca51a4c696b8
 */
fun swapping(a: Int, b: Int) {
    println("$a,$b")
    var a = a
    var b = b
    a = b.also { b = a }
    println("$a,$b")
}

/**
 *Largest of the three elements
 * Collections resource for list
 * TODO - Read https://kotlinlang.org/docs/reference/collections.html
 */
fun largestElement(list: List<Int>) {
    println(list.max())
    println(list.min())
}

/**
 * Factorial
 */
fun factorial(n: Long) {

    var fac = 1L
    for (i in n until n) {
        fac = fac * i
    }
    println(fac)
}

/**NOTE ; IN KOILIN THE PARAMETERS PASSED ARE ALWAYS IMMUTABLE**/

/**
 * Primes
 *Breaking,continue the loop
 * Maths functions
 * Use optimized school method
 */
fun primes(n: Int) {

    println("2")
    println("3")

    supLopp@ for (j in 5..n) {
        val sqrtN: Int = (Math.sqrt(j.toDouble())).toInt()

        if (j % 2 == 0 || j % 3 == 0) {
            continue@supLopp
        }

        loop@ for (i in 5..sqrtN step 6) {
            if (j % i == 0 || j % (i + 2) == 0) {
                break@loop
            }
        }
        println(j)
    }

}

/**
 * Armstrong No
 *Here in Kotlin the "0034" type input won't be accepted so we dont have to worry about zero's in the beginning
 * if the user gives input like 000045534 it will be implicitly converted to 45534 in Kotlin by removing initial zeroes
 */
fun armstrongNo(n: Int) {

    var nString = n.toString()
    var size = nString.length
    var sum = 0
    for (i in n.toString()) {
        //We have used -48 because char value of '3' return 51 so 51-48=3 is the double value
        sum = (sum + Math.pow(i.toDouble() - 48, size.toDouble())).toInt()
    }

    if (sum == n) {
        println("True")
    } else {
        println("False")
    }
}

/**
 * Floyd's Triangle
 *
 */
fun floydsTriangle(n: Int) {
    var x = 0
    for (i in 1..n) {
        for (j in 1..i) {
            //Doing calculations in string block
            print("${++x} ")
        }
        println()
    }
}

/**
 * Reverse String
 * Do without using inbuild function
 */
fun reserveString(str: String) {
    var s = str
    s = str.reversed()
    print(s)

    //Using charArray
//    for (i in str.toCharArray().reversed()){
//        println(i)
//    }

}

/**
 * Palindrome
 */
fun palindrome(str: String) {
    if (str.equals(str.reversed()))
        print(true)
    else
        print(false)
}


/**
 * Interface in methods
 * In Kotlin they can have their body unlike java, we use Class Name for specifying the parent class of method in
 * case of conflict
 * TODO read - https://kotlinlang.org/docs/reference/interfaces.html
 */
interface A {
    fun foo() {
        print("A")
    }

    fun bar()
}

interface B {
    fun foo() {
        print("B")
    }

    fun bar() {
        print("bar")
    }
}

class C : A {
    override fun bar() {
        print("bar")
    }
}

class D : A, B {
    override fun foo() {
        super<A>.foo()
        super<B>.foo()
    }

    override fun bar() {
        super.bar()
    }
}

/**
 * Compare Strings
 */
fun compareStrings(strA: String, strB: String) {
    println(strA.compareTo(strB))
}

/**
 *Linear search
 * making use of mutable list as simple list in kotlin is only readable
 * TODO READ - https://kotlinlang.org/docs/reference/collections.html
 */
fun linearSearch() {
    var scn = Scanner(System.`in`)
    println("Enter array size")
    var n: Int = scn.nextInt()
    var list = mutableListOf<String>()
    for (i in 0..(n - 1)) {
        list.add(scn.next())
    }
    println("Enter element to search for")
    var str = scn.next()
    for (i in list) {
        if (str.equals(i)) {
            println("Elements is present")
            return
        }
    }
    println("Element is not present")
}

/**
 * Binary search
 * This code implements binary search algorithm.
 * Input numbers must be in ascending order.
 */
fun binarySearch() {
    var list = listOf<Int>(0, 7, 8, 15, 30)

    println("Enter no to search for")
    val scn = Scanner(System.`in`)
    val n = scn.nextInt()

    val result = logic(n, list, 0, list.size - 1)
    println(result)
}

fun logic(n: Int, list: List<Int>, ini: Int, end: Int): Int {
    var si: Int = (ini + end) / 2
    var result = 0
    if (n == list[si]) {
        result = n
    } else if (n < list[si] && si - 1 >= ini) {
        result = logic(n, list, ini, si - 1)
    } else if (n > list[si] && si + 1 <= end) {
        result = logic(n, list, si + 1, end)
    } else {
        result = -1
    }
    return result
}

/**
 * Substring
 * This program find all substrings of a string and the prints them. For example substrings of "fun" are :- "f", "fu", "fun", "u", "un" and "n". substring method of String class is used to find substring.
 * Kotlin code to print substrings of a string is given below.
 */
fun substring(str: String) {
    for (i in 0..str.length - 1) {
        var k = i + 1
        while (k <= str.length) {
            println(str.subSequence(i, k))
            k++
        }
    }
}

/**
 * Date and time
 * https://www.programiz.com/kotlin-programming/examples/current-date-time
 */
fun displayDateTime() {
    var date = LocalDateTime.now()
    val format = DateTimeFormatter.ISO_DATE_TIME
    val formatted = date.format(format)

    println(formatted)
}

/**
 * Random No.
 */
fun randomNo() {
    var r = Math.random() * 100
    println(r)
}

/**
 * Garbage collection
 * Free memory after collection is more than before
 */
fun garbageCollector() {
    var r = Runtime.getRuntime()

    println(r.freeMemory())
    r.gc()
    println(r.freeMemory())
}

/**
 *
 */
fun ipAddress() {
    println(Inet4Address.getLocalHost())
    println(Inet6Address.getLocalHost())
}

/**
 *Reverse Number
 */
fun reverseNumber(n: Int) {
    var j = n
    var sum = 0
    var i = 0
    while (j > 0) {
        sum = (sum * 10 + (j % 10))
        j = j / 10
        i++
    }
    println(sum)
}


/**
 * Matrix
 */
fun addMatrix() {
    val arr1 = arrayOf(intArrayOf(2, 4, 3), intArrayOf(-3, 5, 90), intArrayOf(2, 4, 3), intArrayOf(-3, 5, 90))
    val arr2 = arrayOf(intArrayOf(2, 4, 3), intArrayOf(-3, 5, 90), intArrayOf(2, 4, 3), intArrayOf(-3, 5, 90))
    println("no of rows = ${arr1.size}")
    println("no of columns ${arr1[0].size}")

    for (j in 0..(arr1.size - 1)) {
        for (i in 0..(arr2[0].size - 1)) {
            print("${arr1[j][i] + arr2[j][i]} ")
        }
        println()
    }
}

/**
 * Transpose of matrix
 */
fun transposeOfMatrix() {
    //We have 4*3 matrix
    val arr1 = arrayOf(intArrayOf(2, 4, 3), intArrayOf(-3, 5, 90), intArrayOf(2, 4, 3), intArrayOf(-3, 5, 90))

    for (j in 0..(arr1[0].size - 1)) {
        for (i in 0..(arr1.size - 1)) {
            print("${arr1[i][j]} ")
        }
        println()
    }
}

/**
 * Multiply two matrix
 * Requirement - if A is an m x n matrix and B is an r x s matrix, n = r.
 */
fun multiplyMatrix() {
    val arr1 = arrayOf(intArrayOf(2, 4, 3), intArrayOf(-3, 5, 90), intArrayOf(2, 4, 3), intArrayOf(-3, 5, 90))
    val arr2 = arrayOf(intArrayOf(2, 4, 3), intArrayOf(-3, 5, 90), intArrayOf(2, 4, 3))

    for (i in 0..(arr1.size - 1)) {
        for (k in 0..(arr2.size - 1)) {
            var sum = 0
            for (j in 0..(arr1[0].size - 1)) {
                sum = sum + (arr1[i][j] * arr2[j][k])
            }
            print("$sum ")
        }
        println()
    }
}

/**
 * Bubble Sort
 * ascending order
 */
fun bubbleSort(list: MutableList<Int>) {
    var k = list.size - 1
    for (i in 0..(k - 1)) {
        for (j in 0..(k - i - 1)) {
            if (list[j] < list[j + 1]) {
                list[j] = list[j + 1].also { list[j + 1] = list[j] }
            }
        }
    }
    list.reverse()
    for (i in 0..(list.size - 1)) {
        println(list[i])
    }
}

/**
 * program for running mac terminal commands from Kotlin program
 */
fun openNotePad() {
    var rs = Runtime.getRuntime()
    //This will create a directory name "kotlinpractice" in the directory containing the src folder of the project
    rs.exec("kotlinpractice")

}


/*
Some more programs for practice
hcf and lcm
decimal to binary conversion
merge two arrays
insertion sort
selection sort
check anagram
merge/copy two files
list files in directory
add two imaginary nos.
 */