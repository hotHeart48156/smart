package com.smart.website;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author "yangbiao"
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@SpringBootApplication(scanBasePackages = "com.smart.website")
@Slf4j
public class MailTest {
    @Autowired
    private JavaMailSender sender;

    private String from="2680323775@qq.com";
@Test
    public void test(){
    SimpleMailMessage mailMessage=new SimpleMailMessage();
    mailMessage.setFrom(from);
    mailMessage.setTo("000111aaaim@gmail.com");
    mailMessage.setSubject("cdafaaa");
    mailMessage.setText("hello hello hello");
    try {
        sender.send(mailMessage);
        log.info("succeed");
    }catch (Exception e){
        log.error("error send mail");
    }
    }
}
