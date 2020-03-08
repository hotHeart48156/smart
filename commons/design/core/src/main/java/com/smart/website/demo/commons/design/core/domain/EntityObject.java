package com.smart.website.demo.commons.design.core.domain;


import com.smart.website.accout.commons.extension.BizScenario;
import lombok.Data;

/**
 * Entity Object
 * <p>
 * This is the parent object of ${parentArtifactId} domain objects
 *
 * @author fulan.zjf 2017年10月27日 上午10:16:10
 */

@Data
public abstract class EntityObject {
    private BizScenario bizScenario;
}
