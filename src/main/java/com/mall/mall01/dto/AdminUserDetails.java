package com.mall.mall01.dto;

import com.mall.mall01.mbg.model.UmsAdmin;
import com.mall.mall01.mbg.model.UmsPermission;
import com.mall.mall01.service.UmsAdminService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.List;

/**
 * @author yunN
 * @date 2023/02/08.
 */
@RequiredArgsConstructor
public class AdminUserDetails implements UserDetails {

    private final UmsAdmin umsAdmin;
    private final List<UmsPermission> permissionList;

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return null;
    }

    @Override
    public String getPassword() {
        return null;
    }

    @Override
    public String getUsername() {
        return null;
    }

    @Override
    public boolean isAccountNonExpired() {
        return false;
    }

    @Override
    public boolean isAccountNonLocked() {
        return false;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return false;
    }

    @Override
    public boolean isEnabled() {
        return false;
    }
}
