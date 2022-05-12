package hu.unideb.inf;


public class Apartment_Listing {

    private Integer id;
    private Integer price;
    private Location loc;
    private Integer size;
    private String type;
    private Integer bedroom;
    private Boolean furnish;

    public Apartment_Listing() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Location getLoc() {
        return loc;
    }

    public void setLoc(Location loc) {
        this.loc = loc;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getBedroom() {
        return bedroom;
    }

    public void setBedroom(Integer bedroom) {
        this.bedroom = bedroom;
    }

    public Boolean getFurnish() {
        return furnish;
    }

    public void setFurnish(Boolean furnish) {
        this.furnish = furnish;
    }
}