/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facebook;

import facebook4j.BatchRequest;
import facebook4j.BatchRequests;
import facebook4j.BatchResponse;
import facebook4j.Comment;
import facebook4j.FacebookException;
import facebook4j.FacebookFactory;
import facebook4j.Friend;
import facebook4j.Friendlist;
import facebook4j.PagableList;
import facebook4j.Post;
import facebook4j.Reading;
import facebook4j.ResponseList;
import facebook4j.User;
import facebook4j.auth.AccessToken;
import facebook4j.internal.http.RequestMethod;
import facebook4j.internal.org.json.JSONArray;
import facebook4j.internal.org.json.JSONException;
import facebook4j.internal.org.json.JSONObject;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import org.omg.PortableServer.POA;

/**
 *
 * @author Salvador RG
 */
public class Facebook {


    public static void main(String[] args) throws FacebookException, IOException, JSONException {
        
        (new IngresarComoDeveloper()).setVisible(true);
//        // TODO code application logic here
//        MetodosFacebook4j metodos = new MetodosFacebook4j();
//        Scanner teclado = new Scanner(System.in);
//
//        facebook4j.Facebook facebook = new FacebookFactory().getInstance();
//        facebook.setOAuthAppId(appId, appSecret);
//        facebook.setOAuthPermissions("ads_management, ads_read, read_friendlists, create_event, create_note, email, export_stream, read_stream, user_friends, friends_about_me, friends_actions.books, friends_actions.music, friends_actions.news, friends_actions.video, friends_activities, friends_birthday, friends_education_history, friends_events, friends_games_activity, friends_groups, friends_hometown, friends_interests, friends_likes, friends_location, friends_notes, friends_online_presence, friends_photo_video_tags, friends_photos, friends_questions, friends_relationship_details, friends_relationships, friends_religion_politics, friends_status, friends_subscriptions, friends_videos, friends_website, friends_work_history, manage_friendlists, manage_notifications, manage_pages, photo_upload, publish_actions, publish_stream, read_friendlists, read_insights, read_mailbox, read_page_mailboxes, read_requests, read_stream, rsvp_event, share_item, sms, status_update, user_about_me, user_actions.books, user_actions.music, user_actions.news, user_actions.video, user_activities, user_birthday, user_education_history, user_events, user_friends, user_games_activity, user_groups, user_hometown, user_interests, user_likes, user_location, user_notes, user_online_presence, user_photo_video_tags, user_photos, user_questions, user_relationship_details, user_relationships, user_religion_politics, user_status, user_subscriptions, user_videos, user_website, user_work_history, user_posts, video_upload, xmpp_login");
//        // facebook.setOAuthAppId(appId, appSecret);
//        facebook.setOAuthAccessToken(new AccessToken(accessToken, null));
//
//        //(new PublicacionesFacebook()).setVisible(true);
//        // System.out.println(run.getFacebookPostes(facebook, amigo));
//        /*
//         System.out.print("Busca un usuario: ");
//         String busqueda = teclado.nextLine();
//         ResponseList<User> results = facebook.searchUsers(busqueda.toLowerCase());
//
//         for (User buscarUsuario : results) {
//         User usuarioBuscado = facebook.getUser(buscarUsuario.getId(), new Reading().fields(args));
//         if (usuarioBuscado.getBirthday() != null) {
//         // System.out.println(usuarioBuscado);
//         }
//         }
//         */
//        //System.out.print("post: " + feed + "\n\n\n\n");
//        User miPerfil = facebook.getUser(facebook.getMe().getId(), new Reading().fields(args));
//        List<Post> myWall = facebook.getFeed(miPerfil.getId());
//        //System.out.println("post: "+ postFromUser+"\n\n");
//        // System.out.print("Hola: " + miPerfil.getName() + "\nPerfil: \ne/mail: " + miPerfil.getEmail()+ "\nBirthday: " +  miPerfil.getBirthday()+ "\n" 
//        //               + miPerfil.getGender()+ "\nId: "+ miPerfil.getId()+ "\nRelacion: " + miPerfil.getRelationshipStatus()+ "\nEducacion: " + miPerfil.getEducation()+ "\n");
//        LinkedList<String> idUSuarios = new LinkedList<>();
//        //System.out.println(metodos.listaDeAmigosDevelopers());
//
//        //obtener listado de amigos completa(solo developers)
//        /*String query = "SELECT uid2 FROM friend WHERE uid1=me()";
//         JSONArray jsonArray = facebook.executeFQL(query);
//         for (int i = 0; i < jsonArray.length(); i++) {
//         JSONObject jsonObject = jsonArray.getJSONObject(i);
//         System.out.println(jsonObject.get("uid2"));
//         }*/
//        //obtenemos lista de amigos mediante querys(solo developers)
//        /*Map<String, String> queries = new HashMap<String, String>();
//         queries.put("all friends", "SELECT uid2 FROM friend WHERE uid1=me()");
//         queries.put("my name", "SELECT name FROM user WHERE uid=me()");
//         Map<String, JSONArray> result = facebook.executeMultiFQL(queries);
//         JSONArray allFriendsJSONArray = result.get("all friends");
//         for (int i = 0; i < allFriendsJSONArray.length(); i++) {
//         JSONObject jsonObject = allFriendsJSONArray.getJSONObject(i);
//         System.out.println(jsonObject);
//         }*/
//        //obtener amigos con requisicion por lotes(developers)
//       /* BatchRequests<BatchRequest> batch = new BatchRequests<BatchRequest>();
//         batch.add(new BatchRequest(RequestMethod.GET, "me"));
//         batch.add(new BatchRequest(RequestMethod.GET, "v2.0/me/friends?limit=500"));//taggable_friends// /v1.0/me/friends and/v2.0/me/friends
//         List<BatchResponse> actuals = facebook.executeBatch(batch);
//         System.out.println("kjkjn: " + actuals.get(1).asJSONObject().get("summary"));//"summary","data","paging"//summary imprime la cantidad de amigos
//         */
//        //JSONArray myNameJSONArray = result.get("my name");
//        //System.out.println(myNameJSONArray.getJSONObject(0).get("name"));
//        //System.out.println("jhvjhvjhvjhvjhv: " + metodos.obtenerMuroPublico(metodos.listaDeAmigosDevelopers().get(0), 5));
//        try {
//            for (int i = 0; i < facebook.getFriends().size(); i++) {
//                User usuarioLista = facebook.getFriends().get(i);
//                User personalInformationUser = facebook.getUser(usuarioLista.getId(), new Reading().fields(args));
//                //System.out.println("Muro de : " + facebook.getUser(personalInformationUser.getId()).getName());
//                idUSuarios.add(personalInformationUser.getId());
//                List<Post> wallFromFriend = facebook.getPosts(personalInformationUser.getId());
//                //System.out.println(wallFromFriend.get(i) + "\n\n");
//                //System.out.println(personalInformationUser);//obtenemos el perfil publico de los amigos
//            }
//            //obtener muro por lotes de un usuario en njuestro ResponseList
//            ResponseList<Post> feeds = facebook.getFeed(idUSuarios.get(1),
//                    new Reading().limit(100));
//
//            // For all 25 feeds...
//            for (Post post : feeds) {
//                PagableList<Comment> comments = post.getComments();
//                // Get (string) message.
//
//                String message = post.getMessage();
//                System.out.println("Fecha: " + post.getCreatedTime() + "\nQuien publica: " + post.getFrom().getName() + ": \nTitulo del post: " + message);
//                for (Comment comment : comments) {
//                    System.out.println(comment.getFrom().getName() + ": " + comment.getMessage() + "  ✌: " + comment.getLikeCount());
//                }
//                System.out.println("Imagen: " + post.getPicture() + "\n\n");
//
//                // Datos importantes de un post del usuario elejido
//                //guardar imagen
//                //URL url = new URL("urlPath");
//                //BufferedImage c = ImageIO.read(url);
//                //ImageIcon image = new ImageIcon(c);
//                //jXImageView1.setImage(image);
//                // Get more stuff...
//                String date = post.getCreatedTime().toString();
//                String name = post.getFrom().getName();
//                String id = post.getId();
//            } //obtener mi muro
//            /* System.out.println("Mi id: " + facebook.getMe().getId() + "\n" + "Muro de " + facebook.getMe().getName()+"\n");
//             List<Post> wallFromUser = facebook.getFeed(idUSuarios.get(0));
//             System.out.println(wallFromUser);*/
//        } catch (Exception e) {
        }

    }



/*
 //codigo que obtiene tu muro y defines cuantos post quieres en "new Reading().limit(numeroDePostQueQuieres)"
 ResponseList<Post> feeds = facebook.getFeed(facebook.getMe().getId(),
 new Reading().limit(100));

 // For all 25 feeds...
 for (Post post : feeds) {
 PagableList<Comment> comments = post.getComments();
 // Get (string) message.

 String message = post.getMessage();
 System.out.println("Fecha: " + post.getCreatedTime() + "\nQuien publica: " + post.getFrom().getName() + ": \nTitulo del post: " + message);
 for (Comment comment : comments) {
 System.out.println(comment.getFrom().getName() + ": " + comment.getMessage() + "  ✌: " + comment.getLikeCount());
 }
 System.out.println("Imagen: " + post.getPicture() + "\n\n");
                
 } //obtener mi muro
 */
