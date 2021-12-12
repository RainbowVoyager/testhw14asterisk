package com.cherevataya;

//Написать в чем разница между final, finally и finalize
public class Main {

    public static void main(String[] args) {

        /*
        final - это ключевое слово, и его можно использовать для обозначения переменной «неизменяемый».
        Фактически, он используется для применения ограничений на класс, метод и переменную.
         */
        final String s = "Hello final";
        System.out.println(s);

        /*
        Finalize - это метод класса Object.
        Он вызывается перед тем, как объект будет отброшен сборщиком мусора, что позволит ему очистить его состояние.
         */
        String str = new String("Hi, Welcome in Java World");
        str = null;

        System.gc();
        System.out.println("We are in finalize class");
        exempleFinally();
    }

    public void finalize() {
        System.out.println("hi, We are in finalize() method ");

    }

    /*  finally это кодовый блок. Он используется с блоком try-catch для обработки исключения.
б       лок кода будет выполнен независимо от того, обрабатывается ли исключение или нет
     */
    private static void exempleFinally() {
        try {
            // код здесь
        } catch (Exception e) {
            // обрабатываем исключение здесь
        } finally {
            System.out.println("Maybe Finally catch some exeption");
        }

    }
}





