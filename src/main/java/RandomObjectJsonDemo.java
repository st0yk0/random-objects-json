import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import com.google.gson.stream.JsonReader;
import com.namics.commons.random.RandomData;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class RandomObjectJsonDemo {

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter how many objects you want:");
        int input = myObj.nextInt();
        List<People> peopleList = new ArrayList<People>();

        for (int i = 0; i < input; i++) {
            People people = RandomData.random(People.class);
            peopleList.add(people);
        }

        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String json = gson.toJson(peopleList);
        System.out.println(json);


    }
}
