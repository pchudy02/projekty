package pl.piotr.pizza_aplication.remote.rest.dto.response;

import pl.piotr.pizza_aplication.remote.rest.dto.common.PersonOrderDto;
import pl.piotr.pizza_aplication.remote.rest.dto.common.PizzaOrderDto;

import java.util.List;

public class OrderDto {
    private Integer id;
    private OrderStatusDto status;
    private List<PizzaOrderDto> pizzas;
    private PersonOrderDto person;

    public OrderDto(Integer id, OrderStatusDto status, List<PizzaOrderDto> pizzas, PersonOrderDto person) {
        this.id = id;
        this.status = status;
        this.pizzas = pizzas;
        this.person = person;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public OrderStatusDto getStatus() {
        return status;
    }

    public void setStatus(OrderStatusDto status) {
        this.status = status;
    }

    public List<PizzaOrderDto> getPizzas() {
        return pizzas;
    }

    public void setPizzas(List<PizzaOrderDto> pizzas) {
        this.pizzas = pizzas;
    }

    public PersonOrderDto getPerson() {
        return person;
    }

    public void setPerson(PersonOrderDto person) {
        this.person = person;
    }
}
