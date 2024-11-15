package com.example.module9csc325;

import products.Top;
import products.Pant;
import products.Shoe;
import products.CasualTop;
import products.CasualPant;
import products.CasualShoe;

public class CasualFactory implements GarmentFactory {
    @Override
    public Top createTop() {
        return new CasualTop();
    }

    @Override
    public Pant createPant() {
        return new CasualPant();
    }

    @Override
    public Shoe createShoe() {
        return new CasualShoe();
    }
}
