package   org.activite.commandhandle.aggregation.coupon;

import lombok.Value;
import org.activite.cache.CacheService;
import org.activite.cache.UpdateCache;
import org.activite.domain.repository.CouponRepository;
import org.activite.event.CouponUserTypeEvent;
import org.activite.executor.command.aggregation.coupon.CouponUserTypeCommand;
import org.axonframework.commandhandling.CommandHandler;
import org.axonframework.modelling.command.AggregateLifecycle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component

@Value
public class CouponUserTypeCommandHandle  extends AbstractCouponCommandHandle{
 @Autowired
private     CacheService cacheService;
@Autowired
private  CouponRepository repository;
@CommandHandler
public void on (CouponUserTypeCommand command){
cacheService.update(new UpdateCache(command.getCouponUserTypeDto(),repository));
AggregateLifecycle.apply(new CouponUserTypeEvent(command.getCouponUserTypeDto()));
}}
