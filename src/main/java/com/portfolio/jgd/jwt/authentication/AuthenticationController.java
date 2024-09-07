package com.portfolio.jgd.jwt.authentication;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/auth")
@CrossOrigin(origins = {"https://delimaprograma-3f21a.web.app/inicio"})
//@CrossOrigin(origins = {"http://localhost:4200"})
public class AuthenticationController {



  private final AuthenticationService authenticationService;

  @PostMapping(value = "register")
  public ResponseEntity<AuthenticationResponse> register(@RequestBody RegisterRequest request){
    return ResponseEntity.ok(authenticationService.register(request));
  }
  @PostMapping(value = "login")
  public ResponseEntity<AuthenticationResponse> login(@RequestBody LoginRequest request){
    return ResponseEntity.ok(authenticationService.login(request));
  }
}
