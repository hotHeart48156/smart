package org.users.domain.valueobject.integration;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Value;

import javax.persistence.Column;
/**
 * @author "yangbiao"
 */
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@Value
public class HistoryIntegration extends AbstractIntegration {
    @Column(name ="   historyIntegration")
private Long integration;
}
