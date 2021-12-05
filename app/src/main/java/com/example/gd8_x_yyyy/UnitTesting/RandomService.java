package com.example.gd8_x_yyyy.UnitTesting;




import com.example.gd8_x_yyyy.api.ApiClient;
import com.example.gd8_x_yyyy.api.ApiInterface;
import com.example.gd8_x_yyyy.models.Random;
import com.example.gd8_x_yyyy.models.RandomResponse;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class RandomService {

    public void random(final RandomView view, Random random, final RandomCallback callback)
    {
        ApiInterface apiService = ApiClient.getClient().create(ApiInterface.class);
        Call<RandomResponse> randomDAOCall = apiService.createRandom(random);

        randomDAOCall.enqueue(new Callback<RandomResponse>() {
            @Override
            public void onResponse(Call<RandomResponse> call, Response<RandomResponse> response) {
                if (response.body().getMessage().equalsIgnoreCase("berhasil daftar")) {
                    callback.onSuccess(true, response.body().getRandomList().get(0));
                } else {
                    callback.onError();
                    view.showRandomError(response.body().getMessage());
                }
            }

            @Override
            public void onFailure(Call<RandomResponse> call, Throwable t) {
                view.showErrorResponse(t.getMessage());
                callback.onError();
            }
        });
    }

    public Boolean getValid(final RandomView view, Random random)
    {
        final Boolean[] bool = new Boolean[1];
        random(view, random, new RandomCallback() {
            @Override
            public void onSuccess(boolean value, Random random) {
                bool[0] = true;
            }

            @Override
            public void onError() {
                bool[0] = false;
            }
        });
        return bool[0];
    }
}
