package com.simplecoding.simpledms.config;

//스프링 시큐리티 설정 파일

import jakarta.servlet.DispatcherType;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;


//자바파일 설정파일 사용할 수 있게 하는 어노테이션 : 예)application.properties 파일 처럼 사용
@Configuration
//스프링 시큐리티를 활성화 하는 어노테이션
@EnableWebSecurity
public class SecurityConfig {

    // 과거) 스프링:DB 패스워드는 암호화 해야합니다.(암호화 라이브러리 설치)
    // 지금) 스프링부트: 암호화 라이브러리가 포함됨(스프링 시큐리티 안에 있음)
    // TODO: 목적: 암호화 메소드
    @Bean    //IOC: 예) @Service 등 유사
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    //TODO: 목적: 인증,권한,설정 메소드
    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        // authorize(권한관리),authenticate(인증,로그인)
        // TODO: 1)권한(로그인 했지만 그 화면을 볼수 있는가? 없는가?), 인증(로그인) 관리
        http.authorizeHttpRequests(auth -> auth
                        .dispatcherTypeMatchers(DispatcherType.FORWARD).permitAll()   //jsp 태그중에 redirect 태그 허용
                        .dispatcherTypeMatchers(DispatcherType.INCLUDE).permitAll()   // jsp 태그중에 jap:include 허용    => 둘다 jsp를쓰면 넣어야 하는 것들 리액트쓰면 필요 x
                        .requestMatchers("auth/**", "/", "/errors", "/css/**", "/images/**", "/js/**").permitAll()  // url 허용 주소(로그인 없어도 가능)
                        .requestMatchers("/admin/**").hasAnyAuthority("ROLE_ADMIN") //admin 메뉴는 ROLE_ADMIN 권한 있는 사람만 볼수 있음
                        .anyRequest().authenticated()
                )
                //TODO: 2)로그인 화면,성공여부 설정
                .formLogin(form -> form
                        .loginPage("/auth/login")                  //이쁜 로그인 페이지
                        .loginProcessingUrl("/auth/loginProcess")  // 로그인 버튼 눌렀을때 실행될 TRL(자동,컨트롤러 메소드 불필요)
                        .usernameParameter("email")                //jsp에서 input태그의 name 속성을 email 한다는 의미(아이디)
                        .defaultSuccessUrl("/", true) // 성공했을때 이동할 페이지 지정,(옵션) 그 페이지로 무조건 이동해라
                        .failureUrl("/errors")            // 실패했을때 이동할 페이지 지정
                        .permitAll()
                )

                //TODO: 3)로그아웃 설정 ,성공유무 설정
                .logout(logout -> logout
                        .logoutUrl("/auth/logout")        //로그아웃 처리 URL(자동.컨트롤러 메소드 불필요)
                        .logoutSuccessUrl("/auth/login")  //로그아웃 성공하면 이동할 URL
                        .permitAll()
                );

        return http.build();                             //위의 설정이 최종적으로 적용됨
    }


}
