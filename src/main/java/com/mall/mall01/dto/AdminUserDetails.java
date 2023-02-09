package com.mall.mall01.dto;

import com.mall.mall01.mbg.model.UmsAdmin;
import com.mall.mall01.mbg.model.UmsPermission;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author yunN
 * @date 2023/02/08.
 */
@RequiredArgsConstructor
public class AdminUserDetails implements UserDetails {

    private final UmsAdmin umsAdmin;
    private final List<UmsPermission> permissionList;

    /**
     *
     * @return 返回此用户的所有权限
     */
    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return permissionList.stream()
                .filter(p -> p.getValue() != null)
                .map(p -> new SimpleGrantedAuthority(p.getValue()))
                .collect(Collectors.toList());
    }

    @Override
    public String getPassword() {
        return umsAdmin.getPassword();
    }

    @Override
    public String getUsername() {
        return umsAdmin.getUsername();
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return umsAdmin.getStatus().equals(1);
    }
}
