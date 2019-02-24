package guru.springframework.bootstrap.profilesysout;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class NonProfileSysout {

    @Autowired
    public NonProfileSysout(@Value("${guru.springframework.profile.message}") String message) {
        System.out.println("***** " + message + " *****");
    }
}
