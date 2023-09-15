import java.io.File;
import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;

public class Demo {
    private static Path path;

    public static void main(String[] args)throws IOException {

        //io 
       File[] listRoots = File.listRoots();
       System.out.println(Arrays.toString(listRoots));

       for(File file : listRoots){
        File[] rootContent = file.listFiles();
        for(File f : rootContent){
            System.out.println(f);
        }
       }

       System.out.println("==============================");

       //nio

       Iterable<Path> rootDirectories =FileSystems.getDefault().getRootDirectories();
       for(Path path : rootDirectories){

        System.out.println(path);

        DirectoryStream<Path> folderContent = Files.newDirectoryStream(path);
        folderContent.forEach(p -> System.out.println(p.toAbsolutePath()));
       }

    }
}