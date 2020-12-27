/**
 * Definition of Tweet:
 * public class Tweet {
 *     public int id;
 *     public int user_id;
 *     public String text;
 *     public static Tweet create(int user_id, String tweet_text) {
 *         // This will create a new tweet object,
 *         // and auto fill id
 *     }
 * }
 */


public class MiniTwitter {
    
    /* Friendship
     */
    public class Friendship {
        public int from_user_id;
        public int to_user_id;
        
        /* Constructor for Frienship
         * @param id: An integer, the id of the friendship
         * @param from_user_id: An integer, the id of the from user
         * @param to_user_id: An integer, the id of the to user
         * @return: nothing
         */
        public Friendship(int from_user_id, int to_user_id) {
            this.from_user_id = from_user_id;
            this.to_user_id = to_user_id;
        }
    } 
    
    // Tables
    private ArrayList<Friendship> friendshipTable;
    private ArrayList<Tweet> tweetTable;
    
    public MiniTwitter() {
        friendshipTable = new ArrayList<Friendship>();
        tweetTable = new ArrayList<Tweet>();
    }

    /* postTweet
     * @param user_id: An integer, the id of the user
     * @param tweet_text: a string, the content of the tweet
     * @return: a tweet
     */
    public Tweet postTweet(int user_id, String tweet_text) {
        Tweet tweet = Tweet.create(user_id, tweet_text);
        tweetTable.add(0, tweet);
        return tweet;
    }

    /* getNewsFeed - get the news feed sorted by timeline using Pull Table
     * @param user_id: An integer, the id of the user requesting
     * @return: a list of 10 new feeds recently and sort by timeline
     */
    public List<Tweet> getNewsFeed(int user_id) {
        // find all the followings
        Set<Integer> followings = new HashSet<Integer>();
        for(Friendship f : friendshipTable) {
            if (f.from_user_id == user_id) {
                followings.add(f.to_user_id);
            } // end if
        } // end for
        
        // go through tweet Tables
        List<Tweet> newsFeed = new ArrayList<Tweet>();
        for(Tweet t : tweetTable) {
            if(t.user_id == user_id || followings.contains(t.user_id)) {
                newsFeed.add(t);
                if(newsFeed.size() == 10) {
                    break;
                } // end if
            } // end if
        } // end for
        
        return newsFeed;
    }

    /* getTimeLine for a user
     * @param user_id: An integer, the user id of the user for the timeline
     * @return: a list of 10 new posts recently and sort by timeline
     */
    public List<Tweet> getTimeline(int user_id) {
        List<Tweet> timeline = new ArrayList<Tweet>();
        for(Tweet t : tweetTable) {
            if(t.user_id == user_id) {
                timeline.add(t);
                if(timeline.size() == 10) {
                    break;
                } // end if
            } // end if
        } // end for
        
        return timeline;
    }

    /* follow
     * @param from_user_id: An integer
     * @param to_user_id: An integer
     * @return: nothing
     */
    public void follow(int from_user_id, int to_user_id) {
        // make sure the friendship is not already recorded
        for(Friendship f : friendshipTable) {
            if(f.from_user_id == from_user_id && f.to_user_id == to_user_id) {
                return;
            } // end if
        } // end for
        
        friendshipTable.add(new Friendship(from_user_id, to_user_id));
    }

    /* unfollow
     * @param from_user_id: An integer
     * @param to_user_id: An integer
     * @return: nothing
     */
    public void unfollow(int from_user_id, int to_user_id) {
        for(int i = 0; i < friendshipTable.size(); i++) {
            Friendship f = friendshipTable.get(i);
            if(f.from_user_id == from_user_id && f.to_user_id == to_user_id) {
                friendshipTable.remove(i);
                return;
            } // end if
        } // end for
    }
}
