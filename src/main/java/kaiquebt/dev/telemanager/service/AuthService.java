package kaiquebt.dev.telemanager.service;

import kaiquebt.dev.telemanager.dto.LoginDto;
import kaiquebt.dev.telemanager.dto.SignupDto;

public interface AuthService {
    String login(LoginDto loginDto);
    String signup(SignupDto signupDto);
}