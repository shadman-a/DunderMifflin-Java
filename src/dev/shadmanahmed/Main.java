package dev.shadmanahmed;

import dundermifflin.PaperCompany;

public class Main {

    public static void main(String[] args) {
        PaperCompany dunderMifflin = new PaperCompany();
        dunderMifflin.receiveShipments();
        dunderMifflin.receiveOrders();
        dunderMifflin.processOrders();

        dunderMifflin.printSummary();

    }
}
