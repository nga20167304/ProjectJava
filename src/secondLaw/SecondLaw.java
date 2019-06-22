package secondLaw;

import java.io.InputStream;
import java.util.Optional;

import algoPackage.FAV;
import javafx.animation.PathTransition;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextInputDialog;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.HLineTo;
import javafx.scene.shape.Line;
import javafx.scene.shape.MoveTo;
import javafx.scene.shape.Path;
import javafx.stage.Stage;
import javafx.util.Duration;
import project.Display;
import project.Node2;
import secondLaw.Arrow;


public class SecondLaw extends Application{
	private static final Image IMAGE = new Image("/application/NewtonsLaws.jpg");
	private FAV car1,car2,car3,car4;
	private Arrow arrow1,arrow2;//mũi tên lực 1,2
	private int arr1Width = 0,arr2Width = 0;//xét độ rộng cho mũi tên 1,2
	private int pathCar1 = 0,pathCar2 = 0;//xét thời gian chạy của xe1,xe2
	private PathTransition pathT1,pathT2;
	private String TH1 = "TH1:Xét 2 vật có cùng khối lượng m = 100(kg),v0=0,t=20(s)";
	private String TH2 = "TH2:Xét 2 vật có khối lượng là m1=100(kg) và m2=200(kg),v0=0,t=20(s)";
	private String strCar1 = "a1 = F1/m; v1 = v0+a1*t";
	private String strCar2 = "a2 = F2/m; v2 = v0+a2*t";
	public void secondLaw(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		
		car3 = new FAV(100);//khối lượng xe 3 
		car4 = new FAV(200);//khối lượng xe 4
		
		Label lbTH1 = new Label(TH1);
		lbTH1.setWrapText(true);
		lbTH1.setStyle("-fx-font-family: \"Comic Sans MS\"; -fx-font-size: 25; -fx-text-fill: darkred;");
		AnchorPane.setLeftAnchor(lbTH1, 80.0);
		
		Label lbTH2 = new Label(TH2);
		lbTH2.setWrapText(true);
		lbTH2.setStyle("-fx-font-family: \"Comic Sans MS\"; -fx-font-size: 25; -fx-text-fill: darkred;");
		AnchorPane.setTopAnchor(lbTH2, 250.0);
		AnchorPane.setLeftAnchor(lbTH2, 100.0);
		
		Label lbCar1 = new Label(strCar1);
		lbCar1.setWrapText(true);
		lbCar1.setStyle("-fx-font-family: \"Comic Sans MS\"; -fx-font-size: 20; -fx-text-fill: darkred;");
		AnchorPane.setTopAnchor(lbCar1, 60.0);
		AnchorPane.setLeftAnchor(lbCar1, 600.0);
		
		Label lbCar2 = new Label(strCar2);
		lbCar2.setWrapText(true);
		lbCar2.setStyle("-fx-font-family: \"Comic Sans MS\"; -fx-font-size: 20; -fx-text-fill: darkred;");
		AnchorPane.setTopAnchor(lbCar2, 160.0);
		AnchorPane.setLeftAnchor(lbCar2, 600.0);
		
		AnchorPane root=new AnchorPane();
		
		Line line1=new Line(100,100,1400,100);
		line1.setStroke(Color.DARKGRAY);
		line1.setStrokeWidth(15);
		
		Line line2=new Line(100,200,1400,200);
		line2.setStroke(Color.DARKGRAY);
		line2.setStrokeWidth(15);
		
		
		String url="/secondLaw/car.png";
		Class<?> clazz=this.getClass();
		InputStream input1=clazz.getResourceAsStream(url);
		Image image1=new Image(input1);
		ImageView imageView1=new ImageView(image1);
		imageView1.setFitHeight(100);
		imageView1.setFitWidth(200);
		imageView1.setTranslateX(70);
		imageView1.setTranslateY(20);
		
		InputStream input2=getClass().getResourceAsStream("/secondLaw/car.png");
		Image image2=new Image(input2);
		ImageView imageView2=new ImageView(image2);
		imageView2.setFitHeight(100);
		imageView2.setFitWidth(200);
		imageView2.setTranslateX(70);
		imageView2.setTranslateY(120);

		//xét mũi tên lực
		arrow1 = new Arrow(0,80,50,80);
		arrow2 = new Arrow(0,180,50,180);
				
		//xét button cho 2 mũi tên và 2 xe trên 
		Button button1=new Button("Start1");
		button1.setPrefHeight(70);
		button1.setPrefWidth(120);		
		AnchorPane.setTopAnchor(button1, 600.0);
		AnchorPane.setLeftAnchor(button1, 300.0);
		button1.setStyle("-fx-font:18 arial");
		
		HLineTo line_1=new HLineTo();
		line_1.setX(1300);

		MoveTo move1=new MoveTo();
		move1.setX(170);
		move1.setY(70);
		
		Path path1=new Path();
		path1.getElements().add(move1);
		path1.getElements().add(line_1);
				
		
		pathT1=new PathTransition();
		pathT1.setPath(path1);
		pathT1.setNode(imageView1);
		pathT1.setOrientation(PathTransition.OrientationType.ORTHOGONAL_TO_TANGENT);
		
		
		HLineTo line_2=new HLineTo();
		line_2.setX(1300);

		MoveTo move2=new MoveTo();
		move2.setX(170);
		move2.setY(170);
		
		Path path2=new Path();
		path2.getElements().add(move2);
		path2.getElements().add(line_2);
				
		
		pathT2=new PathTransition();
		pathT2.setPath(path2);
		pathT2.setNode(imageView2);
		pathT2.setOrientation(PathTransition.OrientationType.ORTHOGONAL_TO_TANGENT);
		
		HLineTo line_1_1=new HLineTo();
		line_1_1.setX(70);

		MoveTo move1_1=new MoveTo();
		move1_1.setX(0);
		move1_1.setY(80);
		
		Path path1_1=new Path();
		path1_1.getElements().add(move1_1);
		path1_1.getElements().add(line_1_1);
				
		
		PathTransition pathT1_1=new PathTransition();
		pathT1_1.setDuration(Duration.millis(2000));
		pathT1_1.setPath(path1_1);
		pathT1_1.setNode(arrow1);
		pathT1_1.setOrientation(PathTransition.OrientationType.ORTHOGONAL_TO_TANGENT);
		
		
		HLineTo line_2_1=new HLineTo();
		line_2_1.setX(70);

		MoveTo move2_1=new MoveTo();
		move2_1.setX(0);
		move2_1.setY(180);
		
		Path path2_1=new Path();
		path2_1.getElements().add(move2_1);
		path2_1.getElements().add(line_2_1);
				
		
		PathTransition pathT2_1=new PathTransition();
		pathT2_1.setDuration(Duration.millis(2000));
		pathT2_1.setPath(path2_1);
		pathT2_1.setNode(arrow2);
		pathT2_1.setOrientation(PathTransition.OrientationType.ORTHOGONAL_TO_TANGENT);
		
		
		button1.setOnAction(new EventHandler<ActionEvent>() {			
			@Override
			public void handle(ActionEvent event) {
				// TODO Auto-generated method stub
				TextInputDialog dialog = new TextInputDialog();
				 
		        dialog.setTitle("Newton's law");
		        dialog.setHeaderText("Enter force of car 1:");
		        dialog.setContentText("F1:");
		 
		        Optional<String> result = dialog.showAndWait();
		        float f1 = Float.parseFloat(result.get());//lực tác dụng vật 1
		        car1 = new FAV(f1,100);//khởi tạo giá trị cho vật là 100kg
		        float a1 = car1.getAcce();//tính gia tốc của vật 1
		        car1.setA(a1);
		        float v1 = car1.getVelocity(0, 20);//v0 = 0,t=20s
		        car1.setV(v1);
		        result.ifPresent(F1->{
		        	showForceDialog();
		        });
		        	 
		        setArrow();
				pathT1_1.play();
				pathT2_1.play();
				runCar();
				pathT1.play();	
				pathT2.play();
			}
			
		});		
		
		Line line3=new Line(100,400,1400,400);
		line3.setStroke(Color.DARKGRAY);
		line3.setStrokeWidth(15);
		
		Line line4=new Line(100,500,1400,500);
		line4.setStroke(Color.DARKGRAY);
		line4.setStrokeWidth(15);
		
		
		InputStream input3=getClass().getResourceAsStream("/secondLaw/car.png");
		Image image3=new Image(input3);
		ImageView imageView3=new ImageView(image3);
		imageView3.setFitHeight(100);
		imageView3.setFitWidth(200);
		imageView3.setTranslateX(70);
		imageView3.setTranslateY(320);
		
		InputStream input4=getClass().getResourceAsStream("/secondLaw/car2.png");
		Image image4=new Image(input4);
		ImageView imageView4=new ImageView(image4);
		imageView4.setFitHeight(80);
		imageView4.setFitWidth(160);
		imageView4.setTranslateX(90);
		imageView4.setTranslateY(420);
	
		HLineTo line_3=new HLineTo();
		line_3.setX(1300);

		MoveTo move3=new MoveTo();
		move3.setX(170);
		move3.setY(370);
		
		Path path3=new Path();
		path3.getElements().add(move3);
		path3.getElements().add(line_3);
				
		
		PathTransition pathT3=new PathTransition();
		pathT3.setDuration(Duration.millis(4000));
		pathT3.setPath(path3);
		pathT3.setNode(imageView3);
		pathT3.setOrientation(PathTransition.OrientationType.ORTHOGONAL_TO_TANGENT);
		
		HLineTo line_4=new HLineTo();
		line_4.setX(1300);

		MoveTo move4=new MoveTo();
		move4.setX(170);
		move4.setY(460);
		
		Path path4=new Path();
		path4.getElements().add(move4);
		path4.getElements().add(line_4);
				
		
		PathTransition pathT4=new PathTransition();
		pathT4.setDuration(Duration.millis(5000));
		pathT4.setPath(path4);
		pathT4.setNode(imageView4);
		pathT4.setOrientation(PathTransition.OrientationType.ORTHOGONAL_TO_TANGENT);
		
		
		
		Button button2=new Button("Start2");
		button2.setPrefHeight(70);
		button2.setPrefWidth(120);		
		AnchorPane.setTopAnchor(button2, 600.0);
		AnchorPane.setLeftAnchor(button2, 500.0);
		button2.setStyle("-fx-font:18 arial");
		
		Arrow arrow3 = new Arrow(0,380,50,380);
		Arrow arrow4 = new Arrow(0,480,50,480);
		
		HLineTo line_3_1=new HLineTo();
		line_3_1.setX(70);

		MoveTo move3_1=new MoveTo();
		move3_1.setX(0);
		move3_1.setY(380);
		
		Path path3_1=new Path();
		path3_1.getElements().add(move3_1);
		path3_1.getElements().add(line_3_1);
				
		
		PathTransition pathT3_1=new PathTransition();
		pathT3_1.setDuration(Duration.millis(2000));
		pathT3_1.setPath(path3_1);
		pathT3_1.setNode(arrow3);
		pathT3_1.setOrientation(PathTransition.OrientationType.ORTHOGONAL_TO_TANGENT);
		
		
		HLineTo line_4_1=new HLineTo();
		line_4_1.setX(70);

		MoveTo move4_1=new MoveTo();
		move4_1.setX(0);
		move4_1.setY(480);
		
		Path path4_1=new Path();
		path4_1.getElements().add(move4_1);
		path4_1.getElements().add(line_4_1);
				
		
		PathTransition pathT4_1=new PathTransition();
		pathT4_1.setDuration(Duration.millis(2000));
		pathT4_1.setPath(path4_1);
		pathT4_1.setNode(arrow4);
		pathT4_1.setOrientation(PathTransition.OrientationType.ORTHOGONAL_TO_TANGENT);
		
		
		button2.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				// TODO Auto-generated method stub
				TextInputDialog dialog = new TextInputDialog();
				 
		        dialog.setTitle("Newton's law");
		        dialog.setHeaderText("Enter force of car :");
		        dialog.setContentText("F:");
		 
		        Optional<String> result = dialog.showAndWait();
		        float f = Float.parseFloat(result.get());//lực tác dụng vào 2 xe 3,4
		        car3.setF(f);
		        car4.setF(f);
		        car3.getAcce();
		        car4.getAcce();
		        float v3 = car3.getVelocity(0, 20);
		        float v4 = car4.getVelocity(0, 20);		        
		        		
				pathT3_1.play();
				pathT4_1.play();
				pathT3.play();	
				pathT4.play();		
			}
			
		});
		ImageView image = new ImageView(IMAGE);
		image.setOpacity(0.3);
		image.setTranslateX(300);
		
		Button button3=new Button("Back");
		button3.setPrefHeight(70);
		button3.setPrefWidth(120);		
		AnchorPane.setTopAnchor(button3, 600.0);
		AnchorPane.setLeftAnchor(button3, 700.0);
		button3.setStyle("-fx-font:18 arial");
		
		Button button4=new Button("Menu");
		button4.setPrefHeight(70);
		button4.setPrefWidth(120);
		AnchorPane.setTopAnchor(button4, 600.0);
		AnchorPane.setLeftAnchor(button4, 900.0);
		button4.setStyle("-fx-font:20 arial");
		
		button3.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				Node2 node=new Node2();
				node.start2(primaryStage);
			}
		});
		
		button4.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				Display dp=new Display();
				try {
					dp.display(primaryStage);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		root.getChildren().addAll(lbTH1,lbTH2);
		root.getChildren().addAll(line1,line2,line3,line4);
		root.getChildren().addAll(imageView1,imageView2,imageView3,imageView4);
//		root.getChildren().addAll(lbCar1,lbCar2);
		root.getChildren().addAll(arrow1,arrow2,arrow3,arrow4);
		root.getChildren().addAll(button1,button2,button3,button4);
		
		Scene scene=new Scene(root,1400,700);
		
		primaryStage.setTitle("Seconds Newtons Laws");
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}
	
	public void showForceDialog() {
		TextInputDialog dialog = new TextInputDialog();
		 
        dialog.setTitle("Newton's law");
        dialog.setHeaderText("Enter force of car 2:");
        dialog.setContentText("F2:");
 
        Optional<String> result = dialog.showAndWait();
        float f2 = Float.parseFloat(result.get());
        car2 = new FAV(f2,100);//khởi tạo giá trị cho vật là 100kg
        float a2 = car2.getAcce();//tính gia tốc của vật 1
        car2.setA(a2);
        float v2 = car2.getVelocity(0, 20);//v0 = 0,t=20s
        car2.setV(v2);
	}
	
	public void setArrow() {
		if(car1.getF() > car2.getF()) {//F1>F2
			arr1Width = 8;
			arr2Width = 4;	
		}else {
			arr1Width = 4;
			arr2Width = 8;
		}
		arrow1.setStrokeWidth(arr1Width);//xét độ mỏng hay dầy của mũi tên
		arrow2.setStrokeWidth(arr2Width);
	}
	public void runCar() {
		if(car1.getV() > car2.getV()) {
			pathCar1 = 3000;
			pathCar2 = 4000;
		}else {
			pathCar1 = 4000;
			pathCar2 = 3000;
		}
		pathT1.setDuration(Duration.millis(pathCar1));
		pathT2.setDuration(Duration.millis(pathCar2));
	}
	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		
	}
}
