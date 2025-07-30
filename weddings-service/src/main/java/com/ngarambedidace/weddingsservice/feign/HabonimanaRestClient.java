package com.ngarambedidace.weddingsservice.feign;

//import com.ngarambedidace.weddingsservice.model.Habonimana;
import com.ngarambedidace.weddingsservice.model.Habonimana;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.hateoas.PagedModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "ntigabanya-service")
public interface HabonimanaRestClient {
    @GetMapping("habonimanas/{id}")
    @CircuitBreaker(name = "ntigabanyaServiceCB", fallbackMethod = "getDefaultNtigabanya")
    Habonimana getHabonimanaById(@PathVariable Long id);

    @GetMapping("habonimanas")
    @CircuitBreaker(name = "ntigabanyaServiceCB", fallbackMethod = "getDefaultAllNtigabanya")
    PagedModel<Habonimana> getAllHabonimanas();
    default Habonimana getDefaultNtigabanya(Long id, Exception exception){
        Habonimana habonimana =new Habonimana();
        habonimana.setHabonimanaId(id);
        habonimana.setFirstName("default firstname");
        return habonimana;
    }

    default PagedModel<Habonimana> getDefaultAllNtigabanya(Exception e){
        return PagedModel.empty();
    }
}
