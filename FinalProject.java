/**
 *  Description: This program requires user interaction with multiple windows which will help user become
 *  better aquainted with campus goodies. The user will initially be prompted a question based on an interest.
 *  User will input a keyword which will then narrow search into one of the following three categories: study,
 *  food, or athletics locations on campus. The user will then be asked whether they want a store or place which
 *  will further narrow search. Then a list of locations ranging from all 6 colleges, PC, and General will be 
 *  provided from which user will choose as well. Lastly, a list will be given based on all selections and user
 *  has one more input, a number which represents a place which will ultimately a picture and description of the 
 *  place and a more detailed location. Ex. 64 Degrees is next to Argo Hall.
 *
 *  @author: Yu Gu, Andrew Kwak, Karen Montoya
 *  @compile: javac FinalProject.java
 *  @run: java FinalProject
 *
 */
import javafx.application.Application;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.geometry.Insets;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import java.io.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import java.util.*;

/**
 *  This class is the set up of the whole program. All the windows (scenes) are declared here. Every 
 *  action of every button is written here as well.
 *
 */
public class FinalProject extends Application {
    final int NUM_LIST = 13;
    private Label instruction1, instruction2, KeyWord, Q2S, Q6Title, Q6Descripe;
    private Label[] ListQ4;
    private TextField KeyWordField, NumField;
    private Button run, start;
    private Button runQ2A, runQ2B, runClose, Q4Close, Q4run;
    public static int[] keyValue = new int[3];
    public String[] placeName;
    public String[][][] placeList = new String[3][2][7];
    Scene sceneQ1 = null; // Scene contains all content
    Scene sceneQ2 = null;
    Scene sceneQ4 = null;
    Scene sceneQ5 = null;
    Scene sceneQ6 = null;
    Scene sceneStart= null;
    GridPane gridPane1 = null; // Positions components within scene
    GridPane gridPane2 = null;
    GridPane gridPaneStart, gridPane4, gridPane5, gridPane6;
    Stage stageBegin, stageQ1, stageQ2, stageQ3, stageQ4, stageQ5, stageQ6;
    @Override
    public void start(Stage applicationStage) throws IOException {
        //setting for instruction
    	stageBegin = applicationStage;
    	gridPaneStart = new GridPane();
    	sceneStart = new Scene(gridPaneStart);
    	gridPaneStart.setPadding(new Insets(10, 10, 10, 10)); // Padding around  grid
        gridPaneStart.setHgap(10); // Spacing between columns
        gridPaneStart.setVgap(10); // Spacing between rows
     	start = new Button("Let's Start");
     	instruction1 = new Label("This program will ask you a series of questions which will help");
     	instruction2 = new Label("you find study food, or sport places on campus within seconds!");
        gridPaneStart.add(instruction1, 0, 0);
        gridPaneStart.add(instruction2, 0, 1);
        gridPaneStart.add(start, 0, 2);
        
    	//setting for stage1
        stageQ1 = new Stage();
        gridPane1 = new GridPane(); // Create an empty pane      
        sceneQ1 = new Scene(gridPane1); // Create scene containing the grid pane
        KeyWord = new Label("What do you want or want to do?? Ex:'banana','study*rooms','run'");
        KeyWordField = new TextField();
        KeyWordField.setPrefColumnCount(15);
        KeyWordField.setEditable(true);
        KeyWordField.setText("keyword");
        run = new Button("next");
        gridPane1.setPadding(new Insets(10, 10, 10, 10)); // Padding around  grid
        gridPane1.setHgap(10); // Spacing between columns
        gridPane1.setVgap(10); // Spacing between rows
        gridPane1.add(KeyWordField, 0, 1);
        gridPane1.add(KeyWord, 0, 0);
        gridPane1.add(run, 1, 0);
        stageQ1.setScene(sceneQ1);
        
        //setting for stage2
        stageQ2 = new Stage();
        gridPane2 = new GridPane();
        sceneQ2 = new Scene(gridPane2);
        gridPane2.setPadding(new Insets(10, 10, 10, 10)); // Padding around  grid
        gridPane2.setHgap(10); // Spacing between columns
        gridPane2.setVgap(10); // Spacing between rows
        Q2S = new Label();
        runQ2A = new Button();
        runQ2B = new Button();
        runClose = new Button("Back");
        gridPane2.add(Q2S, 0, 0);
        gridPane2.add(runQ2A, 0, 1);
        gridPane2.add(runQ2B, 1, 1);
        gridPane2.add(runClose, 1, 0);
        stageQ2.setScene(sceneQ2);
        stageQ2.initModality(Modality.APPLICATION_MODAL);

        //setting for stage3
        stageQ3 = new Stage();
        stageQ3.setTitle("Campus Goodies");
        Panel paneQ3 = new Panel();
        stageQ3.setScene(new Scene(paneQ3, 830, 650));
        stageQ3.setResizable(false);
        stageQ3.centerOnScreen();
        stageQ3.initModality(Modality.APPLICATION_MODAL);

        //setting for stage 4
        stageQ4 = new Stage();
        gridPane4 = new GridPane();
        sceneQ4 = new Scene(gridPane4);
        gridPane4.setPadding(new Insets(10, 10, 10, 10)); // Padding around  grid
        gridPane4.setHgap(10); // Spacing between columns
        gridPane4.setVgap(10); // Spacing between rows
        stageQ4.setScene(sceneQ4);
        Q4Close = new Button("Back");
        Q4run = new Button("Run");
        NumField = new TextField();
        NumField.setPrefColumnCount(15);
        NumField.setEditable(true);
        NumField.setText("");
        ListQ4 = new Label[NUM_LIST];
        Label Q4Info = new Label("Enter the number from the list to see details");
        int i = 0;
        for (i = 0; i < NUM_LIST; i++) {
            ListQ4[i] = new Label();
        }
        gridPane4.addColumn(0, ListQ4);
        gridPane4.add(Q4Info, 0, i);
        gridPane4.add(Q4Close, 2, i + 1);
        gridPane4.add(Q4run, 1, i + 1);
        gridPane4.add(NumField, 0, i + 1);


        //setting for stage 5
        stageQ5 = new Stage();
        gridPane5 = new GridPane();
        sceneQ5 = new Scene(gridPane5);
        gridPane5.setPadding(new Insets(10, 10, 10, 10)); // Padding around  grid
        gridPane5.setHgap(10); // Spacing between columns
        gridPane5.setVgap(10); // Spacing between rows
        stageQ5.setScene(sceneQ5);
        Image Q5img = new Image(getClass().getResourceAsStream("initial.png"));

        ImageView Q5imgShow = new ImageView(Q5img);
        gridPane5.add(Q5imgShow, 0, 2);

        stageQ6 = new Stage();
        //stageQ6.initStyle(StageStyle.UNDECORATED);
        gridPane6 = new GridPane();
        sceneQ6 = new Scene(gridPane6);
        gridPane6.setPadding(new Insets(10, 10, 10, 10)); // Padding around  grid
        gridPane6.setHgap(10); // Spacing between columns
        gridPane6.setVgap(10); // Spacing between rows
        stageQ6.setScene(sceneQ6);
        Q6Title = new Label();
        Q6Descripe = new Label();

        gridPane6.add(Q6Title, 0, 0);
        gridPane6.add(Q6Descripe, 0, 1);

        //The following paneQ3 is in charge of printing out places of a certain category
        //for a certain location. For example, if user chooses food in revelle, 64 north
        //is one of the few listed.

        paneQ3.revelleButton.setOnAction(new EventHandler < ActionEvent > () {
            /* Method is automatically called when an event 
            occurs (e.g, button is pressed) */
            @Override
            public void handle(ActionEvent event) {
                keyValue[2] = 0;
                String place = placeList(keyValue[0], keyValue[1], keyValue[2]);
                if (place.equals("Not*Found")) {
                    stageQ5.show();
                } else {
                    String[] placeLabel = place.split(" ");
                    int i = 0;
                    for (i = 0; i < placeLabel.length; i++) {
                        ListQ4[i].setText((i + 1) + ". " + placeLabel[i].replace("*", " "));
                    }
                    for (i = placeLabel.length; i < NUM_LIST; i++) {
                        ListQ4[i].setText("");
                    }
                    stageQ4.show();
                }
            }
        });
        paneQ3.muirButton.setOnAction(new EventHandler < ActionEvent > () {
            /* Method is automatically called when an event 
            occurs (e.g, button is pressed) */
            @Override
            public void handle(ActionEvent event) {
                keyValue[2] = 1;
                String place = placeList(keyValue[0], keyValue[1], keyValue[2]);
                if (place.equals("Not*Found")) {
                    stageQ5.show();
                } else {
                    String[] placeLabel = place.split(" ");
                    int i = 0;
                    for (i = 0; i < placeLabel.length; i++) {
                        ListQ4[i].setText((i + 1) + ". " + placeLabel[i].replace("*", " "));
                    }
                    for (i = placeLabel.length; i < NUM_LIST; i++) {
                        ListQ4[i].setText("");
                    }
                    stageQ4.show();
                }
            }
        });
        paneQ3.marshallButton.setOnAction(new EventHandler < ActionEvent > () {
            /* Method is automatically called when an event 
            occurs (e.g, button is pressed) */
            @Override
            public void handle(ActionEvent event) {
                keyValue[2] = 2;
                String place = placeList(keyValue[0], keyValue[1], keyValue[2]);
                if (place.equals("Not*Found")) {

                    stageQ5.show();
                } else {
                    String[] placeLabel = place.split(" ");
                    int i = 0;
                    for (i = 0; i < placeLabel.length; i++) {
                        ListQ4[i].setText((i + 1) + ". " + placeLabel[i].replace("*", " "));
                    }
                    for (i = placeLabel.length; i < NUM_LIST; i++) {
                        ListQ4[i].setText("");
                    }
                    stageQ4.show();
                }
            }
        });
        paneQ3.rooseveltButton.setOnAction(new EventHandler < ActionEvent > () {
            /* Method is automatically called when an event 
            occurs (e.g, button is pressed) */
            @Override
            public void handle(ActionEvent event) {
                keyValue[2] = 3;
                String place = placeList(keyValue[0], keyValue[1], keyValue[2]);
                if (place.equals("Not*Found")) {
                    stageQ5.show();
                } else {
                    String[] placeLabel = place.split(" ");
                    int i = 0;
                    for (i = 0; i < placeLabel.length; i++) {
                        ListQ4[i].setText((i + 1) + ". " + placeLabel[i].replace("*", " "));
                    }
                    for (i = placeLabel.length; i < NUM_LIST; i++) {
                        ListQ4[i].setText("");
                    }
                    stageQ4.show();
                }
            }
        });
        paneQ3.warrenButton.setOnAction(new EventHandler < ActionEvent > () {
            /* Method is automatically called when an event 
            occurs (e.g, button is pressed) */
            @Override
            public void handle(ActionEvent event) {
                keyValue[2] = 4;
                String place = placeList(keyValue[0], keyValue[1], keyValue[2]);
                if (place.equals("Not*Found")) {
                    stageQ5.show();
                } else {
                    if (place.equals("Not*Found")) {
                        stageQ5.show();
                    } else {
                        String[] placeLabel = place.split(" ");
                        int i = 0;
                        for (i = 0; i < placeLabel.length; i++) {
                            ListQ4[i].setText((i + 1) + ". " + placeLabel[i].replace("*", " "));
                        }
                        for (i = placeLabel.length; i < NUM_LIST; i++) {
                            ListQ4[i].setText("");
                        }

                        stageQ4.show();
                    }
                }
            }
        });
        paneQ3.sixthButton.setOnAction(new EventHandler < ActionEvent > () {
            /* Method is automatically called when an event 
            occurs (e.g, button is pressed) */
            @Override
            public void handle(ActionEvent event) {
                keyValue[2] = 5;
                String place = placeList(keyValue[0], keyValue[1], keyValue[2]);
                if (place.equals("Not*Found")) {
                    stageQ5.show();
                } else {
                    String[] placeLabel = place.split(" ");
                    int i = 0;
                    for (i = 0; i < placeLabel.length; i++) {
                        ListQ4[i].setText((i + 1) + ". " + placeLabel[i].replace("*", " "));
                    }
                    for (i = placeLabel.length; i < NUM_LIST; i++) {
                        ListQ4[i].setText("");
                    }
                    stageQ4.show();
                }
            }
        });
        paneQ3.priceButton.setOnAction(new EventHandler < ActionEvent > () {
            /* Method is automatically called when an event 
            occurs (e.g, button is pressed) */
            @Override
            public void handle(ActionEvent event) {
                keyValue[2] = 6;
                String place = placeList(keyValue[0], keyValue[1], keyValue[2]);
                if (place.equals("Not*Found")) {
                    stageQ5.show();
                } else {
                    String[] placeLabel = place.split(" ");
                    int i = 0;
                    for (i = 0; i < placeLabel.length; i++) {
                        ListQ4[i].setText((i + 1) + ". " + placeLabel[i].replace("*", " "));
                    }
                    for (i = placeLabel.length; i < NUM_LIST; i++) {
                        ListQ4[i].setText("");
                    }
                    stageQ4.show();
                }
            }
        });
        paneQ3.generalButton.setOnAction(new EventHandler < ActionEvent > () {
            /* Method is automatically called when an event 
            occurs (e.g, button is pressed) */
            @Override
            public void handle(ActionEvent event) {
                keyValue[2] = 7;
                String place = placeList(keyValue[0], keyValue[1], keyValue[2]);
                if (place.equals("Not*Found")) {
                    stageQ5.show();
                } else {
                    String[] placeLabel = place.split(" ");
                    int i = 0;
                    for (i = 0; i < placeLabel.length; i++) {
                        ListQ4[i].setText((i + 1) + ". " + placeLabel[i].replace("*", " "));
                    }
                    for (i = placeLabel.length; i < NUM_LIST; i++) {
                        ListQ4[i].setText("");
                    }
                    stageQ4.show();
                }
            }
        });


        // Set an event handler to handle button presses
        //A list of buttons pops out based on the users initial choice on keyword
        //for example if user chose food, case 2 information is presented
        run.setOnAction(new EventHandler < ActionEvent > () {
            /* Method is automatically called when an event 
               occurs (e.g, button is pressed) */
            @Override
            public void handle(ActionEvent event) {
                String userInput = "";
                userInput = KeyWordField.getText();
                int valueCategory = 0;
                valueCategory = getKeyValue(userInput);
                keyValue[0] = valueCategory;
                int flag = 0;
                switch (valueCategory) {
                    case 0: //fitness
                        Q2S.setText("Looking for a place to play or buy equipment?");
                        runQ2A.setText("location");
                        runQ2B.setText("store");
                        KeyWord.setText("What do you want? Exp:'food','study*rooms'");
                        break;
                    case 1: //study
                        Q2S.setText("Do you want to find a place to study or buy school materials");
                        runQ2A.setText("location");
                        runQ2B.setText("store");
                        KeyWord.setText("What do you want? Exp:'food','study*rooms'");
                        break;
                    case 2: //food
                        Q2S.setText("find a place to eat or buy produce");
                        runQ2A.setText("restaurant");
                        runQ2B.setText("market");
                        KeyWord.setText("What do you want? Exp:'food','study*rooms'");
                        break;
                    default:
                        flag = 1;
                        KeyWord.setText("Don't try to fool me again!");
                        Alert alert1 = new Alert(AlertType.ERROR, "Okay Please type in Keyword I can understand!");
                        alert1.showAndWait();
                        KeyWordField.setText(""); //delete wrong enter
                        return;
                        // break;
                }
                if (flag == 0) {
                    stageQ2.showAndWait();
                }
                return;
            }
        });

        runClose.setOnAction(new EventHandler < ActionEvent > () {
            /* Method is automatically called when an event 
               occurs (e.g, button is pressed) */
            @Override
            public void handle(ActionEvent event) {
                stageQ2.close();
            }
        });
        Q4Close.setOnAction(new EventHandler < ActionEvent > () {
            /* Method is automatically called when an event 
               occurs (e.g, button is pressed) */
            @Override
            public void handle(ActionEvent event) {

                stageQ4.close();

            }
        });

        //This button is in charge of grabbing number which in result will show
        //imade and description of place
        Q4run.setOnAction(new EventHandler < ActionEvent > () {
            /* Method is automatically called when an event 
               occurs (e.g, button is pressed) */
            @Override
            public void handle(ActionEvent event) {
                String place = placeList(keyValue[0], keyValue[1], keyValue[2]);
                String[] placeLabel = place.split(" ");
                if (!NumField.getText().matches("-?\\d+(\\.\\d+)?")) {
                    Alert alertin1 = new Alert(AlertType.ERROR, "Enter Number");
                    alertin1.showAndWait();
                    return;
                }
                int no = Integer.parseInt(NumField.getText());
                if (no > placeLabel.length) {
                    Alert alertin1 = new Alert(AlertType.ERROR, "Enter correct Number");
                    alertin1.showAndWait();
                    return;
                }
                Q6Title.setText(placeLabel[no - 1].replace("*", " "));
                PlaceInfo name = new PlaceInfo();
                Q6Descripe.setText(name.getInfo(placeLabel[no - 1]));
                if (!placeLabel[no - 1].equals("Not*Found")) {
                    StringBuilder ss = new StringBuilder(placeLabel[no - 1]);
                    ss.append(".png");
                    Image Q6img = new Image(getClass().getResourceAsStream(ss.toString()));
                    ImageView Q6imgShow = new ImageView(Q6img);
                    gridPane6.add(Q6imgShow, 0, 2);

                }
                stageQ6.show();
                NumField.setText("");
            }
        });
        runQ2A.setOnAction(new EventHandler < ActionEvent > () {
            /* Method is automatically called when an event 
            occurs (e.g, button is pressed) */
            @Override
            public void handle(ActionEvent event) {
                stageQ3.show();
                keyValue[1] = 0;
            }
        });

        runQ2B.setOnAction(new EventHandler < ActionEvent > () {
            /* Method is automatically called when an event 
            occurs (e.g, button is pressed) */
            @Override
            public void handle(ActionEvent event) {
                stageQ3.show();
                keyValue[1] = 1;
            }
        });
        start.setOnAction(new EventHandler < ActionEvent > () {
            /* Method is automatically called when an event 
            occurs (e.g, button is pressed) */
            @Override
            public void handle(ActionEvent event) {
                stageQ1.show();
                applicationStage.close();
            }
        });
        applicationStage.setScene(sceneStart); // Set window's scene  
        applicationStage.setTitle("Recommendation System Ver1.0"); // Set window's title
        applicationStage.show(); // Display window

        return;
    }

