package appsyouneed.idinu.quizmaker.service;

import java.util.List;

import appsyouneed.idinu.quizmaker.firebase.DatabaseHandler;

public class UserService {

    public static void updateUser(List<String> updatedKeys, Object newValue, String userId) {
        if (updatedKeys.contains("firstName")) {
            DatabaseHandler.updateUserFirstName(newValue, userId);
        }
        if (updatedKeys.contains("lastName")) {
            DatabaseHandler.updateUserLastName(newValue, userId);
        }
        if (updatedKeys.contains("username")) {
            DatabaseHandler.updateUserUsername(newValue, userId);
        }
        if (updatedKeys.contains("password")) {
            DatabaseHandler.updateUserPassword(newValue, userId);
        }
        if (updatedKeys.contains("email")) {
            DatabaseHandler.updateUserEmail(newValue, userId);
        }
        if (updatedKeys.contains("description")) {
            DatabaseHandler.updateUserDescription(newValue, userId);
        }
        if (updatedKeys.contains("friendsList")) {
            DatabaseHandler.updateFriendsList(newValue, userId);
        }
    }
}
