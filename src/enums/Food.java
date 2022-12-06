package enums;

public enum Food {
    MEAT_POULSTRY(300),
    FISH_SEAFOOF(700),
    WATER(25),
    TASTY(250);

    private int price;

    Food(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

}
