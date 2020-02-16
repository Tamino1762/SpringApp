package spring.beans.teacher;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import spring.services.iface.CommentService;
import spring.services.Teacher;

@Component
public class NiceTeacher implements Teacher {
    private NiceCommentService niceCommentService;

    @Value("${instrument}")
    private String instrument;

    public String getInstrument(){
        return instrument;
    }


    public NiceTeacher(NiceCommentService niceCommentService) {
       this.niceCommentService = niceCommentService;
    }

    @Override
    public String getPiece() {
        return "Happy fun piece";
    }

    @Override
    public String getComment() {
        return niceCommentService.getComment();
    }

    public void setNiceCommentService(NiceCommentService niceCommentService) {
    }

    public void setInstrument(String instrument) {
    }
}
