import model.Flat;
import model.Floor;
import model.House;
import model.Room;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        //setting up rooms (6)
        Room roomRr1 = new Room();
        roomRr1.setHeight(3.00);
        roomRr1.setLightOn(false);

        Room roomRr2 = new Room();
        roomRr2.setHeight(3.1);
        roomRr2.setLightOn(false);

        Room roomRr3 = new Room();
        roomRr3.setHeight(2.9);
        roomRr3.setLightOn(true);

        Room roomRr4 = new Room();
        roomRr4.setHeight(9.0);
        roomRr4.setLightOn(true);

        Room roomRr5 = new Room();
        roomRr5.setHeight(9.0);
        roomRr5.setLightOn(true);

        Room roomRr6 = new Room();
        roomRr6.setHeight(7.0);
        roomRr6.setLightOn(false);

        //setting up flats

        Flat flatNr1 = new Flat();
        flatNr1.setArea(64.14);
        flatNr1.setNr(1);
        flatNr1.setOwner("Kostik");

        List<Room> roomsIn1 = new ArrayList<>();
        roomsIn1.add(roomRr1);
        roomsIn1.add(roomRr2);

        flatNr1.setRooms(roomsIn1);

        //-----------------------------

        Flat flatNr2 = new Flat();
        flatNr2.setArea(34.14);
        flatNr2.setNr(2);
        flatNr2.setOwner("Kostik");

        List<Room> roomsIn2 = new ArrayList<>();
        roomsIn2.add(roomRr3);

        flatNr2.setRooms(roomsIn2);

        //setting up floors

        Floor floorNr1 = new Floor();
        floorNr1.setNr(1);

        List<Flat> flats = new ArrayList<>();
        flats.add(flatNr1);
        flats.add(flatNr2);

        floorNr1.setFlats(flats);

        //setting up house


        House house = new House();
        house.setNr(221);
        house.setStreetName("Baker str. ");

        List<Floor> floors = new ArrayList<>();
        floors.add(floorNr1);
        floors.add(new Floor());

        house.setFloors(floors);

        System.out.println(house.getFloors().get(0).getFlats().get(0).getRooms().get(0).getHeight());
















//        //       System.out.println("Hello, world!");
//        //       SometutUdaljaemTekstFunctions functions = new SometutUdaljaemTekstFunctions();     // vivodit na konsolj Hello i imja iz klassa Main
//        //       String text = functions.getWelcomeText("Valera");  // imja Valera
//        //       System.out.println(text);                          // rezuljtat  SomeFunctions functions + getWelcomeText
//
//        String text = "Laikraksts, atsaucoties uz anonīmām amatpersonām, apgalvoja, ka Tramps par atlīdzību, kas tiekot maksāta par amerikāņu karavīru nogalināšanu, esot ticis informēts vēl martā.\n" +
//                "\n" +
//                "Avīze norādījusi, ka talibi naudu esot saņēmuši, taču nav skaidrs, vai pastāv aizdomas par kādas konkrētas ASV militārpersonas nāvi Afganistānā, kuras nogalināšana būtu saistīta ar šo lietu.";
//
//        String[] words = text.split(" ");
//        System.out.println("Words count is " + words.length);
//        //       System.out.println(words[4]);
//
//        for (int i = 0; i < words.length; i = i + 2) {
//            System.out.println("The word with id" + i + " is " + words[i]); // Nachinaetjsa s 0 slovo, rabota so vsem textom, s hagom cherez odno slovo
//        }
//
//        for (String word : words) {
//            System.out.println(word);  // kazhdoe novoe slovo otobrazhaetjsa s novoj stroki, v tom chisle znaki -. , !
//        }
//
//        List<String> names = new ArrayList<String>();
//        names.add("Valerijs");
//        names.add("Kostik the best");
//        names.add("Maxik");
//        names.add("uPsa - eto aspirin");
//
//        System.out.println(names.get(1)); //budet Kostik the best   porjadkovoja nomeracija 0 1 2 3
//
//        for (String name : names) {
//            System.out.println(name); // budet otobrazhatjsaja to chto v skobkah (Valerijs, Kostik the best, Maxik, uPsa - eto aspirin
//        }
//
//        HashMap<String, Integer> bookUniqueWords = new HashMap<String, Integer>();
//        bookUniqueWords.put("the", 1);
//        bookUniqueWords.put("student", 1);
//        bookUniqueWords.put("is", 1);
//        bookUniqueWords.put("the", 2);
//
//        for (Map.Entry<String, Integer> entry : bookUniqueWords.entrySet()) {
//            System.out.println(entry.getKey()); // otvet the student is
//        }
    }
}




