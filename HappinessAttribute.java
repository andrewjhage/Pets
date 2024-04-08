// Creates the attributes for happiness for pets
class HappinessAttribute implements Attribute {
    private int value;

    public HappinessAttribute() {
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
        if (key == 6) {
            if (value <= 2) {
                return "unhappy";
            } else if (value > 2 && value <= 5) {
                return "happy";
            } else {
                return "very happy";
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