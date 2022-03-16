class Methods {

    static String method1(String name) {
        return "Hello " + name
    }

    static def method2(String name) {
        return "Hello " + name
    }

    static def method3(int x, int y) {
        return x + y
    }

    // Method with default values
    static def method4(int x=0, int y=1) {
        return x + y
    }

    static void main(String[] args) {
        println(method1('Davor'))
        println(method2('Bianca'))
        println(method3(6, 5))
        println(method4())
    }

}
