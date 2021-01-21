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
    public static void main(String[] args){
        String hello = right2("Hello");
        System.out.println(hello);
        String onetwo = right2("12345");
        System.out.println(onetwo);
    }
}
