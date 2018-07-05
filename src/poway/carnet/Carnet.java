package poway.carnet;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Carnet extends Application
{

	private TableView<Personne> table = new TableView<>();

	@SuppressWarnings("unchecked")
	@Override

	public void start(Stage primaryStage) throws Exception
	{
		BorderPane cp = new BorderPane();

		Scene scene = new Scene(cp, 500, 500);
		primaryStage.setTitle("Carnet d'Adresse");

		table.setEditable(true);
		TableColumn<Personne, String> lastNameCol = new TableColumn<>("Last Name");
		TableColumn<Personne, String> firstNameCol = new TableColumn<>("First Name");
		TableColumn<Personne, String> numCol = new TableColumn<>("Number");
		TableColumn<Personne, String> mailCol = new TableColumn<>("Email");
		lastNameCol.setCellValueFactory(p -> p.getValue().getNom());

		firstNameCol.setCellValueFactory(p -> p.getValue().getPrenom());
		numCol.setCellValueFactory(p -> p.getValue().getNumero());
		mailCol.setCellValueFactory(p -> p.getValue().getEmail());

		lastNameCol.setMinWidth(125);
		firstNameCol.setMinWidth(125);
		numCol.setMinWidth(125);
		mailCol.setMinWidth(125);
		table.getColumns().addAll(firstNameCol, lastNameCol, numCol, mailCol);

		table.setItems(File.read());
		cp.setBottom(getHpane());
		cp.setCenter(table);
		primaryStage.setScene(scene);
		primaryStage.show();

	}

	public HBox getHpane()
	{
		HBox b = new HBox();
		b.setPadding(new Insets(5, 5, 5, 5));
		b.setSpacing(5);
		b.setAlignment(Pos.BOTTOM_RIGHT);
		Button btAdd = new Button("Ajouter");
		btAdd.setOnMouseClicked(this::ajouter);
		b.getChildren().add(btAdd);
		return b;
	}

	public void ajouter(MouseEvent e)
	{
		Stage stage = new Stage();
		BorderPane bp = new BorderPane();
		VBox vb = new VBox();
		vb.setSpacing(10);
		Scene scene = new Scene(bp, 300, 300);
		Label lblLName = new Label("Last Name :");
		TextField lName = new TextField();
		Label lblFName = new Label("First Name :");
		TextField fName = new TextField();
		Label lblNum = new Label("Number :");
		TextField num = new TextField();
		Label lblMail = new Label("Mail :");
		TextField mail = new TextField();
		vb.getChildren().addAll(lblFName, fName, lblLName, lName, lblNum, num, lblMail, mail);
		bp.setCenter(vb);

		HBox hb = new HBox();
		Button confirm = new Button("Add");
		hb.getChildren().add(confirm);
		hb.setAlignment(Pos.CENTER);
		bp.setBottom(hb);

		stage.setScene(scene);
		stage.show();

	}

	public static void main(String[] args)
	{

		Application.launch(Carnet.class, args);
	}
}
