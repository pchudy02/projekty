package pl.piotr.pizza_aplication.remote.rest.dto.response;

import com.fasterxml.jackson.annotation.JsonFormat;
import pl.piotr.pizza_aplication.domain.model.OrderStatusType;

import java.util.Date;


public class OrderStatusDto {
    private OrderStatusType status;

    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date createAt;

    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date updatedAt;

    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date expectedAt;

    public OrderStatusDto() {
    }

    public OrderStatusDto(OrderStatusType status, Date createAt, Date updatedAt, Date expectedAt) {
        this.status = status;
        this.createAt = createAt;
        this.updatedAt = updatedAt;
        this.expectedAt = expectedAt;
    }

    public OrderStatusType getStatus() {
        return status;
    }

    public void setStatus(OrderStatusType status) {
        this.status = status;
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Date getExpectedAt() {
        return expectedAt;
    }

    public void setExpectedAt(Date expectedAt) {
        this.expectedAt = expectedAt;
    }
}