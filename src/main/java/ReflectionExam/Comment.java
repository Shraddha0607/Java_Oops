package ReflectionExam;

public class Comment {
    private  int commentId = 1;
    private String description = "First Comment";
    private int blogId = 1;

    // constructor
    public Comment(int commentId, String description, int blogId){
        this.commentId = commentId;
        this.description = description;
        this.blogId = blogId;
    }
    private Comment(){

    }

    // other method
    private String getDescription(){
        return this.description;
    }
}
