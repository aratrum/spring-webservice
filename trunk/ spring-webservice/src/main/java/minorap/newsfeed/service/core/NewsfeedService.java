package minorap.newsfeed.service.core;

import minorap.newsfeed.service.entity.Interest;
import minorap.newsfeed.service.presentation.ArticlePrinter;
import minorap.newsfeed.service.service.ServiceCaller;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;

import java.util.ArrayList;

/**
 * User: Robbert
 * Date: 29-5-13
 * Time: 11:24
 */

@Endpoint
public class NewsfeedService {
    public ArticlePrinter pr;
    public ArticleParser ap;
    public InterestParser ip;
    public ServiceCaller sc;

    public NewsfeedService(){

    }

    public ArrayList<Interest> getLocalInterests(String user){
        return null;
    }

    public String getProfile(String user){
        return "";
    }

    @PayloadRoot(localPart = "NewsFeedRequest", namespace = "http://www.han.nl/schemas/messages")
    public NewsfeedRequest showNewsFeed(NewsfeedRequest request){

    }

}
