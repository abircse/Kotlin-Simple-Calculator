///-----Initialize public Variable-----//
//----Val is a keyword for constant value which cant be changes (Here with value)---//

//----Constant Value---//
val num1 : Int = 10
val num2 : Int = 20

///-----Main Fuction of Kotlin where execusion start----///
fun main(args: Array<String>)
{
    //---function call from outside of main body---//
    additon()
    subtraction()
    multiply()
    division()
}

//-----2 number additional fuction----///
fun additon() {

    //----variable diclaration with out value---//
    val sum : Int
    sum = num1 + num2
    //---Print output---//
    println("Additional Result is: "+sum)

}

//-----2 number subtractional fuction----///
fun subtraction() {

    //----variable diclaration with out value---//
    val sum : Int;
    sum = num1 - num2
    //---Print output---//
    println("subtraction Result is: "+sum)

}

//-----2 number multiplicational fuction----///
fun multiply() {

    //----variable diclaration with out value---//
    val sum : Int
    sum = num1 * num2
    //---Print output---//
    println("multiplication Result is: "+sum)

}

//-----2 number divisional fuction----///
fun division() {

    //----variable diclaration with out value---//
    val sum : Int
    sum = num1 / num2
    //---Print output---//
    println("divisional Result is: "+sum)

}
