package tech.reliab.course.vybornovdv.bank.service;

import tech.reliab.course.vybornovdv.bank.entity.Bank;
import tech.reliab.course.vybornovdv.bank.web.dto.BankDto;

import java.util.List;

public interface BankService {

    BankDto createBank(String bankName);

    Bank getBankById(int id);

    BankDto getBankDtoById(int id);

    List<BankDto> getAllBanks();

    BankDto updateBank(int id, String name);

    void deleteBank(int id);
}
