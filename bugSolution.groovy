```groovy
class MyClass {
    def method1() {
        println "In method1"
        method2()
    }

    def method2() {
        println "In method2"
        method3()
    }

    def method3() {
        println "In method3"
        try {
            def x = 10 / 0
            println "After division"
        } catch (ArithmeticException e) {
            println "Error: Division by zero! ${e.message}"
        }
    }
}

new MyClass().method1()
```