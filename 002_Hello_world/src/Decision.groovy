class Decision {
    static void main(String [] args) {
        def var1 = 5
        def var2 = 10
        def var3 = 100
        // Conditionals If statement
        if (var1 != var2) {
            println('Hello')
        } else if (var1 != var3) {
            println('Another value')
        } else {
            println('Else data')
        }

        // Switch statement
        switch (var1) {
            case 1:
                println('x=1')
                break;
            case 2:
                println('x=2')
                break;
            default:
                println('default value')
        }

        // Loops
        // While statement

        while(var3 < 1000) {
            var3++
            println(var3)
        }

        // For statement
        for(def i=0;i<100;i++) {
            println('i = ' + i)
        }

        int[] var4 = [1,2,3,4,5,6]
        for (int data : var4) {
            println(data)
        }

        for (data in var4){
            println(data)
        }

    }
}
