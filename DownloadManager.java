Package com.example;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class DownloadManager{
        @FXML
         Private TextField urlTextField;
         Public int index = 0;
      @FXML
              Void downloadbuttonclicked(ActionEvent event){
                        String url  =  urlTextField.getText().trim();
                        String filename = url.substring(url.lastindexof((“/”)+1);
                       String status = “starting”;
                       String action = “open”;
                    String path = AppConfig.DOWNLOAD_PATH+ file.seperator+filename;
                       FileInfo file = new FileInfo(((index+1)+” ”),name, url,status action);
                       This.index = this.index+1;
                      DownloadThread thread = new DownloadThread(file, manager);
                      this.tableview.getItems().add(Integer.parseInt(file.getindex),file);
                      thread.start();
                      this.urlTextField.setText(“ ”);
         }
                  Public void updateUI(FileInfo metafile){
                  System.out.println(metafile);
               FileInfo fileinfo =   this.tableview.getItems().get(Integer.parseInt(metafile.getIndex)-1);
              fileinfo.setStatus(metafile.getStatus());
               this.tableview.refresh();
           }
              @FXML
              Public void initialize(){
  System.out.println(“view initialized”);

TableColumn<FileInfo , String> sn = (TableColumn<FileInfo, String>this.tableiew.get(0);
sn.setCellValueFactory(p ->{
        return p.getValue().indexProperty();
});
TableColumn<FileInfo , String> filename = (TableColumn<FileInfo, String>this.tableiew.get(1);
filename.setCellValueFactory(p ->{
        return p.getValue().nameProperty();
});
TableColumn<FileInfo , String> url = (TableColumn<FileInfo, String>this.tableiew.get(2);
url.setCellValueFactory(p ->{
        return p.getValue().urlProperty();
});
TableColumn<FileInfo , String> status = (TableColumn<FileInfo, String>this.tableiew.get(3);
status.setCellValueFactory(p ->{
        return p.getValue().statusProperty();
});
TableColumn<FileInfo , String> action = (TableColumn<FileInfo, String>this.tableiew.get(4);
action.setCellValueFactory(p ->{
        return p.getValue().actionProperty();
});
}
