// Creates the hunger attributes for the pets
class HungerAttribute implements Attribute {
    private int value;

    public HungerAttribute() {
        this.value = 0;
    }

    @Override
    public void incrementValue() {
        value++;
    }

    @Override
    public void decrementValue() {
        if (value > 0) {
            value--;
        }
    }

    @Override
    public String getValue(Integer key) {
        if (key == 5) {
            if (value <= 2) {
                return "hungry";
            } else {
                return "not hungry";
            }
        }
        return "";
    }

    @Override
    public Integer getCurrentValue() {
        return value;
    }

    @Override
    public String getColor() {
        return "";
    }
}