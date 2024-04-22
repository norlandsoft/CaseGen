import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.context.annotation.ComponentScan;

import java.io.File;

@SpringBootApplication
@ComponentScan("com.norlandsoft.air")
public class QABricks {
  public static void main(String[] args) {
    String workspace = "/opt/QABricks/workspace";

    // 设置日志目录
    System.setProperty("log.path", workspace + File.separator + "logs");
    System.setProperty("log.name", "air-one");
    System.setProperty("log.level", "debug");

    SpringApplication.run(QABricks.class, args);
  }
}
