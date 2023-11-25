package com.example.account.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AccountInfo {  //클라이언트와 컨트롤러 간
    private String accountNumber;
    private Long balance;
}