    /**
     *  This method is in charge
     *
     *  @param String keyword it gets user input and checks it against list, if found goes into a 
            certain category, ex. meat goes into food
     *  @return a value is returned to indicate if keyword is present
     */
    public static int getKeyValue(String keyword) {



        String[][] category = {
            {
                "baseball",
                "basketball",
                "football",
                "sport",
                "sports",
                "football",
                "soccer",
                "tennis",
                "rugby",
                "running",
                "run",
                "throwing",
                "throw",
                "swimming",
                "swim",
                "track",
                "field",
                "shooting",
                "shoot",
                "archery",
                "gym",
                "lifting",
                "lift",
                "treadmill",
                "dance",
                "dancing",
                "gymnastics",
                "weights",
                "weight",
                "frisbee",
                "ultimate*frisbee",
                "skating",
                "skate",
                "ping*pong",
                "pingpong",


            },
            {
                "study",
                "book",
                "books",
                "learn",
                "library",
                "notes",
                "homework",
                "assignment",
                "quiet",
                "nerd*box",
                "read",
                "reading",
                "dictionary",
                "textbooks",
                "reserves",
                "study*rooms",
                "book*reserves",
                "dr*seuss",
                "puzzles",
                "research"
            },
            {
                "food",
                "vege",
                "vegetable",
                "meat",
                "vegan",
                "sushi",
                "tacos",
                "burrito",
                "burritos",
                "freshmen*15",
                "goodies",
                "snacks",
                "snack",
                "junk",
                "junk*food",
                "fast*food",
                "burgers",
                "chicken",
                "cookies",
                "dessert",
                "water",
                "drinks",
                "coffee",
                "tea",
                "crispy*chicken",
                "slushy",
                "boba",
                "greek",
                "indian",
                "tapex",
                "banana",
                "watermelon",
                "apple",
                "orange",
                "lemon",
                "grape"
            }
        };
        int i = 0;
        int j = 0;
        int flag = -1;
        // find keyword and return the value
        for (i = 0; i < category.length; i++) {
            for (j = 0; j < category[i].length; j++) {

                if (category[i][j].equals(keyword)) {
                    flag = i;
                    break;
                }
            }
        }
        if (flag == -1) {
            return -1;
        }

        return flag;
    }

