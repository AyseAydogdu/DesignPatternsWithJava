package prototype_design_pattern;

import java.lang.reflect.Field;

/**
 * @Author Ayse Aydogdu
 * @Date ${DATE} ${TIME}
 */
public class PrototypePattern {
    public static void main(String[] args) throws CloneNotSupportedException{
       Person arife = new Person();
       Person ayse = arife.clone();
       arife.name = "Ahmet";
       ayse.name = "Ayse";
        System.out.println(ayse.hashCode()+" "+ayse.name);
        System.out.println(arife.hashCode()+" "+arife.name);
        Field[] fields = Person.class.getDeclaredFields();
        System.out.println(fields.length);
        for (int i = 0 ; i<fields.length;i++)
        {
            System.out.println(fields[i].getName());
        }
    }
}
class Person implements Cloneable{
    String name;
    int age;
    Person() {
        try {
            Thread.sleep(0000);
        }
        catch (InterruptedException | RuntimeException e){
            System.out.println( e.getMessage());
        }
        finally {

        }
        System.out.println("Person object created");

    }

    @Override
    public Person clone() throws CloneNotSupportedException{

            return (Person) super.clone();

    }
}