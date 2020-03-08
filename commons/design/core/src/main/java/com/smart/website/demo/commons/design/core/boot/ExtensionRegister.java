package com.smart.website.demo.commons.design.core.boot;

import com.smart.website.account.common.ApplicationContextHelper;
import com.smart.website.account.common.ColaConstant;
import com.smart.website.account.exception.framework.ColaException;
import com.smart.website.account.extension.ExtensionCoordinate;
import com.smart.website.account.extension.ExtensionPointI;
import com.smart.website.account.extension.ExtensionRepository;
import com.sun.tools.javac.util.ArrayUtils;
import com.sun.tools.javac.util.StringUtils;

/**
 * ExtensionRegister
 *
 * @author fulan.zjf 2017-11-05
 */
@Component
public class ExtensionRegister implements RegisterI {

    @Autowired
    private ExtensionRepository extensionRepository;


    @Override
    public void doRegistration(Class<?> targetClz) {
        ExtensionPointI extension = (ExtensionPointI) ApplicationContextHelper.getBean(targetClz);
        Extension extensionAnn = targetClz.getDeclaredAnnotation(Extension.class);
        String extPtClassName = calculateExtensionPoint(targetClz);
        BizScenario bizScenario = BizScenario.valueOf(extensionAnn.bizId(), extensionAnn.useCase(), extensionAnn.scenario());
        ExtensionCoordinate extensionCoordinate = new ExtensionCoordinate(extPtClassName, bizScenario.getUniqueIdentity());
        ExtensionPointI preVal = extensionRepository.getExtensionRepo().put(extensionCoordinate, extension);
        if (preVal != null) {
            throw new ColaException("Duplicate registration is not ${parentArtifactId}owed for :" + extensionCoordinate);
        }
    }

    /**
     * @param targetClz
     * @return
     */
    private String calculateExtensionPoint(Class<?> targetClz) {
        Class[] interfaces = targetClz.getInterfaces();
        if (ArrayUtils.isEmpty(interfaces))
            throw new ColaException("Please assign a extension point interface for " + targetClz);
        for (Class intf : interfaces) {
            String extensionPoint = intf.getSimpleName();
            if (StringUtils.contains(extensionPoint, ColaConstant.EXTENSION_EXTPT_NAMING))
                return intf.getName();
        }
        throw new ColaException("Your name of ExtensionPoint for " + targetClz + " is not valid, must be end of " + ColaConstant.EXTENSION_EXTPT_NAMING);
    }

}