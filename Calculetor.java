package calculetor;

import java.lang.Math;
import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
public class Calculetor extends Application {
    int base = 10;
    @Override
    public void start(Stage primaryStage) {
        //Boutons _ size // 
        Button btn_add = new Button("+");
        btn_add.setMinSize(35, 35);
        Button btn_sub = new Button("-");
        btn_sub.setMinSize(35, 35);
        Button btn_multi = new Button("*");
        btn_multi.setMinSize(35, 35);
        Button btn_div = new Button("/");
        btn_div.setMinSize(35, 35);
        Button btn_int_div = new Button("//");
        btn_int_div.setMinSize(35, 35);
        Button btn_modul = new Button("%");
        btn_modul.setMinSize(35, 35);
        Button btn_power = new Button("^");
        btn_power.setMinSize(35, 35);
        Button btn_log = new Button("log ");
        btn_log.setMinSize(35, 35);
        Button btn_fact = new Button("x!");
        btn_fact.setMinSize(35, 35);
        Button btn_clear = new Button("   c    ");
        btn_clear.setMinSize(150, 35);
        Button btn_Exit = new Button("Exit");
        btn_Exit.setMinSize(150, 35);
        Button btn_check = new Button("Check");
        btn_check.setMinSize(150, 35);
        //Text Field //
        TextField txt_x = new TextField();
        txt_x.setMinSize(35, 35);
        TextField txt_y = new TextField();
        txt_y.setMinSize(35, 35);
        //Label//
        Label lbl_res = new Label();
        lbl_res.setMinSize(35,35); // size 
        Label lbl_base = new Label("Base: ");
        lbl_base.setMinSize(35, 35);
        // ComboBox//
        ComboBox combo = new ComboBox();
        combo.getItems().addAll("DEC", "HEX", "OCT", "BIN");
        combo.setValue("DEC");
        combo.setMinSize(110, 35);// size 
        combo.valueProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue observable, String x, String y) {
                if (y.equals("DEC")) {
                    base = 10;
                } else if (y.equals("HEX")) {
                    base = 16;
                } else if (y.equals("OCT")) {
                    base = 8;
                } else {
                    base = 2;
                }

            }
        });
        //actions //
        btn_add.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                double x = Double.parseDouble(txt_x.getText());
                double y = Double.parseDouble(txt_y.getText());
                lbl_res.setText(Double.toString(x + y));
                EventHandler<ActionEvent> event = new EventHandler<ActionEvent>() {

                    @Override
                    public void handle(ActionEvent e) {
                        if (combo.getValue() == "HEX") {

                            int a = (int) Double.parseDouble((Double.toString(x + y)));

                            lbl_res.setText(Integer.toString(a, 16));
                        } else if (combo.getValue() == "OCT") {
                            int a = (int) Double.parseDouble(Double.toString(x + y));

                            lbl_res.setText(Integer.toString(a, 8));

                        } else if (combo.getValue() == "BIN") {
                            int a = (int) Double.parseDouble(Double.toString(x + y));

                            lbl_res.setText(Integer.toString(a, 2));
                        } else if (combo.getValue() == "DEC") {

                            int a = (int) Double.parseDouble(Double.toString(x + y));

                            lbl_res.setText(Integer.toString(a, 10));
                        }

                    }
                };
                combo.setOnAction(event);

            }
        });
        btn_sub.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                double x = Double.parseDouble(txt_x.getText());
                double y = Double.parseDouble(txt_y.getText());
                lbl_res.setText(Double.toString(x - y));
                EventHandler<ActionEvent> event = new EventHandler<ActionEvent>() {

                    @Override
                    public void handle(ActionEvent e) {
                        if (combo.getValue() == "HEX") {

                            int a = (int) Double.parseDouble((Double.toString(x - y)));

                            lbl_res.setText(Integer.toString(a, 16));
                        } else if (combo.getValue() == "OCT") {
                            int a = (int) Double.parseDouble(Double.toString(x - y));

                            lbl_res.setText(Integer.toString(a, 8));

                        } else if (combo.getValue() == "BIN") {
                            int a = (int) Double.parseDouble(Double.toString(x - y));

                            lbl_res.setText(Integer.toString(a, 2));
                        } else if (combo.getValue() == "DEC") {

                            int a = (int) Double.parseDouble(Double.toString(x - y));

                            lbl_res.setText(Integer.toString(a, 10));
                        }

                    }
                };
                combo.setOnAction(event);

            }

        });
        btn_multi.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                double x = Double.parseDouble(txt_x.getText());
                double y = Double.parseDouble(txt_y.getText());
                lbl_res.setText(Double.toString(x * y));
                EventHandler<ActionEvent> event = new EventHandler<ActionEvent>() {

                    @Override
                    public void handle(ActionEvent e) {
                        if (combo.getValue() == "HEX") {

                            int a = (int) Double.parseDouble((Double.toString(x * y)));

                            lbl_res.setText(Integer.toString(a, 16));
                        } else if (combo.getValue() == "OCT") {
                            int a = (int) Double.parseDouble(Double.toString(x * y));

                            lbl_res.setText(Integer.toString(a, 8));

                        } else if (combo.getValue() == "BIN") {
                            int a = (int) Double.parseDouble(Double.toString(x * y));

                            lbl_res.setText(Integer.toString(a, 2));
                        } else if (combo.getValue() == "DEC") {

                            int a = (int) Double.parseDouble(Double.toString(x * y));

                            lbl_res.setText(Integer.toString(a, 10));
                        }

                    }
                };
                combo.setOnAction(event);

            }

        });
        btn_div.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                double x = Double.parseDouble(txt_x.getText());
                double y = Double.parseDouble(txt_y.getText());

                try {
                    double sum = x / y;
                } catch (ArithmeticException eee) {
                    lbl_res.setText("Invalid operation: " + eee.getMessage());
                }

                lbl_res.setText(Double.toString(x / y));
                EventHandler<ActionEvent> event = new EventHandler<ActionEvent>() {

                    @Override
                    public void handle(ActionEvent e) {
                        if (combo.getValue() == "HEX") {

                            int a = (int) Double.parseDouble((Double.toString(x / y)));

                            lbl_res.setText(Integer.toString(a, 16));
                        } else if (combo.getValue() == "OCT") {
                            int a = (int) Double.parseDouble(Double.toString(x / y));

                            lbl_res.setText(Integer.toString(a, 8));

                        } else if (combo.getValue() == "BIN") {
                            int a = (int) Double.parseDouble(Double.toString(x / y));

                            lbl_res.setText(Integer.toString(a, 2));
                        } else if (combo.getValue() == "DEC") {

                            int a = (int) Double.parseDouble(Double.toString(x / y));

                            lbl_res.setText(Integer.toString(a, 10));
                        }

                    }
                };
                combo.setOnAction(event);
            }

        });
        btn_int_div.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                int x = (int) Double.parseDouble(txt_x.getText());
                int y = (int) Double.parseDouble(txt_y.getText());
                lbl_res.setText(Integer.toString(x / y));
                EventHandler<ActionEvent> event = new EventHandler<ActionEvent>() {

                    @Override
                    public void handle(ActionEvent e) {
                        if (combo.getValue() == "HEX") {

                            int a = (int) Double.parseDouble((Double.toString(x / y)));

                            lbl_res.setText(Integer.toString(a, 16));
                        } else if (combo.getValue() == "OCT") {
                            int a = (int) Double.parseDouble(Double.toString(x / y));

                            lbl_res.setText(Integer.toString(a, 8));

                        } else if (combo.getValue() == "BIN") {
                            int a = (int) Double.parseDouble(Double.toString(x / y));

                            lbl_res.setText(Integer.toString(a, 2));
                        } else if (combo.getValue() == "DEC") {

                            int a = (int) Double.parseDouble(Double.toString(x / y));

                            lbl_res.setText(Integer.toString(a, 10));
                        }

                    }
                };
                combo.setOnAction(event);

            }

        });
        btn_modul.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                double x = Double.parseDouble(txt_x.getText());
                double y = Double.parseDouble(txt_y.getText());
                lbl_res.setText(Double.toString(x % y));
                EventHandler<ActionEvent> event = new EventHandler<ActionEvent>() {

                    @Override
                    public void handle(ActionEvent e) {
                        if (combo.getValue() == "HEX") {

                            int a = (int) Double.parseDouble((Double.toString(x % y)));

                            lbl_res.setText(Integer.toString(a, 16));
                        } else if (combo.getValue() == "OCT") {
                            int a = (int) Double.parseDouble(Double.toString(x % y));

                            lbl_res.setText(Integer.toString(a, 8));

                        } else if (combo.getValue() == "BIN") {
                            int a = (int) Double.parseDouble(Double.toString(x % y));

                            lbl_res.setText(Integer.toString(a, 2));
                        } else if (combo.getValue() == "DEC") {

                            int a = (int) Double.parseDouble(Double.toString(x % y));

                            lbl_res.setText(Integer.toString(a, 10));
                        }

                    }
                };
                combo.setOnAction(event);

            }

        });
        btn_power.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                double x = Double.parseDouble(txt_x.getText());
                double y = Double.parseDouble(txt_y.getText());
                lbl_res.setText(Double.toString(Math.pow(x, y)));
                EventHandler<ActionEvent> event = new EventHandler<ActionEvent>() {

                    @Override
                    public void handle(ActionEvent e) {
                        if (combo.getValue() == "HEX") {

                            int a = (int) Double.parseDouble((Double.toString(Math.pow(x, y))));

                            lbl_res.setText(Integer.toString(a, 16));
                        } else if (combo.getValue() == "OCT") {
                            int a = (int) Double.parseDouble(Double.toString(Math.pow(x, y)));

                            lbl_res.setText(Integer.toString(a, 8));

                        } else if (combo.getValue() == "BIN") {
                            int a = (int) Double.parseDouble(Double.toString(Math.pow(x, y)));

                            lbl_res.setText(Integer.toString(a, 2));
                        } else if (combo.getValue() == "DEC") {

                            int a = (int) Double.parseDouble(Double.toString(Math.pow(x, y)));

                            lbl_res.setText(Integer.toString(a, 10));
                        }

                    }
                };
                combo.setOnAction(event);

            }

        });
        btn_log.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                double x = Double.parseDouble(txt_x.getText());
                double y = Double.parseDouble(txt_y.getText());
                lbl_res.setText(Double.toString(Math.log(x) / Math.log(y)));
            }

        });
        btn_fact.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                int i, fact = 1;
                double x = Double.parseDouble(txt_x.getText());
                double number = x;
                for (i = 1; i <= number; i++) {
                    fact = fact * i;
                }
                lbl_res.setText(Double.toString(fact));

            }

        });
        btn_clear.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                double x = Double.parseDouble(txt_x.getText());
                double y = Double.parseDouble(txt_y.getText());
                lbl_res.setText("");

            }

        });
        btn_Exit.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                System.exit(0);

            }

        });
        btn_check.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                try {
                    int x = Integer.parseInt(txt_x.getText(), base);
                    int y = Integer.parseInt(txt_x.getText(), base);

                } catch (NumberFormatException ex) {

                    lbl_res.setText("invalid input ");
                }
            }
        });
        // place in scene //
        HBox box = new HBox();
        box.getChildren().addAll(lbl_base, combo);
        GridPane grid = new GridPane();
        grid.setVgap(10);
        grid.add(box, 0, 4);
        grid.add(txt_x, 0, 0);
        grid.add(txt_y, 0, 1);
        grid.add(lbl_res, 0, 2);
        grid.add(btn_clear, 0, 3);
        grid.add(btn_add, 1, 2);
        grid.add(btn_sub, 1, 3);
        grid.add(btn_multi, 1, 4);
        grid.add(btn_div, 1, 5);
        grid.add(btn_int_div, 2, 2);
        grid.add(btn_modul, 2, 3);
        grid.add(btn_power, 2, 4);
        grid.add(btn_log, 2, 5);
        grid.add(btn_fact, 1, 6);
        grid.add(btn_Exit, 0, 6);
        grid.add(btn_check, 0, 5);
        // scene 
        Scene scene = new Scene(grid, 275, 350);
        primaryStage.setTitle("Calc");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }

}
