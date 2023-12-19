package com.example.shoppingmall.admin.controller;

import com.example.shoppingmall.admin.domain.Admin;
import com.example.shoppingmall.admin.dto.AdminLoginDTO;
import com.example.shoppingmall.admin.service.AdminLoginService;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admins")/*절대경로*/
@RequiredArgsConstructor
public class AdminController {

    private final AdminLoginService adminLoginService;

    @GetMapping("/login")
    public String goToAdminLoginPage(){
        return "admins/admin-login";
    }
    @PostMapping("/login")
    public String loginAdmin(@ModelAttribute AdminLoginDTO adminLoginDTO, HttpServletRequest request){

        Admin loginAdmin = adminLoginService.loginAdmin(adminLoginDTO);

        if(loginAdmin != null){
            HttpSession session = request.getSession();
            session.setAttribute("loginAdmin", loginAdmin);
            return "admins/admin-home";
        }

        return "admins/admin-login";
    }
    @PostMapping("/logout")
    public String adminLogout(HttpServletRequest request){
        HttpSession session = request.getSession(false);
        if(session !=null){
            session.invalidate();
        }
        return "redirect:/admins/login";
    }

}
