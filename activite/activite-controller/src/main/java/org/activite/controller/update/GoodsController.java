package org.activite.controller.update;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yangbiao
 */
@RestController(value = "/update/")
public class GoodsController {
    @PostMapping("goods")
    public void update()
}
