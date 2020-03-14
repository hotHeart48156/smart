package org.product.domain.aggragate;

import java.io.*;
import java.lang.reflect.Field;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.Objects;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;

/**
 * @author yangbiao
 */

public class AutoGen {

    public static void main(String[] args) {
        AutoGen autoGen=new AutoGen();
        autoGen.entityToDto(" /org/product/domain/aggragate", "/org/product/dto");
    }
    public void entityToDto(String packagename, String destPackageName){
        List<String> className=getClassName(packagename);
        for (String name:className){


            try {
            Class c=Class.forName(name);
                File file=new File(name+"Dto"+".java");
                FileWriter fileWriter=new FileWriter(file);
                BufferedWriter bufferedWriter=new BufferedWriter(fileWriter);
                bufferedWriter.write("package "+"\n  "+destPackageName);

                bufferedWriter.write("public class"+c.getName()+"Dto");

                for (Field filed:c.getFields()){
                    String filename=filed.getName();
                    bufferedWriter.write("private"+"  \n"+"String"+"  \n"+Character.isLowerCase(filename.charAt(0)));
                }
                bufferedWriter.write("public void accept(");
                for (Field filed:c.getFields()){

                    bufferedWriter.write("ValueObjectFactoty.newInstance("+filed.getName()+".class"+","+Character.isLowerCase(filed.getName().charAt(0))+");");
                }
                bufferedWriter.write("}}");

            } catch (IOException | ClassNotFoundException e) {
                e.printStackTrace();
            }


        }
    }

    public  List<String> getClassName(String packageName) {
        System.out.println("cafdrgf");

        String filePath = AutoGen.class.getResource(packageName).getPath() ;
        System.out.println(filePath);
        List<String> fileNames = getClassName(filePath, null);
        for (String name:fileNames){
            System.out.println(name);
        }
        return fileNames;
    }

    private  List<String> getClassName(String filePath, List<String> className) {
        List<String> myClassName = new ArrayList<String>();
        File file = new File(filePath);
        File[] childFiles = file.listFiles();
        for (File childFile : childFiles) {
            if (childFile.isDirectory()) {
                myClassName.addAll(getClassName(childFile.getPath(), myClassName));
            } else {
                String childFilePath = childFile.getPath();
                childFilePath = childFilePath.substring(childFilePath.indexOf("\\classes") + 9, childFilePath.lastIndexOf("."));
                childFilePath = childFilePath.replace("\\", ".");
                myClassName.add(childFilePath);
            }
        }

        return myClassName;
    }
}





