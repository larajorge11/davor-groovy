class FileWrite {

    static def readFile(String path) {
        try {
            File file = new File(path)
            return file.text
        } catch(e) {
            assert e
        }
    }

    static void main(String[] args) {
        try {
            File file = new File('./', 'hello.txt')
            file.withWriter {it.writeLine("DAVOR")}
        } catch(e) {
            assert e
        }

        println(readFile("./hello.txt"))
    }
}
