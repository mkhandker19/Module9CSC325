package com.example.module9csc325;

import products.Top;
import products.Pant;
import products.Shoe;
import products.ProfessionalTop;
import products.ProfessionalPant;
import products.ProfessionalShoe;

public class ProfessionalFactory implements GarmentFactory {
    @Override
    public Top createTop() {
        return new ProfessionalTop();
    }

    @Override
    public Pant createPant() {
        return new ProfessionalPant();
    }

    @Override
    public Shoe createShoe() {
        return new ProfessionalShoe();
    }
}
