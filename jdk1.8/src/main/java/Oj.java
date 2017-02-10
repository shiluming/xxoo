/**
 * Created by rola on 2017/2/1.
 */
public class Oj implements Cloneable{

    public String age;

    public static void main(String[] args) throws CloneNotSupportedException {

        Oj o = new Oj();
        o.age = "11";
        o.clone();

        A a = new A();
        a.fun(o);

        System.out.println(o.age);
        Object objs = new Object();



    }

    class person {
        public String name;

    }


}

class A {

    public void fun(Oj o) {
        o.age="12";
    }

}
