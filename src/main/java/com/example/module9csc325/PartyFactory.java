package com.example.module9csc325;

import products.Top;
import products.Pant;
import products.Shoe;
import products.PartyTop;
import products.PartyPant;
import products.PartyShoe;

public class PartyFactory implements GarmentFactory {
    @Override
    public Top createTop() {
        return new PartyTop();
    }

    @Override
    public Pant createPant() {
        return new PartyPant();
    }

    @Override
    public Shoe createShoe() {
        return new PartyShoe();
    }
}

//This is the party factory and will have only party garments.