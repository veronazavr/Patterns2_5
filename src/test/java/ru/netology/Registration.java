package ru.netology;

import lombok.AllArgsConstructor;
import lombok.Data;
@Data
@AllArgsConstructor


public class Registration {
    private String  login;
    private String  password;
    private String  status;
}
