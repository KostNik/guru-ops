package guru.springframework.bootstrap.profilesysout;


import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("default")
public class DefaultProfileSysout {

    public DefaultProfileSysout() {
        System.out.println("###############################");
        System.out.println("###############################");
        System.out.println("##           DEFAULT         ##");
        System.out.println("###############################");
        System.out.println("###############################");
    }
}
