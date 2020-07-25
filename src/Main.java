import java.io.File;

public class Main {
    public static void main(String[] args) {
        String folderPath = "D://Media";
        File file  = new File(folderPath);

       long size = getFolderSize(file);
        System.out.println(getHumanReadable(size));
    }
    public static long getFolderSize (File folder) {
        if (folder.isFile()) {
            return folder.length();
        }
        long sum = 0;
        File[] files = folder.listFiles();
        for (File file : files) {
            sum += getFolderSize(file);
        }
        return sum;
    }

    public static String getHumanReadable(long size) {
       long curr = size/1024;
       String suff = "KB";
       if (curr > 1024) {
           suff = "MB";
           curr = curr / 1024;
           if (curr > 1024) {
               suff = "GB";
               curr = curr / 1024;
               if (curr > 1024) {
                   suff = "TB";
                   curr = curr / 1024;

               }
           }
       }

        return Long.toString(curr) + suff;
    }
}
