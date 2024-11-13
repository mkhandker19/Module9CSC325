package products;

public interface Pant {
    String getDescription();
}

//Pant interface and has empty method because other classes will implement this, and override it to have their own description.