package products;

public interface Shoe {
    String getDescription();
}

//Shoe interface and has empty method because other classes will implement this, and override it to have their own description.