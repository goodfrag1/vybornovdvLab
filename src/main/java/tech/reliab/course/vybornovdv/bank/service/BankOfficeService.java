package tech.reliab.course.vybornovdv.bank.service;

import tech.reliab.course.vybornovdv.bank.entity.BankOffice;
import tech.reliab.course.vybornovdv.bank.model.BankOfficeRequest;
import tech.reliab.course.vybornovdv.bank.web.dto.BankOfficeDto;

import java.util.List;

public interface BankOfficeService {

    BankOfficeDto createBankOffice(BankOfficeRequest bankOfficeRequest);

    BankOffice getBankOfficeById(int id);

    BankOfficeDto getBankDtoOfficeById(int id);

    List<BankOfficeDto> getAllBankOffices();

    BankOfficeDto updateBankOffice(int id, String name);

    void deleteBankAtm(int id);
}
