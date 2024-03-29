package app;

import java.io.*;

/**
 * Class for FileManagement
 * Primitive FileManagement
 * @author Karim Saad
 */

public class FileManager {

    /**
     * Checks if a file exists
     * @param path full path 2 file
     * @return boolean fileexists?
     */
    public static boolean fileExists(String path){
        File file = new File(path);
        return file.exists();
    }

    /**
     * Reads Text from File by path
     * @param path full path 2 file
     * @return gesamtText (full Text content of the file)
     * @throws IOException
     */
    public static String readTextFromFile (String path) throws IOException 
    {
        if(!fileExists(path))return "Die Datei existiert nicht!";
        String gesamtText = "";
        FileReader fileReader = new FileReader(path);
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        for(String zeile = bufferedReader.readLine(); zeile != null; zeile = bufferedReader.readLine()) {
            gesamtText += zeile;
        }

        bufferedReader.close();
        fileReader.close();
        return gesamtText;
    }

    /**
     * Returns the root directories
     * @return
     */
    public static File[] getWurzelVerzeichnisse() {
        return File.listRoots();
    }

    /**
     * Returns all Files of a specific root dir
     * @param datei File (the specific root dir)
     * @return File[]
     */
    public static File[] getDateienInWurzelVerzeichniss(File datei) {
        return datei.listFiles();
    }
}