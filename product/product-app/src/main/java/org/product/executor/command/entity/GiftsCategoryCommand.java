package  org.product.executor.command.entity;
import lombok.Value;
import org.product.dto.entity.GiftsCategoryDto;
import org.product.executor.AbstractCommand;
@Value
public class GiftsCategoryCommand  extends AbstractCommand{
private GiftsCategoryDto  GiftsCategoryDto;
}