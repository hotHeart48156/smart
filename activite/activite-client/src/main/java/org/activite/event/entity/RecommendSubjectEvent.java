package org.activite.event.entity;

import org.activite.dto.entity.RecommendSubjectDto;
import org.activite.event.AbstractEvent;

import lombok.Value;
@Value
public class RecommendSubjectEvent  extends AbstractEvent
{
    RecommendSubjectDto recommendSubjectDto;
}