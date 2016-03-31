import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;


public class Panel extends Pane
{
	Image revelleImage = new Image(getClass().getResourceAsStream("Revelle.png"));
    Image muirImage = new Image(getClass().getResourceAsStream("Muir.png"));
    Image marshallImage = new Image(getClass().getResourceAsStream("Marshall.png"));
    Image rooseveltImage = new Image(getClass().getResourceAsStream("Roosevelt.png"));
    Image warrenImage = new Image(getClass().getResourceAsStream("Warren.png"));
    Image sixthImage = new Image(getClass().getResourceAsStream("Sixth.png"));
    Image priceImage = new Image(getClass().getResourceAsStream("PC.png"));
    Image generalImage = new Image(getClass().getResourceAsStream("Geisel.png"));
    
    private Label revelle = new Label();
    private Label muir = new Label();
    private Label marshall = new Label();
    private Label roosevelt = new Label();
    private Label warren = new Label();
    private Label sixth = new Label();
    private Label price = new Label();
    private Label general = new Label();
    private int keyValue = 0;
    
    Button revelleButton;
    Button muirButton;
    Button marshallButton;
    Button rooseveltButton;
    Button warrenButton;
    Button sixthButton;
    Button priceButton;
    Button generalButton;
    public int getValue() {
    	return this.keyValue;
    }
    
    /**
     *  This constructor is in charged of presenting the user with a window that has all possible locations
     *  available to them on campus. A GUI is utilized with buttons, so the user can select a location
     *  and images are presented to make it more user friendly.
     *
     */
    
    public Panel()
    {
        revelle.relocate(0, 50);
        revelle.setGraphic(new ImageView(revelleImage));
        this.getChildren().add(revelle);
        
        revelleButton = new Button ("Revelle");
        revelleButton.setMinSize(200,50);
        revelleButton.relocate(0, 250);
        this.getChildren().add(revelleButton);
        
        muir.relocate(210, 50);
        muir.setGraphic(new ImageView(muirImage));
        this.getChildren().add(muir);
        
        muirButton = new Button ("Muir");
        muirButton.setMinSize(200,50);
        muirButton.relocate(210, 250);
        this.getChildren().add(muirButton);
        
        marshall.relocate(420, 50);
        marshall.setGraphic(new ImageView(marshallImage));
        this.getChildren().add(marshall);
        
        marshallButton = new Button ("Marshall");
        marshallButton.setMinSize(200,50);
        marshallButton.relocate(420, 250);
        this.getChildren().add(marshallButton);
        
        
        roosevelt.relocate(0, 350);
        roosevelt.setGraphic(new ImageView(rooseveltImage));
        this.getChildren().add(roosevelt);
        
        rooseveltButton = new Button ("Roosevelt");
        rooseveltButton.setMinSize(200,50);
        rooseveltButton.relocate(0, 550);
        this.getChildren().add(rooseveltButton);
        
        warren.relocate(210, 350);
        warren.setGraphic(new ImageView(warrenImage));
        this.getChildren().add(warren);
        
        warrenButton = new Button ("Warren");
        warrenButton.setMinSize(200,50);
        warrenButton.relocate(210, 550);
        this.getChildren().add(warrenButton);
        
        sixth.relocate(420, 350);
        sixth.setGraphic(new ImageView(sixthImage));
        this.getChildren().add(sixth);
        
        sixthButton = new Button ("Sixth");
        sixthButton.setMinSize(200,50);
        sixthButton.relocate(420, 550);
        this.getChildren().add(sixthButton);
        
        price.relocate(630, 50);
        price.setGraphic(new ImageView(priceImage));
        this.getChildren().add(price);
        
        priceButton = new Button ("PriceCenter");
        priceButton.setMinSize(250,50);
        priceButton.relocate(630, 250);
        this.getChildren().add(priceButton);
        
        general.relocate(630, 350);
        general.setGraphic(new ImageView(generalImage));
        this.getChildren().add(general);
        
        generalButton = new Button ("General");
        generalButton.setMinSize(200,50);
        generalButton.relocate(630, 550);
        this.getChildren().add(generalButton);       
    }
}