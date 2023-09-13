Package org.example;
FileInfo fileinfo;
DownloadManager manager;
Public DownloadThread(FileInfo file, DownloadManager manager){
            this.file = file ;
            this.manager = manager;
@override
Public void run(){
        this.file.setStatus(“DOWNLOADING”);
        this.manager.updateUI(this.file);
         try{
                          Files.copy(new URL(this.file.getUrl()).openstream(), paths.get(this.file.getpath()){
	                        This.file.setstatus(“done”);
} catch(IOException e){
                  this.file.setstatus(“failed”);
                  System.out.println(“downloading error”);
                  e.printstacktrace();

}
This.manager.updateUI(this.file);
       }
}

