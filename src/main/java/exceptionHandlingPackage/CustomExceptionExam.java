package exceptionHandlingPackage;

public class CustomExceptionExam extends Exception {

    public CustomExceptionExam(String message){
        super(message);
         System.out.println("Custom Exception called");
    }

}
