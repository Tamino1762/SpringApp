package spring.beans.teacher;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import spring.services.iface.CommentService;
import spring.services.Teacher;

@Component

public class MeanTeacher implements Teacher {

    private MeanCommentService meanCommentService;

    @Value("${instrument}")
    private String instrument;

    public String getInstrument(){
        return instrument;
    }

    public MeanTeacher(MeanCommentService meanCommentService) {
        this.meanCommentService = meanCommentService;
    }

    @Override
    public String getPiece() {
        return "Super hard, boring piece";
    }

    @Override
    public String getComment() {
        return meanCommentService.getComment();
    }

    public void setMeanCommentService(MeanCommentService meanCommentService) {
    }

    public void setInstrument(String instrument) {
    }

    public void setIndifferentCommentService(IndifferentCommentService indifferentCommentService) {
    }
}
