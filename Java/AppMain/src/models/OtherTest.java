package models;

public class OtherTest {
    public static void main(String[] args) {
//        JavaClass obj = new JavaClass();
//        obj.setMyInt(10);
//        System.out.println(obj);
//
//        String otherString = Constants.HELLO_WORLD;
//        String myString = obj.getMyString();
//        if(otherString.equalsIgnoreCase(myString)){
//            System.out.println("Essas strings são iguais");
//        }else{
//            System.out.println("Não são iguais");
//        }
//
//        String substring = otherString.substring(1,3);
//        System.out.println(substring);
//
//        String replace = otherString.replace("Hello" , "");
//        System.out.println(replace.trim());
//
//        int wo = otherString.indexOf("wo");
//        System.out.println(wo);
//
//
//        //SPLIT
//        String myOtherString = "Luquinhas jantou na casa da sogra ontem";
//        String[] strings = myOtherString.split(" ");
//        for (int i = 0; i < strings.length; i++) {
//            System.out.println(strings[i]);
//        }

        JavaClass myObj = new JavaClass(11);
        System.out.println(myObj);

        myObj.sum2numbers(20);


    }
}
