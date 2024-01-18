package com.shankastudy.springbootemail.service;

import java.io.File;

public interface EmailService {
    public String sendEmail(String from, String to, String subject, String body);
    public String sendEmails(String from, String[] to, String subject, String body);
    public String sendEmailWithAttachment(String from, String[] to, String subject, String body,
                                          String attachmentName, File resource);
}
