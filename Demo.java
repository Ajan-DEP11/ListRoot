import java.io.File;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.util.Arrays;

public class Demo {
    public static void main(String[] args) {

        //io 
       File[] listRoots = File.listRoots();
       System.out.println(Arrays.toString(listRoots));

       //nio

       Iterable<Path> rootDirectories =FileSystems.getDefault().getRootDirectories();
       for(Path path : rootDirectories){
        System.out.println(path);
       }

    }
}