package com.fashion_order_server.model;

import lombok.Data;

@Data
public class User {
    private String id;
    //private String userId;
    private String password;
    private String email;
}
