package com.portfolio.jgd.jwt.user;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {
  private final UserRepository userRepository;

  @Transactional
  public UserResponse updateUser(UserRequest userRequest) {

    User user = User.builder()
        .id(userRequest.id)
        .firstname(userRequest.getFirstname())
        .lastname(userRequest.lastname)
        .profession(userRequest.getProfession())
        .role(Role.USER)
        .build();

    userRepository.updateUser(user.id, user.firstname, user.lastname, user.profession);

    return new UserResponse("El usuario se registró satisfactoriamente");
  }

  public UserDTO getUser(Integer id) {
    User user= userRepository.findById(id).orElse(null);

    if (user!=null)
    {
      UserDTO userDTO = UserDTO.builder()
          .id(user.id)
          .username(user.username)
          .firstname(user.firstname)
          .lastname(user.lastname)
          .profession(user.profession)
          .build();
      return userDTO;
    }
    return null;
  }
}
