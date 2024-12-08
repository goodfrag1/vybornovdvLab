package tech.reliab.course.vybornovdv.bank.web.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PaymentAccountDto {

    private int userId;
    private int bankId;
    private double balance;
}
