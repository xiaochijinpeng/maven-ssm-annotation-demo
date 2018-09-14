package com.cutiechi.demo;

import com.cutiechi.demo.config.ApplicationContextConfig;

import org.junit.jupiter.api.extension.ExtendWith;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

/**
 * Spring Application 测试类, 所有 Dao 和 Service 等的测试类都继承此类
 * @author Cutie Chi
 */
@ExtendWith(SpringExtension.class)
@ContextConfiguration(
    classes = {
        ApplicationContextConfig.class
    }
)
public class ApplicationTests {

}
