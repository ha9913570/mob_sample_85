package oit.is.mob_sample_85.mob_sample_85;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@EnableAsync
@SpringBootApplication
public class MobSample85Application {

  public static void main(String[] args) {
    SpringApplication.run(MobSample85Application.class, args);
  }

}
