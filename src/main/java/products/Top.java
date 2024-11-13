package products;

public interface Top {
    String getDescription();
}

//Top interface and has empty method because other classes will implement this, and override it to have their own description.