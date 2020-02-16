package spring.beans.teacher;

import spring.services.iface.CommentService;

public class IndifferentCommentService implements CommentService {

    public String getComment() {
        return " 'Eh, whatever.' :| *zzz* ";
    }
    public void setInstrument(String instrument) {
    }

}
