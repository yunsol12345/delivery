package delivery.external;

import java.util.Date;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "front", url = "${api.url.front}")
public interface StoreChoiceService {
    @RequestMapping(method = RequestMethod.POST, path = "/storeChoices")
    public void storeChoice(@RequestBody StoreChoice storeChoice);
}
