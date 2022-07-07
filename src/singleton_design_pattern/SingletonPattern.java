package singleton_design_pattern;

/**
 * @Author Ayse Aydogdu
 * @Date 7/7/2022 2:36 PM
 */
public class SingletonPattern {

    private static SingletonPattern singletonPattern = null;

    private SingletonPattern() {
    }

    public static SingletonPattern getInstance() {
        if (singletonPattern == null)
            synchronized (SingletonPattern.class) {
                if (singletonPattern == null) {
                    singletonPattern = new SingletonPattern();
                }
            }
        return singletonPattern;
    }
}

class SingletonTest {
    public static void main(String[] args) {
        SingletonPattern singletonPattern = SingletonPattern.getInstance();
        SingletonPattern singletonPattern2 = SingletonPattern.getInstance();
        System.out.println(singletonPattern.hashCode());
        System.out.println(singletonPattern2.hashCode());

    }
}