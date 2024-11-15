package com.example.module9csc325;

import products.Top;
import products.Pant;
import products.Shoe;


public interface GarmentFactory {
    Top createTop();
    Pant createPant();
    Shoe createShoe();
}

//Garment factory that will initiate the creating on garments.