package tech.reliab.course.vybornovdv.bank.service.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import tech.reliab.course.vybornovdv.bank.entity.BankAtm;
import tech.reliab.course.vybornovdv.bank.web.dto.BankAtmDto;

import java.util.List;

@Mapper(componentModel = "spring")
public interface BankAtmMapper {

    @Mapping(source = "location.address", target = "locationAddress")
    @Mapping(source = "employee.fullName", target = "employeeFullName")
    @Mapping(source = "bank.name", target = "bankName")
    BankAtmDto toDto(BankAtm bankAtm);

    List<BankAtmDto> toDtoList(List<BankAtm> bankAtms);
}
