package part1;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class ClockList extends Clock implements I_List {

    List<Clock> list = new ArrayList<>();

    @Override
    public void addFromFile(String fName) {
        //    Your code is here!

        if (list.size() > 0) {
            list.clear();
        }

        try {
            BufferedReader br = new BufferedReader(new FileReader(fName));
            String line;

            while ((line = br.readLine()) != null) {
                if (line.equalsIgnoreCase("")) {
                    continue;
                }

                String[] data = line.split(",");
                String code = data[0];
                String make = data[1];
                int size = Integer.parseInt(data[2]);
                int price = Integer.parseInt(data[3]);

                Clock clock = new Clock(code, make, size, price);
                list.add(clock);
            }
            br.close();
        } catch (IOException e) {
            System.out.println("Error reading file: " + fName);
        }
    }

    @Override
    public void saveToFile(String fName) {
        //    Your code is here!

        if (list.isEmpty()) {
            System.out.println("Empty list. ");
            return;
        }

        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(fName));

            for (int i = 0; i < list.size(); i++) {
                bw.write(list.get(i).toString().toUpperCase().replaceAll(", ", "- "));
                bw.newLine();
            }

            bw.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    @Override
    public void addClock() {
        //    Your code is here!

        Clock clock = new Clock();

        clock.input();

        list.add(clock);
    }

    @Override
    public void findClockByCode(String code) {
        //    Your code is here!

        boolean found = false;

        for (Clock clock : list) {
            if (clock.getCode().equalsIgnoreCase(code)) {
                System.out.println(clock);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Not found: " + code);
        }
    }

    @Override
    public void findClockByMake(String make) {
        //    Your code is here!

        boolean found = false;

        for (Clock clock : list) {
            if (clock.getMake().equalsIgnoreCase(make)) {
                System.out.println(clock);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Not found: " + make);
        }
    }

    @Override
    public Clock findClockWithMaxPrice() {
        //    Your code is here!

        int maxPrice = 0;
        Clock maxClock = new Clock();

        for (Clock clock : list) {
            if (clock.getPrice() > maxPrice) {
                maxPrice = clock.getPrice();
                maxClock = clock;
            }
        }

        System.out.println(maxClock);

        return null;
    }

    @Override
    public Clock findClockWithMinPrice() {
        //    Your code is here!

        int minPrice = list.get(0).getPrice();
        Clock minClock = new Clock();

        for (Clock clock : list) {
            if (clock.getPrice() < minPrice) {
                minPrice = clock.getPrice();
                minClock = clock;
            }
        }

        System.out.println(minClock);
        return null;
    }

    @Override
    public void countClock() {
        //    Your code is here!
        System.out.println("Count: " + list.size());

    }

    @Override
    public void sortAndPrint() {
        //    Your code is here!

        List<Clock> tList = new ArrayList<>();
        tList = list;

        countClock();
        tList.sort(new Comparator<Clock>() {
            @Override
            public int compare(Clock c1, Clock c2) {
                return c1.getPrice() > c2.getPrice() ? 1 : -1;
            }
        });

        for (Clock clock : tList) {
            System.out.println(clock.toString());
        }
    }
}