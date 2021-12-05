package com.example.gd8_x_yyyy.UnitTesting;

import com.example.gd8_x_yyyy.models.Random;

public class RandomPresenter {
    private RandomView view;
    private  RandomService service;
    private RandomCallback callback;
    private Random random;

    public RandomPresenter(RandomView view, RandomService service) {
        this.view = view;
        this.service = service;
    }

    public void onRandomClicked()
    {
        String regexNum = "[0-9]+";
        String regexAlpha = "[a-zA-Z]+";
        String regexAlphaNum = "^[A-Za-z0-9]+$";
        String regexEmail = "[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+";
        String regexAlpha2Words = "[A-Za-z]+\\s+[A-Za-z]+";


        if (view.getEmail().isEmpty()) {
            view.showEmailError("Email tidak boleh kosong");
            return;
        } else if (!view.getEmail().matches(regexEmail)) {
            view.showEmailError("Format Email tidak sesuai dengan aturan");
            return;
        } else if (view.getPassword().isEmpty()) {
            view.showPasswordError("Password tidak boleh kosong");
            return;
        } else if (!view.getPassword().matches(regexAlphaNum)) {
            view.showPasswordError("Format Password tidak sesuai dengan aturan");
            return;
        } else  if (view.getPassword().length() < 6 ){
            view.showPasswordError("Password tidak boleh kurang dari 6 karakter");
            return;
        } else if (view.getKotaAsal().isEmpty()) {
            view.showKotaAsalError("Kota Asal tidak boleh kosong");
            return;
        } else if (!view.getKotaAsal().matches(regexAlpha)) {
            view.showKotaAsalError("Format Kota Asal harus berupa huruf");
        } else if (!view.getKotaAsal().matches(regexAlpha2Words)) {
            view.showKotaAsalError("Kota Asal harus terdiri dari 2 kata");
        } else {
            service.random(view, random, new RandomCallback() {
                @Override
                public void onSuccess(boolean value, Random random) {
                    view.startMainRandom();
                }

                @Override
                public void onError() {

                }
            });
            return;
        }
    }
}
