public class JavaPractice {

    public String left2(String str) {
        String a = str.substring(0,2);
        String b = str.substring(2);
        if(str.length()<=2){
            return a;
        }else{
            return b+a;
        }

    }

    public static String right2(String str) {
        String a = str.substring(str.length()-2);
        String b = str.substring(0,str.length()-2);
        if(str.length()<=2){
            return str;
        }else{
            return a+b;
        }

    }

    public static String theEnd(String str, boolean front){
        String a = str.substring(0,1);
        String b = str.substring(str.length()-1);
        if(front){
            return a;
        }else{
            return b;
        }
    };

//    public static String withoutEnd(String str) {
//        String a = str.substring(1,str.length()-1);
//        if(str.length()<=2){
//            return "";
//        }else{
//            return a;
//        }
//    }

    public static String withoutEnd(String str) {
        if(str.length()>2){
            String a = str.substring(1,str.length()-1);
            return a;
        }else{
            return "";
        }
    }

    public static String middleTwo(String str){
        String a = str.substring(0,str.length()/2);
        String b = str.substring(str.length()/2);
        String c = a.substring(a.length()-1);
        String d = b.substring(0,1);
        return c+d;
    }

    public static boolean endsLy(String str){
        if(str.length()>=2){
            String a = str.substring(str.length()-2);
            return a.equals("ly");
        }else{
            return false;
        }
    }

    public static String twoChar(String str, int index){
        String a;
        if(index==0 || str.length()<=index+1){
            a = str.substring(0, 2);
        }else {
            a = str.substring(str.length() - index);
        }
        return a;
    }
    public static void main(String[] args){
//        String hello = right2("Hello");
//        System.out.println(hello);
//        String onetwo = right2("12345");
//        System.out.println(onetwo);
//        String cat = right2("cat");
//        System.out.print(cat);
//        String hel = theEnd("Hello",true);
//        System.out.println(hel);
//        String hello = withoutEnd("Hello");
//        System.out.println(hello);
//        String abc = withoutEnd("abc");
//        System.out.println(abc);
//        String ab = withoutEnd("a");
//        System.out.println(ab);
//        String string = middleTwo("string");
//        System.out.println(string);
//        String practice = middleTwo("practice");
//        System.out.println(practice);
//        String code = middleTwo("code");
//        System.out.println(code);
//        Boolean oddly = endsLy("oddly");
//        System.out.println(oddly);
//        Boolean y = endsLy("y");
//        System.out.println(y);
        String java = twoChar("java", 0);
        System.out.println(java);
        String va = twoChar("java", 3);
        System.out.print(va);
    }
}
