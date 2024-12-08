package tech.reliab.course.vybornovdv.bank.service.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import tech.reliab.course.vybornovdv.bank.entity.PaymentAccount;
import tech.reliab.course.vybornovdv.bank.web.dto.PaymentAccountDto;

import java.util.List;

@Mapper(componentModel = "spring")
public interface PaymentAccountMapper {

    @Mapping(source = "bank.id", target = "bankId")
    @Mapping(source = "user.id", target = "userId")
    PaymentAccountDto toDto(PaymentAccount paymentAccount);

    List<PaymentAccountDto> toDtoList(List<PaymentAccount> paymentAccounts);
}
