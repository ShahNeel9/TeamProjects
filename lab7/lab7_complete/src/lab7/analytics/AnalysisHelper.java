/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7.analytics;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lab7.entities.Comment;
import lab7.entities.Post;
import lab7.entities.User;

/**
 *
 * @author harshalneelkamal
 */
public class AnalysisHelper {
    // find user with Most Likes
    //  key: UserId ; Value: sum of likes from all comments
    public void userWithMostLikes() {
        Map<Integer, Integer> userLikesCount = new HashMap<>();
        Map<Integer, User> users = DataStore.getInstance().getUsers();
    
        for (User user : users.values()) {
            for (Comment c : user.getComments()) {
                int likes = 0;
                if (userLikesCount.containsKey(user.getId())) {
                    likes = userLikesCount.get(user.getId());
                }
                likes += c.getLikes();
                userLikesCount.put(user.getId(), likes);
            }
        }
        int max = 0;
        int maxId = 0;
        for (int id : userLikesCount.keySet()) {
            if (userLikesCount.get(id) > max) {
                max = userLikesCount.get(id);
                maxId = id;
            }
        }
        System.out.println("User with most likes: " + max + "\n" 
            + users.get(maxId));
    }
    
    // find 5 comments which have the most likes
    public void getFiveMostLikedComment() {
        Map<Integer, Comment> comments = DataStore.getInstance().getComments();
        List<Comment> commentList = new ArrayList<>(comments.values());
        
        Collections.sort(commentList, new Comparator<Comment>() {
            @Override 
            public int compare(Comment o1, Comment o2) {
                return o2.getLikes() - o1.getLikes();
            }
        });
        
        System.out.println("5 most likes comments: ");
        for (int i = 0; i < commentList.size() && i < 5; i++) {
            System.out.println(commentList.get(i));
        }
    }
    
   // 1). Find Average number of likes per comment.
    
    public void avgLIkesPerComment(){
        
     /*   Map<Integer,Comment> useLikesCount = DataStore.getInstance().getComments();
        List<Comment> commentList = new ArrayList<>(useLikesCount.values());*/
        
        Map<Integer, Integer> userLikesCount = new HashMap<>();
        Map<Integer, User> users = DataStore.getInstance().getUsers();
    
        int Totalcomments =0;
        for (User user : users.values()) {
            for (Comment c : user.getComments()) {
                Totalcomments++;
                int likes = 0;
                if (userLikesCount.containsKey(user.getId())) {
                    likes = userLikesCount.get(user.getId());
                }
                likes += c.getLikes();
                userLikesCount.put(user.getId(), likes);
            }
        }
        int Totallikes=0;
        for(int id : userLikesCount.keySet()){
            
            Totallikes += userLikesCount.get(id);
        }
        
        System.out.println("Comments" + Totalcomments);
        System.out.println("Likes" + Totallikes);
        System.out.println("AveLIkes_perComment" + Totallikes/Totalcomments);
    }
    
   // 2). Find the post with most liked comments.
 
    public void MostlikePost(){
        
       Map<Integer, Comment> comments = DataStore.getInstance().getComments();
        List<Comment> commentList = new ArrayList<>(comments.values());
        
        Collections.sort(commentList, new Comparator<Comment>() {
            @Override 
            public int compare(Comment o1, Comment o2) {
                return o2.getLikes() - o1.getLikes();
            }
        });
        
            System.out.println("Post With Most Like Post"+commentList.get(0));
        
    }
    
  // 3) Find the post with most comments.
    
    public void PostwithMostComment(){
        
        Map<Integer, Integer> commentsCount = new HashMap<>();
        Map<Integer, Post> posts = DataStore.getInstance().getPosts();

        for (Post post : posts.values()) {
            commentsCount.put(post.getPostId(), post.getComments().size());
        }
        int max = 0;
        int maxId = 0;

        for (int id : commentsCount.keySet()) {

            if (commentsCount.get(id) > max) {
                max = commentsCount.get(id);
                maxId = id;
            }
        }
        
         System.out.println("Post with Most Comments : " + max + "\n" + posts.get(maxId));
    }
    
   // 4). Top 5 inactive users based on total posts number.
    
    public void inactiveUserbypost(){
        
        Map<Integer, Post> posts = DataStore.getInstance().getPosts();
        Map<Integer, User> users = DataStore.getInstance().getUsers();
        ArrayList<User> user = new ArrayList<User>();

        for (User u : users.values()) {
            int count = 0;
            for (Post post : posts.values()) {
                if (u.getId() == post.getUserId()) {
                    count++;
                }
            }
            u.setTotalPosts(count);
            user.add(u);
        }

        Collections.sort(user, new Comparator<User>() {
            @Override
            public int compare(User o1, User o2) {
                return o1.getTotalPosts() - o2.getTotalPosts();
            }
        });

        System.out.println("Top Five Inactive User By Total Posts : ");
        for (int i = 0; i < user.size() && i<5; i++) {
            System.out.println(user.get(i));
        }
        
    }
    
   // 5). Top 5 inactive users based on total comments they created.

    public void inactiveUserbyComment(){
        
       Map<Integer, Integer> commentsCount = new HashMap<>();
        Map<Integer, Post> posts = DataStore.getInstance().getPosts();
        
    }
    
    
    
    public void topFiveInactiveUserByTotalpost(){
        
        Map<Integer,Post> post = DataStore.getInstance().getPosts();
        Map<Integer,User> user = DataStore.getInstance().getUsers();
        ArrayList<User> user1 = new ArrayList<User>();
        
    }
}

        




