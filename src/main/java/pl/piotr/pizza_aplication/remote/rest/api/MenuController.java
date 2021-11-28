package pl.piotr.pizza_aplication.remote.rest.api;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.piotr.pizza_aplication.remote.rest.dto.response.MenuDto;

@RequestMapping
@RestController
public class MenuController {
    @GetMapping
    public ResponseEntity<MenuDto> getMenu(){
    return ResponseEntity.status.ok();
    }
}
