package com.shankastudy.springbootemail.runner;

import com.shankastudy.springbootemail.service.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.io.File;

@Component
public class EmailRunner implements CommandLineRunner {

    @Autowired
    private EmailService emailService;

    @Override
    public void run(String... args) throws Exception {
//        String status = emailService.sendEmail(
//                "shankar.kumar.karn99@gmail.com",
//                "naincynaincy04@gmail.com",
//                "Mail from SpringBootApplication",
//                "Dear Naincy,\nIt is a gentle reminder email from Shan to take care of your health." +
//                        " \n\nThis email is from Shan's Spring Boot application. You can reply him on WhatsApp/Email Please let him know if you have any doubts.\n\n" +
//                        "Thanks and regards,\nShan"
//        );

//        String status = emailService.sendEmails(
//                "shankar.kumar.karn99@gmail.com",
//                new String[] {"shankar.karn.bluestacks@gmail.com", "shankarkarn01@gmail.com", "rajsatyam46@gmail.com"},
//                "Mail from SpringBootApplication",
//                "Dear User,\nIt is a gentle reminder email from Shan to keep enjoying your life." +
//                        "\n\nThis email is from Shan's Spring Boot application. You can reply him on WhatsApp/Email Please let him know if you have any doubts.\n\n" +
//                        "Thanks and regards,\nShan"
//        );

        File file = new File("C:\\Users\\shakarn\\Pictures\\download.jpg");
        String status = emailService.sendEmailWithAttachment(
                "shankar.kumar.karn99@gmail.com",
                new String[] {"shankar.karn.bluestacks@gmail.com", "shankarkarn01@gmail.com", "rajsatyam46@gmail.com", "naincynaincy04@gmail.com"},
                "Mail from SpringBootApplication With Attachment",
                "Dear User,\nIt is a gentle reminder email from Shan to keep enjoying your life. This email also contains an attachment" +
                        "\n\nThis email is from Shan's Spring Boot application. You can reply him on WhatsApp/Email. Please let him know if you have any doubts.\n\n" +
                        "Thanks and regards,\nShan",
                file.getName(),
                file
        );
        System.out.println(status);
    }
}
