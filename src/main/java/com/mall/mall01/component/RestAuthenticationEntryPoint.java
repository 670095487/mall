package com.mall.mall01.component;

import com.mall.mall01.common.CommonResult;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.AuthenticationEntryPoint;
import org.springframework.stereotype.Component;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author yunN
 * @date 2023/02/08.
 *
 *  处理未登陆或者token已失效的情况
 */
@Component
public class RestAuthenticationEntryPoint  implements AuthenticationEntryPoint {


    @Override
    public void commence(HttpServletRequest request,
                         HttpServletResponse response,
                         AuthenticationException e) throws IOException, ServletException {
        response.setCharacterEncoding("UTF-8");
        response.setContentType("application/json");
        response.getWriter().println(CommonResult.unauthorized(e.getMessage()));
        response.getWriter().flush();
    }
}
