package tech.reliab.course.vybornovdv.bank.service;

import tech.reliab.course.vybornovdv.bank.entity.CreditAccount;
import tech.reliab.course.vybornovdv.bank.model.CreditAccountRequest;
import tech.reliab.course.vybornovdv.bank.web.dto.CreditAccountDto;

import java.util.List;

public interface CreditAccountService {

    CreditAccountDto createCreditAccount(CreditAccountRequest creditAccountRequest);

    CreditAccount getCreditAccountById(int id);

    CreditAccountDto getCreditAccountDtoById(int id);

    List<CreditAccountDto> getAllCreditAccounts();

    CreditAccountDto updateCreditAccount(int id, int bankId);

    void deleteCreditAccount(int id);
}
