class Operators {

    static void main(String[] args) {
        def var1 = 30
        def var2 = 57

        println(var1 + var2)
        println(var1 - var2)
        println(var1 * var2)
        println(var1 / var2)
        println(var1 % var2)
        println(var1++) // Increment
        println(--var2) // Decrement

        // Relational Operators
        println(var1 == var2)
        println(var1 != var2)
        println(var1 >= var2)
        println(var1 <= var2)

        // Logical Operators
        println(var1!=var2 && var1<var2) // And Operator
        println(!(var1!=var2 || var1<var2)) // Negation and Or Operator

        // Assignment Operators
        println(var1 += 5)
        println(var2 -= 10)

        // Range Operators
        def var3 = 0..10
        println(var3)
        println(var3.get(4))
    }
}
