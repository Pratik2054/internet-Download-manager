package org.example

import java.util.*;

public class App extends Application {

private static Scene scene ;

@override
  public void start(Stage stage) throws IOException {
    scene = new Scene(loadFXML("primary") );
    stage.setScene(scene);
    stage.show();
  }

static void setRoot(String fxml) throws IOException {
  scene.setRoot(loadFXML(fxml));
}

private static Parent loadFXML(String fxml) throws IOException {
  FXMLoader fxmlloader = new FXMLoader(App.class.getResource(fxml + "fxml));
  return fxmloader.load();
}
