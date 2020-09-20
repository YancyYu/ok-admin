package cn.mi46;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableTransactionManagement
@EnableScheduling
@MapperScan("cn.mi46.mapper")
@SpringBootApplication
public class MiApplication {

    public static void main(String[] args) {
        SpringApplication.run(MiApplication.class, args);
    }

}
