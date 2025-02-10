package ReflectionExam;
import java.lang.reflect.*;
import java.util.Arrays;


public class ReflectionMain {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException{
        Class<?> commentClass = Comment.class;
        System.out.println(commentClass.getName());
        // System.out.println(Arrays.stream(commentClass.getConstructors()).count());

        //Field[] fields = commentClass.getFields();
        Field[] fields = commentClass.getDeclaredFields();
        if(fields.length > 0) System.out.println("Have some length");
        for(Field field : fields){
            //System.out.println(field.getName());
            //System.out.println(field);
            //System.out.println(field.getModifiers());
            //System.out.println(field.getType());
        }

        // Note = to change modifier
        Comment commentObj = new Comment(4, "test", 8);
        Field field = commentClass.getDeclaredField("description");
        field.setAccessible(true);
        field.set(commentObj, true);
        field.set(commentObj, "testAfterChange");
        System.out.println(field.getType().descriptorString());  // this is not correct, giving exception

    }
}
