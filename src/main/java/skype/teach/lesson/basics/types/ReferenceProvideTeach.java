package skype.teach.lesson.basics.types;

import java.sql.Ref;

/**
 *
 */
public class ReferenceProvideTeach {
    public static void main(String[] args) {
        int x = 10;
        change(x);
        System.out.println(x);
        RefClass refClass = new RefClass();
        refClass.name = "Ref1";
        change(refClass);
        System.out.println(refClass.name);
    }
    public static void  change (int x){
        x = 20;
    }
    public static void change (RefClass refClass){
//        refClass = new RefClass();
        refClass.name = "Ref2";
    }
}
class RefClass {
    String name;
}
