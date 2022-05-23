package ma.inpt.rentingCarApp;

import ma.inpt.rentingCarApp.entities.Car;
import ma.inpt.rentingCarApp.entities.User;
import ma.inpt.rentingCarApp.services.CarService;
import ma.inpt.rentingCarApp.services.NotificationService;
import ma.inpt.rentingCarApp.services.UserService;
import ma.inpt.rentingCarApp.utils.MidnightApplicationRefresh;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.time.LocalDate;
import java.util.Arrays;

@SpringBootApplication
public class CarRentingApplication {

    // class attributes :
    final CarService carService;
    final UserService userService;
    final NotificationService notificationService;
    final BCryptPasswordEncoder pwEncoder;
    final MidnightApplicationRefresh midAppRef;

    // class constructor :
    public CarRentingApplication(CarService carService, UserService userService, NotificationService notificationService, BCryptPasswordEncoder pwEncoder, MidnightApplicationRefresh midAppRef) {
        this.carService = carService;
        this.userService = userService;
        this.notificationService = notificationService;
        this.pwEncoder = pwEncoder;
        this.midAppRef = midAppRef;
    }

    // class methods :
    public static void main(String[] args) {
        SpringApplication.run(CarRentingApplication.class, args);
    }

    @Bean
    CommandLineRunner runner() {
        return args -> {

            User user1 = new User("fathima", pwEncoder.encode("fathima"), "fathima@gmail.com", "Bushra", "Fathima", "11, first street", "876542124", "Tuticorin");
            user1.setRole("ROLE_ADMIN");

            User user2 = new User("reema", pwEncoder.encode("reema"), "reema@gmail.com", "shahrin", "reema", "22, second street", "87432829", "Chennai");
            user2.setRole("ROLE_EMPLOYEE");

            User user3 = new User("vaish", pwEncoder.encode("vaish"), "vaish@gmail.com", "Vaishnavi", "Vaish", "33, third street", "82670018", "Mumbai");
            user3.setRole("ROLE_USER");

            User user4 = new User("revathi", pwEncoder.encode("revathi"), "revathi@gmail.com", "D", "Revathi", "44, fourth street", "9875433", "Salem");
            user4.setRole("ROLE_ADMIN");


            User user5 = new User("aakil", pwEncoder.encode("aakil"), "aakil.ahamed@gmail.com", "Aakil", "ahamed", "54, third street", "12347895", "Delhi");
            User user6 = new User("giyaz", pwEncoder.encode("Riyaz"), "riyaz@gmail.com", "Riyaz", "mohamed", "64, third street", "45681329", "Erode");
            User user7 = new User("George", pwEncoder.encode("george"), "george@gmail.com", "George", "Williams", "74, third street", "4568162", "Kerala");
            User user8 = new User("mythili", pwEncoder.encode("mythili"), "mythili.bindh@gmail.com", "Mythili", "Bindh", "84, third street", "12365482", "Chittor");
            User user9 = new User("rizwana", pwEncoder.encode("Rizwana"), "rizwana@gmail.com", "Rizwana", "Khan", "94, third street", "14587892", "Tambaram");
            User user10 = new User("gandhi", pwEncoder.encode("Gandhi"), "gandhi@gmail.com", "Gandhi", "bose", "104, third street", "12349875", "Mysore");
            User user11 = new User("sinchan", pwEncoder.encode("Sinchan"), "sinchan@gmail.com", "Sinchan", "Nohara", "114, third street", "78945213", "Bangalore");
            User user12 = new User("mehta", pwEncoder.encode("Mehta"), "mehta@gmail.com", "Mehta", "kapoor", "124, third street", "12394567", "Ooty");

            userService.save(user1);
            userService.save(user2);
            userService.save(user3);
            userService.save(user4);
            userService.save(user5);
            userService.save(user6);
            userService.save(user7);
            userService.save(user8);
            userService.save(user9);
            userService.save(user10);
            userService.save(user11);
            userService.save(user12);

            Car car1 = new Car("Corolla : Toyota", "Mohammed Hachami", 2001, 1);
            Car car2 = new Car("308 : Peugeot", "Mohammed Batrone", 2000, 1);
            Car car3 = new Car("Tucson : Hyundai", "Taha Bouasria", 2012, 3);
            Car car4 = new Car("Focus : Ford", "Taha Elghabi", 2007, 2);
            Car car5 = new Car("Astra : Opel", "Houda Oukessou", 2013, 3);
            Car car6 = new Car("CLA : Mercedes", "Mohammed Idrissi", 1002, 2);
            Car car7 = new Car("Logan : Dacia", "Oussama Rachidi", 2002, 2);
            Car car8 = new Car("Clio4 : Renault", "Yassir Kassimi", 2011, 1);
            Car car9 = new Car("308 : Peugeot", "Intissar Labiad", 2009, 1);
            Car car10 = new Car("Golf : VolksWagen", "Imad Slimani", 2015, 3);
            Car car11 = new Car("Fabia : SKoda", "Aaziz Taleb", 2005, 1);
            Car car12 = new Car("Uno : Fiat", "Achak Nizar", 2008, 1);
            Car car13 = new Car("Punto : Fiat", "Bahou Basma", 2000, 2);
            Car car14 = new Car("Kuga : Ford", "Ibrahim Jouhari", 2001, 3);
            Car car15 = new Car("ClasseE : Mercedes", "Salim Zaidi", 2005, 3);
            Car car16 = new Car("Tiguan : VolksWagen", "Hicham Taibi", 2016, 2);
            Car car17 = new Car("Evoque : RangeRover", "Alae Abjabja", 2014, 1);
            Car car18 = new Car("Fiesta : Ford", "Ismail Ouafi", 2012, 2);
            Car car19 = new Car("Micra : Nissan", "Khalil Amraoui", 2009, 2);
            Car car20 = new Car("Qashqai : Nissan", "Omar Mouad", 2016, 3);
            Car car21 = new Car("Megane : Renault", "Manal Riad", 2006, 3);
            Car car22 = new Car("Leon : Seat", "Amine Meftah", 2015, 1);
            Car car23 = new Car("Picanto : Kia", "Abdellah Chadid", 2001, 2);
            Car car24 = new Car("Micra : Nissan", "Meryem Fadil", 2017, 3);
            Car car25 = new Car("500 : Fiat", "Marouane Naji", 2016, 1);
            Car car26 = new Car("X5 : BMW", "Omar Bahri", 2009, 1);
            Car car27 = new Car("Q8 : Audi", "Youssef Assil", 2011, 1);
            Car car28 = new Car("A4 : Audi", "Ihssane   Grini", 2010, 2);
            Car car29 = new Car("508 : Peugeot", "Selma Yamani", 2017, 3);
            Car car30 = new Car("Ibiza : Seat", "Zineb Oufkir", 2013, 1);
            Car car31 = new Car("Corsa : Opel", "Aymane Sabir", 2014, 1);
            Car car32 = new Car("C3 : Citroen", "Ahmed Ghazouani", 2009, 2);
            Car car33 = new Car("C4 : Citroen", "Kawtar Maaroufi", 2020, 3);
            Car car34 = new Car("XC60 : VOLVO", "Anouar Halimi", 2019, 3);
            Car car35 = new Car("Fiesta : Ford", "Mohammed Bacha", 2016, 3);

            carService.save(car1);
            carService.save(car2);
            carService.save(car3);
            carService.save(car4);
            carService.save(car5);
            carService.save(car6);
            carService.save(car7);
            carService.save(car8);
            carService.save(car9);
            carService.save(car10);
            carService.save(car11);
            carService.save(car12);
            carService.save(car13);
            carService.save(car14);
            carService.save(car15);
            carService.save(car16);
            carService.save(car17);
            carService.save(car18);
            carService.save(car19);
            carService.save(car20);
            carService.save(car21);
            carService.save(car22);
            carService.save(car23);
            carService.save(car24);
            carService.save(car25);
            carService.save(car26);
            carService.save(car27);
            carService.save(car28);
            carService.save(car29);
            carService.save(car30);
            carService.save(car31);
            carService.save(car32);
            carService.save(car33);
            carService.save(car34);
            carService.save(car35);

            car10.setTheUser(user3);
            car10.setReturnDate(LocalDate.of(2021, 5, 23));

            car34.setTheUser(user12);
            car34.setReturnDate(LocalDate.of(2021, 12, 28));

            car1.setTheUser(user3);
            car1.setReturnDate(LocalDate.of(2021, 5, 05));

            user3.setCars(Arrays.asList(car10, car1));

            carService.save(car1);
            carService.save(car10);
            userService.save(user3);

            midAppRef.midnightApplicationRefresher();
        };
    }
}