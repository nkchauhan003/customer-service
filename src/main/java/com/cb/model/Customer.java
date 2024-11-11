package com.cb.model;

import lombok.*;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Customer {
    private String customerId;
    private String name;
    private String email;
    private String phone;
}
