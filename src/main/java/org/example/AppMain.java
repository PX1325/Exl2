package org.example;

import org.example.Repository.MasterRepository;
import org.example.Tables.Client;
import org.example.Repository.ClientRepository;
import org.example.Tables.Master;

import java.util.List;

public class AppMain {
    public static void main(String[] args) {

        MasterRepository masterRepository = new MasterRepository();
        List<Master> masters = masterRepository.getAllMasters();

            System.out.println("Парикмахеры:");
        for (Master master: masters) {
            System.out.println(master.getName()+ " "  + master.getSurname() );
            }
        masterRepository.closeEntityManager();

        System.out.println();

        ClientRepository clientRepository = new ClientRepository();
        List<Client> clients = clientRepository.getAllClients();

            System.out.println("Клиенты:");
        for (Client client : clients) {
            System.out.println(client.getName()+ " " + client.getSurname());
            //System.out.println("Номер телефона " + client.getNumber());
        }
        clientRepository.closeEntityManager();
    }
}
