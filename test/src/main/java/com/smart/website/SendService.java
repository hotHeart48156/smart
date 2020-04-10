package com.smart.website;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

/**
 * @author "yangbiao"
 */
@Service
@Slf4j
public class SendService {
    @Autowired
    private JavaMailSender sender;

    private String from="2680323775@qq.com";
    public void send(){
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
