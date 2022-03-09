package io.learning.springboot.topic;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class TopicService {

    List<Topic> topics = new ArrayList<>( Arrays.asList(new Topic("1","Maath","Mathematics "),
            new Topic("2","Science","Scientific topics"),
            new Topic("3","Social","Social science")));

    public List<Topic> getAllTopics(){
        return topics;
    }

   public  Topic getTopic(String id){
       return topics.stream().filter(topic -> topic.getId().equals(id)).findFirst().get();
   }

   public void  addTopic(Topic topic){
        topics.add(topic);
   }

    public void updateTopic(Topic topic,String id) {
      for(int i=0;i<topics.size();i++){
          Topic t = topics.get(i);
          if(t.getId().equals(id)){
              topics.set(i,topic);
              return;
          }
      }
    }

    public void deleteTopic( String id) {
       topics.removeIf(t->t.getId().equals(id));
    }
}
