package edu.iutcs.cr.system;

import edu.iutcs.cr.Invoice;
import edu.iutcs.cr.persons.Buyer;
import edu.iutcs.cr.persons.Seller;
import edu.iutcs.cr.vehicles.Vehicle;

import java.io.*;
import java.util.HashSet;
import java.util.Set;

/**
 * @author Raian Rahman
 * @since 4/19/2024
 */
public class DataStore {
    private final String CARS_FILENAME = "cars.txt";
    private final String BUYERS_FILENAME = "buyers.txt";
    private final String SELLERS_FILENAME = "sellers.txt";
    private final String INVOICES_FILENAME = "invoices.txt";

    public void saveInvoices(Set<Invoice> invoices) {
        saveData(invoices, INVOICES_FILENAME);
    }

    public Set<Invoice> loadInvoices() {
        return (Set<Invoice>) loadData(INVOICES_FILENAME);
    }

    public void saveBuyers(Set<Buyer> buyers) {
        saveData(buyers, BUYERS_FILENAME);
    }

    public Set<Buyer> loadBuyers() {
        return (Set<Buyer>) loadData(BUYERS_FILENAME);
    }

    public void saveSellers(Set<Seller> sellers) {
        saveData(sellers, SELLERS_FILENAME);
    }

    public Set<Seller> loadSellers() {
        return (Set<Seller>) loadData(SELLERS_FILENAME);
    }

    public void saveVehicles(Set<Vehicle> vehicles) {
        saveData(vehicles, CARS_FILENAME);
    }

    public Set<Vehicle> loadVehicles() {
        return (Set<Vehicle>) loadData(CARS_FILENAME);
    }

    private void saveData(Object data, String filename) {
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(filename))) {
            outputStream.writeObject(data);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private Set<?> loadData(String filename) {
        Set<?> dataSet = new HashSet<>();
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(filename))) {
            dataSet = (Set<?>) inputStream.readObject();
        } catch (IOException | ClassNotFoundException e) {
            saveData(dataSet, filename);
        }
        return dataSet;
    }
}
