package lolcatloyal.ArtBot;

import java.util.*;

/**
 * Class that represents a collection of Twitter art links
 * ordered by artist Twitter handle.
 *
 * Artists cannot be directly added to the collection. Instead,
 * they are automatically added when necessary when a new
 * Twitter art link is added.
 *
 * An array of stored artist handles can be obtained from
 * the collection.
 *
 * An array of Twitter art links for a certain artist can be
 * obtained by providing the artist's online handle.
 */
public class ArtCollection {
    private SortedMap<String, List<String>> collection;

    /**
     * Initializes a new, empty ArtCollection that
     * can be added to.
     */
    public ArtCollection(){
        collection = new TreeMap<String, List<String>>();
    }

    /**
     * Initializes a new ArtCollection with the given
     * map of Artists and Art Links.
     *
     * @param map SortedMap with Artist Handles and lists of Art
     *            Links as Keys and Values.
     */
    public ArtCollection(SortedMap<String, List<String>> map){
        collection = map;
    }

    /**
     * Gets an array of the currently stored
     * Artist Handles in alphabetical
     * order.
     *
     * @return A sorted array of artist handles.
     */
    public String[] getArtists(){
        return collection.keySet().toArray(new String[0]);
    }

    /**
     * Gets an array of the given artist handle's
     * currently stored art links.
     *
     * @param handle The handle of the desired artist.
     * @return The desired artist's collection of links
     *         if they are in the collection. Returns
     *         null otherwise.
     */
    public String[] getArtCollection(String handle){
        if (collection.containsKey(handle)){
            return collection.get(handle).toArray(new String[0]);
        }

        return null;
    }

    /**
     * Attempts to add a given art link to the
     * collection. If the link is already in the
     * collection, it is not added.
     *
     * Adds the link's artist
     * if it is not already in
     * the collection
     * as well.
     *
     * @param link Art link to add to the collection.
     * @return True if the link was added to the
     *         collection, false otherwise.
     */
    public boolean addArt(String link){
        //TODO
        return false;
    }

    /**
     * Attempts to remove the given art link from
     * the collection if it is in the collection.
     *
     * If this is the last link stored for a given
     * artist, removes the artist from the collection
     * as well.
     *
     * @param link Art link stored in the collection.
     * @return True if removal was successful, false
     *         otherwise.
     */
    public boolean removeArt(String link){
        //TODO
        return false;
    }

    /**
     * Attempts to remove the given artist
     * handle from the collection, along
     * with their art.
     *
     * If the given artist is not in the
     * collection already, no change
     * will occur.
     *
     * @param handle Social handle for an artist
     *               in the collection.
     * @return True if removal was successful, false
     *         otherwise.
     */
    public boolean removeArtist(String handle){
        //TODO
        return false;
    }

    /**
     * Attempts to add a new artist to the
     * collection.
     *
     * Fails if the artist is already in
     * the collection.
     *
     * @param handle Handle of the artist to
     *               add to the collection.
     * @return True if Artist was added, false
     *         otherwise.
     */
    private boolean addArtist(String handle) {
        //TODO
        return false;
    }
}