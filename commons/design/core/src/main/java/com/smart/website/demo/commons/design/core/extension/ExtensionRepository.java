package com.smart.website.demo.commons.design.core.extension;

/*
 * Copyright 2017 Alibaba.com All right reserved. This software is the
 * confidential and proprietary information of Alibaba.com ("Confidential
 * Information"). You sh${parentArtifactId} not disclose such Confidential Information and sh${parentArtifactId}
 * use it only in accordance with the terms of the license agreement you entered
 * into with Alibaba.com.
 */


import lombok.Getter;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

/**
 * ExtensionRepository
 *
 * @author fulan.zjf 2017-11-05
 */
@Component
public class ExtensionRepository {

    @Getter
    private Map<ExtensionCoordinate, ExtensionPointI> extensionRepo = new HashMap<>();

}
