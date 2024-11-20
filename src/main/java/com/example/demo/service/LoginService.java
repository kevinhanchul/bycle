package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.service.comm.Login;
import com.example.demo.service.comm.Member;

import java.util.Map;

@Service
public class LoginService {

    private Login login;
    private Member member;

    @Autowired
    public void setLogin(Login login) {
        this.login = login;
    }
    @Autowired
    public void setMember(Member member) {
        this.member = member;
    }

    public Map<String, Object> loginPro(Map<String, Object> paramMap) throws Exception {
        //아이디가 맞는지 확인
        String chkId = login.chkId(paramMap);
        if(chkId.equals("N")){
            paramMap.put("chkId",chkId);
            return paramMap;
        }
        //정지 되었는지 확인
        String chkStop = member.chkStop(paramMap);
        if(chkStop.equals("N")){
            paramMap.put("chkStop",chkStop);
            return paramMap;
        }
        //로그인 자가제한했는지 확인
        String limitLogin = login.chkLoginLimit(paramMap);
        if(limitLogin.equals("Y")){
            paramMap.put("loginLimit",limitLogin);
            return paramMap;
        }
        return paramMap;
    }
}
