package com.example.matkaexhibitioncentre.repository;

import com.example.matkaexhibitioncentre.MatkaItems;

import java.util.ArrayList;
import java.util.List;

public class ExhibitionRepository {






   public List<MatkaItems> getAllItems () {
       List<MatkaItems> itemsList = new ArrayList<>();

       itemsList.add(new MatkaItems("For the center", "http://matka.com.mk/wp-content/uploads/2018/05/centrala.jpg",  "The Exhibition Center Matka is a unique educational center in Macedonia dealing with energy. In it, visitors through modern interactive methods can learn more about electricity, its history, production, transmission and usage.\n" +
               "\n" +
               "\n" +
               "Th educational contents are set in the historic building of the old hydroelectric power plant Matka, where guests have a unique opportunity to see an 80-year-old energy facility that can still be in operation.\n" +
               "\n" +
               "EVN has that honor as part of its small production of electricity from renewable sources to own the hydroelectric power plant Matka. Matka has always been special. It is located in one of the most picturesque canyons in the Republic of Macedonia, visited by tourists from all over the world. Macedonia, as well as the rest of the world, has a growing need for educating young people in the so-called STEM area (Science, Technology, Engineering and Mathematics). The love for these sciences is developed in childhood, and in Macedonia there is not enough educational content that would encourage it.\n" +
               "\n" +
               "The rich history of Matka, worth passing on to future generations, as well as the need for STEM education were the main reasons why EVN created the Exhibition Center Matka."));



         itemsList.add(new MatkaItems("History","http://matka.com.mk/wp-content/uploads/2018/05/ISTORIJA-2.jpg","In the thirties of the last century, an artificial lake was built at the exit of the canyon on Lake Treska, with a concrete dam for electricity production. Construction work on the dam began in 1935 and HPP began operations in 1938 with an installed capacity of 4.2 MW."));
         itemsList.add(new MatkaItems("History","http://matka.com.mk/wp-content/uploads/2018/05/ISTORIJA-3.jpg","The construction was extensive and it was a collective venture, a capital project of its time, but credits for it’s construction can be attributed to Professor. Dr. Miladin Pekinar the author of the project, the designer and the man supervising the construction. When the dam was completed, Pekinar standing on its top shouted: “If you the dam goes, let the one who envisioned it go with it”."));
         itemsList.add(new MatkaItems("History","http://matka.com.mk/wp-content/uploads/2018/05/ISTORIJA-4.jpg",""));
         itemsList.add(new MatkaItems("History", "http://matka.com.mk/wp-content/uploads/2018/05/ISTORIJA-5.jpg","The HPP Match today is part of the production of renewable energy of EVN Macedonia. In 2008 it has been reconstructed and a completely new hydropower plan has been built.  With the construction of the new powerhouse, located near the old, the old powerhouse ceased operation, after which in 2016 was transformed into an educational and exhibition center."));



         return itemsList;


   }
}
