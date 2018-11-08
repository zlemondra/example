import javafx.scene.Scene;
import javafx.scene.layout.Vbox
import javafx.layout.Pane;
import javafx.image.ImageView;
import javafx.image.Image;
import javafx.stage.Stage;
import javafx.geometry.Insets;
import javafx.application.Application;

public class showCard extends Application{
	public void start(Stage pStage){
		String card1 = (int)(Math.random()*53)+1 + "png";
		String card2 = (int)(Math.random()*53)+1+ "png";
		String card3 = (int)(Math.random()*53)+1+ "png";
	}
		Pane pane = new Pane;
		pane.setPadding(newInserts(5,5,5,5));
		 // card 1 
		Image image = new Image(card1);
		pane.getChildren().add(new ImageView(image));
		ImageView imageView2 = new ImpageView(image);
		imageView2.setFitHeight(100);
		imageView2.setFitWidth(100);
		pane.getChildern.add(imageView2);
		ImageView imageView3 = new ImageView(image);
		imageView3.rotate(90);
		pane.getChildren().add(imageView3);
		Scene scene = new Scene(pane);
		pStage.setTitle("Show Cards");
		pStage.setScene(Scene);
		pStage.show(); 
