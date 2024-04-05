/*
package com.example.service;

import com.example.entity.Member;
import java.util.List;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class CustomUserDetailService implements UserDetailsService {

    */
/*@Autowired
    private BCryptPasswordEncoder passwordEncoder;*//*


    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        List<Member> members = List.of(
            new Member("admin1@gmail.com", "1234a", "운영자1"),
            new Member("admin2@gmail.com", "1234b", "운영자2"),
            new Member("admin3@gmail.com", "1234c", "운영자3"),
            new Member("admin4@gmail.com", "1234d", "운영자4"),
            new Member("admin5@gmail.com", "1234e", "운영자5")
        );

        Member member = members.stream()
            .filter(m -> m.getEmail().equals(email))
            .findFirst()
            .orElseThrow(() -> new UsernameNotFoundException("회원을 찾을 수 없습니다."));

        return User.builder()
            .username(member.getEmail())
            .password(member.getPassword())
            .roles("USER")
            .build();
    }
}
*/