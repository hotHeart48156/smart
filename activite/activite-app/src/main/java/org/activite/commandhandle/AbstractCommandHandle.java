package org.activite.commandhandle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;

/**
@author yangbiao
 */


public abstract class AbstractCommandHandle  {
    @Autowired
    JpaRepository repository;



}
