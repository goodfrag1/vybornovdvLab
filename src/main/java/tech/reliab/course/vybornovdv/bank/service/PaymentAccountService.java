package tech.reliab.course.vybornovdv.bank.service;

import tech.reliab.course.vybornovdv.bank.entity.PaymentAccount;
import tech.reliab.course.vybornovdv.bank.model.PaymentAccountRequest;
import tech.reliab.course.vybornovdv.bank.web.dto.PaymentAccountDto;

import java.util.List;

public interface PaymentAccountService {

    PaymentAccountDto createPaymentAccount(PaymentAccountRequest paymentAccountRequest);

    PaymentAccount getPaymentAccountById(int id);

    PaymentAccountDto getPaymentAccountDtoById(int id);

    List<PaymentAccountDto> getAllPaymentAccounts();

    PaymentAccountDto updatePaymentAccount(int id, int bankId);

    void deletePaymentAccount(int id);
}
