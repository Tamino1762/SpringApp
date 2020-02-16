package spring.beans.teacher;

import spring.services.iface.CommentService;

public class MeanCommentService implements CommentService {

    @Override
    public String getComment() {
        return "Practice harder! >:| *Fist shake*";
    }

    public void setInstrument(String instrument) {
    }

    public void setMeanCommentService(MeanCommentService meanCommentService) {
    }
}
