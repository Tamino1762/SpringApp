package spring.beans.teacher;

import spring.services.iface.CommentService;

public class NiceCommentService implements CommentService {

    @Override
    public String getComment() {
        return " 'Great job!' :D ";
    }

    public void setNiceCommentService(NiceCommentService niceCommentService) {
    }

    public void setInstrument(String instrument) {
    }
}
