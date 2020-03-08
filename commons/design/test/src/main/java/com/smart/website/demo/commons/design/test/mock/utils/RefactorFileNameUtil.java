package com.smart.website.demo.commons.design.test.mock.utils;

#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.mock.utils;

import java.io.File;
import java.io.IOException;

/**
 * 使用方式==》只要修改mockfilePath即可
 * java -cp ${artifactId}-1.0.4.jar ${package}.mock.utils.RefactorFileNameUtil [mockfilePath]
 * 如：java -cp ${artifactId}-1.0.4_beta-SNAPSHOT.jar ${package}.mock.utils.RefactorFileNameUtil D:/gitspace/megabot-crm/crm-auth/start/src/test/resources/mockfile
 *
 * 录制文件名缩写，原本com.alibaba.Test_execute->c.a.Test_execute
 * created by damon on 2019/5/8
 */
public class RefactorFileNameUtil {

    public static boolean readfile(String packagepath) throws IOException {
            //String packagepath = "/Users/damon/workspace/larissa-sample/start/src/test/resources/mockfile";
            File file = new File(packagepath);
            if (file.isDirectory()) {
                String[] filelist = file.list();
                for (int i = 0; i < filelist.length; i++) {
                    if(filelist[i].contains("service.list")){
                        continue;
                    }
                    File readfile = new File(packagepath + "/" + filelist[i]);
                    File destifile = new File(packagepath + "/" + FileUtils.getAbbrOfClassName(filelist[i]));
                    readfile.renameTo(destifile);
                }

            }


        return true;
    }

    public static void main(String[] args) throws IOException {
        RefactorFileNameUtil.readfile(args[0]);
    }
}
