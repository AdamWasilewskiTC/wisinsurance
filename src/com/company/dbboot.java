package com.company;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class dbboot {
    public static void connect() {
        Connection conn = null;
        try {
            // db parameters
            String url = "jdbc:sqlite:E:\\dokumenty\\szkola\\i20 szypke\\ubezpieczenia\\baza.sqlite";
            // create a connection to the database
            conn = DriverManager.getConnection(url);

            System.out.println("Connection to SQLite has been established.");
            Statement st = conn.createStatement();
            String dropTableSQL1 = "DROP TABLE IF EXISTS address;" ;
            String dropTableSQL2 = "DROP TABLE IF EXISTS damage_type;" ;
            String dropTableSQL3 = "DROP TABLE IF EXISTS damages;" ;
            String dropTableSQL4 = "DROP TABLE IF EXISTS event;" ;
            String dropTableSQL5 = "DROP TABLE IF EXISTS policy;";
            String dropTableSQL6 = "DROP TABLE IF EXISTS policy_type;" ;
            String dropTableSQL7 = "DROP TABLE IF EXISTS risks;";
            String dropTableSQL8 = "DROP TABLE IF EXISTS customer;";
            String dropTableSQL9 = "DROP TABLE IF EXISTS customeraddress;";
            String dropTableSQL10 = "DROP TABLE IF EXISTS businesscustomer;";
            String dropTableSQL11 = "DROP TABLE IF EXISTS individualcustomer;";
            st.execute(dropTableSQL1);
            st.execute(dropTableSQL2);
            st.execute(dropTableSQL3);
            st.execute(dropTableSQL4);
            st.execute(dropTableSQL5);
            st.execute(dropTableSQL6);
            st.execute(dropTableSQL7);
            st.execute(dropTableSQL8);
            st.execute(dropTableSQL9);
            st.execute(dropTableSQL10);
            st.execute(dropTableSQL11);
            String createTableSQL = "create table address" +
                    "(" +
                    "    id         int  not null" +
                    "        constraint address_pk" +
                    "            primary key," +
                    "    city       text not null," +
                    "    street     text not null," +
                    "    homeNumber text not null," +
                    "    zipcode    text not null" +
                    ");" +
                    "create unique index address_id_uindex" +
                    "    on address (id);";
            String createTableSQL1 = "create table damage_type" +
                    "(" +
                    "    name text not null" +
                    "        constraint damage_type_pk" +
                    "            primary key" +
                    ");" +

                    "create unique index damage_type_name_uindex" +
                    "    on damage_type (name);";
            String createTableSQL2 = "create table damages" +
                    "(" +
                    "    id          int  not null" +
                    "        constraint damages_pk" +
                    "            primary key," +
                    "    policy_id   int  not null" +
                    "        references policy" +
                    "            on update restrict," +
                    "    documents   text not null," +
                    "    damage_type text not null" +
                    "        references damage_type" +
                    "            on update restrict," +
                    "    victim      text not null" +
                    ");" +

                    "create unique index damages_damage_type_uindex" +
                    "    on damages (damage_type);" +

                    "create unique index damages_id_uindex" +
                    "    on damages (id);" +

                    "create unique index damages_policy_id_uindex" +
                    "    on damages (policy_id);";
            String createTableSQL3 = "create table event" +
                    "(" +
                    "    id         int  not null" +
                    "        constraint event_pk" +
                    "            primary key," +
                    "    date       date not null," +
                    "    damages    text not null" +
                    "        references damages," +
                    "    eventPlace text not null," +
                    "    course     int" +
                    ");" +

                    "create unique index event_damages_uindex" +
                    "    on event (damages);" +

                    "create unique index event_id_uindex" +
                    "    on event (id);";
            String createTableSQL4 = "create table policy" +
                    "(" +
                    "    id           int     not null" +
                    "        constraint policy_pk" +
                    "            primary key," +
                    "    policyholder text    not null," +
                    "    insured      text    not null," +
                    "    salarized    text    not null," +
                    "    risk_id      int     not null" +
                    "        references risks" +
                    "            on update restrict," +
                    "    \"from\"       Date    not null," +
                    "    \"to\"         Date    not null," +
                    "    price        Decimal not null," +
                    "    policy_type  text    not null" +
                    "        references policy_type" +
                    "            on update restrict" +
                    ");" +

                    "create unique index policy_id_uindex" +
                    "    on policy (id);" +

                    "create unique index policy_policy_type_uindex" +
                    "    on policy (policy_type);" +

                    "create unique index policy_risk_id_uindex" +
                    "    on policy (risk_id);";
            String createTableSQL5 = "create table policy_type" +
                    "(" +
                    "    name text not null" +
                    "        constraint policy_type_pk" +
                    "            primary key" +
                    ");" +

                    "create unique index policy_type_name_uindex" +
                    "    on policy_type (name);";
            String createTableSQL6 = "create table risks" +
                    "(" +
                    "    id              int     not null" +
                    "        constraint risks_pk" +
                    "            primary key," +
                    "    min_price       Decimal not null," +
                    "    max_price       Decimal not null," +
                    "    protection_from Date    not null," +
                    "    protection_to   Date    not null," +
                    "    description     Text    not null," +
                    "    policy_type     Text    not null" +
                    "        references policy_type" +
                    "            on update restrict" +
                    ");" +

                    "create unique index risks_id_uindex" +
                    "    on risks (id);" +

                    "create unique index risks_policy_type_uindex" +
                    "    on risks (policy_type);";
            String createTableSQL9 = "create table customer" +
                    "(" +
                    "    id int not null" +
                    "        constraint customer_pk" +
                    "            primary key" +
                    "        constraint customer_businesscustomer_id_fk" +
                    "            references businesscustomer" +
                    "        constraint customer_individualcustomer_id_fk" +
                    "            references individualcustomer," +
                    "    email text not null," +
                    "    number text not null" +
                    ");" +
                    "create unique index customer_id_uindex" +
                    "    on customer (id);"
                    ;
            String createTableSQL10 = "create table customeraddress" +
                    "(" +
                    "   id int not null" +
                    "      constraint customeraddress_pk" +
                    "         primary key," +
                    "   addressid int not null" +
                    "      constraint customeraddress_address_id_fk" +
                    "         references address," +
                    "   customerid int not null" +
                    "      constraint customeraddress_customer_id_fk" +
                    "         references customer" +
                    ");" +
                    "" +
                    "create unique index customeraddress_addressid_uindex" +
                    "   on customeraddress (addressid);" +
                    "" +
                    "create unique index customeraddress_customerid_uindex" +
                    "   on customeraddress (customerid);" +
                    "" +
                    "create unique index customeraddress_id_uindex" +
                    "   on customeraddress (id);";
            String createTableSQL7 = "create table businesscustomer" +
                    "(" +
                    "    id    int  not null" +
                    "        constraint businesscustomer_pk" +
                    "            primary key," +
                    "    nip   text not null," +
                    "    regon text" +
                    ");" +
                    "" +
                    "create unique index businesscustomer_id_uindex" +
                    "    on businesscustomer (id);";
            String createTableSQL8 ="create table individualcustomer" +
                    "(" +
                    "    id        int  not null" +
                    "        constraint individualcustomer_pk" +
                    "            primary key," +
                    "    firstname text not null," +
                    "    lastname  text not null," +
                    "    pesel     text not null" +
                    ");" +
                    "" +
                    "create unique index individualcustomer_id_uindex" +
                    "    on individualcustomer (id);";
            st.execute(createTableSQL1);
            st.execute(createTableSQL2);
            st.execute(createTableSQL3);
            st.execute(createTableSQL4);
            st.execute(createTableSQL5);
            st.execute(createTableSQL6);
            st.execute(createTableSQL7);
            st.execute(createTableSQL8);
            st.execute(createTableSQL);
            st.execute(createTableSQL9);
            st.execute(createTableSQL10);


            String insertTable1 = "INSERT INTO address (id, city, street, homeNumber, zipcode) VALUES (1, 'Warszawa', 'Wiśniowa', '56', '02-520');";

            String insertTable2 = "INSERT INTO address (id, city, street, homeNumber, zipcode) VALUES (2, 'Kałuszyn', 'Rodzinna', '25', '05-124');";
            String insertTable3 = "INSERT INTO businesscustomer (id, nip, regon) VALUES (1, '2137694207', '692137420');";
            String insertTable4 = "INSERT INTO businesscustomer (id, nip, regon) VALUES (2, '5757854546', '666776875');";;
            String insertTable5 = "INSERT INTO customer (id, email, number) VALUES (1, 'agent47@gmail.com', '600100100');";
            String insertTable6 = "INSERT INTO customer (id, email, number) VALUES (2, 'stanislawkloca@wp.pl', '754443735');";
            String insertTable7 = "INSERT INTO customer (id, email, number) VALUES (3, 'sox@sox.pl', '213742069');";
            String insertTable8 = "INSERT INTO customer (id, email, number) VALUES (4, 'miski@grozne.eu', '006947420');";
            String insertTable9 = "INSERT INTO individualcustomer (id, firstname, lastname, pesel) VALUES (1, 'Agent', 'Fortyseven', '68071255437');";
            String insertTable10 = "INSERT INTO individualcustomer (id, firstname, lastname, pesel) VALUES (2, 'Stanisław', 'Kłoca', '54102566591');";
            String insertTable11= "INSERT INTO address (id, city, street, homeNumber, zipcode) VALUES (3, 'Bydgoszcz', 'Brzozowa', '31', '85-154');";
            String insertTable12 = "INSERT INTO address (id, city, street, homeNumber, zipcode) VALUES (4, 'Studzienice', 'Wczasowa', '19', '77-143');";
            String insertTable13 = "INSERT INTO customeraddress (id, addressid, customerid) VALUES (1, 1, 1);";
            String insertTable14 = "INSERT INTO customeraddress (id, addressid, customerid) VALUES (2, 2, 2);";
            String insertTable15 = "INSERT INTO customeraddress (id, addressid, customerid) VALUES (3, 3, 3);";
            String insertTable16 = "INSERT INTO customeraddress (id, addressid, customerid) VALUES (4, 4, 4);";
            String insertTable17 = "INSERT INTO policy_type (name) VALUES ('Zdrowotne');";
            String insertTable18= "INSERT INTO policy_type (name) VALUES ('Na życie');";
            String insertTable19 = "INSERT INTO policy_type (name) VALUES ('Komunikacujne');";
            String insertTable20 = "INSERT INTO policy_type (name) VALUES ('Majątkowe');";
            String insertTable21 = "";
            String insertTable22= "";
            String insertTable23 = "";
            String insertTable24= "";

            st.execute(insertTable1);
            st.execute(insertTable2);
            st.execute(insertTable3);
            st.execute(insertTable4);
            st.execute(insertTable5);
            st.execute(insertTable6);
            st.execute(insertTable7);
            st.execute(insertTable8);
            st.execute(insertTable9);
            st.execute(insertTable10);
            st.execute(insertTable11);
            st.execute(insertTable12);
            st.execute(insertTable13);
            st.execute(insertTable14);
            st.execute(insertTable15);
            st.execute(insertTable16);
            st.execute(insertTable17);
            st.execute(insertTable18);
            st.execute(insertTable19);
            st.execute(insertTable20);
            st.execute(insertTable21);
            st.execute(insertTable22);
            st.execute(insertTable23);
            st.execute(insertTable24);

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        }

        
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        connect();
    }
}