    public String placeList(int i, int j, int m) {

        String[][][] everything = new String[][][] {

            {
                {
                    "Revelle*Basketball*Courts Revelle*PingPong*Table Revelle*Plaza*Skating",
                    "Muir*Basketball*Courts Muir*Natatorium Main*Gym Muir*Volleyball*Courts Muir*Athletics*Field",
                    "Marshall*Athletics*Field Marshall*Volleyball*Courts Marshall*Basketball*Court",
                    "RIMAC*Gym/Arena RIMAC*Field",
                    "Canyonview*Pools Warren*Volleyball*Courts Warren*Field",
                    "Sixth*Tennis*Court Sixth*Basketball*Court",
                    "GameRoom",
                    "Track*Field Archery*Range Baseball*Field"
                }, {
                    "Not*Found",
                    "Not*Found",
                    "Not*Found",
                    "Not*Found",
                    "Not*Found",
                    "Not*Found",
                    "BookStore",
                    "Outback*Adventures Campus*Bike*And*Skate"
                } //sports store
            }, //sports


            {
                {
                    "Blake*Hall*Commuter*Lounge Argo*Lounge Fleet*Lounges Galbraith*Hall Keeling*Lounge",
                    "Muir*Residence*Hall*Lounges Middle*of*Muir*Lounge",
                    "Marshall*Residence*Hall*Lounges OceanView*Lounge Fireside*Lounge",
                    "ERC*Residence*Hall*Lounges Great*Hall",
                    "Courtroom Warren*Residence*Hall*Lounges Yosemite*Room",
                    "Sixth*College*Lodge",
                    "Sixth*Commuter*Lounge Dogg*House ",
                    "Price*Center*East/West*Lounge PriceCenter*Commuter*Lounge Red*Shoe*Room ",
                    "Geisel*Library Biomedical*Library "
                },


                {
                    "Not*Found",
                    "Not*Found",
                    "Not*Found",
                    "Not*Found",
                    "Not*Found",
                    "Not*Found",
                    "Not*Found",
                    "BookStore",
                    "Student*Center"
                }
            }, //study
            {
                {
                    "64*Degrees 64*North",
                    "Muir*Woods Pines Roots",
                    "Goody's*Place",
                    "Cafe*Ventanas Bistro",
                    "Canyon*Vista",
                    "Foodworx",
                    "Burger*King Santorini Panda*Express Lemon*Grass Subway Tapioca*Express Jamba*Juice Round*Table*Pizza Starbucks Shogun Zanzibar Rubio's Bombay*Coast",
                    "Hi*Thai Club*Med Home*Plate Croutons YogurtWorld"
                },

                {
                    "Roger's*Market",
                    "John's*Market",
                    "Goody's*Market",
                    "Not*Found",
                    "Earl's*Market",
                    "Sixth*College*Market",
                    "Sunshine*Market",
                    "General*Store"
                }
            } //food
        };
        return everything[i][j][m];
    }

    /**
     *  The main method is in charge of launching the program, in other words it runs the whole program with the
     *  single command of launch(args).
     *
     *  @return void nothing is returned
     */

    public static void main(String[] args) {
        launch(args); // Launch application
        return;
    }
}