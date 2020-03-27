package   org.activite.commandhandle.aggregation.coupon;

import lombok.Value;
import org.activite.cache.CacheService;
import org.activite.cache.UpdateCache;
import org.activite.domain.repository.CouponRepository;
import org.activite.event.CouponEnableTimeEvent;
import org.activite.executor.command.aggregation.coupon.CouponEnableTimeCommand;
import org.axonframework.commandhandling.CommandHandler;
import org.axonframework.modelling.command.AggregateLifecycle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component

@Value
public class CouponEnableTimeCommandHandle  extends AbstractCouponCommandHandle{
 @Autowired
private     CacheService cacheService;
@Autowired
private  CouponRepository repository;
@CommandHandler
public void on (CouponEnableTimeCommand command){
cacheService.update(new UpdateCache(command.getCouponEnableTimeDto(),repository));
AggregateLifecycle.apply(new CouponEnableTimeEvent(command.getCouponEnableTimeDto()));
}}
