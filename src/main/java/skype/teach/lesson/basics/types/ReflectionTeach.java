package skype.teach.lesson.basics.types;

import java.lang.reflect.Method;

/**
 *
 */
public class ReflectionTeach {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        String className = "skype.teach.lesson.basics.types.MyReflection";
        Class cls = Class.forName(className);
//        Class stringClass = String.class;
        Method[] methods = cls.getMethods();
        for (Method method : methods) {
            if(method.getDeclaringClass()==cls) {
                System.out.println(method.getName() + " - " + method.getDeclaringClass());
            }
        }
        Object obj = cls.newInstance();
        System.out.println(obj);
        String methodName = "incrementA";
    }
}

class MyReflection {
    private int a;
    private String b;

    @Override
    public String toString() {
        return "MyReflection{" +
                "a=" + a +
                ", b='" + b + '\'' +
                '}';
    }

    public int incrementA() {
        return ++a;
    }
}