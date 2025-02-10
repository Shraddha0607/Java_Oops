package exceptionHandlingPackage;


public class CheckedHandling {
    public void classCastExceptionExam(){
        //classCastException
        Object num = 4;
        System.out.println((String) num);
    }

    public void arithmeticExceptionExam() throws  CustomExceptionExam{
        int a = 9;
        System.out.println(6+7);
        //if(a ==9) throw new CustomExceptionExam("got 9");
        // System.out.println(5/0);
        illegalArgumentExceptionExam();
    }

    public void illegalArgumentExceptionExam(){
        String str = "abd";
        System.out.println(Integer.parseInt(str));
    }


}
