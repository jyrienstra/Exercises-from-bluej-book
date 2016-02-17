import java.util.ArrayList;

/**
 * A class to hold details of audio files.
 * This version can play the files.
 * 
 * @author David J. Barnes and Michael Kölling
 * @version 2011.07.31
 */
public class MusicOrganizer
{
    // An ArrayList for storing the file names of music files.
    private ArrayList<String> files;
    // A player for the music files.
    private MusicPlayer player;
        
    /**
     * Create a MusicOrganizer
     */
    public MusicOrganizer()
    {
        files = new ArrayList<String>();
        player = new MusicPlayer();
    }
    
    /**
     * Add a file to the collection.
     * @param filename The file to be added.
     */
    public void addFile(String filename)
    {
        files.add(filename);
    }
    
    /**
     * Return the number of files in the collection.
     * @return The number of files in the collection.
     */
    public int getNumberOfFiles()
    {
        return files.size();
    }
    
    /**
     * List a file from the collection.
     * @param index The index of the file to be listed.
     */
    public void listFile(int index)
    {
        if(index >= 0 && index < files.size()) {
            String filename = files.get(index);
            System.out.println(filename);
        }
    }
    
    /**
     * List all files from the collection
     */
    public void listAllFiles(){
        int position = 0;
        
        for(String filename: files) {
            System.out.println(position + ": " + filename);
            position++;
        }

    }
    
    /**
     * List the files that contain a certain searched string
     * @param searchString The string that will be used for the search
     */
    public void listMatching(String searchString){
        boolean noMatches = true;
         
        for(String filename : files){
            if(filename.contains(searchString)) {
                //A file that matches the string
                System.out.println(filename);
                noMatches = false;
            }
           
             if(noMatches == true){
                 System.out.print("No matches found");
            }
        }
    }
    
    /**
     * Play a sample of all mathing songs
     * 15 seconds longs
     * Using the MusicPlayer class p
     * @param searchString The string that will be used for the search
     */
    public void playSample(String searchString){
        for(String filename : files){
            if(filename.contains(searchString)) {
                //A file that matches the string
                player.playSample(filename); //play a sample of 15 seconds for the given filename
                
            }
        }
    }
    
    /**
     * Remove a file from the collection.
     * @param index The index of the file to be removed.
     */
    public void removeFile(int index)
    {
        if(index >= 0 && index < files.size()) {
            files.remove(index);
        }
    }

    /**
     * Start playing a file in the collection.
     * Use stopPlaying() to stop it playing.
     * @param index The index of the file to be played.
     */
    public void startPlaying(int index)
    {
        String filename = files.get(index);
        player.startPlaying(filename);
    }

    /**
     * Stop the player.
     */
    public void stopPlaying()
    {
        player.stop();
    }
}
