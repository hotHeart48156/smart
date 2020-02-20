package com.geekhalo.ddd.lite.codegen.utils;

import com.geekhalo.ddd.lite.codegen.Description;
import com.geekhalo.ddd.lite.domain.Aggregate;
import com.geekhalo.ddd.lite.domain.support.jpa.IdentitiedJpaAggregate;
import com.geekhalo.ddd.lite.domain.support.jpa.IdentitiedJpaEntity;
import com.geekhalo.ddd.lite.domain.support.jpa.JpaAggregate;
import com.geekhalo.ddd.lite.domain.support.jpa.JpaEntity;
import com.geekhalo.ddd.lite.domain.support.mongo.IdentitiedMongoAggregate;
import com.geekhalo.ddd.lite.domain.support.mongo.IdentitiedMongoEntity;
import com.geekhalo.ddd.lite.domain.support.mongo.MongoAggregate;
import com.geekhalo.ddd.lite.domain.support.mongo.MongoEntity;
import com.google.common.collect.Lists;
import com.squareup.javapoet.*;
import org.apache.commons.lang3.StringUtils;

import javax.lang.model.element.*;
import javax.lang.model.type.TypeKind;
import javax.lang.model.type.TypeMirror;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TypeUtils {
    public static String getParentPacketName(String pkgName) {
        return pkgName.substring(0, pkgName.lastIndexOf('.'));
    }


    public static void bindDescription(Element element, MethodSpec.Builder methodBuilder) {
        Description description = element.getAnnotation(Description.class);
        if (description != null) {
            methodBuilder.addAnnotation(AnnotationSpec.builder(Description.class)
                    .addMember("value", "\"" + description.value() + "\"")
                    .build());
        }
    }

    public static ParameterSpec createParameterSpecFromElement(VariableElement element) {
        TypeName type = TypeName.get(element.asType());
        String name = element.getSimpleName().toString();
        ParameterSpec.Builder parameterBuilder = ParameterSpec.builder(type, name)
                .addModifiers(element.getModifiers());
        Description description = element.getAnnotation(Description.class);
        if (description != null) {
            parameterBuilder.addAnnotation(AnnotationSpec.builder(Description.class)
                    .addMember("value", "\"" + description.value() + "\"")
                    .build());
        }
        return parameterBuilder.build();
    }

    public static ParameterSpec createIdParameter(ClassName idClassName) {
        return ParameterSpec.builder(idClassName, "id")
                .addAnnotation(AnnotationSpec.builder(Description.class)
                        .addMember("value", "\"主键\"")
                        .build())
                .build();
    }

    public static String createParamListStr(List<String> params) {
        List<String> result = Lists.newArrayList();
        result.addAll(params);
        return result.stream()
                .collect(Collectors.joining(","));
    }

    public static String createParamListStr(ExecutableElement executableElement, String... beforeParam) {
        List<String> parm = executableElement.getParameters().stream()
                .map(varElement -> varElement.getSimpleName().toString())
                .collect(Collectors.toList());
        for (int i = beforeParam.length - 1; i >= 0; i--) {
            parm.add(0, beforeParam[i]);
        }
        return parm.stream()
                .collect(Collectors.joining(", "));
    }

    public static String createParamVarStr(List<String> params) {
        return params.stream()
                .map(varElement -> "{}")
                .collect(Collectors.joining(", "));
    }

    public static String getNameFromGetter(String s) {
        String r = null;
        if (s.startsWith("get")) {
            r = s.substring(3, s.length());
        } else if (s.startsWith("is")) {
            r = s.substring(2, s.length());
        } else {
            r = s;
        }
        return r.substring(0, 1).toLowerCase() + r.substring(1, r.length());
    }

    public static String getNameFromSetter(String s) {
        String r = null;
        if (s.startsWith("set")) {
            r = s.substring(3, s.length());
        } else {
            r = s;
        }
        return r.substring(0, 1).toLowerCase() + r.substring(1, r.length());
    }

    public static boolean isGetter(ExecutableElement element) {
        String s = element.getSimpleName().toString();
        TypeMirror typeMirror = element.getReturnType();
        boolean is = s.startsWith("is") && typeMirror.getKind() == TypeKind.BOOLEAN;
        boolean getter = s.startsWith("get") && typeMirror.getKind() != TypeKind.VOID && !element.getModifiers().contains(Modifier.STATIC);
        return is || getter;
    }


    public static String getFieldName(String name) {
        return name.substring(0, 1).toUpperCase() + name.substring(1, name.length());
    }

    public static String getIdClassName(TypeElement typeElement) {
        TypeMirror typeMirror = typeElement.getSuperclass();
        if (typeMirror == null) {
            return null;
        }

        String parentCls = typeMirror.toString();
        if (parentCls.startsWith(JpaAggregate.class.getName())) {
            return "java.lang.Long";
        }
        if (parentCls.startsWith(JpaEntity.class.getName())) {
            return "java.lang.Long";
        }
        if (parentCls.startsWith(MongoAggregate.class.getName())) {
            return BigInteger.class.getName();
        }
        if (parentCls.startsWith(MongoEntity.class.getName())) {
            return BigInteger.class.getName();
        }
        if (parentCls.startsWith(IdentitiedJpaAggregate.class.getName())) {
            return getIdClassFrom(parentCls);
        }
        if (parentCls.startsWith(IdentitiedJpaEntity.class.getName())) {
            return getIdClassFrom(parentCls);
        }
        if (parentCls.startsWith(IdentitiedMongoAggregate.class.getName())) {
            return getIdClassFrom(parentCls);
        }
        if (parentCls.startsWith(IdentitiedMongoEntity.class.getName())) {
            return getIdClassFrom(parentCls);
        }
        for (TypeMirror itfType : typeElement.getInterfaces()) {
            String type = itfType.toString();
            if (type.startsWith(Aggregate.class.getName())) {
                String s = type.substring(Aggregate.class.getName().length() + 1);
                s = s.substring(0, s.length() - 1);
                if (StringUtils.isNotEmpty(s)) {
                    return s;
                }
            }
        }
        return null;
    }

    private static String getIdClassFrom(String parentCls) {
        return parentCls.substring(parentCls.indexOf("<") + 1, parentCls.indexOf(">"));
    }

    public static String getPackageFromFullClassName(String fullClassName) {
        return fullClassName.substring(0, fullClassName.lastIndexOf('.'));
    }

    public static String getClassNameFromFullClassName(String fullClassName) {
        return fullClassName.substring(fullClassName.lastIndexOf('.') + 1, fullClassName.length());

    }

    public static String getFieldNameFromType(String type) {
        return type.substring(0, 1).toLowerCase() + type.substring(1);
    }
}
