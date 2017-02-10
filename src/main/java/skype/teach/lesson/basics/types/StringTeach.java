package skype.teach.lesson.basics.types;

/**
 *
 */
public class StringTeach {
    public static void main(String[] args) {
        String s1 = "ABC";
        String s2 = "ABC";
        String s3 = new String("ABC");

        String s4 = s1.toLowerCase();
        System.out.println(s1);
        System.out.println(s4);

        s1 = "ABCDEf";
        String s5 = s1.substring(1);
        System.out.println(s5);
        s5 = s1.substring(1, 2);
        System.out.println(s5);
        s5 = s1.substring(0, s1.length());
        System.out.println(s5);

        s1 = "AB,CD,EF,GH";
        int index = s1.indexOf(',');
        System.out.println(index);
        s5 = s1.substring(0, index);
        System.out.println(s5);
        int index2 = s1.indexOf(',', index + 1);
        s5 = s1.substring(index + 1, index2);
        System.out.println(s5);
        int index3 = s1.indexOf(',', index2 + 1);

        s1 = s1.toLowerCase();
        int startIndex = 0;
        while (startIndex != -1) {
            int endIndex = s1.indexOf(',', startIndex);
            if (endIndex == -1) {
                System.out.println(s1.substring(startIndex));
                startIndex = endIndex;
            } else {
                System.out.println(s1.substring(startIndex, endIndex));
                startIndex = endIndex + 1;
            }

        }

        index = s1.lastIndexOf(',');
        s5 = s1.substring(index + 1);
        System.out.println(s5);

        boolean b = s1.contains("dc");
        System.out.println(b);
        b = s1.startsWith("ab");
        b = s1.endsWith("gh");
        b = s1.matches("a.*d.*h");
        System.out.println(b);

        String[] items = s1.split(",", -1);
        for (int i = 0; i < items.length; i++) {
            System.out.println(items[i]);
        }

        s1 = "\t  abc def ";
        System.out.println(s1);
        s5 = s1.trim();
        System.out.println(s5);

        s1 = "abc";
        s5 = new String("Abc");
        System.out.println(s1.equals(s5));
        System.out.println(s1.equalsIgnoreCase(s5));
        int result = s1.compareTo(s5);
        System.out.println(result);
        result = s1.compareToIgnoreCase(s5);
        System.out.println(result);

        items = new String[]{"AB","CD","EF"};
        s5 = String.join(";",items);
        System.out.println(s5);

        s1 = "abc#@e#@";
        s5 = s1.replace("#@","1");
        System.out.println(s5);

        s1 = "abcdef";
        s5 = s1.substring(1);
        s5 = new String(s1.substring(1));
    }
}
