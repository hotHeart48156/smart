package org.users.controller.command.aggre;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.users.dto.agg.UserIconDto;
import org.users.service.command.UserIconService;

/**
 * @author yangbiao
 */

public class UserCreateController {
    @Autowired
    UserIconService service;
    @PostMapping(value = "createuser")
    public void command(UserIconDto dto){
        service.UserIcon(dto);
    }
}
