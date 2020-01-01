package com.example.lottogenerator.lotto;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import lombok.Getter;

public class Lotto {
    private List<Integer> userNumbers = new ArrayList();
    @Getter
    private List<Integer> lottoNumbers = new ArrayList();
    private int lottoSize;
    private int amountOfLottoNumbers;

    public Lotto(int lottoSize, int amountOfLottoNumbers) {
        this.lottoSize = lottoSize;
        this.amountOfLottoNumbers = amountOfLottoNumbers;
    }

    public void randomGenarateNumbers(){
        lottoNumbers.clear();
        int count = 1;
        Random random = new Random();
        int randomNum;
        while (count <= lottoSize){
            randomNum = 1 + random.nextInt(amountOfLottoNumbers);
            if(!lottoNumbers.contains(randomNum)){
                lottoNumbers.add(randomNum);
                count++;
            }
        }
    }
}
