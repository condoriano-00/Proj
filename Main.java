import javax.xml.transform.Source;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean yeah = false;
        while (yeah == false) {
            System.out.print("Enter email: ");
            String s = sc.nextLine();
            if (s.matches("admin@g.msuiit.edu.ph")) {
                yeah = true;
            } else {
                System.out.println("MSU-IIT Admin acc only");
            }
        }

            {
                {
                    Scanner cs = new Scanner(System.in);
                    {
                        boolean ohhh = false;
                        while (ohhh == false) {
                            System.out.print("Enter password: ");
                            String p = cs.nextLine();
                            if (p.matches("1234")) {
                                ohhh = true;
                            } else {
                                System.out.println("Invalid password");
                            }
                        }
                    }
                }


                int monthIncome = 22500;
                int expenses = 9000;
                int netSavings = 13500;
                double totalMoney = netSavings + expenses + monthIncome;

                //Goals
                // goalA = Emergency Funds
                //goalB = Text books
                //goalC = Study Abroad funds
                double totalGoal = 0;
                int[] goals = {50000, 15000, 150000};
                for (int i = 0; i < goals.length; i++) {
                    totalGoal += goals[i];
                }


                double achievedGoal = totalMoney / totalGoal * 100;
                System.out.println("total Money: " + totalMoney);
                System.out.println("total Goal: " + totalGoal);

                if (totalGoal < totalMoney) {
                    System.out.printf("This Month's Money Achieved:  %.2f%%", achievedGoal);
                    System.out.println(" of the goal");
                } else {
                    System.out.printf("This Month's Money Did not Achieve %.2f%%", achievedGoal);
                    System.out.println(" of the goal");
                }


                double monthsIncome = 18000;
                System.out.println("This Month's Income: " + monthsIncome);
                double monthsUsualIncome = 14550;
                double monthsIncomeAchieved = (monthsIncome - monthsUsualIncome) / monthsUsualIncome * 100;


                if (monthsUsualIncome < monthsIncome) {
                    System.out.printf("Your Monthly Income was raised by: %.2f%%\n", monthsIncomeAchieved);
                } else {
                    System.out.printf("Your Monthly Income decreased by: %.2f%%\n", monthsIncomeAchieved);
                }

                double monthsExpenses = 12000;
                double monthsUsualExpenses = 14550;
                double monthsExpensesAchieved = (monthsExpenses - monthsUsualExpenses) / monthsUsualExpenses * 100;
                System.out.println("Total Expenses: " + monthsExpenses);


                if (monthsExpenses < monthsUsualExpenses) {
                    System.out.printf("Your Monthly expenses decreased by: %.2f%%\n", monthsExpensesAchieved);
                } else {
                    System.out.printf("Your Monthly expenses increased by: %.2f%%\n", monthsExpensesAchieved);
                }

                System.out.println("Net Savings: " + totalGoal);


            }

        }
    }
