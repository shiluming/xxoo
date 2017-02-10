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
不管它被调用