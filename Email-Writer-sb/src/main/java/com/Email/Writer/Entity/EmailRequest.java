package com.Email.Writer.Entity;

import lombok.Data;

@Data
public class EmailRequest {
    private String emailContent;
    private String tone;
}
