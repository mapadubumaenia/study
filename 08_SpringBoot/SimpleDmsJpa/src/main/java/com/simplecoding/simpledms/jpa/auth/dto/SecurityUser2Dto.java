package com.simplecoding.simpledms.jpa.auth.dto;


import lombok.Getter;
import lombok.Setter;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;

import java.util.Collection;


@Getter
@Setter
public class SecurityUser2Dto extends User {

    public SecurityUser2Dto(String username, String password, Collection<? extends GrantedAuthority> authorities) {
        super(username, password, authorities);
    }
}
