package guru.springframework.bootstrap.profilesysout;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
@Profile("qa")
public class QAProfileSysout {

    @Autowired
    public QAProfileSysout(@Value("${guru.springframework.profile.message}") String message) {
        System.out.println("###############################");
        System.out.println("###############################");
        System.out.println("##             QA            ##");
        System.out.println(message);
        System.out.println("###############################");
        System.out.println("###############################");
    }

    @Value("${guru.springframework.profile.message}")
    private String message;

    @PostConstruct
    public void init(){
        System.out.println("###############################");
        System.out.println("###############################");
        System.out.println("##             QA            ##");
        System.out.println(message);
        System.out.println("###############################");
        System.out.println("###############################");
    }
}
