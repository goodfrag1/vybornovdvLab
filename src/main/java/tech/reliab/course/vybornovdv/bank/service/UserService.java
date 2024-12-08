package tech.reliab.course.vybornovdv.bank.service;

import tech.reliab.course.vybornovdv.bank.entity.User;
import tech.reliab.course.vybornovdv.bank.model.UserRequest;
import tech.reliab.course.vybornovdv.bank.web.dto.UserDto;

import java.util.List;

public interface UserService {

    UserDto createUser(UserRequest userRequest);

    User getUserById(int id);

    UserDto getUserDtoById(int id);

    List<UserDto> getAllUsers();

    UserDto updateUser(int id, String name);

    void deleteUser(int id);
}
