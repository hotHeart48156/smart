package org.product.domain.aggragate;

import com.geekhalo.ddd.lite.codegen.application.GenApplication;
import com.geekhalo.ddd.lite.codegen.application.GenMixedApplication;
import com.geekhalo.ddd.lite.codegen.dto.GenDto;
import com.geekhalo.ddd.lite.codegen.springdatarepository.GenSpringDataRepository;
import com.geekhalo.ddd.lite.domain.Aggregate;
import com.geekhalo.ddd.lite.domain.DomainEvent;
import com.geekhalo.ddd.lite.domain.ValidationHandler;
import com.geekhalo.ddd.lite.domain.support.jpa.JpaAggregate;
import org.product.domain.valueobject.id.ProductId;

import java.util.Date;
import java.util.List;

/**
 * @author "yangbiao"
 */
@GenDto
@GenSpringDataRepository
@GenMixedApplication

public class ProductFindByTitle extends JpaAggregate {

}
