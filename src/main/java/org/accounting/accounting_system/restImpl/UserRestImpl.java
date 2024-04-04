package org.accounting.accounting_system.restImpl;

import org.accounting.accounting_system.constents.OfficeConstants;
import org.accounting.accounting_system.rest.UserRest;
import org.accounting.accounting_system.service.UserService;
import org.accounting.accounting_system.utils.OfficeUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class UserRestImpl implements UserRest {

    @Autowired
    UserService userService;

    @Override
    public ResponseEntity<String> signUp(Map<String, String> requestMap) {
        try {

            return userService.signUp(requestMap);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return OfficeUtils.getResponseEntity(OfficeConstants.SOMETHING_WENT_WRONG, HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @Override
    public ResponseEntity<String> login(Map<String, String> requestMap) {
        try {

            return userService.login(requestMap);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return OfficeUtils.getResponseEntity(OfficeConstants.SOMETHING_WENT_WRONG, HttpStatus.INTERNAL_SERVER_ERROR);
    }

}
