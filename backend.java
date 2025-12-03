package asd;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        int available_job = 0;
        HashMap<String, ArrayList<Integer>> goals = new HashMap<String, ArrayList<Integer>>();
        main_menu(available_job, goals);
    }

    public static void main_menu(int available_job, HashMap<String, ArrayList<Integer>> goals) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("");
        System.out.println("/////////////////////////////");
        System.out.println("// CampusWallet App Design //");
         System.out.println("/////////////////////////////");
        System.out.println("");
        System.out.println("");
        System.out.println("------------------");
        System.out.println("[1] Dashboard");
        System.out.println("[2] Opportunities");
        System.out.println("[3] Marketplace");
        System.out.println("------------------");
        System.out.print(">: ");
        String choice = scanner.nextLine();
        if (!choice.equals("1") && !choice.equals("2") && !choice.equals("3")) {
            System.out.println("[1] [2] [3] only!");
            main_menu(available_job, goals);
        }
        else {
            if (choice.equals("1")) {
                dash_board(available_job, goals);
            }
            else if (choice.equals("2")) {
                opportunities_section(available_job, goals);
            }
        }


    }

    public static void dash_board(int available_job, HashMap<String, ArrayList<Integer>> goals) {
        System.out.println("-----------------------");
        System.out.println("Your Campus Economy Hub");
        System.out.println("Empowering independence");
        print_financial_health_score();
        quick_access_section(available_job, goals);
        saving_goals_section(goals);

    }

    public static void saving_goals_section(HashMap<String, ArrayList<Integer>> goals) {
        System.out.println("-----------------------");
        System.out.println("");
        System.out.println("---- Saving Goals ----");
        System.out.println("");
        if (goals.isEmpty()) {
            System.out.println("---- No Goal ----");
            System.out.println("");
            System.out.println("[6] Add Goal");
            System.out.println("-----------------------");
        }
        else {
            for (String goal: goals.keySet()) {
                System.out.println("");
                double earn = goals.get(goal).get(0);
                double current = goals.get(goal).get(1);
                double percent = (current / earn) * 100;
                System.out.println(goal + " : " + current + "/" + earn + " " + "(" + percent + "%) complete");
                
            }   
            System.out.println("");
            System.out.println("[6] Add Goal");
            System.out.println("-----------------------");
        }
    }

    public static void quick_access_section(int available_job, HashMap<String, ArrayList<Integer>> goals) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("");
        System.out.println("---- Quick Access Section ----");
         System.out.println("");
          System.out.println("");
        System.out.println("[1] Find Student Jobs" + " (" + available_job + ")");
        System.out.println("[2] Sell Items");
        System.out.println("[3] Budget Helper");
        System.out.println("[4] Skill Marketplace");
        System.out.println("[5] Back");
        System.out.println("");
        saving_goals_section(goals);
        System.out.println("");
        System.out.print(">: ");
        String choice = scanner.nextLine();
        if (choice.equals("5")) {
            main_menu(available_job, goals);
        }
        else if (choice.equals("6")) {
            add_goal(available_job, goals);
        }
        else if (choice.equals("2")) {
            sell_items();
        }

    }

    public static void sell_items() {
        System.out.println("");
    }

    public static void find_student_job() {

    }

    public static void opportunities_section(int available_job, HashMap<String, ArrayList<Integer>> goals) {
        System.out.println("");
        System.out.println("//////////////////////////////////////////////////");
        System.out.println("//  Income Opportunities Hub                   ///");
        System.out.println("//  Discover ways to earn and grow financially ///");
        System.out.println("//////////////////////////////////////////////////");
        System.out.println("");
        System.out.println("");
        System.out.println("--------------------------------------------");
        top_section2(available_job);
        filter_category(available_job, goals);


    }

    public static void filter_category(int available_job, HashMap<String, ArrayList<Integer>> goals) {
        System.out.println("-----------------------");
        System.out.println("");
        System.out.println("Filter By Category");
        System.out.println("");
        System.out.println("[1] All Opportunities");
        System.out.println("[2] Part-Time Jobs");
        System.out.println("[3] Freelance Gigs");
        System.out.println("[4] Campus Events");
        System.out.println("[5] Entrepreneurship");
        System.out.println("[6] Back");
        System.out.println("-----------------------");
        System.out.println("");
        Scanner scanner = new Scanner(System.in);
        System.out.print(">: ");
        String choice = scanner.nextLine();
        
        if (choice.equals("1")) {
            System.out.println("   All  Job Opportunities               Location                Work Hour        Salary");
            System.out.println("------------------------------------------------------------------------------------------------");
            System.out.println("[1] Campus Library Assistant | Location: On Campus         | 15-20 hrs/week   | 750/hr");
            System.out.println("[2] Student Cafeteria Server | Location: Main Dining Hall  | 10-15 hrs/week   | 700/hr");
            System.out.println("[3] Web Design Projects      | Location: Remote            | Flexible         | 1,250-2,500/hr");
            System.out.println("[4] Tutoring (Math & Science)| Location: Campus or Remote  | Flexible         | 1,000-1,500/hr");
            System.out.println("[5] Event Setup Crew         | Location: Various Locations | Weekends         | 800/hr");
            System.out.println("[6] Welcome Week Ambassador  | Location: On Campus         | 1 week intensive | 25k");
            System.out.println("[7] Student StartUp Program  | Location: On Campus         | Self-Paced       | 250k");
            System.out.println("[8] Campus Delivery Service  | Location: Campus Area       | Flexible         | Commision Based");
            System.out.println("------------------------------------------------------------------------------------------------");
            System.out.println("[9] Back");
            System.out.println("");
            System.out.print(">: ");
            String choice2 = scanner.nextLine();

            if (choice2.equals("9")) {
                filter_category(available_job, goals);
            }
            
            else if (choice2.equals("1")) {
                System.out.println("");
                System.out.println("-----------------------------");
                System.out.println("Contact: 12345678910");
                System.out.println("Email Here:   Tiger@gmail.com");
                System.out.println("-----------------------------");
                filter_category(available_job, goals);
            }
            else if (choice2.equals("2")) {
                System.out.println("");
                System.out.println("----------------------------------");
                System.out.println("Contact: 12345678910");
                System.out.println("Email Here:   Sumalpong@gmail.com");
                System.out.println("----------------------------------");
                filter_category(available_job, goals);
            }
            else if (choice2.equals("3")) {
                System.out.println("");
                System.out.println("----------------------------------");
                System.out.println("Contact: 12345678910");
                System.out.println("Email Here:   AbdulRaman@gmail.com");
                System.out.println("----------------------------------");
                filter_category(available_job, goals);
            }
            else if (choice2.equals("4")) {
                System.out.println("");
                System.out.println("----------------------------------");
                System.out.println("Contact: 12345678910");
                System.out.println("Email Here:   BoyScatter@gmail.com");
                System.out.println("----------------------------------");
                filter_category(available_job, goals);
            }
            else if (choice2.equals("5")) {
                System.out.println("");
                System.out.println("---------------------------------------");
                System.out.println("Contact: 12345678910");
                System.out.println("Email Here:   GeorgeHandsome@gmail.com");
                System.out.println("---------------------------------------");
                filter_category(available_job, goals);
            }
            else if (choice2.equals("6")) {
                System.out.println("");
                System.out.println("-------------------------------");
                System.out.println("Contact: 12345678910");
                System.out.println("Email Here:   Dedeo@gmail.com");
                System.out.println("-------------------------------");
                filter_category(available_job, goals);
            }
            else if (choice2.equals("7")) {
                System.out.println("");
                System.out.println("-----------------------------------");
                System.out.println("Contact: 12345678910");
                System.out.println("Email Here:   ZhandiGwapo@gmail.com");
                System.out.println("-----------------------------------");
                filter_category(available_job, goals);
            }
            else if (choice2.equals("8")) {
                System.out.println("");
                System.out.println("-----------------------------------");
                System.out.println("Contact: 12345678910");
                System.out.println("Email Here:   LacioPogi@gmail.com");
                System.out.println("-----------------------------------");
                filter_category(available_job, goals);
            }
            else {
                System.out.println("-----------------------------------------");
                System.out.println("[1] [2] [3] [4] [5] [6] [7] [8] [9] Only!");
                System.out.println("-----------------------------------------");
                filter_category(available_job, goals);
            }
            
        }
        else if (choice.equals("2")) {
            System.out.println("       Part-Time Jobs                  Location                Work Hour        Salary");
            System.out.println("------------------------------------------------------------------------------------------------");
            System.out.println("[1] Campus Library Assistant | Location: On Campus         | 15-20 hrs/week   | 750/hr");
            System.out.println("[2] Student Cafeteria Server | Location: Main Dining Hall  | 10-15 hrs/week   | 700/hr");
            System.out.println("------------------------------------------------------------------------------------------------");
            System.out.println("[3] Back");
            System.out.println("");
            System.out.print(">: ");
            String choice2 = scanner.nextLine();
            if (choice2.equals("3")) {
                filter_category(available_job, goals);
            }
        }
        else if (choice.equals("3")) {
            System.out.println("      Freelance Gigs                   Location                Work Hour        Salary");
            System.out.println("------------------------------------------------------------------------------------------------");
            System.out.println("[1] Web Design Projects      | Location: Remote            | Flexible         | 1,250-2,500/hr");
            System.out.println("[2] Tutoring (Math & Science)| Location: Campus or Remote  | Flexible         | 1,000-1,500/hr");
            System.out.println("------------------------------------------------------------------------------------------------");
            System.out.println("[3] Back");
            System.out.println("");
            System.out.print(">: ");
            String choice2 = scanner.nextLine();
            if (choice2.equals("3")) {
                filter_category(available_job, goals);
            }
        }
        else if (choice.equals("4")) {
            System.out.println("      Campus Events                    Location                Work Hour        Salary");
            System.out.println("------------------------------------------------------------------------------------------------");
            System.out.println("[1] Event Setup Crew         | Location: Various Locations | Weekends         | 800/hr");
            System.out.println("[2] Welcome Week Ambassador  | Location: On Campus         | 1 week intensive | 25k");
            System.out.println("------------------------------------------------------------------------------------------------");
            System.out.println("[3] Back");
            System.out.println("");
            System.out.print(">: ");
            String choice2 = scanner.nextLine();
            if (choice2.equals("3")) {
                filter_category(available_job, goals);
            }
        }
        
        else if (choice.equals("5")) {
            System.out.println("      Entrepreneurship                    Location                Work Hour        Salary");
            System.out.println("------------------------------------------------------------------------------------------------");
            System.out.println("[1] Student StartUp Program  | Location: On Campus         | Self-Paced       | 250k");
            System.out.println("[2] Campus Delivery Service  | Location: Campus Area       | Flexible         | Commision Based");
            System.out.println("------------------------------------------------------------------------------------------------");
            System.out.println("");
            System.out.print(">: ");
            String choice2 = scanner.nextLine();
            if (choice2.equals("3")) {
                filter_category(available_job, goals);
            }
        }

        else if (choice.equals("6")) {
            main_menu(available_job, goals);
        }

        else {
            System.out.println("[1] [2] [3] [4] [5] [6] Only!");
            filter_category(available_job, goals);
        }



    }

    public static void top_section2(int available_job) {
        double total = 750 + 700 + 1250 + 1000 + 800 + 25000 + 250000;
        double yeah = total / 7;
        double average = 0;
        System.out.println("---------------------------");
        System.out.println("Active Job: " + 8);
        System.out.println("Avg. Hourly Rate: " + yeah);
        System.out.println("Students Hired: " + 0);
        System.out.println("New This Week: " + 0);
        System.out.println("---------------------------");
    }
    
    public static void add_goal(int available_job, HashMap<String, ArrayList<Integer>> goals) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Name of you Goal: ");
        String goal = scanner.nextLine();

        System.out.print("Goal Earning: ");
        int earning_goal = scanner.nextInt();
        
        System.out.print("Current Earning: ");
        int current_earning = scanner.nextInt();
        if (goals.containsKey(goal)) {
            System.out.println("Goal Already Existed!");
        }
        else {
            
            goals.put(goal, new ArrayList<>(Arrays.asList(earning_goal, current_earning)));
            dash_board(available_job, goals);
        }
        
 

    }

    public static void print_financial_health_score() {
        System.out.println("-----------------------");
        System.out.println("Financial Health Score");
        System.out.println("");
        System.out.println("-----------------------");
    }

}
