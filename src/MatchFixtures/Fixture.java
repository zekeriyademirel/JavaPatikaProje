package MatchFixtures;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Fixture {
    Scanner scanInt = new Scanner(System.in);
    Scanner scanStr = new Scanner(System.in);
    String teamName;
    int secim;
    int count = 0;

    ArrayList<String> teams = new ArrayList<>();
    ArrayList<String> coupleTeams = new ArrayList<>();
    Random random = new Random();


    public void teamsRun() {
        boolean status = true;
        while (status) {
            System.out.println("1-Takım Ekleme \n" +
                    "2-Fikstür Oluşturma \n" +
                    "0-Çıkış ");
            System.out.print("Seciminiz = ");
            secim = scanInt.nextInt();

            switch (secim) {
                case 1: {
                    System.out.print("Takım Adı= ");
                    teamName = scanStr.nextLine();
                    teams.add(teamName);
                    break;
                }
                case 2: {
                    System.out.println("***** Takımlar *****");
                    for (String t : teams) {
                        System.out.println(" - " + t);
                    }

                    createFixture();
                }

                case 0: {
                    status = false;
                    break;
                }
                default:
                    System.out.println("Lütfen geçerli bir işlem giriniz !");
            }
        }

    }


    public void createFixture() {

        if (teams.size() % 2 != 0) {
            teamName = "BAY";
            teams.add(teamName);
        }

        for (int i = 0; i < teams.size() - 1; i++) {
            String away;
            String home;
            int matchQuality = 0;
            String selectedTeams = "";

            while (matchQuality < teams.size() / 2) {

                home = teams.get(random.nextInt(teams.size()));
                away = teams.get(random.nextInt(teams.size()));

                if (!home.equals(away)) {
                    if (!selectedTeams.contains(home) && !selectedTeams.contains(away)) {

                        String match1 = (home + " vs " + away);
                        String match2 = (away + " vs " + home);

                        if (!coupleTeams.contains(match1) && !coupleTeams.contains(match2)) {

                            coupleTeams.add(match1);
                            coupleTeams.add(match2);

                            selectedTeams += home;
                            selectedTeams += away;

                            matchQuality++;

                        }

                    }

                }


            }

        }
        printFixtures();

    }

    public void printFixtures() {
        for (int i = 0; i < coupleTeams.size(); i += 2) {
            count++;
            System.out.println("Round " + count);
            int fixCount = 0;
            while (fixCount < teams.size() / 2) {
                System.out.println(coupleTeams.get(i));
                fixCount++;
                i += 2;

                if (i >= coupleTeams.size()) break;
            }
            i -= 2;
        }

        for (int i = 1; i < coupleTeams.size(); i += 2) {
            count++;
            System.out.println("Round " + count);
            int fixCount = 0;
            while (fixCount < teams.size() / 2) {
                System.out.println(coupleTeams.get(i));
                fixCount++;
                i += 2;

                if (i >= coupleTeams.size()) break;
            }
            i -= 2;
        }

    }


}




