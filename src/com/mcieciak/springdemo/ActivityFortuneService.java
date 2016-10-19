package com.mcieciak.springdemo;

import org.springframework.stereotype.Component;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by Mateusz on 19.10.2016.
 */

@Component
public class ActivityFortuneService implements FortuneService {


    public List<String> readFromFile(String filePath) {
        FileReader fileReader = null;
        try {
            fileReader = new FileReader(filePath);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        List<String> array = new ArrayList<>();
        try {
            String line = bufferedReader.readLine();
            while (line != null) {
                line = bufferedReader.readLine();
                array.add(line);
            }
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return array;

    }


    private Random rnd = new Random();

    @Override
    public String getFortune() {

        List <String> array=readFromFile("C:/Users/Mateusz/Desktop/file.txt");
        int index = rnd.nextInt(array.size());
        String theFortune = array.get(index);
        return theFortune;
    }
}
