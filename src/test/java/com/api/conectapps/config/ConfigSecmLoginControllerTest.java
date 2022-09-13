package com.api.conectapps.config;

import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Profile;

@TestConfiguration
@Profile("ConfigSecmLoginControllerTest")
public class ConfigSecmLoginControllerTest {

    public final static String User = "ADMIN";
    public final static String InvalidUser = "ADMIN1234";
    public final static String errorUser = "ADMIN500";
    public final static String Token = "SECM-01642442009942-7";

//    @Bean
//    @Primary
//    public ISecmUserValidator getLogin(){
//        ISecmUserValidator toReturn = new ISecmUserValidator() {
//
//            @Override
//            public SecmRequestInfo validPermission(String token, String permission) throws TimeOutException {
//                return null;
//            }
//
//            @Override
//            public boolean validToken(String token) throws TimeOutException {
//                return false;
//            }
//
//            @Override
//            public String validLogin(String user, String password, String organization, String originIpAddress) throws LoginFailureException, Exception {
//                if (user.equals(User)){
//                    return Token;
//                }
//                else if(user.equals(errorUser)){
//                    throw new HttpServerErrorException(HttpStatus.INTERNAL_SERVER_ERROR);
//                }
//                else{
//                    throw new LoginFailureException();
//                }
//            }
//
//            @Override
//            public void logoutUser(String token) throws Exception {
//
//            }
//        };
//        return toReturn;
//    }

}
