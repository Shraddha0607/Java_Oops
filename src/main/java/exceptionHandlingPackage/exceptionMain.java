package exceptionHandlingPackage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class exceptionMain {
    public static void main(String[] args)  {

        SpringApplication.run(exceptionMain.class, args);
        System.out.println("Welcome, Error Handling started.");

        CheckedHandling obj = new CheckedHandling();

        try{
            //obj.classCastExceptionExam();
            obj.arithmeticExceptionExam();
            //obj.illegalArgumentExceptionExam();
        }
        catch(CustomExceptionExam | ArithmeticException e){
           e.printStackTrace(); //("custom exception occured");
            String msg = e.getMessage();
            System.out.println(msg +" this is message");
        }
        catch(Exception e){
            System.out.println("last catch block executed");
            e.printStackTrace();
            e.getMessage();
        }
        finally {
            System.out.println("finally block executed");
        }


    }
}
