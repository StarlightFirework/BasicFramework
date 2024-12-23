package com.sicnu.utils;


import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.autoconfigure.security.oauth2.resource.OAuth2ResourceServerProperties;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import java.util.Date;
import java.util.Map;
@Slf4j
@Component
public class JwtUtil {
    private final String SECRET = "sicnu";
    private final long EXPIRATION_TIME = 3600000;

    public String createToken(Map<String,Object> claims){
        return Jwts.builder().setClaims(claims).signWith(SignatureAlgorithm.HS256,SECRET)
                .setExpiration(new Date(System.currentTimeMillis() + EXPIRATION_TIME)).compact();
    }

    public String extractClaimContent(String token,String claimKey){
        Claims claims = Jwts.parser().setSigningKey(SECRET).parseClaimsJws(token).getBody();
        return claims.get(claimKey,String.class);
    }

    public boolean verifyToken(String token) throws Exception {
        if(!StringUtils.hasLength(token)){
            log.info("请求头token为空，登录错误");
            return false;
            //throw new Exception("令牌解析异常,拦截成功");
        }
        try{
            Jwts.parser().setSigningKey(SECRET).parseClaimsJws(token);
        }catch (Exception ex){
            log.info("令牌解析异常:" , ex );
            return false;
        }

        return true;
    }
}
