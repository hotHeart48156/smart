package org.activite.domain;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * @author yangbiao
 */

public class GetAllClass {

    public static List<String> getClassName(String packagename){
        List<String> classPath=new ArrayList<>();
        String filePath=ClassLoader.getSystemResource("").getPath()+packagename.replace(".","/");
        System.out.println(filePath);
        List<String> fileNames=getClassName(filePath,true);
        fileNames.forEach(fileName->classPath.add(packagename+"."+fileName));
        return classPath;

    }
    public static List<String> getClassName(String filepath,boolean ischild){
        List<String> classNames=new ArrayList<>();
        File file=new File(filepath+"/");
        System.out.println(file.getAbsolutePath());
        System.out.println(file.isDirectory());
        for (File childFile:file.listFiles()){
            if (childFile.isDirectory()){
                classNames.addAll(getClassName(childFile.getPath(),true));

            }else {
                String fileName=childFile.getName();
                int index=fileName.indexOf(".");
                classNames.add(fileName.substring(0,index));
            }
        }
        return classNames;

    }
}
