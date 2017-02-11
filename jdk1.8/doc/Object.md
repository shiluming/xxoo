## Object 类
  
- Class Object is the root of the class hierarchy. Every class has Object 
as a superclass. All objects,including arrays,implement the menthods of this class.  
Object 类是其他类的最顶层类，每个类都以Object类作为超类。所有的类，包括数组都实现了这个类的方法  
  
- Returns the runtime class of this Object. The returned class Object is the Object that is locked by synchronized methods of the represented class.  
返回运行时此Object的字节码。返回的字节码对象是表示代表类synchronized方法锁定的对象  
The actual result type is class<? extends x> where{<x>} is the erasure of the static type of the expression on which getClass is called. For example,no cast is required in this code fragment:  
Number n = 0;  
Class<? extends Number> c = n.getClass();  
实际的返回类型是class<? extends x>,x 清除表达式中的静态类型当调用getClass()时.比如下面的代码片段：  
```java  
Number n = 0;
Class<? extends Number> num = n.getClass();//按照翻译中的，清除静态类型是什么鬼？
```  
public final native Class<?> getClass();  

- return a hash code values for the object. This method is supported for the benefit of hash tables such as those provided by HashMap.  
返回对象的哈希值。这个方法被支持和益于哈希表，比如那些HashMap 等类  
The general contract of hashcode is :  
whenever it is invoked on the same object more than once during an execution of a java application,the hashcode method must consistently return the same integer,provided no information used in {equals} comparisons on the object is modified. This integer need not remain consistent from one execution of an application to another execution of the same application.  
hashcode 通用的协议是：  
在一个java程序的运行期间，不管这个方法被调用多少次，hashcode方法必须一贯的返回同样的hashcode，前提假设没有信息被修改在equals比较时。从一个程序的执行到另一个程序的执行这个数字不需要保持一致  
  
  
- if two objects are equal according to the equals(Object) method, then calling the hashcoding method on each of two objects must produce the same integer result.  
如果两个对象相等根据他们的equals方法，那么调用hashcode方法时他们会返回相同的数字  
- It is not required that if two objects are unequal according to the equals method,then calling the hashcode on each of the two objects must produce distinct integer results. However, the programmer should be aware that producing distinct integer results for unequal object may improve the performance of hash tables.  
如果两个对象不相等根据equals方法，调用hashcode方法是不必须生成一样的hash值的。但是，程序员应该意识到，生成不同的数字对于不同的对象能够提高hash table的性能  
As mush as is reasonably practical, the hashcode method defined by class object does return distinct integers for distinct object. (This is typically implemented by converting the internal address of the object into an integer, but this implementation technique is not required by the java; programming language. )  
尽可能合理实用，hashcode 方法被定义在object类返回不同的数字针对不同的对象。（有一个典型的实现是通过对象的内存地址转换成一个数字来实现的，但是java编程语言不需要这种实现技巧）  
public native int hashCode();  
- Indicates whether some other object is "equal to " this one.  
The equals method implements an equivalence relation on non-null object reference:  
It is **reflexive** : for any non-null reference value, x.equals(x) should return true;  
It is **symmetric** : for any non-null reference values x and y , x.equals(y) should return true if and only if y.equals(x) return true;  
It is **transitive** : for any non-null reference values x, y and z, if x.equals(y) return true and y.equals(z) return true, then x.equals(z) should return true;  
It is **consistent** : for any non-null reference values x and y, mutiple invocations x.equals(y) consistently return true or consistently return false, provided no information used in equals comparisons on the object is modified.  
For any non-null reference value x x.equals(null) should return false  
equals(obj) 有几个参考：  
1.反射性 2.对称性 3.一致性，假设信息没有被修改的情况下  
null 值和任何值比较应该返回 false 值  
The equals method for class object implements the most discriminating possible equivalence relation on objects;  
that is, for any non-null reference values x and y , this method return true if and only if x and y refer to the same object x == y has the value ture  
equals 方法 **，，，，，**  

Note that it is generally necessary to override the hashCdoe() method whenever this method is overridden, so as to maintain the general contract for the hashCode() method, which states that equal object must have equal hash codes.  
如果重写了这个equals方法，那么通常来讲是要重写hashcode方法的
public boolean equals(Object obj);  


