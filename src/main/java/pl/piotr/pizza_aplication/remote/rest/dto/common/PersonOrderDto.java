package pl.piotr.pizza_aplication.remote.rest.dto.common;

public class PersonOrderDto {
    private String name;
    private String adrres;
    private String phone;
    private Integer floor;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdrres() {
        return adrres;
    }

    public void setAdrres(String adrres) {
        this.adrres = adrres;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Integer getFloor() {
        return floor;
    }

    public void setFloor(Integer floor) {
        this.floor = floor;
    }
}
