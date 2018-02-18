package com.example.zk;

import com.example.zk.util.SpringCtxUtil;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class ZkApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(ZkApplication.class, args);
		System.out.println(applicationContext.getEnvironment().getProperty("zookeeper.connection.address"));
		SpringCtxUtil.setApplicationContext(applicationContext);
		JavaApiSample sample = SpringCtxUtil.getBean(JavaApiSample.class);
		sample.test();
	}
}
