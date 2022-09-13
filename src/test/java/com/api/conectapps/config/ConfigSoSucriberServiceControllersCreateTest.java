package com.api.conectapps.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Profile;

@TestConfiguration
@Profile("ConfigSoSucriberServiceControllersCreateTest")
public class ConfigSoSucriberServiceControllersCreateTest {

    public static final String TOKEN_HAS_PERMISION = "HAS_PERMISION";
    public static final String TOKEN_HAS_NOT_PERMISION = "HAS_NOT_PERMISION";
    public static final String TOKEN_UNAUTHORIZED = "UNAUTHORIZED";

    public static final String NAME_VALID = "NAME_VALID";
    public static final String NAME_NOT_VALID = "NAME_NOT_VALID";


    @Value("${usr.permissions.create}")
    private String permissionCreate;

//    @Bean
//    @Primary
//    public ISecmUserValidator setISecmUserValidator() throws TimeOutException {
//        System.out.println(">> SE INICIA \n\n");
//        ISecmUserValidator toReturn = Mockito.mock(ISecmUserValidator.class);
//        SecmRequestInfo requestInfo = new SecmRequestInfo();
//        requestInfo.setStatus(SecmUserValidatorStatus.HAS_PERMISION);
//        Mockito.when(toReturn.validPermission(TOKEN_HAS_PERMISION,permissionCreate)).thenReturn(requestInfo);
//
//        requestInfo = new SecmRequestInfo();
//        requestInfo.setStatus(SecmUserValidatorStatus.HAS_NOT_PERMISION);
//        Mockito.when(toReturn.validPermission(TOKEN_HAS_NOT_PERMISION,permissionCreate)).thenReturn(requestInfo);
//
//        requestInfo = new SecmRequestInfo();
//        requestInfo.setStatus(SecmUserValidatorStatus.UNAUTHORIZED);
//        Mockito.when(toReturn.validPermission(TOKEN_UNAUTHORIZED,permissionCreate)).thenReturn(requestInfo);
//        return toReturn;
//    }
//
//    @Bean
//    @Primary
//    public ProvServices setSoSubscriberService() throws TimeOutException {
//        ProvServices toReturn = new ProvServices() {
//            @Override
//            public boolean create(String msisdn, ProvProfilesListBody servicesList, String user) {
//                if(msisdn.equals(NAME_VALID)){
//                    return true;
//                }
//                else {
//                    return false;
//                }
//            }
//
//            @Override
//            public ResponseEntity update(ProvProfilesListBody servicesList, String msisdn, SecmRequestInfo secmResponse, String correlationId, MeasureItem measure) {
//                return new ResponseEntity(HttpStatus.OK);
//            }
//
//            @Override
//            public int delete(String msisdn) throws Exception {
//                return 0;
//            }
//
//            @Override
//            public String get(String msisdn, ProvProfilesListBody servicesList) {
//                return null;
//            }
//
//            @Override
//            public String get(String msisdn) {
//                return null;
//            }
//
//        };
//        return toReturn;
//    }
}
