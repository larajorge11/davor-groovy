class App {
    static void main(String[] args){
        // This is a comment in groovy
        /* This is a multi line comment
        *
        * Learning Groovy, Install Groovy and Java
        * groovysh: Open a groovy console to execute code
        * groovyConsole: Open a console GUI groovy
        * */

        println('Davor Groovy!')
        println(5+3-2+4)
        println(5 > 10)

        // Executing Java Code in Groovy Background
        System.out.println('This is Java code executing in Java, semicolon is not necessary')

        // Define variables
        def var1 = 1000
        def var2 = false
        def var3 = 'Davor'
        def var4 = 'Bianca'
        println(var1)
        println(var2)
        println(var3 + ' ' + var4)

    }
}
