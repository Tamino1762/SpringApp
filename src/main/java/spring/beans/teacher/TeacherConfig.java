package spring.beans.teacher;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import spring.services.Teacher;
import spring.services.iface.CommentService;

@Configuration

@PropertySource("classpath:music.properties")

public class TeacherConfig {

    @Bean

    public Teacher niceTeacher() {
        return new NiceTeacher(niceCommentService());
    }

    @Bean

    public NiceCommentService niceCommentService() {
        return new NiceCommentService();
    }

    @Bean

    public Teacher meanTeacher() {
        return new MeanTeacher(new MeanCommentService());
    }

    public CommentService CommentService() {
        return new CommentService() {
            @Override
            public String getComment() {
                return null;
            }
        };
    }
}
