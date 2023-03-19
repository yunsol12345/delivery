package delivery.external;

import java.util.Date;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "customer", url = "${api.url.customer}")
public interface PayService {
    @RequestMapping(method = RequestMethod.POST, path = "/pays")
    public void cancelOder(@RequestBody Pay pay);
}
