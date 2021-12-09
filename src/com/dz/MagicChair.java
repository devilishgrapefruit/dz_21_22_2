package com.dz;

public class MagicChair implements Chair{
    String type = "Magic chair";


    @Override
    public String getType() {
        return type;
    }
}
