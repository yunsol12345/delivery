package delivery.external;

import org.springframework.stereotype.Service;

@Service
public class StoreChoiceServiceImpl implements StoreChoiceService {

    /**
     * Fallback
     */
    public StoreChoice getStoreChoice(Long id) {
        StoreChoice storeChoice = new StoreChoice();
        return storeChoice;
    }
}
