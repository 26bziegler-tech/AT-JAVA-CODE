public class BaseballCard {
    String name; 
    int year; 

    public BaseballCard(String name, int year) {
        this.name = name;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "BaseballCard[Name: " + name + ", Year: " + year + "]";
    }

    @Override
    public boolean equals(Object otherObject) {
        if (otherObject == null) {
            return false;
        }

        if (this == otherObject) {
            return true;
        }

        if (otherObject instanceof BaseballCard) {
            BaseballCard other = (BaseballCard) otherObject;
            return this.name.equals(other.name) && this.year == other.year;
        }

        return false;
    }
}