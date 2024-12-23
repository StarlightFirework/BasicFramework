package com.sicnu.interceptor;

import com.alibaba.fastjson.JSONObject;
import com.sicnu.pojo.ResponseResult;
import com.sicnu.utils.JwtUtil;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

@Component
public class JwtInterceptor implements HandlerInterceptor {

    @Autowired
    JwtUtil jwtUtil;
    @Override
    public boolean preHandle(HttpServletRequest req, HttpServletResponse res, Object Handler) throws Exception{
        String jwt = req.getHeader("token");
        if (!jwtUtil.verifyToken(jwt)) {
            ResponseResult responseResult = new ResponseResult(401,"NOT_LOGIN",null);
            res.getWriter().write(JSONObject.toJSONString(responseResult));
            return false;
        }
        return true;
    }
}
