package singleton_design_pattern;

/**
 * @Author Ayse Aydogdu
 * @Date 7/7/2022 4:44 PM
 */
public class SingletonWithThreads {

    public static void main(String[] args) {
        Thread threadOne = new Thread(new ThreadExample());
        Thread threadTwo = new Thread(new ThreadExampleTwo());

            threadOne.start();
            threadTwo.start();



    }


}
class ThreadExample implements Runnable{

    @Override
    public void run() {
        for(int i=0;i<3;i++) {
            SingletonPattern singletonPattern = SingletonPattern.getInstance();
            System.out.println("Thread 1 " + singletonPattern.hashCode());
        }
    }
}
class ThreadExampleTwo implements Runnable{

    @Override
    public void run() {
        for(int i=0;i<3;i++) {
            SingletonPattern singletonPattern = SingletonPattern.getInstance();
            System.out.println("Thread 2 " + singletonPattern.hashCode());
        }
    }
}