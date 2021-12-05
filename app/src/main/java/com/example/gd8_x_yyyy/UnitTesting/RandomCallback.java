package com.example.gd8_x_yyyy.UnitTesting;

import com.example.gd8_x_yyyy.models.Random;

public interface RandomCallback {

    void onSuccess(boolean value, Random random);
    void onError();
}
