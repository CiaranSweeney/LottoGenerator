package com.example.lottogenerator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.example.lottogenerator.lotto.Lotto;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Lotto lotto = new Lotto(6, 47);
        lotto.randomGenarateNumbers();
        System.out.println("here");
        for(int i =0; i < lotto.getLottoNumbers().size(); i++)
            System.out.println(lotto.getLottoNumbers().get(i));
    }
}
