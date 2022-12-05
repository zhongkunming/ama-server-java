package cn.ama.server;

import cn.hutool.extra.spring.EnableSpringUtil;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author zhongkunming
 */
@SpringBootApplication
@MapperScan("cn.ama.server.mapper")
@EnableSpringUtil
public class Server {

    public static void main(String[] args) {
        SpringApplication.run(Server.class, args);
    }

}
