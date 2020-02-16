package spring.beans.teacher;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import spring.services.Teacher;

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
        return new MeanTeacher(meanCommentService());
    }

    public MeanCommentService meanCommentService() {
        return new MeanCommentService();
    }
}
