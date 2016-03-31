
import java.util.HashMap;
/**
 *  This class is in charge creating a hashmap with key = location and value = description.
 *  This will allow for user to obtain information of a certain location they are interested 
 *  in. This information will be used in the last part of the program. A picture will accompany
 *  the description. More will be said on this later.
 */
public class PlaceInfo {
    HashMap < String, String > description = new HashMap < String, String > ();


    /**
     *  This method is in charged of presenting the user with a description of a place on campus.
     *  For example, if a user is interested in Main Gym, the following location will be given:
     *  Located across from the Student Center, the Main Gym has it all, as it has basketball courts, 
     *  weights, and place to dance.
     *
     *  @param HashMap <String, String>, this hashmap grabs name in order to give description on place
     *  @return description.get(name), this returns the description based on users request/interest
     */

    public String getInfo(String name) {
        description.put("Revelle*Basketball*Courts", "Located, in front of the Revelle Fleet buildings, these secluded courts are great place to shoot around or play games!");
        description.put("Revelle*PingPong*Table", "Located behind 64 degrees, this table is open to all!");
        description.put("Revelle*Plaza*Skating", "Located in front of Galbriath Hall, this plaza is open to skaters, so come out to practice tricks and flips!");
        description.put("Muir*Basketball*Courts", "Located across the Tamarack apartments, these basketball courts are open to the public, so come out to shoot or play pick up games!");
        description.put("Muir*Natatorium", "Located right next to the main gym, this swimming facility hosts swimming lessons and is open to the public on weekdays.");
        description.put("Main*Gym", "Located across from the Student Center, the Main Gym has it all, as it has basketball courts, weights, and place to dance.");
        description.put("Muir*Volleyball*Courts", "Located in front of the Muir Basketball Courts, this volleyball court is open to all, so come on out and get ready to spike!");
        description.put("Muir*Athletics*Field", "Located next to the Muir Basketball Courts, this field is open to outdoor field activities such as lacrosse, soccer, football, etc.");
        description.put("Marshall*Athletics*Field", "Located next to and above OceanView Terrace, this field is open to outdoor field activities! So come out and have fun!");
        description.put("Marshall*Volleyball*Courts", "Located within the lower level of Marshall, this court is open to all so come out and spike that ball!");
        description.put("Marshall*Basketball*Courts", "Located behind the residence halls along the walk to RIMAC gym, this isolated court is a great place to shoot around and practice!");
        description.put("RIMAC*Gym/Arena", "Located across from ERC, and right above the softball fields, this is the biggest gym of UCSD, which offers weights, basketball courts, dance rooms, treadmills, racquetball, etc.!");
        description.put("RIMAC*Field", "Located below RIMAC Gym, this field is open to outdoor activities");
        description.put("Canyonview*Pools", "Located on the eastern end of campus, between Eleanor Roosevelt College and Warren College, the Canyonview Aquatics Center features two outdoor, Olympic-Size Pools, each of which can be divided into 8 lanes of 50 meters in length or 19 lanes of 25 yards.");
        description.put("Warren*Volleyball*Courts", "In near the field encircled by Douglas, Brown, Bates, Stewart, and Frankfurter Hall, this court is open to all!");
        description.put("Warren*Field", "Located across from Warren and next to the Materials Engineering building, this field is open to outdoor activities!");
        description.put("Sixth*Tennis*Court", "Next to the Sixth Recreation Field and basketball courts, this field is open to outdoor activities!");
        description.put("Sixth*Basketball*Court", "On the east side of the Sixth Recreational Field, this court is open to the public, so come out and shoot some hoops!");
        description.put("Gameroom", "Located right next to Shogun, this gameroom has pool, ping pong, and fooseball tables, so come out and play!");
        description.put("Track*Field", "East of Parking Lot 359, this Track field is open to (yes you guessed it) track and field activities");
        description.put("Archery*Range", "Located behind P702 and the Challenge Course, provides a place for archers and the Archery @ UCSD Club.");
        description.put("Baseball*Field", "Located just north of RIMAC, this field is open to baseball and softball! Come out and practice your swing!");
        description.put("Not*Found", "Sorry! According to our database, we don't have what you are looking for.");
        description.put("BookStore", "Located within Price Center, UCSD's bookstore has everything you need, from pencils to skateboards to spirit wear! Come and shop!");
        description.put("Outback*Adventures", "Located between Price Center and Geisel Library, this store has everything you need to be ready for your outdoor adventure.Come check out the surfboards, boots, and other equipment!");
        description.put("Campus*Bike*And*Skate", "Loacted within the Student Center, this shop has bike and skate rentals. Not to mention it also repairs!");
        description.put("Blake*Hall*Commuter*Lounge", "Located on the first floor of Blake Hall, this study lounge is open to all students, so come out and relax and study!");
        description.put("Argo*Lounge", "Located on the first floor of Argo Hall, this study lounge is open to all students, so come out to relax and study!");
        description.put("Fleet*Lounges", "The fleets are found in Revelle College, and the its buildings, Challenger, Galathea, Discovery, Beagle, and Meteor all have study lounges on the first floor.");
        description.put("Galbraith Hall", "Located above Revelle Plaza, Galbraith offers an active study room and a quiet study room!");
        description.put("Keeling*Lounge", "Located next to the Fleets, Keeling has a study lounge on the first floor. Come stop by!");
        description.put("Muir*Residence*Hall*Lounges", "The residence halls in Muir which include Tenaya, and Tioga both have a study lounges on each floor of the apartment! Come stop by!");
        description.put("Middle*Of*Muir*Lounge", "Located literally in the Middle of Muir, below Pines, MoM offers food and a place to study. Come stop by!");
        description.put("Marshall*Residence*Hall*Lounges", "The residence halls of Marshall, P, Q, R, U, O, all have study lounges, but it is only acessible to Marshall students.");
        description.put("Ocean*View*Lounge", "Located in the same building as the Terrace, this study lounge is open to Marshall Residents");
        description.put("Fireside*Lounge", "Located upstairs in the OceanView building, this study lounge is open to Marshall residents");
        description.put("ERC*Residence*Hall*Lounges", "The ERC housing buildings which include, Afirca, Asia, Europe, Latin America, and North America Hall all have a study lounge on the first floor open to ERC students and residents");
        description.put("Great*Hall", "Located in the front of ERC, this study lounge is open to all so come out and study!");
        description.put("Courtroom", "Located in the front of Warren, the Courtroom offers a place to study, but is only accessible to Warren students");
        description.put("Warren*Residence*Hall*Lounges", "The housing buildings of Warren which include Harlan, Frankfurt, and Stewart Hall all have a study lounge on each floor! So come out and study!");
        description.put("Yosemite*Room", "Located within the Canyon Vista restaurant, this study room is open until midnight during finals! It is open to anyone!");
        description.put("Sixth*College*Lodge", "Located in the Sixth College apartments, this lodge is open 24/7 to study and meet when not being used for meetings!");
        description.put("Sixth*Commuter*Lounge", "Located beside the Sixth College apartments, this lounge can be used to meet and study, open 24/7!");
        description.put("Dogg*House", "Located near the Sixth apartments, this space is open from 8am to 1am when not being used for meetings! SO come out to relax and study!");
        description.put("Price*Center*East/West*Lounge", "The study and meet lounges are located in the east and west wing of Price Center respectively. Comfortable chairs and computers are for your use here!");
        description.put("PriceCenter*Commuter*Lounge", "The commuter lounge in Price Center is on the second floor. Come out to study and meet people!");
        description.put("Red*Shoe*Room", "Located next to Sun God Lounge, this room is open to study and have meetings. So come out here to study!");
        description.put("Geisel*Library", "Located in the center of the campus, this landmark library has 8 floors of quiet study rooms and books! Make sure to come check it out and study here!");
        description.put("Student*Center", "Located below Mandeville Center, the Student Center holds a library where you can purchase books for a low price!");
        description.put("Biomedical*Library", "Located next to the Biomedical Science building, this library has 2 floors of study areas and quiet rooms!");
        description.put("64*Degrees", "Located behind Argo Hall, this dining hall offers stir fry wok, burgers, deli, salads, and a bistro. Come check it out!");
        description.put("64*North", "Located behind 64 Degrees, 64 North is a fancy restaruant that offers fine delicacies such as steak, shrimp linguini, and etc.");
        description.put("Muir*Woods", "Located downstairs from Pines, Muir Woods offers expresso coffee, tea, and fresh pastries. Come check it out and have a bite!");
        description.put("Pines", "Located in front of Ledden Auditorium and in front of Tioga and Tenaya Hall, Pines offers sushi, pizza, an extensive salad bar, stir fry, and dessert! Come check it out!");
        description.put("Roots", "Located right under Pines, Roots offers a vegan menu which includes vegetarian salads, sides, and smoothies! Come check it out!");
        description.put("Goody's*Place", "Located across the Marshall residence halls and next to the tennis court, Goody's offers delicious burritos and bowls. Come check it out if you're craving something like Chipotle!");
        description.put("Cafe*Ventanas", "Located at the end of ERC, Cafe V offers a rotation of regional bowls such as tacos, ramen bowls, stir fry, and a salad bar! Come check it out! It's very delicious!");
        description.put("Bistro", "Located in ERC, specfically Village East, the Bistro offers offers sushi, fresh greens and vegetarian fare, noodle dishes, and top-grade cuts of beef and fish. The Bistro experience focuses on tasting a variety of flavors and sharing plates with friends!");
        description.put("Canyon*Vista", "Located in the heart of Warren, Canyon Vista offers pizza, pasta, calzones, stromboli, Asian cuisine, made-to-order sandwiches and a variety of hot grilled items! Come check it out!");
        description.put("Foodworx", "Located right next to the Sixth apartments, Foodworx is famous for their made-to-order pizza, fresh salads and sandwiches. Come check it out and have a bite!");
        description.put("Burger*King", "Located in the food court of Price Center, Burger King is open 6am to 12am on the weekends, and on weekdays it is open 24/7! Come have a bite!");
        description.put("Santorini", "Located in the food court of Price Center, Santorini offers dishes from the Mediterranean and Aegean regions of the world. Come have a bite of international cuisine!");
        description.put("Panda*Express", "Located in the food court of Price Center, Panda Express provides a variety of Chinese dishes. Come have a bite!");
        description.put("Lemon*Grass", "Located in the food court of Price Center, Lemon Grass offers fresh fruits and vegetables that are in the peak of their season! Come check it out!");
        description.put("Subway", "Located in the food court of Price Center, Subway offers customizable sandwiches.Come grab a sub! Eat Fresh!");
        description.put("Tapioca*Express", "Located in the food court of Price Center, Tapioca Express sells a ton of different flavors of boba as well as chicken and other snacks! Come stop by!");
        description.put("Jamba*Juice", "Located outside in the amphitheater of Price Center, Jamba Juice sells fresh fruit smoothies! Come grab a drink and live life juiced!");
        description.put("Round*Table*Pizza", "Located right next to Jamba Juice outside of Price Center, Round Table Pizza serves pizza, salads, sandwichesm beverages, and beer! Come stop by!");
        description.put("Starbucks", "Located next to Subway inside Price Center, Starbucks is a great place to grab some coffee and sit down to catch a breath! Come stop by!");
        description.put("Bombay*Coast", "Located inside of Price Center, Bombay Coast serves South American dishes, as well as other exotic dishes. Come check it out!");
        description.put("Shogun", "Located on the 2nd level outside of Price Center, Shogun serves sushi, tempura, and noodles! If you're craving some Asian taste in your food, be sure to check out Shogun!");
        description.put("Zanzibar", "Located in Price Center East, Zanzibar offers freshly made artisan sandwiches, pastas, salads, and more. Come grab a bite!");
        description.put("Rubio's", "Located in the food court of Price Center, Rubio's serves Mexican food and has a fresh salsa bar. Come check it out!");
        description.put("Club*Med", "Located inside UCSD's School of Medicine near the Biomedical Library, ClubMed serves pastries, fresh-made salads, deli sandwiches, pizza, soup, and tasty dessert. Come grab a bite!");
        description.put("Hi*Thai", "Located outside of the Student Center, Hi Thai serves fresh quality Asian cuisines, including noddles, soups, and salads. Be sure to come check it out!");
        description.put("Home*Plate", "Located at Rimac Annex, Home Plate serves delicious, healthy salads as well as the best burgers on campus and beer. Come grab a bite!");
        description.put("Croutons", "Located at the Student Services Center, Croutons serves fresh salds, panini sandwiches, and soups! Come check it out!");
        description.put("YogurtWorld", "Located next to the Student Services Center, YogurtWorld serves frozen yogurt and has a ton of different, unique flavors! Come check it out and cool yourself down!");
        description.put("Roger's*Market", "Located next to 64 degrees, Roger's serves as a market and convenience store! Come stop by!");
        description.put("Earl's*Market", "Located next to Canyon Vista Dining Hall, Earl's serves as a market and convenience store! Come stop by!");
        description.put("John's*Market", "Located below Tamarack apartment, John's serves as a market and a convenience store! Come stop by!");
        description.put("Sixth*College*Market", "Located next to the Matthew's Apartments, Sixth College Market has everything you need! Come stop by!");
        description.put("Sunshine*Market", "Located inside the food court of Price Center, Sunshine is a market and convenience store that has everything you're looking for! Come stop by!");
        description.put("Goody's*Market", "Located across from the Thurgood Marshall residence halls, Goody's is a market and convenience store that has everything you're looking for! Come stop by!");
        description.put("General*Store", "Located in the Student Center, the General Store sells very unique items as well as snacks! Come stop by!");
  //      System.out.println(description.get(Revelle*PingPong*Table));
        return description.get(name);
    }
}