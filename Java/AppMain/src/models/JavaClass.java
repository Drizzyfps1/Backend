package models;

public class JavaClass {

    private int myInt = 0;
    private String myString = "Hello World";

    public JavaClass(int myInt) {
        this.myInt = myInt;
    }

    public int getMyInt() {
        return myInt;
    }

    public void setMyInt(int myInt) {
        this.myInt = myInt;
    }

    public String getMyString() {
        return myString;
    }

    public void setMyString(String myString) {
        this.myString = myString;
    }

    public void sum2numbers(){
        int a = 2;
        int b = 1;
        int sum = a+b;
        System.out.println(sum);
    }

    protected void sum2numbers(int value){
        int a = value;
        int b = 1;
        int sum = a + b;
        System.out.println(sum);
    }

    @Override
    public String toString() {
        return "JavaClass{" +
                "myInt=" + myInt +
                ", myString='" + myString + '\'' +
                '}';
    }



}
