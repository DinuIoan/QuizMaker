package appsyouneed.idinu.quizmaker.firebase;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.List;

import appsyouneed.idinu.quizmaker.model.Answear;
import appsyouneed.idinu.quizmaker.model.Question;
import appsyouneed.idinu.quizmaker.model.User;
import appsyouneed.idinu.quizmaker.model.UserQuiz;

public class DatabaseHandler {
    private static final DatabaseReference mDatabase = FirebaseDatabase.getInstance().getReferenceFromUrl("https://quizmaker-f5e22.firebaseio.com/");


    public static void addUser(User user) {
        mDatabase.child("users").child("" + user.getId()).setValue(user);


        /*HARDCODED VERSION*/
        /*mDatabase.child("users").setValue(user.getId());
        mDatabase.child("users").child("" + user.getId()).setValue("firstName");
        mDatabase.child("users").child("" + user.getId()).child("firstName").setValue(user.getFirstName());

        mDatabase.child("users").child("" + user.getId()).setValue("lastName");
        mDatabase.child("users").child("" + user.getId()).child("lastName").setValue(user.getLastName());

        mDatabase.child("users").child("" + user.getId()).setValue("username");
        mDatabase.child("users").child("" + user.getId()).child("username").setValue(user.getUsername());

        mDatabase.child("users").child("" + user.getId()).setValue("password");
        mDatabase.child("users").child("" + user.getId()).child("password").setValue(user.getPassword());

        mDatabase.child("users").child("" + user.getId()).setValue("email");
        mDatabase.child("users").child("" + user.getId()).child("email").setValue(user.getEmail());

        mDatabase.child("users").child("" + user.getId()).setValue("description");
        mDatabase.child("users").child("" + user.getId()).child("description").setValue(user.getDescription());

        mDatabase.child("users").child("" + user.getId()).setValue("timestamp");
        mDatabase.child("users").child("" + user.getId()).child("timestamp").setValue(user.getTimestamp());

        mDatabase.child("users").child("" + user.getId()).setValue("imageId");
        mDatabase.child("users").child("" + user.getId()).child("imageId").setValue(user.getImageId());

        mDatabase.child("users").child("" + user.getId()).setValue("friendsList");
        List<Long> friendsList = user.getFriendsList();
        for (int i = 0; i < friendsList.size(); i++) {
            mDatabase.child("users").child("" + user.getId()).child("friendsList").setValue("" + i);
            mDatabase.child("users").child("" + user.getId()).child("friendsList").child("" + i).setValue(friendsList.get(i));
        }*/
    }

    public static void addUserQuiz(UserQuiz userQuiz) {
        mDatabase.child("quizzes").child("" + userQuiz.getId()).setValue(userQuiz);

        /*HARDCODED VERSION*/
        /*
        mDatabase.child("quizzes").setValue(userQuiz.getId());
        mDatabase.child("quizzes").child("" + userQuiz.getId()).setValue("title");
        mDatabase.child("quizzes").child("" + userQuiz.getId()).child("title").setValue(userQuiz.getTitle());

        mDatabase.child("quizzes").child("" + userQuiz.getId()).setValue("description");
        mDatabase.child("quizzes").child("" + userQuiz.getId()).child("description").setValue(userQuiz.getDescription());

        mDatabase.child("quizzes").child("" + userQuiz.getId()).setValue("date");
        mDatabase.child("quizzes").child("" + userQuiz.getId()).child("date").setValue(userQuiz.getDate());

        mDatabase.child("quizzes").child("" + userQuiz.getId()).setValue("userId");
        mDatabase.child("quizzes").child("" + userQuiz.getId()).child("userId").setValue(userQuiz.getUserId());
        */

    }

    public static void addQuestion(Question question) {
        mDatabase.child("questions").child("" + question.getId()).setValue(question);
    }

    public static void addAnswear(Answear answear) {
        mDatabase.child("answears").child("" + answear.getId()).setValue(answear);
    }

    public static void updateUserFirstName(Object newValue, String userId) {
        mDatabase.child("users").child(userId).child("firstName").setValue("" +  newValue);
    }

    public static void updateUserLastName(Object newValue, String userId) {
        mDatabase.child("users").child(userId).child("lastName").setValue("" +  newValue);
    }

    public static void updateUserUsername(Object newValue, String userId) {
        mDatabase.child("users").child(userId).child("username").setValue("" + newValue);
    }

    public static void updateUserPassword(Object newValue, String userId) {
        mDatabase.child("users").child(userId).child("password").setValue("" + newValue);
    }

    public static void updateUserEmail(Object newValue, String userId) {
        mDatabase.child("users").child(userId).child("email").setValue("" + newValue);
    }

    public static void updateUserDescription(Object newValue, String userId) {
        mDatabase.child("users").child(userId).child("description").setValue("" + newValue);
    }

    public static void updateFriendsList(Object newValue, String userId) {
        mDatabase.child("users").child(userId).child("friendsList").setValue(newValue);
    }

    public static void deleteUser(Long userId) {
        mDatabase.child("users").child("" + userId).removeValue();
    }

    public static void deleteUserQuiz(Long userQuizId) {
        mDatabase.child("quizzes").child("" + userQuizId).removeValue();
    }

    public static void deleteQuestion(Long questionId) {
        mDatabase.child("questions").child("" + questionId).removeValue();
    }

    public static void deleteAnswear(Long answearId) {
        mDatabase.child("answears").child("" + answearId).removeValue();
    }

}
