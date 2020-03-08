package com.smart.website.demo.commons.design.test.mock.persist;

#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.mock.persist;

import ${package}.mock.model.InputParamsFile;
import ${package}.mock.model.MockDataFile;

/**
 * @author shawnzhan.zxy
 * @date 2018/09/12
 */
public interface DataStore {

    public void save(MockDataFile mockDataFile, String filePath);
    public void save(InputParamsFile inputParamsFile, String filePath);


    public MockDataFile get(String fileId, String filePath);
    public InputParamsFile getInputParamsFile(String fileId, String filePath);

}
