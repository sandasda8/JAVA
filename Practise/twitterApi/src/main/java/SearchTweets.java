import twitter4j.*;
import twitter4j.conf.ConfigurationBuilder;

import java.util.List;

public class SearchTweets {

    public static void main(String[] args) {

        ConfigurationBuilder cb = new ConfigurationBuilder();
        cb.setDebugEnabled(true)
                .setOAuthConsumerKey("B2FG2PTMCXeplZvkyGb3ZvyL6")
                .setOAuthConsumerSecret("BhOunczMXln4GCarZfp5jF7P8Bh3Iteay6cx9Aw0IzZdSx0Mvb")
                .setOAuthAccessToken("989081364724101121-rPnTaCXu4iFqDJ4ekxJtfFy5uignn7Y")
                .setOAuthAccessTokenSecret("2F4Eo5ECkWIVKFc0id438AqLoOtPAxHKyzRKdbo3NWBZ7");
        TwitterFactory tf = new TwitterFactory(cb.build());
        Twitter someTwitter = tf.getInstance();

        try {
            Query query = new Query("retek");
            QueryResult result;
            do {
                result = someTwitter.search(query);
                List<Status> tweets = result.getTweets();
                for (Status tweet : tweets) {
                    System.out.println("User: " + tweet.getUser().getScreenName() + " - " + tweet.getText());
                }
            } while ((query = result.nextQuery()) != null);
            System.exit(0);
        } catch (TwitterException te) {
            te.printStackTrace();
            System.out.println("Failed to search tweets: " + te.getMessage());
            System.exit(-1);
        }
    }
}