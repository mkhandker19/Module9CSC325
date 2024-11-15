package com.example.module9csc325;

import products.Top;
import products.Pant;
import products.Shoe;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;

public class Controller {

    @FXML
    private ComboBox<String> styleComboBox;

    @FXML
    private Label topLabel;

    @FXML
    private Label pantLabel;

    @FXML
    private Label shoeLabel;

    @FXML
    public void initialize() {
        // Populate ComboBox with style options
        styleComboBox.getItems().addAll("Professional", "Casual", "Party");

        // Handle style selection
        styleComboBox.setOnAction(event -> {
            String selectedStyle = styleComboBox.getValue();
            GarmentFactory factory;

            // Choose the factory based on the selected style
            switch (selectedStyle) {
                case "Professional":
                    factory = new ProfessionalFactory();
                    break;
                case "Casual":
                    factory = new CasualFactory();
                    break;
                case "Party":
                    factory = new PartyFactory();
                    break;
                default:
                    factory = null;
            }

            // Update labels if a valid factory is selected
            if (factory != null) {
                Top top = factory.createTop();
                Pant pant = factory.createPant();
                Shoe shoe = factory.createShoe();
                topLabel.setText("Top: " + top.getDescription());
                pantLabel.setText("Pant: " + pant.getDescription());
                shoeLabel.setText("Shoe: " + shoe.getDescription());
            }
        });
    }
}
