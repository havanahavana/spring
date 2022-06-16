package tn.esprit.ExamenSpring.Services;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import tn.esprit.ExamenSpring.Config.AspectAop;

@Service
public class UserService {
    private static final Logger log= LogManager.getLogger(UserService.class);
    @Scheduled(cron = "*/10 * * * * *")
    public void hello (){
        log.info("hello");
    }
}
