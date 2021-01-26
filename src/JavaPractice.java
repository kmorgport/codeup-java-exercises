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
    public static String lastTwo(String str) {
        String a;
        String b;
        String c;
        if(str.length()==1||str.isEmpty()){
            return str;
        }
        if(str.length()==2){
            a = str.substring(0,1);
            b = str.substring(1);
            return b+a;
        }else{
            a = str.substring(0,str.length()-2);
            b = str.substring(str.length()-2,str.length()-1);
            c = str.substring(str.length()-1);
            return a+c+b;
        }
    }

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
        if(index==0 || str.length()<=index+1||index<0){
            a = str.substring(0, 2);
        }else {
            a = str.substring(index, index+2);
        }
        return a;
    }

    public static String middleThree(String str){
        return str.substring((str.length()/2)-1, (str.length()/2)+2);
    }

    public static  boolean hasBad(String str){
        if(str == ""){
            return false;
        }else{
            String a = str.substring(0,2);
            if(!a.contains("b")){
                return false;
            }else{
                return str.contains("bad");
            }
        }
    }

    public static String lastChars(String a, String b) {
        String c;
        String d;
        if(a==""&&b==""){
            c = "@";
            d = "@";
            return c+d;
        }else if(a == ""){
            c = "@";
            d = b.substring(b.length()-1);
            return c+d;
        }else if(b==""){
            c = a.substring(0,1);
            d = "@";
            return c+d;
        }else{
            c = a.substring(0,1);
            d = b.substring(b.length()-1);
            return c+d;
        }
    }

    public String seeColor(String str) {
        if(str.length()<3){
            return "";
        }
        if(str.length()<=3&&!str.substring(0,3).equals("red")){
            return "";
        }else if(str.length()>=3&& str.substring(0,3).equals("red")){
            return "red";
        }else if(str.substring(0,4).equals("blue")){
            return "blue";
        }else{
            return "";
        }
    }
    public static String minCat(String a, String b) {
        if(a.length()>b.length()){
            String c = a.substring(a.length()-b.length());
            return c+b;
        }else if(b.length()>a.length()){
            String c = b.substring(b.length()-a.length());
            return a+c;
        } else{
            return a+b;
        }
    }
    public static String without2(String str) {
        if(str.isEmpty()||str.length()<=1){
            return str;
        }
        String a = str.substring(0,2);
        String b = str.substring(str.length()-2);
        if(a.equals(b)){
            String c = str.substring(2);
            return c;
        }else{
            return str;
        }
    }

    public static void main(String[] args){
//        String java = twoChar("java", 0);
//        System.out.println(java);
//        String va = twoChar("java", 3);
//        System.out.print(va);
        String candy = middleThree("solving");
        System.out.println(candy);
        String last = lastChars("last","chars");
        System.out.println(last);
    }
}
