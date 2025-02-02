package LearningPackage1;

public class UseOfInstanceOfExample {

//    static Integer a = 10;

    public static void main(String[] args){
        Integer a = 1;
        if(a instanceof java.lang.Integer) {
            System.out.println("Instance : true");
        }
        else{
            System.out.println("Instance : false");
        }
        System.out.println("Instance of Example");
    }
}
