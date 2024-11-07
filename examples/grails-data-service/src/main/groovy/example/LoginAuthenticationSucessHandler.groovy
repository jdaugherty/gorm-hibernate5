package example

import grails.events.EventPublisher
import grails.plugin.springsecurity.rest.RestAuthenticationSuccessHandler
import groovy.transform.CompileStatic
import org.springframework.security.core.Authentication

import jakarta.servlet.ServletException
import jakarta.servlet.http.HttpServletRequest
import jakarta.servlet.http.HttpServletResponse

@CompileStatic
class LoginAuthenticationSucessHandler extends RestAuthenticationSuccessHandler implements EventPublisher {

    TestService testService

    @Override
    void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response, Authentication authentication) throws IOException, ServletException {
        super.onAuthenticationSuccess(request, response, authentication)
        testService.testDataService(1l)
    }

}
