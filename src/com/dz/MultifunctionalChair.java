package com.dz;

public class MultifunctionalChair implements Chair{
    String type = "Multifunctional chair";



    @Override
    public String getType() {
        return type;
    }
}
