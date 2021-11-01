package java2;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        List<Contribuinte> list = new ArrayList<Contribuinte>();

        System.out.print(" Enter the number of taxpayers: ");
        int n = sc.nextInt();

        for (int i = 1; i<=n; i++ ){
            System.out.println( " Taxpayer # " + i + " data: ");
            System.out.print(" Individual or company (i/c)? ");
            char x = sc.next().charAt(0);
                System.out.print(" Name: ");
                String name = sc.next();
                System.out.print(" Anual Income: ");
                Double anualIncome = sc.nextDouble();
            if (x == 'i'){
                System.out.print(" Health expenditures: ");
                Double health = sc.nextDouble();
                Individual individual = new Individual(name, anualIncome,health);
                list.add(individual); // instaciar o objeto da classe antes de fazer a LISTA

            }
            else{
            System.out.print(" Number of Employees: ");
            Integer number = sc.nextInt();
            list.add(new Company(name, anualIncome, number));

        }}

        System.out.println();
        System.out.println(" Taxes paid: ");

        for (Contribuinte cb: list){
                System.out.println(cb.getName()+ ": $ "+ String.format("%.2f", cb.tax())); //cb eu to puxando da lista o nome e o imposto
            }// além disso o metodo abstrato unifica pois pode unir o nome com o tax em uma mesma lista


        System.out.println("Total: ");
        double sum = 0.0;
        for (Contribuinte cb: list){
            sum += cb.tax();
        }
        System.out.println(sum);

            sc.close();


    }
}
