package  org.activite.commandhandle.aggregation.promotion;

import lombok.Value;
import org.activite.cache.CacheService;
import org.activite.cache.UpdateCache;
import org.activite.domain.repository.PromotionRepository;
import org.activite.executor.command.aggregation.promotion.PromotionStatusCommand;
import org.axonframework.commandhandling.CommandHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component

@Value
public class PromotionStatusCommandHandle  extends AbstractPromotionCommandHandle{
 @Autowired
private CacheService cacheService;
@Autowired
private PromotionRepository repository;
@CommandHandler
public void on (PromotionStatusCommand command){
cacheService.update(new UpdateCache(command.getPromotionStatusDto(),repository));
}}
