package payroll;


import lombok.extern.slf4j.Slf4j;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import payroll.Model.Order;

import java.util.Calendar;
import java.util.GregorianCalendar;

@Configuration
@Slf4j
class LoadDatabase {
    Calendar calendar=new GregorianCalendar(2020,5,4);

    @Bean
    CommandLineRunner initDatabase(OrderRepository repository) {
        return args -> {
            //
            // log.info("Preloading " + repository.save(new Order(true,"telephone","lenovo","calendar","calendar","Q","E","O","K")));
          //  log.info("Preloading " + repository.save(new Order(false,"Q","c",new GregorianCalendar(2017,1,5),new GregorianCalendar(2017,1,5),"Q","E","O","K")));
        };
    }
}